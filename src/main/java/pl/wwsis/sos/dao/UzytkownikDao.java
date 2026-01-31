package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Uzytkownik;
import java.util.List;

public interface UzytkownikDao {
    List<Uzytkownik> findAll();
    Uzytkownik findById(Integer id);
    Uzytkownik findByLogin(String login);
    Uzytkownik findByEmail(String email);
    void save(Uzytkownik uzytkownik);
}
