package pl.wwsis.sos.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "semestr")
public class Semestr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_semestru", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "nazwa", length = 20, nullable = false, unique = true)
    private String nazwa;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_od", nullable = false)
    private Date dataOd;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_do", nullable = false)
    private Date dataDo;

    public Semestr() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getDataOd() {
        return dataOd;
    }

    public void setDataOd(Date dataOd) {
        this.dataOd = dataOd;
    }

    public Date getDataDo() {
        return dataDo;
    }

    public void setDataDo(Date dataDo) {
        this.dataDo = dataDo;
    }
}
