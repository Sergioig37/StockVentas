package objetos;

public class Producto {

	private String idProducto;
	private String nombreProducto;
	private int cantidad;
	private double precio;
	
	
	public Producto(String idProducto, String nombreProducto) {
		
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		
	}


	
	
	
	
	
	public String getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}


	public String getNombreProducto() {
		return nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
