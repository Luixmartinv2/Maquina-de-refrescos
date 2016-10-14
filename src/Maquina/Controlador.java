package Maquina;

public class Controlador {

	private static int saldo;

	private void insertMon(int cant) {
		saldo = cant;
	}

	public static void DevMon() {
		int cant = 0;
		cant = saldo;
		saldo = 0;

		// falta la relacion con el deposito

	}

	private void SelPro(int producto) {

		Dispensador.dispensar(producto,saldo);
		saldo=Dispensador.resto();

	}

}
