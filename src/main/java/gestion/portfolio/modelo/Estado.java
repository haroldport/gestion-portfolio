package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the estado database table.
 * 
 */
@Entity
@NamedQuery(name="Estado.findAll", query="SELECT e FROM Estado e")
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ESTADO")
	private int idEstado;

	private String nemonico;

	private String nombre;

	//bi-directional many-to-one association to AccesoRol
	@OneToMany(mappedBy="estado")
	private List<AccesoRol> accesoRols;

	//bi-directional many-to-one association to AplicacionOferta
	@OneToMany(mappedBy="estado")
	private List<AplicacionOferta> aplicacionOfertas;

	//bi-directional many-to-one association to Capacitacion
	@OneToMany(mappedBy="estado")
	private List<Capacitacion> capacitacions;

	//bi-directional many-to-one association to Catalogo
	@OneToMany(mappedBy="estado")
	private List<Catalogo> catalogos;

	//bi-directional many-to-one association to CatalogoDetalle
	@OneToMany(mappedBy="estado")
	private List<CatalogoDetalle> catalogoDetalles;

	//bi-directional many-to-one association to Experiencia
	@OneToMany(mappedBy="estado")
	private List<Experiencia> experiencias;

	//bi-directional many-to-one association to FormacionAcademica
	@OneToMany(mappedBy="estado")
	private List<FormacionAcademica> formacionAcademicas;

	//bi-directional many-to-one association to Freelance
	@OneToMany(mappedBy="estado")
	private List<Freelance> freelances;

	//bi-directional many-to-one association to Habilidade
	@OneToMany(mappedBy="estado")
	private List<Habilidade> habilidades;

	//bi-directional many-to-one association to HabilidadesOferta
	@OneToMany(mappedBy="estado")
	private List<HabilidadesOferta> habilidadesOfertas;

	//bi-directional many-to-one association to Idioma
	@OneToMany(mappedBy="estado")
	private List<Idioma> idiomas;

	//bi-directional many-to-one association to Oferta
	@OneToMany(mappedBy="estado")
	private List<Oferta> ofertas;

	//bi-directional many-to-one association to Opinione
	@OneToMany(mappedBy="estado")
	private List<Opinione> opiniones;

	//bi-directional many-to-one association to PersonaDemandante
	@OneToMany(mappedBy="estado")
	private List<PersonaDemandante> personaDemandantes;

	//bi-directional many-to-one association to Portfolio
	@OneToMany(mappedBy="estado")
	private List<Portfolio> portfolios;

	//bi-directional many-to-one association to Rol
	@OneToMany(mappedBy="estado")
	private List<Rol> rols;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="estado")
	private List<Usuario> usuarios;

	public Estado() {
	}

	public int getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public String getNemonico() {
		return this.nemonico;
	}

	public void setNemonico(String nemonico) {
		this.nemonico = nemonico;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<AccesoRol> getAccesoRols() {
		return this.accesoRols;
	}

	public void setAccesoRols(List<AccesoRol> accesoRols) {
		this.accesoRols = accesoRols;
	}

	public AccesoRol addAccesoRol(AccesoRol accesoRol) {
		getAccesoRols().add(accesoRol);
		accesoRol.setEstado(this);

		return accesoRol;
	}

	public AccesoRol removeAccesoRol(AccesoRol accesoRol) {
		getAccesoRols().remove(accesoRol);
		accesoRol.setEstado(null);

		return accesoRol;
	}

	public List<AplicacionOferta> getAplicacionOfertas() {
		return this.aplicacionOfertas;
	}

	public void setAplicacionOfertas(List<AplicacionOferta> aplicacionOfertas) {
		this.aplicacionOfertas = aplicacionOfertas;
	}

	public AplicacionOferta addAplicacionOferta(AplicacionOferta aplicacionOferta) {
		getAplicacionOfertas().add(aplicacionOferta);
		aplicacionOferta.setEstado(this);

		return aplicacionOferta;
	}

	public AplicacionOferta removeAplicacionOferta(AplicacionOferta aplicacionOferta) {
		getAplicacionOfertas().remove(aplicacionOferta);
		aplicacionOferta.setEstado(null);

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
		capacitacion.setEstado(this);

		return capacitacion;
	}

	public Capacitacion removeCapacitacion(Capacitacion capacitacion) {
		getCapacitacions().remove(capacitacion);
		capacitacion.setEstado(null);

		return capacitacion;
	}

	public List<Catalogo> getCatalogos() {
		return this.catalogos;
	}

	public void setCatalogos(List<Catalogo> catalogos) {
		this.catalogos = catalogos;
	}

	public Catalogo addCatalogo(Catalogo catalogo) {
		getCatalogos().add(catalogo);
		catalogo.setEstado(this);

		return catalogo;
	}

	public Catalogo removeCatalogo(Catalogo catalogo) {
		getCatalogos().remove(catalogo);
		catalogo.setEstado(null);

		return catalogo;
	}

	public List<CatalogoDetalle> getCatalogoDetalles() {
		return this.catalogoDetalles;
	}

	public void setCatalogoDetalles(List<CatalogoDetalle> catalogoDetalles) {
		this.catalogoDetalles = catalogoDetalles;
	}

	public CatalogoDetalle addCatalogoDetalle(CatalogoDetalle catalogoDetalle) {
		getCatalogoDetalles().add(catalogoDetalle);
		catalogoDetalle.setEstado(this);

		return catalogoDetalle;
	}

	public CatalogoDetalle removeCatalogoDetalle(CatalogoDetalle catalogoDetalle) {
		getCatalogoDetalles().remove(catalogoDetalle);
		catalogoDetalle.setEstado(null);

		return catalogoDetalle;
	}

	public List<Experiencia> getExperiencias() {
		return this.experiencias;
	}

	public void setExperiencias(List<Experiencia> experiencias) {
		this.experiencias = experiencias;
	}

	public Experiencia addExperiencia(Experiencia experiencia) {
		getExperiencias().add(experiencia);
		experiencia.setEstado(this);

		return experiencia;
	}

	public Experiencia removeExperiencia(Experiencia experiencia) {
		getExperiencias().remove(experiencia);
		experiencia.setEstado(null);

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
		formacionAcademica.setEstado(this);

		return formacionAcademica;
	}

	public FormacionAcademica removeFormacionAcademica(FormacionAcademica formacionAcademica) {
		getFormacionAcademicas().remove(formacionAcademica);
		formacionAcademica.setEstado(null);

		return formacionAcademica;
	}

	public List<Freelance> getFreelances() {
		return this.freelances;
	}

	public void setFreelances(List<Freelance> freelances) {
		this.freelances = freelances;
	}

	public Freelance addFreelance(Freelance freelance) {
		getFreelances().add(freelance);
		freelance.setEstado(this);

		return freelance;
	}

	public Freelance removeFreelance(Freelance freelance) {
		getFreelances().remove(freelance);
		freelance.setEstado(null);

		return freelance;
	}

	public List<Habilidade> getHabilidades() {
		return this.habilidades;
	}

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

	public Habilidade addHabilidade(Habilidade habilidade) {
		getHabilidades().add(habilidade);
		habilidade.setEstado(this);

		return habilidade;
	}

	public Habilidade removeHabilidade(Habilidade habilidade) {
		getHabilidades().remove(habilidade);
		habilidade.setEstado(null);

		return habilidade;
	}

	public List<HabilidadesOferta> getHabilidadesOfertas() {
		return this.habilidadesOfertas;
	}

	public void setHabilidadesOfertas(List<HabilidadesOferta> habilidadesOfertas) {
		this.habilidadesOfertas = habilidadesOfertas;
	}

	public HabilidadesOferta addHabilidadesOferta(HabilidadesOferta habilidadesOferta) {
		getHabilidadesOfertas().add(habilidadesOferta);
		habilidadesOferta.setEstado(this);

		return habilidadesOferta;
	}

	public HabilidadesOferta removeHabilidadesOferta(HabilidadesOferta habilidadesOferta) {
		getHabilidadesOfertas().remove(habilidadesOferta);
		habilidadesOferta.setEstado(null);

		return habilidadesOferta;
	}

	public List<Idioma> getIdiomas() {
		return this.idiomas;
	}

	public void setIdiomas(List<Idioma> idiomas) {
		this.idiomas = idiomas;
	}

	public Idioma addIdioma(Idioma idioma) {
		getIdiomas().add(idioma);
		idioma.setEstado(this);

		return idioma;
	}

	public Idioma removeIdioma(Idioma idioma) {
		getIdiomas().remove(idioma);
		idioma.setEstado(null);

		return idioma;
	}

	public List<Oferta> getOfertas() {
		return this.ofertas;
	}

	public void setOfertas(List<Oferta> ofertas) {
		this.ofertas = ofertas;
	}

	public Oferta addOferta(Oferta oferta) {
		getOfertas().add(oferta);
		oferta.setEstado(this);

		return oferta;
	}

	public Oferta removeOferta(Oferta oferta) {
		getOfertas().remove(oferta);
		oferta.setEstado(null);

		return oferta;
	}

	public List<Opinione> getOpiniones() {
		return this.opiniones;
	}

	public void setOpiniones(List<Opinione> opiniones) {
		this.opiniones = opiniones;
	}

	public Opinione addOpinione(Opinione opinione) {
		getOpiniones().add(opinione);
		opinione.setEstado(this);

		return opinione;
	}

	public Opinione removeOpinione(Opinione opinione) {
		getOpiniones().remove(opinione);
		opinione.setEstado(null);

		return opinione;
	}

	public List<PersonaDemandante> getPersonaDemandantes() {
		return this.personaDemandantes;
	}

	public void setPersonaDemandantes(List<PersonaDemandante> personaDemandantes) {
		this.personaDemandantes = personaDemandantes;
	}

	public PersonaDemandante addPersonaDemandante(PersonaDemandante personaDemandante) {
		getPersonaDemandantes().add(personaDemandante);
		personaDemandante.setEstado(this);

		return personaDemandante;
	}

	public PersonaDemandante removePersonaDemandante(PersonaDemandante personaDemandante) {
		getPersonaDemandantes().remove(personaDemandante);
		personaDemandante.setEstado(null);

		return personaDemandante;
	}

	public List<Portfolio> getPortfolios() {
		return this.portfolios;
	}

	public void setPortfolios(List<Portfolio> portfolios) {
		this.portfolios = portfolios;
	}

	public Portfolio addPortfolio(Portfolio portfolio) {
		getPortfolios().add(portfolio);
		portfolio.setEstado(this);

		return portfolio;
	}

	public Portfolio removePortfolio(Portfolio portfolio) {
		getPortfolios().remove(portfolio);
		portfolio.setEstado(null);

		return portfolio;
	}

	public List<Rol> getRols() {
		return this.rols;
	}

	public void setRols(List<Rol> rols) {
		this.rols = rols;
	}

	public Rol addRol(Rol rol) {
		getRols().add(rol);
		rol.setEstado(this);

		return rol;
	}

	public Rol removeRol(Rol rol) {
		getRols().remove(rol);
		rol.setEstado(null);

		return rol;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setEstado(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setEstado(null);

		return usuario;
	}

}