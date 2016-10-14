package Maquina;

public class Retorno extends Tecla {
	
	public Retorno() {
		super();
	}
	
	private void Devolver(){
		if (boton==0){
			Controlador.DevMon();
			Visor.MSaldo();
		}
	}
}
