@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_powiadomienia", nullable = false, updatable = false)
private Integer id;

@ManyToOne
@JoinColumn(name = "id_studenta", nullable = false)
private Student student;

@Column(name = "tresc", columnDefinition = "TEXT", nullable = false)
private String tresc;

@Temporal(TemporalType.TIMESTAMP)
@Column(name = "data_wyslania", nullable = false)
private Date dataWyslania;
