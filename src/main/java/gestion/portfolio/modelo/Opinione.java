package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the opiniones database table.
 * 
 */
@Entity
@Table(name="opiniones")
@NamedQuery(name="Opinione.findAll", query="SELECT o FROM Opinione o")
public class Opinione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_OPINION")
	private int idOpinion;

	private String descripcion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_REGISTRO")
	private Date fechaRegistro;

	//bi-directional many-to-one association to OpinionFreelance
	@OneToMany(mappedBy="opinione")
	private List<OpinionFreelance> opinionFreelances;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="ID_ESTADO")
	private Estado estado;

	public Opinione() {
	}

	public int getIdOpinion() {
		return this.idOpinion;
	}

	public void setIdOpinion(int idOpinion) {
		this.idOpinion = idOpinion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public List<OpinionFreelance> getOpinionFreelances() {
		return this.opinionFreelances;
	}

	public void setOpinionFreelances(List<OpinionFreelance> opinionFreelances) {
		this.opinionFreelances = opinionFreelances;
	}

	public OpinionFreelance addOpinionFreelance(OpinionFreelance opinionFreelance) {
		getOpinionFreelances().add(opinionFreelance);
		opinionFreelance.setOpinione(this);

		return opinionFreelance;
	}

	public OpinionFreelance removeOpinionFreelance(OpinionFreelance opinionFreelance) {
		getOpinionFreelances().remove(opinionFreelance);
		opinionFreelance.setOpinione(null);

		return opinionFreelance;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}