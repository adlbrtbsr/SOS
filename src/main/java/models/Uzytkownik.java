package models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Uzytkownik")
public class Uzytkownik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_uzytkownika")
    private Integer id;

    @Column(name = "login", length = 50)
    private String login;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "haslo_hash", length = 255)
    private String hasloHash;

    @Column(name = "status_konta", length = 20)
    private String statusKonta;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_rejestracji")
    private Date dataRejestracji;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHasloHash() {
        return hasloHash;
    }

    public void setHasloHash(String hasloHash) {
        this.hasloHash = hasloHash;
    }

    public String getStatusKonta() {
        return statusKonta;
    }

    public void setStatusKonta(String statusKonta) {
        this.statusKonta = statusKonta;
    }

    public Date getDataRejestracji() {
        return dataRejestracji;
    }

    public void setDataRejestracji(Date dataRejestracji) {
        this.dataRejestracji = dataRejestracji;
    }
}
