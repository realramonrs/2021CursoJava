import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MiVentana extends JFrame {

	private JTextField cajaTexto;
	private JButton boton1;
	
	//Constructor
	public MiVentana() {
		//Poner un titulo
		this.setTitle("Mi primera Ventana!!");
		//Establecer un tama�o
		this.setSize(450, 350);
		//Establecer cierre de aplicaci�n al pulsar el bot�n de cerrar
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Establecer tama�o ventana al m�ximo
		//this.setExtendedState(MAXIMIZED_BOTH);
		
		//Llamar al m�todo que crea los componentes de la ventana
		inicializarComponentes();
		
		//A�adir componentes a la ventana USANDO UN bORDER LAYOUT
		//getContentPane().add(cajaTexto,BorderLayout.SOUTH);
		//add(boton1,BorderLayout.CENTER);
		
		//A�adir componentes usando un FlowLayout
		//this.setLayout(new FlowLayout());
		//getContentPane().add(cajaTexto);
		//add(boton1);
		
		//A�adir controles especificando las coordenadas
		this.setLayout(null);
		getContentPane().add(cajaTexto);
		add(boton1);
		
		cajaTexto.setBounds(20, 10, 400, 20);
		boton1.setBounds(100, 45, 250, 35);
		//Hacerla visible
		this.setVisible(true);
	}

	
	//c�digo que instancia e inicializa los componentes de la ventana
	private void inicializarComponentes() {
		// TODO Auto-generated method stub
		cajaTexto = new JTextField(20);
		boton1 = new JButton("P�lsame!");
		boton1.addActionListener(new EscuchadorClickBoton());
		boton1.addMouseListener(new EscuchadorMouse());
		cajaTexto.addActionListener(new EscuchadorClickBoton());
	}
	
	
	//******************** GESTI�N DE EVENTOS ****************//
	 class EscuchadorClickBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Object generador = arg0.getSource();
			if(generador instanceof JButton) {
			
			cajaTexto.setText("No me gusta el Kebab");
			}
			
			else {
				cajaTexto.setText("Has pulsado Enter");
			}
			
		}
		 
	 }
	
	
	//*************** Eventos de Rat�n ********************//
	 class EscuchadorMouse implements MouseListener {
	 

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		boton1.setText("No me dejes!!");
		boton1.setBackground(Color.MAGENTA);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		boton1.setText("Por favor UwU Nadia!!!");
		boton1.setBackground(Color.GREEN);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	 }
	
}
