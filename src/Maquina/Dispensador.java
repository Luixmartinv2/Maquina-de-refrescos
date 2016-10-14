package Maquina;

import java.lang.reflect.Array;

public class Dispensador {
	private static int resto;
	private static int precio;
	private static int cantidad1=10;
	private static int cantidad2=10;
	int[] myIntArray = new int[3];
	
	public static void dispensar(int producto, int saldo){
		if((precio-saldo)<=0){
			if(producto==1){
				Vista.MVenta("Coca-Cola");
				cantidad1--;
			}
			if(producto==2){
				Vista.MVenta("Fanta");
				cantidad2--;
			} 
			
		}else{
			Vista.MError();
		}
		resto=saldo;
	}
	
	public static int resto(){
		int cass=(precio-resto);
		return cass;
		
	}

}
