package Maquina;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/** @author luis.tallafigo */
public class Deposito {

	public int valor;
	public int cantidad;
	public Integer[] Valor = new Integer[5];
	public Integer[] Cantidad = new Integer[5];
	ArrayList<Integer> listaMonedas = new ArrayList<Integer>();
	
	public void añadir(){
		
		listaMonedas=leerFichero();
		
		 Valor[0]= 200; 
		 Valor[1]= 100;
		 Valor[2]= 50;
		 Valor[3]= 20;
		 Valor[4]= 10;
		 Valor[5]= 5;
		
		if(valor==100){
			Cantidad[1]+=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			listaMonedas.get(Valor[3]+Cantidad[3]);
			listaMonedas.get(Valor[4]+Cantidad[4]);
			listaMonedas.get(Valor[5]+Cantidad[5]);
			
		} else if (valor ==200) {
			Cantidad[0]+=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			listaMonedas.get(Valor[3]+Cantidad[3]);
			listaMonedas.get(Valor[4]+Cantidad[4]);
			listaMonedas.get(Valor[5]+Cantidad[5]);
			
		} else if (valor==50){
			Cantidad[2]+=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			listaMonedas.get(Valor[3]+Cantidad[3]);
			listaMonedas.get(Valor[4]+Cantidad[4]);
			listaMonedas.get(Valor[5]+Cantidad[5]);
			
		} else if(valor==20){
            Cantidad[3]+=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			listaMonedas.get(Valor[3]+Cantidad[3]);
			listaMonedas.get(Valor[4]+Cantidad[4]);
			listaMonedas.get(Valor[5]+Cantidad[5]);
			
			
		}else if(valor==10){
            Cantidad[4]+=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			listaMonedas.get(Valor[3]+Cantidad[3]);
			listaMonedas.get(Valor[4]+Cantidad[4]);
			listaMonedas.get(Valor[5]+Cantidad[5]);
			
			
		}else if(valor==5){
            Cantidad[5]+=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			listaMonedas.get(Valor[3]+Cantidad[3]);
			listaMonedas.get(Valor[4]+Cantidad[4]);
			listaMonedas.get(Valor[5]+Cantidad[5]);
			
			
		}else{
			Vista.MError();
			
		}
		
		escribirFichero(listaMonedas);
		
	}
	
/*************************************************/
	public void restar(){
		
		listaMonedas=leerFichero();
		
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
			
		} else if(valor==20){
            Cantidad[3]-=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			listaMonedas.get(Valor[3]+Cantidad[3]);
			listaMonedas.get(Valor[4]+Cantidad[4]);
			listaMonedas.get(Valor[5]+Cantidad[5]);
			
			
		}else if(valor==10){
            Cantidad[4]-=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			listaMonedas.get(Valor[3]+Cantidad[3]);
			listaMonedas.get(Valor[4]+Cantidad[4]);
			listaMonedas.get(Valor[5]+Cantidad[5]);
			
			
		}else if(valor==5){
            Cantidad[5]-=1;
			
			listaMonedas.get(Valor[0]+Cantidad[0]);
			listaMonedas.get(Valor[1]+Cantidad[1]);
			listaMonedas.get(Valor[2]+Cantidad[2]);
			listaMonedas.get(Valor[3]+Cantidad[3]);
			listaMonedas.get(Valor[4]+Cantidad[4]);
			listaMonedas.get(Valor[5]+Cantidad[5]);
			
			
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
	public ArrayList<Integer> leerFichero() {
		ArrayList<Integer> listaMonedas = new ArrayList<Integer>();
		File archivo = null;

		// Recorre el fichero y añadir elementos a mi arraylist

		FileReader fr = null;
		BufferedReader br = null;

		try {
			archivo = new File("ListaMonedas.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			Integer Linea;
			while ((Linea = br.read()) != null) {
				listaMonedas.add(Linea);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaMonedas;
	}
/**********************************************************************/
	public int RestarPasta() {
		int cant = 0;
		return cant;

	}
}
