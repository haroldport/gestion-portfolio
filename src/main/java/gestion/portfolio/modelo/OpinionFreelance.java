package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the opinion_freelance database table.
 * 
 */
@Entity
@Table(name="opinion_freelance")
@NamedQuery(name="OpinionFreelance.findAll", query="SELECT o FROM OpinionFreelance o")
public class OpinionFreelance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_OPINION_FREELANCE")
	private int idOpinionFreelance;

	private int ranking;

	//bi-directional many-to-one association to Freelance
	@ManyToOne
	@JoinColumn(name="ID_FREELANCE")
	private Freelance freelance;

	//bi-directional many-to-one association to Opinione
	@ManyToOne
	@JoinColumn(name="ID_OPINION")
	private Opinione opinione;

	//bi-directional many-to-one association to PersonaDemandante
	@ManyToOne
	@JoinColumn(name="ID_PERSONA_DEMANDANTE")
	private PersonaDemandante personaDemandante;

	public OpinionFreelance() {
	}

	public int getIdOpinionFreelance() {
		return this.idOpinionFreelance;
	}

	public void setIdOpinionFreelance(int idOpinionFreelance) {
		this.idOpinionFreelance = idOpinionFreelance;
	}

	public int getRanking() {
		return this.ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public Freelance getFreelance() {
		return this.freelance;
	}

	public void setFreelance(Freelance freelance) {
		this.freelance = freelance;
	}

	public Opinione getOpinione() {
		return this.opinione;
	}

	public void setOpinione(Opinione opinione) {
		this.opinione = opinione;
	}

	public PersonaDemandante getPersonaDemandante() {
		return this.personaDemandante;
	}

	public void setPersonaDemandante(PersonaDemandante personaDemandante) {
		this.personaDemandante = personaDemandante;
	}

}