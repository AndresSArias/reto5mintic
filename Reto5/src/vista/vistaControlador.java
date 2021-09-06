package vista;

import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controlador.ControladorEvento;
import controlador.Fachada;


public class vistaControlador extends JFrame {
	
	private Fachada fachada;
	private ControladorEvento control;
	private panelInicial panelInicial;
	
	public vistaControlador (Fachada fachada) {
		
		this.fachada = fachada;
		iniciarComponentes();
		capturarEventos();
		
		
	}
	
	
	public void iniciarComponentes() {
		
		//Inicializaci�n de la ventana principal
		this.setTitle("Sofi&Migue S.A.S");
		this.setBounds(100, 100, 854, 480);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(vistaControlador.class.getResource("/Imagen/Icono.png")));
		this.getContentPane().setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creaci�n del panel inicial
		panelInicial = new panelInicial();
		this.getContentPane().add(panelInicial);
		
		//Visibilidad de los paneles
		panelInicial.setVisible(true);
	}
	
	public ControladorEvento getControl() {
		if (control == null) {
			control = new ControladorEvento(this);
			}

		return control;
		
	}
	
	public void capturarEventos() {
		
		//Oyente panelInicial
		panelInicial.getBotonSalir().addActionListener(getControl());
		
	}
	
	

	//Getts de los componentes que se modificar�n y usar�n
	
	public Fachada getFachada() {	
		return fachada;
	}
	
	public panelInicial getPanelInicial () {
		return panelInicial;
	}
}
