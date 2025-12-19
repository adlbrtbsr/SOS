package models;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_studenta")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id_uzytkownika")
    private Uzytkownik uzytkownik;

    @Column(name = "nr_indeksu", length = 20)
    private String nrIndeksu;

    @Column(name = "imie", length = 50)
    private String imie;

    @Column(name = "nazwisko", length = 50)
    private String nazwisko;

    @Column(name = "kierunek", length = 100)
    private String kierunek;

    @Column(name = "semestr_aktualny")
    private Integer semestrAktualny;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public String getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(String nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public Integer getSemestrAktualny() {
        return semestrAktualny;
    }

    public void setSemestrAktualny(Integer semestrAktualny) {
        this.semestrAktualny = semestrAktualny;
    }
}
