package models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Platnosc")
public class Platnosc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_platnosci")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_studenta")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_semestru")
    private Semestr semestr;

    @Column(name = "kwota", precision = 10, scale = 2)
    private BigDecimal kwota;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_wymagalnosci")
    private Date dataWymagalnosci;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_wplaty")
    private Date dataWplaty;

    @Column(name = "status", length = 20)
    private String status;

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

    public Semestr getSemestr() {
        return semestr;
    }

    public void setSemestr(Semestr semestr) {
        this.semestr = semestr;
    }

    public BigDecimal getKwota() {
        return kwota;
    }

    public void setKwota(BigDecimal kwota) {
        this.kwota = kwota;
    }

    public Date getDataWymagalnosci() {
        return dataWymagalnosci;
    }

    public void setDataWymagalnosci(Date dataWymagalnosci) {
        this.dataWymagalnosci = dataWymagalnosci;
    }

    public Date getDataWplaty() {
        return dataWplaty;
    }

    public void setDataWplaty(Date dataWplaty) {
        this.dataWplaty = dataWplaty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
