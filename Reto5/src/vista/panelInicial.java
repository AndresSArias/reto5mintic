package vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class panelInicial extends JPanel{
	
	//Componenetes visuales no interactivos
	private JLabel etiquetaTitulo;
	private JLabel etiquetaParrafo;
	private JLabel etiquetaAlias;
	private JLabel etiquetaContrasena;
	
	//Componentes visuales interactivos
	private JTextField textoAlias;
	private JPasswordField textoContrasena;
	private JButton botonIniciarSesion;
	private JButton botonSalir;
	
	public panelInicial () {
		
		this.setBounds(0, 0, 838, 441);
		this.setLayout(null);
		
		etiquetaTitulo = new JLabel("\u00A1Bienvenido a Sofi&Migue S.A.S!");
		etiquetaTitulo.setFont(new Font("Arial Black", Font.PLAIN, 14));
		etiquetaTitulo.setBounds(294, 33, 256, 57);
		this.add(etiquetaTitulo);
		
		etiquetaParrafo = new JLabel("Inicie Sesi\u00F3n y disfrute de nuestros contenidos.");
		etiquetaParrafo.setBounds(285, 120, 270, 14);
		this.add(etiquetaParrafo);
		
		etiquetaAlias = new JLabel("ALIAS");
		etiquetaAlias.setBounds(275, 200, 41, 14);
		this.add(etiquetaAlias);
		
		textoAlias = new JTextField();
		textoAlias.setBounds(394, 197, 116, 20);
		this.add(textoAlias);
		textoAlias.setColumns(10);
		
		etiquetaContrasena = new JLabel("CONTRASE\u00D1A");
		etiquetaContrasena.setBounds(275, 241, 86, 14);
		this.add(etiquetaContrasena);
		
		textoContrasena = new JPasswordField();
		textoContrasena.setBounds(394, 238, 116, 20);
		this.add(textoContrasena);
		
		botonIniciarSesion = new JButton("INICIAR SESION");
		botonIniciarSesion.setBounds(342, 319, 132, 23);
		this.add(botonIniciarSesion);
		
		botonSalir = new JButton("SALIR");
		botonSalir.setBounds(362, 363, 89, 23);
		this.add(botonSalir);
		
	}

	
	//Gettes para el manejo de componentes visuales interactivos
	
	public JTextField getTextoAlias () {
		return textoAlias;
	}
	
	public JPasswordField getTextoContrasena() {
		return textoContrasena;
	}
	
	public JButton getBotonSalir () {
		return botonSalir;
	}
	
	public JButton getBotonIniciarSesion () {
		return botonIniciarSesion;
	}
}
