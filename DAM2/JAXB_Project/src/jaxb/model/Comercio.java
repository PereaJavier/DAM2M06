package jaxb.model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//La clase Comercio es un elemento raíz, para ello usaremos la anotación siguiente.

/***
 * Clase que se vinculará con el nombreTienda del nodo raiz del fichero xml a
 * través de la propiedad name.
 */
@XmlRootElement(name = "shop")
@XmlAccessorType(XmlAccessType.FIELD)
public class Comercio {
	@XmlElement(name = "name")
	private String nombreTienda;
	@XmlElementWrapper(name = "products")
	@XmlElement(name = "product")
	public ArrayList<Producto> productos;

	public Comercio() {

	}

	public Comercio(String nombreTienda, ArrayList<Producto> p) {
		this.nombreTienda = nombreTienda;
		this.productos = p;
	}

	public String getnombreTienda() {
		return this.nombreTienda;
	}

	/**
	 * Usamos el envoltorio (wrapper) que mapeará el valor de la etiqueta "products"
	 * con el array de productos.Además, mapeamos cada elemento contenido que se
	 * corresponderá con la clase Producto (etiqueta xml con nombreTienda "product")
	 */

	public ArrayList<Producto> getProductos() {
		return this.productos;
	}

	public void setnombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
}
