package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the persona_demandante database table.
 * 
 */
@Entity
@Table(name="persona_demandante")
@NamedQuery(name="PersonaDemandante.findAll", query="SELECT p FROM PersonaDemandante p")
public class PersonaDemandante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PERSONA_DEMANDANTE")
	private int idPersonaDemandante;

	@Column(name="CALLE_PRINCIPAL")
	private String callePrincipal;

	@Column(name="CALLE_SECUNDARIA")
	private String calleSecundaria;

	private String celular;

	private String correo;

	private String nombre;

	@Column(name="NUMERO_CASA")
	private int numeroCasa;

	@Column(name="PAGINA_WEB")
	private String paginaWeb;

	private String referencia;

	@Column(name="TELEFONO_OFICINA")
	private String telefonoOficina;

	@Column(name="TELEFONO_PERSONAL")
	private String telefonoPersonal;

	//bi-directional many-to-one association to Oferta
	@OneToMany(mappedBy="personaDemandante")
	private List<Oferta> ofertas;

	//bi-directional many-to-one association to OpinionFreelance
	@OneToMany(mappedBy="personaDemandante")
	private List<OpinionFreelance> opinionFreelances;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="ID_ESTADO")
	private Estado estado;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_TIPO_PERSONA")
	private CatalogoDetalle catalogoDetalle;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;

	public PersonaDemandante() {
	}

	public int getIdPersonaDemandante() {
		return this.idPersonaDemandante;
	}

	public void setIdPersonaDemandante(int idPersonaDemandante) {
		this.idPersonaDemandante = idPersonaDemandante;
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

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroCasa() {
		return this.numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
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

	public String getTelefonoOficina() {
		return this.telefonoOficina;
	}

	public void setTelefonoOficina(String telefonoOficina) {
		this.telefonoOficina = telefonoOficina;
	}

	public String getTelefonoPersonal() {
		return this.telefonoPersonal;
	}

	public void setTelefonoPersonal(String telefonoPersonal) {
		this.telefonoPersonal = telefonoPersonal;
	}

	public List<Oferta> getOfertas() {
		return this.ofertas;
	}

	public void setOfertas(List<Oferta> ofertas) {
		this.ofertas = ofertas;
	}

	public Oferta addOferta(Oferta oferta) {
		getOfertas().add(oferta);
		oferta.setPersonaDemandante(this);

		return oferta;
	}

	public Oferta removeOferta(Oferta oferta) {
		getOfertas().remove(oferta);
		oferta.setPersonaDemandante(null);

		return oferta;
	}

	public List<OpinionFreelance> getOpinionFreelances() {
		return this.opinionFreelances;
	}

	public void setOpinionFreelances(List<OpinionFreelance> opinionFreelances) {
		this.opinionFreelances = opinionFreelances;
	}

	public OpinionFreelance addOpinionFreelance(OpinionFreelance opinionFreelance) {
		getOpinionFreelances().add(opinionFreelance);
		opinionFreelance.setPersonaDemandante(this);

		return opinionFreelance;
	}

	public OpinionFreelance removeOpinionFreelance(OpinionFreelance opinionFreelance) {
		getOpinionFreelances().remove(opinionFreelance);
		opinionFreelance.setPersonaDemandante(null);

		return opinionFreelance;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public CatalogoDetalle getCatalogoDetalle() {
		return this.catalogoDetalle;
	}

	public void setCatalogoDetalle(CatalogoDetalle catalogoDetalle) {
		this.catalogoDetalle = catalogoDetalle;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}