package Maquina;

import java.util.ArrayList;
import java.util.Scanner;

/** @autor Luis Martín Tallafigo Gonzalez */
public class Tecla {
	protected int boton;
	// Cambiamos la clase a una secundaria, ya que vamos a crear
	protected void pulsar(int boton, ArrayList<String> Productos) {
		this.boton=boton;
		while (boton != 0 || boton != 1 || boton != 2) {
			System.out.println("pulse 0 para devolver cambio, 1 para "+Productos.get(0)+" 2 para "+Productos.get(1));
			Scanner scan = new Scanner(System.in);
			boton = scan.nextInt();

		}

	}

}
