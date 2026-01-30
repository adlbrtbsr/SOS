@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_uzytkownika", nullable = false, updatable = false)
private Integer id;

@Column(name = "login", length = 50, nullable = false, unique = true)
private String login;

@Column(name = "email", length = 100, nullable = false, unique = true)
private String email;

@Column(name = "haslo_hash", length = 255, nullable = false)
private String hasloHash;

@Column(name = "status_konta", length = 20, nullable = false)
private String statusKonta;

@Temporal(TemporalType.DATE)
@Column(name = "data_rejestracji", nullable = false)
private Date dataRejestracji;
