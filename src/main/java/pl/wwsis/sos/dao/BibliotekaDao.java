package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Ksiazka;
import pl.wwsis.sos.model.Wypozyczenie;

import java.util.List;

public interface BibliotekaDao {
    List<Ksiazka> findAllKsiazki();
    Ksiazka findKsiazkaById(Integer idKsiazki);

    List<Wypozyczenie> findWypozyczeniaByKonto(Integer idKontaBibliotecznego);
    void saveWypozyczenie(Wypozyczenie wypozyczenie);
}
