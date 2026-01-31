package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.PlatnoscDao;
import pl.wwsis.sos.model.Platnosc;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class PlatnoscDaoImpl implements PlatnoscDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Platnosc> findAll() {
        return entityManager.createQuery("SELECT p FROM Platnosc p", Platnosc.class).getResultList();
    }

    @Override
    public List<Platnosc> findByStudentId(Integer studentId) {
        return entityManager.createQuery(
                "SELECT p FROM Platnosc p WHERE p.student.id = :studentId", Platnosc.class)
                .setParameter("studentId", studentId)
                .getResultList();
    }

    @Override
    public Platnosc findById(Integer id) {
        return entityManager.find(Platnosc.class, id);
    }

    @Override
    public void save(Platnosc platnosc) {
        if (platnosc.getId() == null) {
            entityManager.persist(platnosc);
        } else {
            entityManager.merge(platnosc);
        }
    }
}
