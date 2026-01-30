@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_platnosci", nullable = false, updatable = false)
private Integer id;

@ManyToOne
@JoinColumn(name = "id_studenta", nullable = false)
private Student student;

@ManyToOne
@JoinColumn(name = "id_semestru", nullable = false)
private Semestr semestr;

@Column(name = "kwota", precision = 10, scale = 2, nullable = false)
private BigDecimal kwota;

@Temporal(TemporalType.DATE)
@Column(name = "data_wymagalnosci", nullable = false)
private Date dataWymagalnosci;

@Temporal(TemporalType.DATE)
@Column(name = "data_wplaty")
private Date dataWplaty;

@Column(name = "status", length = 20, nullable = false)
private String status;
