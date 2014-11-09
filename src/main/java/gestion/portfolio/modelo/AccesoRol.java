package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the acceso_rol database table.
 * 
 */
@Entity
@Table(name="acceso_rol")
@NamedQuery(name="AccesoRol.findAll", query="SELECT a FROM AccesoRol a")
public class AccesoRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ACCESO_ROL")
	private int idAccesoRol;

	//bi-directional many-to-one association to Acceso
	@ManyToOne
	@JoinColumn(name="ID_ACCESO")
	private Acceso acceso;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="ID_ESTADO")
	private Estado estado;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="ID_ROL")
	private Rol rol;

	public AccesoRol() {
	}

	public int getIdAccesoRol() {
		return this.idAccesoRol;
	}

	public void setIdAccesoRol(int idAccesoRol) {
		this.idAccesoRol = idAccesoRol;
	}

	public Acceso getAcceso() {
		return this.acceso;
	}

	public void setAcceso(Acceso acceso) {
		this.acceso = acceso;
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