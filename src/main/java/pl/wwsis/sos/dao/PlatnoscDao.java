package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Platnosc;
import java.util.List;

public interface PlatnoscDao {
    List<Platnosc> findAll();
    List<Platnosc> findByStudentId(Integer studentId);
    Platnosc findById(Integer id);
    void save(Platnosc platnosc);
}
