package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.GrupaPrzedmiotowaDao;
import pl.wwsis.sos.model.GrupaPrzedmiotowa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class GrupaPrzedmiotowaDaoImpl implements GrupaPrzedmiotowaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<GrupaPrzedmiotowa> findAll() {
        return entityManager.createQuery("SELECT g FROM GrupaPrzedmiotowa g", GrupaPrzedmiotowa.class).getResultList();
    }

    @Override
    public GrupaPrzedmiotowa findById(Integer id) {
        return entityManager.find(GrupaPrzedmiotowa.class, id);
    }

    @Override
    public void save(GrupaPrzedmiotowa grupa) {
        if (grupa.getId() == null) {
            entityManager.persist(grupa);
        } else {
            entityManager.merge(grupa);
        }
    }
}
