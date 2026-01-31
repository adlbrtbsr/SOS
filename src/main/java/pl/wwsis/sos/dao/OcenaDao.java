package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Ocena;
import java.util.List;

public interface OcenaDao {
    List<Ocena> findAll();
    List<Ocena> findByStudentId(Integer studentId);
    Ocena findById(Integer id);
    void save(Ocena ocena);
}
