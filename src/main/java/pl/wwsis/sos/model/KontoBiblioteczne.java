@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_konta_bibl", nullable = false, updatable = false)
private Integer id;

@OneToOne
@JoinColumn(name = "id_studenta", nullable = false)
private Student student;

@Column(name = "status", length = 20, nullable = false)
private String status;

@Temporal(TemporalType.DATE)
@Column(name = "data_utworzenia", nullable = false)
private Date dataUtworzenia;
