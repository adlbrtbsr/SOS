package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.GrupaPrzedmiotowa;
import java.util.List;

public interface GrupaPrzedmiotowaDao {
    List<GrupaPrzedmiotowa> findAll();
    GrupaPrzedmiotowa findById(Integer id);
    void save(GrupaPrzedmiotowa grupa);
}
