package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Instruktor;
import java.util.List;

public interface InstruktorDao {
    List<Instruktor> findAll();
    Instruktor findById(Integer id);
    void save(Instruktor instruktor);
}
