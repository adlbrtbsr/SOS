package pl.wwsis.sos.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "powiadomienie")
public class Powiadomienie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_powiadomienia", nullable = false, updatable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_studenta", nullable = false)
    private Student student;

    @Column(name = "tresc", columnDefinition = "TEXT", nullable = false)
    private String tresc;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_wyslania", nullable = false)
    private Date dataWyslania;

    public Powiadomienie() {
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

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public Date getDataWyslania() {
        return dataWyslania;
    }

    public void setDataWyslania(Date dataWyslania) {
        this.dataWyslania = dataWyslania;
    }
}
