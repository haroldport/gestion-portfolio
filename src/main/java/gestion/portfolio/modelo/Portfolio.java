package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the portfolio database table.
 * 
 */
@Entity
@NamedQuery(name="Portfolio.findAll", query="SELECT p FROM Portfolio p")
public class Portfolio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PORTFOLIO")
	private int idPortfolio;

	private String descripcion;

	private String titulo;

	//bi-directional many-to-one association to ImagenPortfolio
	@OneToMany(mappedBy="portfolio")
	private List<ImagenPortfolio> imagenPortfolios;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="ID_ESTADO")
	private Estado estado;

	//bi-directional many-to-one association to Freelance
	@ManyToOne
	@JoinColumn(name="ID_FREELANCE")
	private Freelance freelance;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_TIPO_CONTENIDO")
	private CatalogoDetalle catalogoDetalle;

	public Portfolio() {
	}

	public int getIdPortfolio() {
		return this.idPortfolio;
	}

	public void setIdPortfolio(int idPortfolio) {
		this.idPortfolio = idPortfolio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<ImagenPortfolio> getImagenPortfolios() {
		return this.imagenPortfolios;
	}

	public void setImagenPortfolios(List<ImagenPortfolio> imagenPortfolios) {
		this.imagenPortfolios = imagenPortfolios;
	}

	public ImagenPortfolio addImagenPortfolio(ImagenPortfolio imagenPortfolio) {
		getImagenPortfolios().add(imagenPortfolio);
		imagenPortfolio.setPortfolio(this);

		return imagenPortfolio;
	}

	public ImagenPortfolio removeImagenPortfolio(ImagenPortfolio imagenPortfolio) {
		getImagenPortfolios().remove(imagenPortfolio);
		imagenPortfolio.setPortfolio(null);

		return imagenPortfolio;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Freelance getFreelance() {
		return this.freelance;
	}

	public void setFreelance(Freelance freelance) {
		this.freelance = freelance;
	}

	public CatalogoDetalle getCatalogoDetalle() {
		return this.catalogoDetalle;
	}

	public void setCatalogoDetalle(CatalogoDetalle catalogoDetalle) {
		this.catalogoDetalle = catalogoDetalle;
	}

}