package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the habilidades database table.
 * 
 */
@Entity
@Table(name="habilidades")
@NamedQuery(name="Habilidade.findAll", query="SELECT h FROM Habilidade h")
public class Habilidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_HABILIDAD")
	private int idHabilidad;

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
	@JoinColumn(name="ID_NOMBRE_HABILIDAD")
	private CatalogoDetalle catalogoDetalle;

	public Habilidade() {
	}

	public int getIdHabilidad() {
		return this.idHabilidad;
	}

	public void setIdHabilidad(int idHabilidad) {
		this.idHabilidad = idHabilidad;
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