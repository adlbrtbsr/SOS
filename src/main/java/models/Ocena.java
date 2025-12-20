package models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Ocena")
public class Ocena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oceny")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_studenta")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_grupy")
    private GrupaPrzedmiotowa grupa;

    @ManyToOne
    @JoinColumn(name = "id_semestru")
    private Semestr semestr;

    @Column(name = "wartosc")
    private BigDecimal wartosc;

    @Column(name = "typ_oceny", length = 30)
    private String typOceny;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_wystawienia")
    private Date dataWystawienia;

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
