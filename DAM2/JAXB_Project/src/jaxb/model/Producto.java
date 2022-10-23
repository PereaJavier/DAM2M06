package jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Para mapear las propiedades en orden vincularemos el nombre de la propiedad
 * xml con su definición en la clase. Solamente si se llaman iguales los
 * atributos que los nombres de los propiedades podremos vincularlos con
 * propOrder
 */
@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
// @XmlType(propOrder = { "id", "name", "price", "stock" })
public class Producto {
	@XmlAttribute(name = "id")
	private Integer id;
	@XmlElement(name = "title")
	private String nombre;
	@XmlElement(name = "price")
	private float precio;
	@XmlElement(name = "stock")
	private int stock;

	public Producto() {
		super();
	}

	public Producto(Integer id, String nombre, float precio, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
