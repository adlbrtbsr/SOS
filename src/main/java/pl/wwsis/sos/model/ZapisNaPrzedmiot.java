package pl.wwsis.sos.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "zapis_na_przedmiot")
public class ZapisNaPrzedmiot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_zapisu", nullable = false, updatable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_studenta", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_grupy", nullable = false)
    private GrupaPrzedmiotowa grupa;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_zapisu", nullable = false)
    private Date dataZapisu;

    @Column(name = "status", length = 20, nullable = false)
    private String status;

    public ZapisNaPrzedmiot() {
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

    public Date getDataZapisu() {
        return dataZapisu;
    }

    public void setDataZapisu(Date dataZapisu) {
        this.dataZapisu = dataZapisu;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
