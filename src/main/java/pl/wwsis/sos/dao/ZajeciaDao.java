package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Zajecia;
import java.util.List;

public interface ZajeciaDao {
    List<Zajecia> findAll();
    List<Zajecia> findByGrupaId(Integer grupaId);
    Zajecia findById(Integer id);
    void save(Zajecia zajecia);
}
