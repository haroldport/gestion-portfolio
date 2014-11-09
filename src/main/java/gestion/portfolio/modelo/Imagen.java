package gestion.portfolio.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the imagen database table.
 * 
 */
@Entity
@NamedQuery(name="Imagen.findAll", query="SELECT i FROM Imagen i")
public class Imagen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_IMAGEN")
	private int idImagen;

	@Lob
	private byte[] archivo;

	private String extension;

	private String nombre;

	@Column(name="TIPO_ARCHIVO")
	private String tipoArchivo;

	//bi-directional many-to-one association to Freelance
	@OneToMany(mappedBy="imagen")
	private List<Freelance> freelances;

	//bi-directional many-to-one association to ImagenPortfolio
	@OneToMany(mappedBy="imagen")
	private List<ImagenPortfolio> imagenPortfolios;

	//bi-directional many-to-one association to Oferta
	@OneToMany(mappedBy="imagen")
	private List<Oferta> ofertas;

	public Imagen() {
	}

	public int getIdImagen() {
		return this.idImagen;
	}

	public void setIdImagen(int idImagen) {
		this.idImagen = idImagen;
	}

	public byte[] getArchivo() {
		return this.archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoArchivo() {
		return this.tipoArchivo;
	}

	public void setTipoArchivo(String tipoArchivo) {
		this.tipoArchivo = tipoArchivo;
	}

	public List<Freelance> getFreelances() {
		return this.freelances;
	}

	public void setFreelances(List<Freelance> freelances) {
		this.freelances = freelances;
	}

	public Freelance addFreelance(Freelance freelance) {
		getFreelances().add(freelance);
		freelance.setImagen(this);

		return freelance;
	}

	public Freelance removeFreelance(Freelance freelance) {
		getFreelances().remove(freelance);
		freelance.setImagen(null);

		return freelance;
	}

	public List<ImagenPortfolio> getImagenPortfolios() {
		return this.imagenPortfolios;
	}

	public void setImagenPortfolios(List<ImagenPortfolio> imagenPortfolios) {
		this.imagenPortfolios = imagenPortfolios;
	}

	public ImagenPortfolio addImagenPortfolio(ImagenPortfolio imagenPortfolio) {
		getImagenPortfolios().add(imagenPortfolio);
		imagenPortfolio.setImagen(this);

		return imagenPortfolio;
	}

	public ImagenPortfolio removeImagenPortfolio(ImagenPortfolio imagenPortfolio) {
		getImagenPortfolios().remove(imagenPortfolio);
		imagenPortfolio.setImagen(null);

		return imagenPortfolio;
	}

	public List<Oferta> getOfertas() {
		return this.ofertas;
	}

	public void setOfertas(List<Oferta> ofertas) {
		this.ofertas = ofertas;
	}

	public Oferta addOferta(Oferta oferta) {
		getOfertas().add(oferta);
		oferta.setImagen(this);

		return oferta;
	}

	public Oferta removeOferta(Oferta oferta) {
		getOfertas().remove(oferta);
		oferta.setImagen(null);

		return oferta;
	}

}