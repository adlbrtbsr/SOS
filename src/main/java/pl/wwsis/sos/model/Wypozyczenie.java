package pl.wwsis.sos.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Wypozyczenie")
public class Wypozyczenie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_wypozyczenia")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_konta_bibl")
    private KontoBiblioteczne kontoBiblioteczne;

    @ManyToOne
    @JoinColumn(name = "id_ksiazki")
    private Ksiazka ksiazka;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_wypozyczenia")
    private Date dataWypozyczenia;

    @Temporal(TemporalType.DATE)
    @Column(name = "termin_zwrotu")
    private Date terminZwrotu;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_zwrotu")
    private Date dataZwrotu;

    @Column(name = "status", length = 20)
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public KontoBiblioteczne getKontoBiblioteczne() {
        return kontoBiblioteczne;
    }

    public void setKontoBiblioteczne(KontoBiblioteczne kontoBiblioteczne) {
        this.kontoBiblioteczne = kontoBiblioteczne;
    }

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }

    public Date getDataWypozyczenia() {
        return dataWypozyczenia;
    }

    public void setDataWypozyczenia(Date dataWypozyczenia) {
        this.dataWypozyczenia = dataWypozyczenia;
    }

    public Date getTerminZwrotu() {
        return terminZwrotu;
    }

    public void setTerminZwrotu(Date terminZwrotu) {
        this.terminZwrotu = terminZwrotu;
    }

    public Date getDataZwrotu() {
        return dataZwrotu;
    }

    public void setDataZwrotu(Date dataZwrotu) {
        this.dataZwrotu = dataZwrotu;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
