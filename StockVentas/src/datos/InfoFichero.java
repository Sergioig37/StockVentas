package datos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import error.PrecioNoCoincideException;
import objetos.Producto;

public class InfoFichero {

	private ArrayList<Producto> listaProductos ;
	
	
	public  InfoFichero() {
		
		listaProductos = new ArrayList<Producto>();
		
		
	}
	
	public Iterator<Producto> guardarProductos(Iterator<Producto> productos) throws PrecioNoCoincideException {

		while(productos.hasNext()) {
			
			if(listaProductos.contains(productos.next())) {
				if(productos.next().getPrecio()==listaProductos.get(listaProductos.indexOf(productos.next())).getPrecio()) {
					
					int cantidadVieja = listaProductos.get(listaProductos.indexOf(productos.next())).getCantidad();
					int cantidadNueva = productos.next().getCantidad();
					
					listaProductos.get(listaProductos.indexOf(productos.next())).setCantidad(cantidadVieja+cantidadNueva);
					
				}
				else if(productos.next().getPrecio()!=listaProductos.get(listaProductos.indexOf(productos.next())).getPrecio()) {
					PrecioNoCoincideException precioDiferente = new PrecioNoCoincideException("Precios Diferentes");
					throw precioDiferente;
				}

				
			}
			else if(!listaProductos.contains(productos.next())) {
				listaProductos.add(productos.next());
			}
			
			}
		
		return listaProductos.iterator();
			
			
		}
		
	
}
