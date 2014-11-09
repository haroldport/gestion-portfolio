package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the idioma database table.
 * 
 */
@Entity
@NamedQuery(name="Idioma.findAll", query="SELECT i FROM Idioma i")
public class Idioma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_IDIOMA")
	private int idIdioma;

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
	@JoinColumn(name="ID_NIVEL_ESCRITO")
	private CatalogoDetalle catalogoDetalle1;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_NIVEL_HABLADO")
	private CatalogoDetalle catalogoDetalle2;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_NOMBRE_IDIOMA")
	private CatalogoDetalle catalogoDetalle3;

	public Idioma() {
	}

	public int getIdIdioma() {
		return this.idIdioma;
	}

	public void setIdIdioma(int idIdioma) {
		this.idIdioma = idIdioma;
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

	public CatalogoDetalle getCatalogoDetalle3() {
		return this.catalogoDetalle3;
	}

	public void setCatalogoDetalle3(CatalogoDetalle catalogoDetalle3) {
		this.catalogoDetalle3 = catalogoDetalle3;
	}

}