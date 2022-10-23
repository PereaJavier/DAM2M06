package jaxb.main;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import jaxb.model.Comercio;
import jaxb.model.Producto;

public class AppRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hay que pasarle como parámetro la clase que representa TODO EL XML.
		// En nuestro caso es Comercio.
		try {
			TestShopReader.readShopInfo(new File("resources/productosResult.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
