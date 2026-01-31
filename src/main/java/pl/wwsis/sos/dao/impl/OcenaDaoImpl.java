package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.OcenaDao;
import pl.wwsis.sos.model.Ocena;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class OcenaDaoImpl implements OcenaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Ocena> findAll() {
        return entityManager.createQuery("SELECT o FROM Ocena o", Ocena.class).getResultList();
    }

    @Override
    public List<Ocena> findByStudentId(Integer studentId) {
        return entityManager.createQuery(
                "SELECT o FROM Ocena o WHERE o.student.id = :studentId", Ocena.class)
                .setParameter("studentId", studentId)
                .getResultList();
    }

    @Override
    public Ocena findById(Integer id) {
        return entityManager.find(Ocena.class, id);
    }

    @Override
    public void save(Ocena ocena) {
        if (ocena.getId() == null) {
            entityManager.persist(ocena);
        } else {
            entityManager.merge(ocena);
        }
    }
}
