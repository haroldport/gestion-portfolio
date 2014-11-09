package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the experiencia database table.
 * 
 */
@Entity
@NamedQuery(name="Experiencia.findAll", query="SELECT e FROM Experiencia e")
public class Experiencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_EXPERIENCIA")
	private int idExperiencia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_DESDE")
	private Date fechaDesde;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_HASTA")
	private Date fechaHasta;

	@Column(name="NOMBRE_INSTITUCION")
	private String nombreInstitucion;

	private String puesto;

	@Column(name="RESUMEN_ACTIVIDADES")
	private String resumenActividades;

	@Column(name="TRABAJO_ACTUAL")
	private byte trabajoActual;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_AREA_TRABAJO")
	private CatalogoDetalle catalogoDetalle;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="ID_ESTADO")
	private Estado estado;

	//bi-directional many-to-one association to Freelance
	@ManyToOne
	@JoinColumn(name="ID_FREELANCE")
	private Freelance freelance;

	public Experiencia() {
	}

	public int getIdExperiencia() {
		return this.idExperiencia;
	}

	public void setIdExperiencia(int idExperiencia) {
		this.idExperiencia = idExperiencia;
	}

	public Date getFechaDesde() {
		return this.fechaDesde;
	}

	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public Date getFechaHasta() {
		return this.fechaHasta;
	}

	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	public String getNombreInstitucion() {
		return this.nombreInstitucion;
	}

	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}

	public String getPuesto() {
		return this.puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getResumenActividades() {
		return this.resumenActividades;
	}

	public void setResumenActividades(String resumenActividades) {
		this.resumenActividades = resumenActividades;
	}

	public byte getTrabajoActual() {
		return this.trabajoActual;
	}

	public void setTrabajoActual(byte trabajoActual) {
		this.trabajoActual = trabajoActual;
	}

	public CatalogoDetalle getCatalogoDetalle() {
		return this.catalogoDetalle;
	}

	public void setCatalogoDetalle(CatalogoDetalle catalogoDetalle) {
		this.catalogoDetalle = catalogoDetalle;
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

}