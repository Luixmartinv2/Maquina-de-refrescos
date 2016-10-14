package Maquina;

public class Vista {
	
	public static void MBienvenida(){
		System.out.println("Benbenido");
	}
	
	public static void MSaldo(int saldo){
		System.out.println("Tiene "+(saldo/100)+" euros");//hacemos la operación porque las operaciones internas de la maquina son en centimos
	}
	
	public static void MPrecio(int precio, String producto){
		System.out.println("El producto "+producto+" cuesta "+precio);
	}
	
	public static void MError(){
		System.err.println("Error");
	}
	
	public static void MDespedida(){
		System.out.println("Muchas gracias, que tenga un buen día :)");
	}
	
	public static void MVenta(String producto){
		System.out.println("Disfrute su "+producto);
	}
	
	public static void MDineroDevuelto(int cant){
		System.out.println("Se le devuelve "+cant);
	}
}
