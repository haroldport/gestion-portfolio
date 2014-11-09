package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the habilidades_oferta database table.
 * 
 */
@Entity
@Table(name="habilidades_oferta")
@NamedQuery(name="HabilidadesOferta.findAll", query="SELECT h FROM HabilidadesOferta h")
public class HabilidadesOferta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_HABILIDAD_OFERTA")
	private int idHabilidadOferta;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="ID_ESTADO")
	private Estado estado;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_NOMBRE_HABILIDAD")
	private CatalogoDetalle catalogoDetalle;

	//bi-directional many-to-one association to Oferta
	@ManyToOne
	@JoinColumn(name="ID_OFERTA")
	private Oferta oferta;

	public HabilidadesOferta() {
	}

	public int getIdHabilidadOferta() {
		return this.idHabilidadOferta;
	}

	public void setIdHabilidadOferta(int idHabilidadOferta) {
		this.idHabilidadOferta = idHabilidadOferta;
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

	public Oferta getOferta() {
		return this.oferta;
	}

	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}

}