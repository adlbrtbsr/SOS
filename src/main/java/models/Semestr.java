package models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Semestr")
public class Semestr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_semestru")
    private Integer id;

    @Column(name = "nazwa", length = 20)
    private String nazwa;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_od")
    private Date dataOd;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_do")
    private Date dataDo;

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
