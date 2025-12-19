package models;

import javax.persistence.*;

@Entity
@Table(name = "GrupaPrzedmiotowa")
public class GrupaPrzedmiotowa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupy")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_przedmiotu")
    private Przedmiot przedmiot;

    @Column(name = "nazwa_grupy", length = 50)
    private String nazwaGrupy;

    @Column(name = "semestr")
    private Integer semestr;

    @Column(name = "limit_miejsc")
    private Integer limitMiejsc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Przedmiot getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(Przedmiot przedmiot) {
        this.przedmiot = przedmiot;
    }

    public String getNazwaGrupy() {
        return nazwaGrupy;
    }

    public void setNazwaGrupy(String nazwaGrupy) {
        this.nazwaGrupy = nazwaGrupy;
    }

    public Integer getSemestr() {
        return semestr;
    }

    public void setSemestr(Integer semestr) {
        this.semestr = semestr;
    }

    public Integer getLimitMiejsc() {
        return limitMiejsc;
    }

    public void setLimitMiejsc(Integer limitMiejsc) {
        this.limitMiejsc = limitMiejsc;
    }
}
