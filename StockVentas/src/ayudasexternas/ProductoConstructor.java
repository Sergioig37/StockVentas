package ayudasexternas;

import objetos.Producto;

public class ProductoConstructor {

	
	public ProductoConstructor() {
		
	}
	
	public static Producto construirProducto(String idProducto, String nombre, String cantidad, String precio) {
		
		
		Producto producto = new Producto(idProducto, nombre, Integer.parseInt(cantidad),  Double.parseDouble(precio) );
		
		return producto;
		
	}
}
