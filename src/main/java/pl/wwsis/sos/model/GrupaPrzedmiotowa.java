@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_grupy", nullable = false, updatable = false)
private Integer id;

@ManyToOne
@JoinColumn(name = "id_przedmiotu", nullable = false)
private Przedmiot przedmiot;

@Column(name = "nazwa_grupy", length = 50, nullable = false)
private String nazwaGrupy;

@Column(name = "semestr", nullable = false)
private Integer semestr;

@Column(name = "limit_miejsc", nullable = false)
private Integer limitMiejsc;
