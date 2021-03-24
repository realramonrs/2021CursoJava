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
		//Establecer un tamaño
		this.setSize(450, 350);
		//Establecer cierre de aplicación al pulsar el botón de cerrar
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Establecer tamaño ventana al máximo
		//this.setExtendedState(MAXIMIZED_BOTH);
		
		//Llamar al método que crea los componentes de la ventana
		inicializarComponentes();
		
		//Añadir componentes a la ventana USANDO UN bORDER LAYOUT
		//getContentPane().add(cajaTexto,BorderLayout.SOUTH);
		//add(boton1,BorderLayout.CENTER);
		
		//Añadir componentes usando un FlowLayout
		//this.setLayout(new FlowLayout());
		//getContentPane().add(cajaTexto);
		//add(boton1);
		
		//Añadir controles especificando las coordenadas
		this.setLayout(null);
		getContentPane().add(cajaTexto);
		add(boton1);
		
		cajaTexto.setBounds(20, 10, 400, 20);
		boton1.setBounds(100, 45, 250, 35);
		//Hacerla visible
		this.setVisible(true);
	}

	
	//código que instancia e inicializa los componentes de la ventana
	private void inicializarComponentes() {
		// TODO Auto-generated method stub
		cajaTexto = new JTextField(20);
		boton1 = new JButton("Púlsame!");
		boton1.addActionListener(new EscuchadorClickBoton());
		boton1.addMouseListener(new EscuchadorMouse());
		cajaTexto.addActionListener(new EscuchadorClickBoton());
	}
	
	
	//******************** GESTIÓN DE EVENTOS ****************//
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
	
	
	//*************** Eventos de Ratón ********************//
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
