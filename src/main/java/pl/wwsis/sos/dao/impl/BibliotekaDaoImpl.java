package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.BibliotekaDao;
import pl.wwsis.sos.model.Ksiazka;
import pl.wwsis.sos.model.Wypozyczenie;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class BibliotekaDaoImpl implements BibliotekaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Ksiazka> findAllKsiazki() {
        return entityManager
                .createQuery("SELECT k FROM Ksiazka k", Ksiazka.class)
                .getResultList();
    }

    @Override
    public Ksiazka findKsiazkaById(Integer idKsiazki) {
        return entityManager.find(Ksiazka.class, idKsiazki);
    }

    @Override
    public List<Wypozyczenie> findWypozyczeniaByKonto(Integer idKontaBibliotecznego) {
        return entityManager
                .createQuery(
                        "SELECT w FROM Wypozyczenie w WHERE w.kontoBiblioteczne.id = :id",
                        Wypozyczenie.class
                )
                .setParameter("id", idKontaBibliotecznego)
                .getResultList();
    }

    @Override
    public void saveWypozyczenie(Wypozyczenie wypozyczenie) {
        if (wypozyczenie.getId() == null) {
            entityManager.persist(wypozyczenie);
        } else {
            entityManager.merge(wypozyczenie);
        }
    }
}
