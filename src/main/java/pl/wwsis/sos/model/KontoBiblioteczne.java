package pl.wwsis.sos.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "konto_biblioteczne")
public class KontoBiblioteczne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_konta_bibl", nullable = false, updatable = false)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id_studenta", nullable = false)
    private Student student;

    @Column(name = "status", length = 20, nullable = false)
    private String status;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_utworzenia", nullable = false)
    private Date dataUtworzenia;

    public KontoBiblioteczne() {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(Date dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
    }
}
