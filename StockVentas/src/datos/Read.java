package datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import ayudasexternas.ComparadorProductos;
import ayudasexternas.ProductoConstructor;
import objetos.Producto;

public class Read {
	
	
	//considera hacer que fichero no sea un atributo estático y cambie según acabe de leer los datos y cerrar el archivo
	//que lo haga una y otra vez mientras tenga archivos que leer
	

	public static Iterator<Producto> readFiles(String Fichero) {
		
			BufferedReader ficheroEntrada;
			ArrayList<Producto> productos = new ArrayList<Producto>();
			
			try {
				ficheroEntrada = new BufferedReader(new FileReader(Fichero));
			
				
				String idProducto = ficheroEntrada.readLine();
				

				while(idProducto!=null) {
					
					
						
						String nombre = ficheroEntrada.readLine();
						
						String cantidad = ficheroEntrada.readLine();
						
						String precio = ficheroEntrada.readLine();
						
						 Producto productonew = ProductoConstructor.construirProducto(idProducto, nombre, cantidad, precio);
						 
						
						 
						 productos.add(productonew);
												
						idProducto = ficheroEntrada.readLine();

				}
				ficheroEntrada.close();
			}
			catch(Exception e){
				System.out.println("Error, precios diferentes");
				e.printStackTrace();
			}
			return productos.iterator();
	}
}
