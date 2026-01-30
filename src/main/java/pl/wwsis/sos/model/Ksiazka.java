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
