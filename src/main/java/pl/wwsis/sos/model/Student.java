package pl.wwsis.sos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_studenta", nullable = false, updatable = false)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id_uzytkownika", nullable = false, unique = true)
    private Uzytkownik uzytkownik;

    @Column(name = "nr_indeksu", length = 20, nullable = false, unique = true)
    private String nrIndeksu;

    @Column(name = "imie", length = 50, nullable = false)
    private String imie;

    @Column(name = "nazwisko", length = 50, nullable = false)
    private String nazwisko;

    @Column(name = "kierunek", length = 100, nullable = false)
    private String kierunek;

    @Column(name = "semestr_aktualny")
    private Integer semestrAktualny;

    public Student() {
    }

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
