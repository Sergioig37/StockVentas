package go;





import java.util.Iterator;

import ayudasexternas.ComparadorProductos;
import datos.FicheroST1;
import datos.Read;
import datos.Write;
import error.PrecioNoCoincideException;
import objetos.Producto;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FicheroST1 fichero1 = new FicheroST1("C:\\Users\\Mañana\\Documents\\ST1.txt");
		FicheroST1 fichero2 = new FicheroST1("C:\\Users\\Mañana\\Documents\\ST2.txt");
		
		
		
		fichero1.guardarDatos(Read.readFiles(fichero1.getFichero()));
		fichero2.guardarDatos(Read.readFiles(fichero2.getFichero()));
		
		System.out.println(fichero1.toString());
		System.out.println(fichero2.toString());
		
		Write.rellenarArchivo(ComparadorProductos.sacarFicheroFusionado());
		
		
		
		//"C:\\Users\\Mañana\\Documents\\ST1.txt"
		//"C:\\Users\\Mañana\\Documents\\ST1.txt"
	}

}
