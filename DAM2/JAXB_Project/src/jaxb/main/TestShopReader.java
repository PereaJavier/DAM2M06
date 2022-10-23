package jaxb.main;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import jaxb.model.Comercio;
import jaxb.model.Producto;

public class TestShopReader {
	/**
	 * Método para leer los productos de un comercio
	 * @param Comercio
	 */
	public static void readProducts(Comercio miComercioXML) {
		ArrayList<Producto> products = miComercioXML.getProductos();
		for (Producto product : products) {
			// System.out.println(product);
			System.out.println("Nombre Producto con ID " + product.getId() + ": " + product.getNombre() + "\nPrecio: "
					+ product.getPrecio() + "€");
		}
	}

	/**
	 * Método para probar el binding el XML.
	 */
	public static void readShopInfo(File fileXmlPath) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Comercio.class);
		// Unmarshaller será el objeto que me permita leer el XML.
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Comercio miComercioXML = (Comercio) unmarshaller.unmarshal(fileXmlPath);
		System.out.println("Nombre: " + miComercioXML.getnombreTienda());
		readProducts(miComercioXML);
	}

}
