package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.PowiadomienieDao;
import pl.wwsis.sos.model.Powiadomienie;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class PowiadomienieDaoImpl implements PowiadomienieDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Powiadomienie> findAll() {
        return entityManager.createQuery("SELECT p FROM Powiadomienie p", Powiadomienie.class).getResultList();
    }

    @Override
    public List<Powiadomienie> findByStudentId(Integer studentId) {
        return entityManager.createQuery(
                "SELECT p FROM Powiadomienie p WHERE p.student.id = :studentId", Powiadomienie.class)
                .setParameter("studentId", studentId)
                .getResultList();
    }

    @Override
    public Powiadomienie findById(Integer id) {
        return entityManager.find(Powiadomienie.class, id);
    }

    @Override
    public void save(Powiadomienie powiadomienie) {
        if (powiadomienie.getId() == null) {
            entityManager.persist(powiadomienie);
        } else {
            entityManager.merge(powiadomienie);
        }
    }
}
