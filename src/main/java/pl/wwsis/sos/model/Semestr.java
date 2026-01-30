@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_semestru", nullable = false, updatable = false)
private Integer id;

@Column(name = "nazwa", length = 20, nullable = false, unique = true)
private String nazwa;

@Temporal(TemporalType.DATE)
@Column(name = "data_od", nullable = false)
private Date dataOd;

@Temporal(TemporalType.DATE)
@Column(name = "data_do", nullable = false)
private Date dataDo;
