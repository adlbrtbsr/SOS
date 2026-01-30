package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Przedmiot;
import java.util.List;

public interface PrzedmiotDao {
    List<Przedmiot> findAll();
    Przedmiot findById(Integer id);
    Przedmiot findByKod(String kodPrzedmiotu);
    void save(Przedmiot przedmiot);
}
