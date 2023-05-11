package datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import objetos.Producto;

public class Read {
	
	
	//considera hacer que fichero no sea un atributo estático y cambie según acabe de leer los datos y cerrar el archivo
	//que lo haga una y otra vez mientras tenga archivos que leer
	private final static String FICHERO = "C:\\Users\\Mañana\\Documents\\ST1.txt";
	private final static String FICHERO2 = "C:\\Users\\Mañana\\Documents\\ST2.txt";
	

	public static void readFile() {
		
			BufferedReader ficheroEntrada, ficheroEntrada2;
			ArrayList<Producto> productos = new ArrayList<Producto>();
			
			try {
				ficheroEntrada = new BufferedReader(new FileReader(FICHERO));
				ficheroEntrada2 = new BufferedReader(new FileReader(FICHERO2));
				
				String idProducto = ficheroEntrada.readLine();
				String idProducto2 = ficheroEntrada.readLine();
				
				while(idProducto!=null) {
					
					String nombreProducto = ficheroEntrada.readLine();
					String nombreProducto2 = ficheroEntrada.readLine();
					
					
					String cantidad = ficheroEntrada.readLine();
					String cantidad2 = ficheroEntrada.readLine();
					
					String precio = ficheroEntrada.readLine();
					String precio2 = ficheroEntrada.readLine();
					
					
					
					
					
				}
				
			}
			catch(Exception e){
				
			}
	}
}
