package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the capacitacion database table.
 * 
 */
@Entity
@NamedQuery(name="Capacitacion.findAll", query="SELECT c FROM Capacitacion c")
public class Capacitacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CAPACITACION")
	private int idCapacitacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_DESDE")
	private Date fechaDesde;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_HASTA")
	private Date fechaHasta;

	@Column(name="NOMBRE_EVENTO")
	private String nombreEvento;

	@Column(name="NOMBRE_INSTITUCION")
	private String nombreInstitucion;

	@Column(name="NUMERO_DIAS")
	private int numeroDias;

	@Column(name="NUMERO_HORAS")
	private int numeroHoras;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_AREA_ESTUDIO")
	private CatalogoDetalle catalogoDetalle1;

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
	@JoinColumn(name="ID_TIPO_CERTIFICADO")
	private CatalogoDetalle catalogoDetalle2;

	//bi-directional many-to-one association to CatalogoDetalle
	@ManyToOne
	@JoinColumn(name="ID_TIPO_EVENTO")
	private CatalogoDetalle catalogoDetalle3;

	public Capacitacion() {
	}

	public int getIdCapacitacion() {
		return this.idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
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

	public String getNombreEvento() {
		return this.nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public String getNombreInstitucion() {
		return this.nombreInstitucion;
	}

	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}

	public int getNumeroDias() {
		return this.numeroDias;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	public int getNumeroHoras() {
		return this.numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public CatalogoDetalle getCatalogoDetalle1() {
		return this.catalogoDetalle1;
	}

	public void setCatalogoDetalle1(CatalogoDetalle catalogoDetalle1) {
		this.catalogoDetalle1 = catalogoDetalle1;
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