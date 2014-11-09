package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the catalogo_detalle database table.
 * 
 */
@Entity
@Table(name="catalogo_detalle")
@NamedQuery(name="CatalogoDetalle.findAll", query="SELECT c FROM CatalogoDetalle c")
public class CatalogoDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CATALOGO_DETALLE")
	private int idCatalogoDetalle;

	private String descripcion;

	private String nemonico;

	private String nombre;

	//bi-directional many-to-one association to Capacitacion
	@OneToMany(mappedBy="catalogoDetalle1")
	private List<Capacitacion> capacitacions1;

	//bi-directional many-to-one association to Capacitacion
	@OneToMany(mappedBy="catalogoDetalle2")
	private List<Capacitacion> capacitacions2;

	//bi-directional many-to-one association to Capacitacion
	@OneToMany(mappedBy="catalogoDetalle3")
	private List<Capacitacion> capacitacions3;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_CATALOGO_DETALLE_PADRE")
	private CatalogoDetalle catalogoDetalle;

	//bi-directional many-to-one association to CatalogoDetalle
	@OneToMany(mappedBy="catalogoDetalle")
	private List<CatalogoDetalle> catalogoDetalles;

	//bi-directional many-to-one association to Catalogo
	@ManyToOne
	@JoinColumn(name="ID_CATALOGO")
	private Catalogo catalogo;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="ID_ESTADO")
	private Estado estado;

	//bi-directional many-to-one association to Experiencia
	@OneToMany(mappedBy="catalogoDetalle")
	private List<Experiencia> experiencias;

	//bi-directional many-to-one association to FormacionAcademica
	@OneToMany(mappedBy="catalogoDetalle")
	private List<FormacionAcademica> formacionAcademicas;

	//bi-directional many-to-one association to Freelance
	@OneToMany(mappedBy="catalogoDetalle1")
	private List<Freelance> freelances1;

	//bi-directional many-to-one association to Freelance
	@OneToMany(mappedBy="catalogoDetalle2")
	private List<Freelance> freelances2;

	//bi-directional many-to-one association to Freelance
	@OneToMany(mappedBy="catalogoDetalle3")
	private List<Freelance> freelances3;

	//bi-directional many-to-one association to Freelance
	@OneToMany(mappedBy="catalogoDetalle4")
	private List<Freelance> freelances4;

	//bi-directional many-to-one association to Freelance
	@OneToMany(mappedBy="catalogoDetalle5")
	private List<Freelance> freelances5;

	//bi-directional many-to-one association to Freelance
	@OneToMany(mappedBy="catalogoDetalle6")
	private List<Freelance> freelances6;

	//bi-directional many-to-one association to Habilidade
	@OneToMany(mappedBy="catalogoDetalle")
	private List<Habilidade> habilidades;

	//bi-directional many-to-one association to HabilidadesOferta
	@OneToMany(mappedBy="catalogoDetalle")
	private List<HabilidadesOferta> habilidadesOfertas;

	//bi-directional many-to-one association to Idioma
	@OneToMany(mappedBy="catalogoDetalle1")
	private List<Idioma> idiomas1;

	//bi-directional many-to-one association to Idioma
	@OneToMany(mappedBy="catalogoDetalle2")
	private List<Idioma> idiomas2;

	//bi-directional many-to-one association to Idioma
	@OneToMany(mappedBy="catalogoDetalle3")
	private List<Idioma> idiomas3;

	//bi-directional many-to-one association to PersonaDemandante
	@OneToMany(mappedBy="catalogoDetalle")
	private List<PersonaDemandante> personaDemandantes;

	//bi-directional many-to-one association to Portfolio
	@OneToMany(mappedBy="catalogoDetalle")
	private List<Portfolio> portfolios;

	public CatalogoDetalle() {
	}

	public int getIdCatalogoDetalle() {
		return this.idCatalogoDetalle;
	}

	public void setIdCatalogoDetalle(int idCatalogoDetalle) {
		this.idCatalogoDetalle = idCatalogoDetalle;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public List<Capacitacion> getCapacitacions1() {
		return this.capacitacions1;
	}

	public void setCapacitacions1(List<Capacitacion> capacitacions1) {
		this.capacitacions1 = capacitacions1;
	}

	public Capacitacion addCapacitacions1(Capacitacion capacitacions1) {
		getCapacitacions1().add(capacitacions1);
		capacitacions1.setCatalogoDetalle1(this);

		return capacitacions1;
	}

	public Capacitacion removeCapacitacions1(Capacitacion capacitacions1) {
		getCapacitacions1().remove(capacitacions1);
		capacitacions1.setCatalogoDetalle1(null);

		return capacitacions1;
	}

	public List<Capacitacion> getCapacitacions2() {
		return this.capacitacions2;
	}

	public void setCapacitacions2(List<Capacitacion> capacitacions2) {
		this.capacitacions2 = capacitacions2;
	}

	public Capacitacion addCapacitacions2(Capacitacion capacitacions2) {
		getCapacitacions2().add(capacitacions2);
		capacitacions2.setCatalogoDetalle2(this);

		return capacitacions2;
	}

	public Capacitacion removeCapacitacions2(Capacitacion capacitacions2) {
		getCapacitacions2().remove(capacitacions2);
		capacitacions2.setCatalogoDetalle2(null);

		return capacitacions2;
	}

	public List<Capacitacion> getCapacitacions3() {
		return this.capacitacions3;
	}

	public void setCapacitacions3(List<Capacitacion> capacitacions3) {
		this.capacitacions3 = capacitacions3;
	}

	public Capacitacion addCapacitacions3(Capacitacion capacitacions3) {
		getCapacitacions3().add(capacitacions3);
		capacitacions3.setCatalogoDetalle3(this);

		return capacitacions3;
	}

	public Capacitacion removeCapacitacions3(Capacitacion capacitacions3) {
		getCapacitacions3().remove(capacitacions3);
		capacitacions3.setCatalogoDetalle3(null);

		return capacitacions3;
	}

	public CatalogoDetalle getCatalogoDetalle() {
		return this.catalogoDetalle;
	}

	public void setCatalogoDetalle(CatalogoDetalle catalogoDetalle) {
		this.catalogoDetalle = catalogoDetalle;
	}

	public List<CatalogoDetalle> getCatalogoDetalles() {
		return this.catalogoDetalles;
	}

	public void setCatalogoDetalles(List<CatalogoDetalle> catalogoDetalles) {
		this.catalogoDetalles = catalogoDetalles;
	}

	public CatalogoDetalle addCatalogoDetalle(CatalogoDetalle catalogoDetalle) {
		getCatalogoDetalles().add(catalogoDetalle);
		catalogoDetalle.setCatalogoDetalle(this);

		return catalogoDetalle;
	}

	public CatalogoDetalle removeCatalogoDetalle(CatalogoDetalle catalogoDetalle) {
		getCatalogoDetalles().remove(catalogoDetalle);
		catalogoDetalle.setCatalogoDetalle(null);

		return catalogoDetalle;
	}

	public Catalogo getCatalogo() {
		return this.catalogo;
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Experiencia> getExperiencias() {
		return this.experiencias;
	}

	public void setExperiencias(List<Experiencia> experiencias) {
		this.experiencias = experiencias;
	}

	public Experiencia addExperiencia(Experiencia experiencia) {
		getExperiencias().add(experiencia);
		experiencia.setCatalogoDetalle(this);

		return experiencia;
	}

	public Experiencia removeExperiencia(Experiencia experiencia) {
		getExperiencias().remove(experiencia);
		experiencia.setCatalogoDetalle(null);

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
		formacionAcademica.setCatalogoDetalle(this);

		return formacionAcademica;
	}

	public FormacionAcademica removeFormacionAcademica(FormacionAcademica formacionAcademica) {
		getFormacionAcademicas().remove(formacionAcademica);
		formacionAcademica.setCatalogoDetalle(null);

		return formacionAcademica;
	}

	public List<Freelance> getFreelances1() {
		return this.freelances1;
	}

	public void setFreelances1(List<Freelance> freelances1) {
		this.freelances1 = freelances1;
	}

	public Freelance addFreelances1(Freelance freelances1) {
		getFreelances1().add(freelances1);
		freelances1.setCatalogoDetalle1(this);

		return freelances1;
	}

	public Freelance removeFreelances1(Freelance freelances1) {
		getFreelances1().remove(freelances1);
		freelances1.setCatalogoDetalle1(null);

		return freelances1;
	}

	public List<Freelance> getFreelances2() {
		return this.freelances2;
	}

	public void setFreelances2(List<Freelance> freelances2) {
		this.freelances2 = freelances2;
	}

	public Freelance addFreelances2(Freelance freelances2) {
		getFreelances2().add(freelances2);
		freelances2.setCatalogoDetalle2(this);

		return freelances2;
	}

	public Freelance removeFreelances2(Freelance freelances2) {
		getFreelances2().remove(freelances2);
		freelances2.setCatalogoDetalle2(null);

		return freelances2;
	}

	public List<Freelance> getFreelances3() {
		return this.freelances3;
	}

	public void setFreelances3(List<Freelance> freelances3) {
		this.freelances3 = freelances3;
	}

	public Freelance addFreelances3(Freelance freelances3) {
		getFreelances3().add(freelances3);
		freelances3.setCatalogoDetalle3(this);

		return freelances3;
	}

	public Freelance removeFreelances3(Freelance freelances3) {
		getFreelances3().remove(freelances3);
		freelances3.setCatalogoDetalle3(null);

		return freelances3;
	}

	public List<Freelance> getFreelances4() {
		return this.freelances4;
	}

	public void setFreelances4(List<Freelance> freelances4) {
		this.freelances4 = freelances4;
	}

	public Freelance addFreelances4(Freelance freelances4) {
		getFreelances4().add(freelances4);
		freelances4.setCatalogoDetalle4(this);

		return freelances4;
	}

	public Freelance removeFreelances4(Freelance freelances4) {
		getFreelances4().remove(freelances4);
		freelances4.setCatalogoDetalle4(null);

		return freelances4;
	}

	public List<Freelance> getFreelances5() {
		return this.freelances5;
	}

	public void setFreelances5(List<Freelance> freelances5) {
		this.freelances5 = freelances5;
	}

	public Freelance addFreelances5(Freelance freelances5) {
		getFreelances5().add(freelances5);
		freelances5.setCatalogoDetalle5(this);

		return freelances5;
	}

	public Freelance removeFreelances5(Freelance freelances5) {
		getFreelances5().remove(freelances5);
		freelances5.setCatalogoDetalle5(null);

		return freelances5;
	}

	public List<Freelance> getFreelances6() {
		return this.freelances6;
	}

	public void setFreelances6(List<Freelance> freelances6) {
		this.freelances6 = freelances6;
	}

	public Freelance addFreelances6(Freelance freelances6) {
		getFreelances6().add(freelances6);
		freelances6.setCatalogoDetalle6(this);

		return freelances6;
	}

	public Freelance removeFreelances6(Freelance freelances6) {
		getFreelances6().remove(freelances6);
		freelances6.setCatalogoDetalle6(null);

		return freelances6;
	}

	public List<Habilidade> getHabilidades() {
		return this.habilidades;
	}

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

	public Habilidade addHabilidade(Habilidade habilidade) {
		getHabilidades().add(habilidade);
		habilidade.setCatalogoDetalle(this);

		return habilidade;
	}

	public Habilidade removeHabilidade(Habilidade habilidade) {
		getHabilidades().remove(habilidade);
		habilidade.setCatalogoDetalle(null);

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
		habilidadesOferta.setCatalogoDetalle(this);

		return habilidadesOferta;
	}

	public HabilidadesOferta removeHabilidadesOferta(HabilidadesOferta habilidadesOferta) {
		getHabilidadesOfertas().remove(habilidadesOferta);
		habilidadesOferta.setCatalogoDetalle(null);

		return habilidadesOferta;
	}

	public List<Idioma> getIdiomas1() {
		return this.idiomas1;
	}

	public void setIdiomas1(List<Idioma> idiomas1) {
		this.idiomas1 = idiomas1;
	}

	public Idioma addIdiomas1(Idioma idiomas1) {
		getIdiomas1().add(idiomas1);
		idiomas1.setCatalogoDetalle1(this);

		return idiomas1;
	}

	public Idioma removeIdiomas1(Idioma idiomas1) {
		getIdiomas1().remove(idiomas1);
		idiomas1.setCatalogoDetalle1(null);

		return idiomas1;
	}

	public List<Idioma> getIdiomas2() {
		return this.idiomas2;
	}

	public void setIdiomas2(List<Idioma> idiomas2) {
		this.idiomas2 = idiomas2;
	}

	public Idioma addIdiomas2(Idioma idiomas2) {
		getIdiomas2().add(idiomas2);
		idiomas2.setCatalogoDetalle2(this);

		return idiomas2;
	}

	public Idioma removeIdiomas2(Idioma idiomas2) {
		getIdiomas2().remove(idiomas2);
		idiomas2.setCatalogoDetalle2(null);

		return idiomas2;
	}

	public List<Idioma> getIdiomas3() {
		return this.idiomas3;
	}

	public void setIdiomas3(List<Idioma> idiomas3) {
		this.idiomas3 = idiomas3;
	}

	public Idioma addIdiomas3(Idioma idiomas3) {
		getIdiomas3().add(idiomas3);
		idiomas3.setCatalogoDetalle3(this);

		return idiomas3;
	}

	public Idioma removeIdiomas3(Idioma idiomas3) {
		getIdiomas3().remove(idiomas3);
		idiomas3.setCatalogoDetalle3(null);

		return idiomas3;
	}

	public List<PersonaDemandante> getPersonaDemandantes() {
		return this.personaDemandantes;
	}

	public void setPersonaDemandantes(List<PersonaDemandante> personaDemandantes) {
		this.personaDemandantes = personaDemandantes;
	}

	public PersonaDemandante addPersonaDemandante(PersonaDemandante personaDemandante) {
		getPersonaDemandantes().add(personaDemandante);
		personaDemandante.setCatalogoDetalle(this);

		return personaDemandante;
	}

	public PersonaDemandante removePersonaDemandante(PersonaDemandante personaDemandante) {
		getPersonaDemandantes().remove(personaDemandante);
		personaDemandante.setCatalogoDetalle(null);

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
		portfolio.setCatalogoDetalle(this);

		return portfolio;
	}

	public Portfolio removePortfolio(Portfolio portfolio) {
		getPortfolios().remove(portfolio);
		portfolio.setCatalogoDetalle(null);

		return portfolio;
	}

}