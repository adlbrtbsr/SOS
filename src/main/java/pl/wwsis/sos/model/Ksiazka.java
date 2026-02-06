package pl.wwsis.sos.model;

import javax.persistence.*;

@Entity
@Table(name = "ksiazka")
public class Ksiazka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ksiazki", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "tytul", length = 200, nullable = false)
    private String tytul;

    @Column(name = "autor", length = 200, nullable = false)
    private String autor;

    @Column(name = "isbn", length = 20, nullable = false)
    private String isbn;

    public Ksiazka() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
