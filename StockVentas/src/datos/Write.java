package datos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Iterator;

import objetos.Producto;

public class Write {

	private final static String FICHERO = "C:\\Users\\Mañana\\Documents\\resultado.txt";
	
	public static void rellenarArchivo(Iterator<Producto> p) {
	
		BufferedWriter ficheroSalida;
		
		
		Iterator<Producto> productos = p;
		
		
		try {
			ficheroSalida = new BufferedWriter(new FileWriter(FICHERO));
			
			while(productos.hasNext()){
				
				Producto producto = productos.next();
				
				ficheroSalida.write(producto.toString()+"\n");
				
			}
			ficheroSalida.close();
		}
		catch(Exception e) {
			System.out.println("No se pudo escribir nada");
			e.printStackTrace();
		}
	}
}
