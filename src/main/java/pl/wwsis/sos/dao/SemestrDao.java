package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Semestr;
import java.util.List;

public interface SemestrDao {
    List<Semestr> findAll();
    Semestr findById(Integer id);
    void save(Semestr semestr);
}
