package pl.wwsis.sos.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ocena")
public class Ocena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oceny", nullable = false, updatable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_studenta", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_grupy", nullable = false)
    private GrupaPrzedmiotowa grupa;

    @ManyToOne
    @JoinColumn(name = "id_semestru", nullable = false)
    private Semestr semestr;

    @Column(name = "wartosc", nullable = false, precision = 4, scale = 2)
    private BigDecimal wartosc;

    @Column(name = "typ_oceny", length = 30, nullable = false)
    private String typOceny;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_wystawienia", nullable = false)
    private Date dataWystawienia;

    public Ocena() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public GrupaPrzedmiotowa getGrupa() {
        return grupa;
    }

    public void setGrupa(GrupaPrzedmiotowa grupa) {
        this.grupa = grupa;
    }

    public Semestr getSemestr() {
        return semestr;
    }

    public void setSemestr(Semestr semestr) {
        this.semestr = semestr;
    }

    public BigDecimal getWartosc() {
        return wartosc;
    }

    public void setWartosc(BigDecimal wartosc) {
        this.wartosc = wartosc;
    }

    public String getTypOceny() {
        return typOceny;
    }

    public void setTypOceny(String typOceny) {
        this.typOceny = typOceny;
    }

    public Date getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(Date dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }
}
