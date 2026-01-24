package pl.wwsis.sos.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PowiadomieniePlan")
public class PowiadomieniePlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_powiadomienia")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_studenta")
    private Student student;

    @Column(name = "tresc", columnDefinition = "TEXT")
    private String tresc;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_wyslania")
    private Date dataWyslania;

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
