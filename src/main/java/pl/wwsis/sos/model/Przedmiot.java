@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_przedmiotu", nullable = false, updatable = false)
private Integer id;

@Column(name = "kod_przedmiotu", length = 20, nullable = false, unique = true)
private String kodPrzedmiotu;

@Column(name = "nazwa", length = 100, nullable = false)
private String nazwa;

@Column(name = "opis", columnDefinition = "TEXT")
private String opis;

@Column(name = "ects", nullable = false)
private Integer ects;
