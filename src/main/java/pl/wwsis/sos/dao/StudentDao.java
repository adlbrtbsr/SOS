package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Student;
import java.util.List;

public interface StudentDao {
    List<Student> findAll();
    Student findById(Integer id);
    Student findByNrIndeksu(String nrIndeksu);
    void save(Student student);
}
