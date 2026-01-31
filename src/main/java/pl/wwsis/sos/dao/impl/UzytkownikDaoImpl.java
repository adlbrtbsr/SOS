package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.UzytkownikDao;
import pl.wwsis.sos.model.Uzytkownik;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class UzytkownikDaoImpl implements UzytkownikDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Uzytkownik> findAll() {
        return entityManager.createQuery("SELECT u FROM Uzytkownik u", Uzytkownik.class).getResultList();
    }

    @Override
    public Uzytkownik findById(Integer id) {
        return entityManager.find(Uzytkownik.class, id);
    }

    @Override
    public Uzytkownik findByLogin(String login) {
        List<Uzytkownik> list = entityManager
                .createQuery("SELECT u FROM Uzytkownik u WHERE u.login = :login", Uzytkownik.class)
                .setParameter("login", login)
                .getResultList();
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public Uzytkownik findByEmail(String email) {
        List<Uzytkownik> list = entityManager
                .createQuery("SELECT u FROM Uzytkownik u WHERE u.email = :email", Uzytkownik.class)
                .setParameter("email", email)
                .getResultList();
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public void save(Uzytkownik uzytkownik) {
        if (uzytkownik.getId() == null) {
            entityManager.persist(uzytkownik);
        } else {
            entityManager.merge(uzytkownik);
        }
    }
}
