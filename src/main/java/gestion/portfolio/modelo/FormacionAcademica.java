package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the formacion_academica database table.
 * 
 */
@Entity
@Table(name="formacion_academica")
@NamedQuery(name="FormacionAcademica.findAll", query="SELECT f FROM FormacionAcademica f")
public class FormacionAcademica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_FORMACION_ACADEMICA")
	private int idFormacionAcademica;

	@Column(name="ANIOS_ESTUDIO")
	private int aniosEstudio;

	@Column(name="NOMBRE_INSTITUCION")
	private String nombreInstitucion;

	@Column(name="TITULO_OBTENIDO")
	private String tituloObtenido;

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
	@JoinColumn(name="ID_NIVEL_INSTRUCCION")
	private CatalogoDetalle catalogoDetalle;

	public FormacionAcademica() {
	}

	public int getIdFormacionAcademica() {
		return this.idFormacionAcademica;
	}

	public void setIdFormacionAcademica(int idFormacionAcademica) {
		this.idFormacionAcademica = idFormacionAcademica;
	}

	public int getAniosEstudio() {
		return this.aniosEstudio;
	}

	public void setAniosEstudio(int aniosEstudio) {
		this.aniosEstudio = aniosEstudio;
	}

	public String getNombreInstitucion() {
		return this.nombreInstitucion;
	}

	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}

	public String getTituloObtenido() {
		return this.tituloObtenido;
	}

	public void setTituloObtenido(String tituloObtenido) {
		this.tituloObtenido = tituloObtenido;
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