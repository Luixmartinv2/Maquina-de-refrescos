package Maquina;

public class Controlador {

	private static int saldo;
	
	//Agregamos el dinero al saldo y notificamos el saldo que llevamos
	private void insertMon(int cant) {
		saldo = cant;
		Vista.MSaldo(cant);
	}
	
	//Lo utilizamos para mostrar el dinero que vamos a devolver, y para poner el "Monedero" a 0
	public static int DevMon() {
		int cant = 0;
		cant = saldo;
		saldo = 0;
		return cant;
	}
	
	//Provamos a vender un producto, y actualizamos el saldo actual y lo mostramos por pantalla.
	private void SelPro(String producto, int cantidad) {
		Dispensador.dispensar(producto, saldo,cantidad);
		saldo=Dispensador.resto();
		Vista.MSaldo(saldo);
	}

}
