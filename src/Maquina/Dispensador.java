package Maquina;

/**@author luis.tallafigo*/
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dispensador {
	private static int resto;
	private static int precio;

	// aqui se comprueva si se puede vender el producto, si se puede se hace,
	// sino no
	public static void dispensar(String producto, int saldo, int cantidad) {
		if ((precio - saldo) <= 0) {
			Vista.MVenta(producto);
			cantidad -= 1;
		} else {
			Vista.MError();
			resto = saldo;
		}
	}

	// aqui se controla el dinero para que se reste adecuadamente del "monedero"
	public static int resto() {
		int cass = (precio - resto);
		return cass;

	}

}