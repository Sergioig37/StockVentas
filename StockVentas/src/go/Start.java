package go;

import datos.InfoFichero;
import datos.Read;
import datos.Write;
import error.PrecioNoCoincideException;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InfoFichero informacion = new InfoFichero();
		try {
			Write.rellenarArchivo(informacion.guardarProductos(Read.readFile()));
		} catch (PrecioNoCoincideException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
