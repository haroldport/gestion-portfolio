package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ofertas database table.
 * 
 */
@Entity
@Table(name="ofertas")
@NamedQuery(name="Oferta.findAll", query="SELECT o FROM Oferta o")
public class Oferta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_OFERTA")
	private int idOferta;

	@Column(name="ANIOS_EXPERIENCIA")
	private int aniosExperiencia;

	private String descripcion;

	private String nombre;

	@Column(name="TIEMPO_ENTREGA")
	private int tiempoEntrega;

	//bi-directional many-to-one association to AplicacionOferta
	@OneToMany(mappedBy="oferta")
	private List<AplicacionOferta> aplicacionOfertas;

	//bi-directional many-to-one association to HabilidadesOferta
	@OneToMany(mappedBy="oferta")
	private List<HabilidadesOferta> habilidadesOfertas;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="ID_ESTADO")
	private Estado estado;

	//bi-directional many-to-one association to Imagen
	@ManyToOne
	@JoinColumn(name="ID_IMAGEN")
	private Imagen imagen;

	//bi-directional many-to-one association to PersonaDemandante
	@ManyToOne
	@JoinColumn(name="ID_PERSONA_DEMANDANTE")
	private PersonaDemandante personaDemandante;

	public Oferta() {
	}

	public int getIdOferta() {
		return this.idOferta;
	}

	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}

	public int getAniosExperiencia() {
		return this.aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempoEntrega() {
		return this.tiempoEntrega;
	}

	public void setTiempoEntrega(int tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}

	public List<AplicacionOferta> getAplicacionOfertas() {
		return this.aplicacionOfertas;
	}

	public void setAplicacionOfertas(List<AplicacionOferta> aplicacionOfertas) {
		this.aplicacionOfertas = aplicacionOfertas;
	}

	public AplicacionOferta addAplicacionOferta(AplicacionOferta aplicacionOferta) {
		getAplicacionOfertas().add(aplicacionOferta);
		aplicacionOferta.setOferta(this);

		return aplicacionOferta;
	}

	public AplicacionOferta removeAplicacionOferta(AplicacionOferta aplicacionOferta) {
		getAplicacionOfertas().remove(aplicacionOferta);
		aplicacionOferta.setOferta(null);

		return aplicacionOferta;
	}

	public List<HabilidadesOferta> getHabilidadesOfertas() {
		return this.habilidadesOfertas;
	}

	public void setHabilidadesOfertas(List<HabilidadesOferta> habilidadesOfertas) {
		this.habilidadesOfertas = habilidadesOfertas;
	}

	public HabilidadesOferta addHabilidadesOferta(HabilidadesOferta habilidadesOferta) {
		getHabilidadesOfertas().add(habilidadesOferta);
		habilidadesOferta.setOferta(this);

		return habilidadesOferta;
	}

	public HabilidadesOferta removeHabilidadesOferta(HabilidadesOferta habilidadesOferta) {
		getHabilidadesOfertas().remove(habilidadesOferta);
		habilidadesOferta.setOferta(null);

		return habilidadesOferta;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Imagen getImagen() {
		return this.imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

	public PersonaDemandante getPersonaDemandante() {
		return this.personaDemandante;
	}

	public void setPersonaDemandante(PersonaDemandante personaDemandante) {
		this.personaDemandante = personaDemandante;
	}

}