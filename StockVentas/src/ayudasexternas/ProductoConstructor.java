package ayudasexternas;

import error.PrecioNoCoincideException;
import objetos.Producto;

public class ProductoConstructor {

	
	public ProductoConstructor() {
		
	}
	
	public static Producto construirProducto(String idProducto, String nombre, String cantidad, String precio) {
		
		Producto producto = new Producto(idProducto, nombre, Integer.parseInt(cantidad),  Double.parseDouble(precio) );
		
		try {
			producto = ComparadorProductos.compararProductos(producto);
		} catch (PrecioNoCoincideException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		return producto;
		
	}
}
