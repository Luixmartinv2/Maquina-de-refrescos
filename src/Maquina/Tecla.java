package Maquina;

import java.util.Scanner;
/** @autor Luis Martín Tallafigo Gonzalez*/
public class Tecla {
	
	protected int boton = -1;
	
	protected void pulsar(){
		
		
		while (boton!=0 || boton!=1 ||boton!=2) {
			System.out.println("pulse 0 para devolver cambio, 1 para Coca-cola, 2 para Fanta");
			Scanner scan = new Scanner(System.in);
			boton= scan.nextInt();
			
			
		}
		
		
		
	}

}
