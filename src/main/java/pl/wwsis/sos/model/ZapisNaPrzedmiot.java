@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_zapisu", nullable = false, updatable = false)
private Integer id;

@ManyToOne
@JoinColumn(name = "id_studenta", nullable = false)
private Student student;

@ManyToOne
@JoinColumn(name = "id_grupy", nullable = false)
private GrupaPrzedmiotowa grupa;

@Temporal(TemporalType.DATE)
@Column(name = "data_zapisu", nullable = false)
private Date dataZapisu;

@Column(name = "status", length = 20, nullable = false)
private String status;
