@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_wypozyczenia", nullable = false, updatable = false)
private Integer id;

@ManyToOne
@JoinColumn(name = "id_konta_bibl", nullable = false)
private KontoBiblioteczne kontoBiblioteczne;

@ManyToOne
@JoinColumn(name = "id_ksiazki", nullable = false)
private Ksiazka ksiazka;

@Temporal(TemporalType.DATE)
@Column(name = "data_wypozyczenia", nullable = false)
private Date dataWypozyczenia;

@Temporal(TemporalType.DATE)
@Column(name = "termin_zwrotu", nullable = false)
private Date terminZwrotu;

@Temporal(TemporalType.DATE)
@Column(name = "data_zwrotu")
private Date dataZwrotu;

@Column(name = "status", length = 20, nullable = false)
private String status;
