package Maquina;

public class Dispensador {
	private static int resto;
	private static int precio;
	private static int cantidad1=10;
	private static int cantidad2=10;
	
	public static void dispensar(int producto, int saldo){
		if((precio-saldo)<=0){
			if(producto==1){
				Visor.MVenta("Coca-Cola");
				cantidad1--;
			}
			if(producto==2){
				Visor.MVenta("Fanta");
				cantidad2--;
			} 
			
		}else{
			Visor.MError();
		}
		resto=saldo;
	}
	
	public static int resto(){
		int cass=(precio-resto);
		return cass;
		
	}

}
