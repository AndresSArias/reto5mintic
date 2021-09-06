package controlador;

import vista.vistaControlador;

public class Fachada {

	//Atributos de fachada
	private vistaControlador interfaz;
	
	
	public Fachada (){
		
		interfaz = new vistaControlador(this);
		
	}
	
	public void iniciar() {
		
		interfaz.setVisible(true);
		
	}
	
	//Métodos lógicos
	public void salir() {
		System.exit(0);
	}
	
}
