package Maquina;

public class Controlador {

	private static int saldo;

	private void insertMon(int cant) {
		saldo = cant;
	}
	
	//Lo utilizamos para mostrar el dinero que vamos a devolver, y para poner el "Monedero" a 0
	public static int DevMon() {
		int cant = 0;
		cant = saldo;
		saldo = 0;
		return cant;
	}

	private void SelPro(String producto, int cantidad) {

		Dispensador.dispensar(producto, saldo,cantidad);
		saldo=Dispensador.resto();

	}

}
