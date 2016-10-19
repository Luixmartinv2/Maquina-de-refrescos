package Maquina;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/** @author luis.tallafigo */
public class Deposito {

	public int valor;
	public int cantidad;
	public Integer[] Valor = new Integer[3];
	public Integer[] Cantidad = new Integer[3];
	ArrayList<Integer> listaMonedas = new ArrayList<Integer>();
	
	public void añadir(){
		
		 Valor[0]= 200; 
		 Valor[1]= 100;
		 Valor[2]= 50;
		
		if(valor==100){
			Cantidad[1]+=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			
		} else if (valor ==200) {
			Cantidad[0]+=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			
		} else if (valor==50){
			Cantidad[2]+=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			
		} else{
			Vista.MError();
			
		}
		
		escribirFichero(listaMonedas);
		
	}
	
/*************************************************/
	public void restar(){
		
		 Valor[0]= 200; 
		 Valor[1]= 100;
		 Valor[2]= 50;
		
		if(valor==100){
			Cantidad[1]-=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			
		} else if (valor ==200) {
			Cantidad[0]-=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			
		} else if (valor==50){
			Cantidad[2]-=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			
		} else{
			Vista.MError();
			
		}
		
		escribirFichero(listaMonedas);
		
	}
/***********************************************************/
	public static void escribirFichero(ArrayList<Integer> listaMonedas) {

		//String sFichero = "listaMonedas.txt";

		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter("ListaMonedas.txt");

			for (int x = 0; x <= listaMonedas.size() - 1; x++) {

				pw = new PrintWriter(fichero);
				pw.println(listaMonedas.get(x));
			}
			fichero.close();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
/**********************************************************************/
	public int RestarPasta() {
		int cant = 0;
		return cant;

	}
}
