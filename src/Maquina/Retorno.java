package Maquina;

public class Retorno extends Tecla {
	
	public Retorno() {
		super();
	}
	
	private void Devolver(){
		if (boton==0){
			Controlador.DevMon();
			Vista.MSaldo(0);//ponemos cero, porque cuando hemos devuelto todo el dinero el "monedero" está a 0 
		}
	}
}
