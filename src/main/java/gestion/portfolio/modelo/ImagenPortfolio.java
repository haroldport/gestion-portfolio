package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the imagen_portfolio database table.
 * 
 */
@Entity
@Table(name="imagen_portfolio")
@NamedQuery(name="ImagenPortfolio.findAll", query="SELECT i FROM ImagenPortfolio i")
public class ImagenPortfolio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_IMAGEN_PORTFOLIO")
	private int idImagenPortfolio;

	//bi-directional many-to-one association to Imagen
	@ManyToOne
	@JoinColumn(name="ID_IMAGEN")
	private Imagen imagen;

	//bi-directional many-to-one association to Portfolio
	@ManyToOne
	@JoinColumn(name="ID_PORTFOLIO")
	private Portfolio portfolio;

	public ImagenPortfolio() {
	}

	public int getIdImagenPortfolio() {
		return this.idImagenPortfolio;
	}

	public void setIdImagenPortfolio(int idImagenPortfolio) {
		this.idImagenPortfolio = idImagenPortfolio;
	}

	public Imagen getImagen() {
		return this.imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

	public Portfolio getPortfolio() {
		return this.portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

}