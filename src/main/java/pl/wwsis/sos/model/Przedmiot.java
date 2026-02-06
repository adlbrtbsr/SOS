package pl.wwsis.sos.model;

import javax.persistence.*;

@Entity
@Table(name = "przedmiot")
public class Przedmiot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_przedmiotu", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "kod_przedmiotu", length = 20, nullable = false, unique = true)
    private String kodPrzedmiotu;

    @Column(name = "nazwa", length = 100, nullable = false)
    private String nazwa;

    @Column(name = "opis", columnDefinition = "TEXT")
    private String opis;

    @Column(name = "ects", nullable = false)
    private Integer ects;

    public Przedmiot() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKodPrzedmiotu() {
        return kodPrzedmiotu;
    }

    public void setKodPrzedmiotu(String kodPrzedmiotu) {
        this.kodPrzedmiotu = kodPrzedmiotu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Integer getEcts() {
        return ects;
    }

    public void setEcts(Integer ects) {
        this.ects = ects;
    }
}
