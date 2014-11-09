package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the log_sistema database table.
 * 
 */
@Entity
@Table(name="log_sistema")
@NamedQuery(name="LogSistema.findAll", query="SELECT l FROM LogSistema l")
public class LogSistema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_LOG_SISTEMA")
	private int idLogSistema;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String observacion;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;

	public LogSistema() {
	}

	public int getIdLogSistema() {
		return this.idLogSistema;
	}

	public void setIdLogSistema(int idLogSistema) {
		this.idLogSistema = idLogSistema;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}