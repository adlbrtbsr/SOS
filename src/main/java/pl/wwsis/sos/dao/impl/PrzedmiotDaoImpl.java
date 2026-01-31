package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.PrzedmiotDao;
import pl.wwsis.sos.model.Przedmiot;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class PrzedmiotDaoImpl implements PrzedmiotDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Przedmiot> findAll() {
        return entityManager
                .createQuery("SELECT p FROM Przedmiot p", Przedmiot.class)
                .getResultList();
    }

    @Override
    public Przedmiot findById(Integer id) {
        return entityManager.find(Przedmiot.class, id);
    }

    @Override
    public Przedmiot findByKod(String kodPrzedmiotu) {
        List<Przedmiot> list = entityManager
                .createQuery(
                        "SELECT p FROM Przedmiot p WHERE p.kodPrzedmiotu = :kod",
                        Przedmiot.class
                )
                .setParameter("kod", kodPrzedmiotu)
                .getResultList();

        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public void save(Przedmiot przedmiot) {
        if (przedmiot.getId() == null) {
            entityManager.persist(przedmiot);
        } else {
            entityManager.merge(przedmiot);
        }
    }
}
