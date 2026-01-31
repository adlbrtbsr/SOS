package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.SemestrDao;
import pl.wwsis.sos.model.Semestr;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class SemestrDaoImpl implements SemestrDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Semestr> findAll() {
        return entityManager.createQuery("SELECT s FROM Semestr s", Semestr.class).getResultList();
    }

    @Override
    public Semestr findById(Integer id) {
        return entityManager.find(Semestr.class, id);
    }

    @Override
    public void save(Semestr semestr) {
        if (semestr.getId() == null) {
            entityManager.persist(semestr);
        } else {
            entityManager.merge(semestr);
        }
    }
}
