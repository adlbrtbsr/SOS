package pl.wwsis.sos.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "platnosc")
public class Platnosc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_platnosci", nullable = false, updatable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_studenta", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_semestru", nullable = false)
    private Semestr semestr;

    @Column(name = "kwota", precision = 10, scale = 2, nullable = false)
    private BigDecimal kwota;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_wymagalnosci", nullable = false)
    private Date dataWymagalnosci;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_wplaty")
    private Date dataWplaty;

    @Column(name = "status", length = 20, nullable = false)
    private String status;

    public Platnosc() {
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
