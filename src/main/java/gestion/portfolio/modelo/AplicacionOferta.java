package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the aplicacion_oferta database table.
 * 
 */
@Entity
@Table(name="aplicacion_oferta")
@NamedQuery(name="AplicacionOferta.findAll", query="SELECT a FROM AplicacionOferta a")
public class AplicacionOferta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_APLICACION_OFERTA")
	private int idAplicacionOferta;

	private String comentario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_APLICADO")
	private Date fechaAplicado;

	private byte seleccionado;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="ID_ESTADO")
	private Estado estado;

	//bi-directional many-to-one association to Freelance
	@ManyToOne
	@JoinColumn(name="ID_FREELANCE")
	private Freelance freelance;

	//bi-directional many-to-one association to Oferta
	@ManyToOne
	@JoinColumn(name="ID_OFERTA")
	private Oferta oferta;

	public AplicacionOferta() {
	}

	public int getIdAplicacionOferta() {
		return this.idAplicacionOferta;
	}

	public void setIdAplicacionOferta(int idAplicacionOferta) {
		this.idAplicacionOferta = idAplicacionOferta;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getFechaAplicado() {
		return this.fechaAplicado;
	}

	public void setFechaAplicado(Date fechaAplicado) {
		this.fechaAplicado = fechaAplicado;
	}

	public byte getSeleccionado() {
		return this.seleccionado;
	}

	public void setSeleccionado(byte seleccionado) {
		this.seleccionado = seleccionado;
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

	public Oferta getOferta() {
		return this.oferta;
	}

	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}

}