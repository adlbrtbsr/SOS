package models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Zajecia")
public class Zajecia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_zajec")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_grupy")
    private GrupaPrzedmiotowa grupa;

    @ManyToOne
    @JoinColumn(name = "id_semestru")
    private Semestr semestr;

    @Column(name = "dzien_tygodnia")
    private Short dzienTygodnia;

    @Temporal(TemporalType.TIME)
    @Column(name = "godzina_od")
    private Date godzinaOd;

    @Temporal(TemporalType.TIME)
    @Column(name = "godzina_do")
    private Date godzinaDo;

    @Column(name = "sala", length = 20)
    private String sala;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Short getDzienTygodnia() {
        return dzienTygodnia;
    }

    public void setDzienTygodnia(Short dzienTygodnia) {
        this.dzienTygodnia = dzienTygodnia;
    }

    public Date getGodzinaOd() {
        return godzinaOd;
    }

    public void setGodzinaOd(Date godzinaOd) {
        this.godzinaOd = godzinaOd;
    }

    public Date getGodzinaDo() {
        return godzinaDo;
    }

    public void setGodzinaDo(Date godzinaDo) {
        this.godzinaDo = godzinaDo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
