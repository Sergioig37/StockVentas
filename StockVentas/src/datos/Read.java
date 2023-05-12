package datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import ayudasexternas.ProductoConstructor;
import objetos.Producto;

public class Read {
	
	
	//considera hacer que fichero no sea un atributo estático y cambie según acabe de leer los datos y cerrar el archivo
	//que lo haga una y otra vez mientras tenga archivos que leer
	private final static String FICHERO = "C:\\Users\\Mañana\\Documents\\ST1.txt";
	private final static String FICHERO2 = "C:\\Users\\Mañana\\Documents\\ST2.txt";
	

	public static Iterator<Producto> readFile() {
		
			BufferedReader ficheroEntrada, ficheroEntrada2;
			ArrayList<Producto> productos = new ArrayList<Producto>();
			
			try {
				ficheroEntrada = new BufferedReader(new FileReader(FICHERO));
				ficheroEntrada2 = new BufferedReader(new FileReader(FICHERO2));
				
				String idProducto = ficheroEntrada.readLine();
				String idProducto2 = ficheroEntrada2.readLine();

				while(idProducto!=null||idProducto2!= null) {
					
					if(idProducto!=null) {
						
						String nombre = ficheroEntrada.readLine();
						
						String cantidad = ficheroEntrada.readLine();
						
						String precio = ficheroEntrada.readLine();
						
						
						
						productos.add(ProductoConstructor.construirProducto(idProducto, nombre, cantidad, precio));
						
						idProducto = ficheroEntrada.readLine();
					}
					
					if(idProducto2!=null) {
						
						String nombre2 = ficheroEntrada2.readLine();
						
						String cantidad2 = ficheroEntrada2.readLine();
						
						String precio2 = ficheroEntrada2.readLine();
						
						productos.add(ProductoConstructor.construirProducto(idProducto, nombre2, cantidad2, precio2));
						
						idProducto2 = ficheroEntrada2.readLine();
					}

				}
				ficheroEntrada.close();
				
			}
			catch(Exception e){
				System.out.println("No se pudo leer ningún producto");
				e.printStackTrace();
			}
			;
			return productos.iterator();
	}
}
