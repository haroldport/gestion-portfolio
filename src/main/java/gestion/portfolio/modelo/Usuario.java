package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_USUARIO")
	private int idUsuario;

	private String clave;

	private String username;

	//bi-directional many-to-one association to Freelance
	@OneToMany(mappedBy="usuario")
	private List<Freelance> freelances;

	//bi-directional many-to-one association to LogSistema
	@OneToMany(mappedBy="usuario")
	private List<LogSistema> logSistemas;

	//bi-directional many-to-one association to PersonaDemandante
	@OneToMany(mappedBy="usuario")
	private List<PersonaDemandante> personaDemandantes;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="ID_ESTADO")
	private Estado estado;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="ID_ROL")
	private Rol rol;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Freelance> getFreelances() {
		return this.freelances;
	}

	public void setFreelances(List<Freelance> freelances) {
		this.freelances = freelances;
	}

	public Freelance addFreelance(Freelance freelance) {
		getFreelances().add(freelance);
		freelance.setUsuario(this);

		return freelance;
	}

	public Freelance removeFreelance(Freelance freelance) {
		getFreelances().remove(freelance);
		freelance.setUsuario(null);

		return freelance;
	}

	public List<LogSistema> getLogSistemas() {
		return this.logSistemas;
	}

	public void setLogSistemas(List<LogSistema> logSistemas) {
		this.logSistemas = logSistemas;
	}

	public LogSistema addLogSistema(LogSistema logSistema) {
		getLogSistemas().add(logSistema);
		logSistema.setUsuario(this);

		return logSistema;
	}

	public LogSistema removeLogSistema(LogSistema logSistema) {
		getLogSistemas().remove(logSistema);
		logSistema.setUsuario(null);

		return logSistema;
	}

	public List<PersonaDemandante> getPersonaDemandantes() {
		return this.personaDemandantes;
	}

	public void setPersonaDemandantes(List<PersonaDemandante> personaDemandantes) {
		this.personaDemandantes = personaDemandantes;
	}

	public PersonaDemandante addPersonaDemandante(PersonaDemandante personaDemandante) {
		getPersonaDemandantes().add(personaDemandante);
		personaDemandante.setUsuario(this);

		return personaDemandante;
	}

	public PersonaDemandante removePersonaDemandante(PersonaDemandante personaDemandante) {
		getPersonaDemandantes().remove(personaDemandante);
		personaDemandante.setUsuario(null);

		return personaDemandante;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}