package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.ZajeciaDao;
import pl.wwsis.sos.model.Zajecia;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class ZajeciaDaoImpl implements ZajeciaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Zajecia> findAll() {
        return entityManager.createQuery("SELECT z FROM Zajecia z", Zajecia.class).getResultList();
    }

    @Override
    public List<Zajecia> findByGrupaId(Integer grupaId) {
        return entityManager.createQuery(
                "SELECT z FROM Zajecia z WHERE z.grupa.id = :grupaId", Zajecia.class)
                .setParameter("grupaId", grupaId)
                .getResultList();
    }

    @Override
    public Zajecia findById(Integer id) {
        return entityManager.find(Zajecia.class, id);
    }

    @Override
    public void save(Zajecia zajecia) {
        if (zajecia.getId() == null) {
            entityManager.persist(zajecia);
        } else {
            entityManager.merge(zajecia);
        }
    }
}
