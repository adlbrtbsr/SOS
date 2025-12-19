package models;

import javax.persistence.*;

@Entity
@Table(name = "Przedmiot")
public class Przedmiot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_przedmiotu")
    private Integer id;

    @Column(name = "kod_przedmiotu", length = 20)
    private String kodPrzedmiotu;

    @Column(name = "nazwa", length = 100)
    private String nazwa;

    @Column(name = "opis", columnDefinition = "TEXT")
    private String opis;

    @Column(name = "ects")
    private Integer ects;

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
