package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Powiadomienie;
import java.util.List;

public interface PowiadomienieDao {
    List<Powiadomienie> findAll();
    List<Powiadomienie> findByStudentId(Integer studentId);
    Powiadomienie findById(Integer id);
    void save(Powiadomienie powiadomienie);
}
