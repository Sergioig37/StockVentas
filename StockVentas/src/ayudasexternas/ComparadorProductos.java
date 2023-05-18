package ayudasexternas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import error.PrecioNoCoincideException;
import objetos.Producto;

public class ComparadorProductos {
	
	private static HashMap<String, Producto> lista = new HashMap<String, Producto>();

	
	public static  Producto compararProductos(Producto producto) throws PrecioNoCoincideException{
		
			if(lista.containsKey(producto.getIdProducto())) {
				if(lista.get(producto.getIdProducto()).getPrecio()==producto.getPrecio()) {
					int cantidadExtra = producto.getCantidad();
					int cantidadAntigua = lista.get(producto.getIdProducto()).getCantidad();
					lista.get(producto.getIdProducto()).setCantidad(cantidadAntigua+cantidadExtra);
				}
				else {
					lista.remove(producto.getIdProducto());
					throw new PrecioNoCoincideException("Precio diferente");
				}
			}
			else {
				lista.put(producto.getIdProducto(), producto);
			}
		
		return producto;
	}
	
	public static Iterator<Producto> sacarFicheroFusionado(){
		
		ArrayList<Producto> listaFinal = new ArrayList<Producto>();
		
		listaFinal.addAll(lista.values());
		
		return listaFinal.iterator();
		
	}
	
}

