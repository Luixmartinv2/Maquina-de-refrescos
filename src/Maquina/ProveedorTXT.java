package Maquina;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ProveedorTXT {
	
	/***********************************************************/
	private static void escribirFichero(ArrayList<String> listaProductos) {

		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter("ListaProductos.txt");

			for (int x = 0; x <= listaProductos.size() - 1; x++) {

				pw = new PrintWriter(fichero);
				pw.println(listaProductos.get(x));
			}
			fichero.close();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
/**********************************************************************/
	private ArrayList<String> leerFichero() {
		ArrayList<String> listaProductos = new ArrayList<String>();
		File archivo = null;

		// Recorre el fichero y añadir elementos a mi arraylist

		FileReader fr = null;
		BufferedReader br = null;

		try {
			archivo = new File("ListaProductos.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String Linea;
			while ((Linea = br.readLine()) != null) {
				listaProductos.add(Linea);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaProductos;
	}
/**********************************************************************/
}
