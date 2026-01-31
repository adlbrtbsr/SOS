package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.StudentDao;
import pl.wwsis.sos.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public Student findByNrIndeksu(String nrIndeksu) {
        List<Student> list = entityManager
                .createQuery("SELECT s FROM Student s WHERE s.nrIndeksu = :nr", Student.class)
                .setParameter("nr", nrIndeksu)
                .getResultList();
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public void save(Student student) {
        if (student.getId() == null) {
            entityManager.persist(student);
        } else {
            entityManager.merge(student);
        }
    }
}
