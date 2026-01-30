@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_oceny", nullable = false, updatable = false)
private Integer id;

@ManyToOne
@JoinColumn(name = "id_studenta", nullable = false)
private Student student;

@ManyToOne
@JoinColumn(name = "id_grupy", nullable = false)
private GrupaPrzedmiotowa grupa;

@ManyToOne
@JoinColumn(name = "id_semestru", nullable = false)
private Semestr semestr;

@Column(name = "wartosc", nullable = false, precision = 4, scale = 2)
private BigDecimal wartosc;

@Column(name = "typ_oceny", length = 30, nullable = false)
private String typOceny;

@Temporal(TemporalType.DATE)
@Column(name = "data_wystawienia", nullable = false)
private Date dataWystawienia;
