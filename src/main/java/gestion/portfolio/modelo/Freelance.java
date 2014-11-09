package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the freelance database table.
 * 
 */
@Entity
@NamedQuery(name="Freelance.findAll", query="SELECT f FROM Freelance f")
public class Freelance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_FREELANCE")
	private int idFreelance;

	private String apellidos;

	@Column(name="CALLE_PRINCIPAL")
	private String callePrincipal;

	@Column(name="CALLE_SECUNDARIA")
	private String calleSecundaria;

	private String celular;

	private String correo;

	private int edad;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_NACIMIENTO")
	private Date fechaNacimiento;

	private String nombres;

	@Column(name="NUMERO_CASA")
	private String numeroCasa;

	@Column(name="NUMERO_DOCUMENTO")
	private String numeroDocumento;

	@Column(name="PAGINA_WEB")
	private String paginaWeb;

	private String referencia;

	private String telefono;

	//bi-directional many-to-one association to AplicacionOferta
	@OneToMany(mappedBy="freelance")
	private List<AplicacionOferta> aplicacionOfertas;

	//bi-directional many-to-one association to Capacitacion
	@OneToMany(mappedBy="freelance")
	private List<Capacitacion> capacitacions;

	//bi-directional many-to-one association to Experiencia
	@OneToMany(mappedBy="freelance")
	private List<Experiencia> experiencias;

	//bi-directional many-to-one association to FormacionAcademica
	@OneToMany(mappedBy="freelance")
	private List<FormacionAcademica> formacionAcademicas;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_CANTON")
	private CatalogoDetalle catalogoDetalle1;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_ESTADO_CIVIL")
	private CatalogoDetalle catalogoDetalle2;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="ID_ESTADO")
	private Estado estado;

	//bi-directional many-to-one association to Imagen
	@ManyToOne
	@JoinColumn(name="ID_IMAGEN")
	private Imagen imagen;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_NACIONALIDAD")
	private CatalogoDetalle catalogoDetalle3;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_PAIS")
	private CatalogoDetalle catalogoDetalle4;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_PROVINCIA")
	private CatalogoDetalle catalogoDetalle5;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_TIPO_DOCUMENTO")
	private CatalogoDetalle catalogoDetalle6;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;

	//bi-directional many-to-one association to Habilidade
	@OneToMany(mappedBy="freelance")
	private List<Habilidade> habilidades;

	//bi-directional many-to-one association to Idioma
	@OneToMany(mappedBy="freelance")
	private List<Idioma> idiomas;

	//bi-directional many-to-one association to OpinionFreelance
	@OneToMany(mappedBy="freelance")
	private List<OpinionFreelance> opinionFreelances;

	//bi-directional many-to-one association to Portfolio
	@OneToMany(mappedBy="freelance")
	private List<Portfolio> portfolios;

	public Freelance() {
	}

	public int getIdFreelance() {
		return this.idFreelance;
	}

	public void setIdFreelance(int idFreelance) {
		this.idFreelance = idFreelance;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCallePrincipal() {
		return this.callePrincipal;
	}

	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}

	public String getCalleSecundaria() {
		return this.calleSecundaria;
	}

	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getNumeroCasa() {
		return this.numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getNumeroDocumento() {
		return this.numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getPaginaWeb() {
		return this.paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	public String getReferencia() {
		return this.referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<AplicacionOferta> getAplicacionOfertas() {
		return this.aplicacionOfertas;
	}

	public void setAplicacionOfertas(List<AplicacionOferta> aplicacionOfertas) {
		this.aplicacionOfertas = aplicacionOfertas;
	}

	public AplicacionOferta addAplicacionOferta(AplicacionOferta aplicacionOferta) {
		getAplicacionOfertas().add(aplicacionOferta);
		aplicacionOferta.setFreelance(this);

		return aplicacionOferta;
	}

	public AplicacionOferta removeAplicacionOferta(AplicacionOferta aplicacionOferta) {
		getAplicacionOfertas().remove(aplicacionOferta);
		aplicacionOferta.setFreelance(null);

		return aplicacionOferta;
	}

	public List<Capacitacion> getCapacitacions() {
		return this.capacitacions;
	}

	public void setCapacitacions(List<Capacitacion> capacitacions) {
		this.capacitacions = capacitacions;
	}

	public Capacitacion addCapacitacion(Capacitacion capacitacion) {
		getCapacitacions().add(capacitacion);
		capacitacion.setFreelance(this);

		return capacitacion;
	}

	public Capacitacion removeCapacitacion(Capacitacion capacitacion) {
		getCapacitacions().remove(capacitacion);
		capacitacion.setFreelance(null);

		return capacitacion;
	}

	public List<Experiencia> getExperiencias() {
		return this.experiencias;
	}

	public void setExperiencias(List<Experiencia> experiencias) {
		this.experiencias = experiencias;
	}

	public Experiencia addExperiencia(Experiencia experiencia) {
		getExperiencias().add(experiencia);
		experiencia.setFreelance(this);

		return experiencia;
	}

	public Experiencia removeExperiencia(Experiencia experiencia) {
		getExperiencias().remove(experiencia);
		experiencia.setFreelance(null);

		return experiencia;
	}

	public List<FormacionAcademica> getFormacionAcademicas() {
		return this.formacionAcademicas;
	}

	public void setFormacionAcademicas(List<FormacionAcademica> formacionAcademicas) {
		this.formacionAcademicas = formacionAcademicas;
	}

	public FormacionAcademica addFormacionAcademica(FormacionAcademica formacionAcademica) {
		getFormacionAcademicas().add(formacionAcademica);
		formacionAcademica.setFreelance(this);

		return formacionAcademica;
	}

	public FormacionAcademica removeFormacionAcademica(FormacionAcademica formacionAcademica) {
		getFormacionAcademicas().remove(formacionAcademica);
		formacionAcademica.setFreelance(null);

		return formacionAcademica;
	}

	public CatalogoDetalle getCatalogoDetalle1() {
		return this.catalogoDetalle1;
	}

	public void setCatalogoDetalle1(CatalogoDetalle catalogoDetalle1) {
		this.catalogoDetalle1 = catalogoDetalle1;
	}

	public CatalogoDetalle getCatalogoDetalle2() {
		return this.catalogoDetalle2;
	}

	public void setCatalogoDetalle2(CatalogoDetalle catalogoDetalle2) {
		this.catalogoDetalle2 = catalogoDetalle2;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Imagen getImagen() {
		return this.imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

	public CatalogoDetalle getCatalogoDetalle3() {
		return this.catalogoDetalle3;
	}

	public void setCatalogoDetalle3(CatalogoDetalle catalogoDetalle3) {
		this.catalogoDetalle3 = catalogoDetalle3;
	}

	public CatalogoDetalle getCatalogoDetalle4() {
		return this.catalogoDetalle4;
	}

	public void setCatalogoDetalle4(CatalogoDetalle catalogoDetalle4) {
		this.catalogoDetalle4 = catalogoDetalle4;
	}

	public CatalogoDetalle getCatalogoDetalle5() {
		return this.catalogoDetalle5;
	}

	public void setCatalogoDetalle5(CatalogoDetalle catalogoDetalle5) {
		this.catalogoDetalle5 = catalogoDetalle5;
	}

	public CatalogoDetalle getCatalogoDetalle6() {
		return this.catalogoDetalle6;
	}

	public void setCatalogoDetalle6(CatalogoDetalle catalogoDetalle6) {
		this.catalogoDetalle6 = catalogoDetalle6;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Habilidade> getHabilidades() {
		return this.habilidades;
	}

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

	public Habilidade addHabilidade(Habilidade habilidade) {
		getHabilidades().add(habilidade);
		habilidade.setFreelance(this);

		return habilidade;
	}

	public Habilidade removeHabilidade(Habilidade habilidade) {
		getHabilidades().remove(habilidade);
		habilidade.setFreelance(null);

		return habilidade;
	}

	public List<Idioma> getIdiomas() {
		return this.idiomas;
	}

	public void setIdiomas(List<Idioma> idiomas) {
		this.idiomas = idiomas;
	}

	public Idioma addIdioma(Idioma idioma) {
		getIdiomas().add(idioma);
		idioma.setFreelance(this);

		return idioma;
	}

	public Idioma removeIdioma(Idioma idioma) {
		getIdiomas().remove(idioma);
		idioma.setFreelance(null);

		return idioma;
	}

	public List<OpinionFreelance> getOpinionFreelances() {
		return this.opinionFreelances;
	}

	public void setOpinionFreelances(List<OpinionFreelance> opinionFreelances) {
		this.opinionFreelances = opinionFreelances;
	}

	public OpinionFreelance addOpinionFreelance(OpinionFreelance opinionFreelance) {
		getOpinionFreelances().add(opinionFreelance);
		opinionFreelance.setFreelance(this);

		return opinionFreelance;
	}

	public OpinionFreelance removeOpinionFreelance(OpinionFreelance opinionFreelance) {
		getOpinionFreelances().remove(opinionFreelance);
		opinionFreelance.setFreelance(null);

		return opinionFreelance;
	}

	public List<Portfolio> getPortfolios() {
		return this.portfolios;
	}

	public void setPortfolios(List<Portfolio> portfolios) {
		this.portfolios = portfolios;
	}

	public Portfolio addPortfolio(Portfolio portfolio) {
		getPortfolios().add(portfolio);
		portfolio.setFreelance(this);

		return portfolio;
	}

	public Portfolio removePortfolio(Portfolio portfolio) {
		getPortfolios().remove(portfolio);
		portfolio.setFreelance(null);

		return portfolio;
	}

}