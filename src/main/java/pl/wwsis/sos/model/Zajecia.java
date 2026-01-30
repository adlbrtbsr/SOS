@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_zajec", nullable = false, updatable = false)
private Integer id;

@ManyToOne
@JoinColumn(name = "id_grupy", nullable = false)
private GrupaPrzedmiotowa grupa;

@ManyToOne
@JoinColumn(name = "id_semestru", nullable = false)
private Semestr semestr;

@Column(name = "dzien_tygodnia", nullable = false)
private Short dzienTygodnia;

@Temporal(TemporalType.TIME)
@Column(name = "godzina_od", nullable = false)
private Date godzinaOd;

@Temporal(TemporalType.TIME)
@Column(name = "godzina_do", nullable = false)
private Date godzinaDo;

@Column(name = "sala", length = 20, nullable = false)
private String sala;
