package repaso;

import javax.swing.JOptionPane;

public class repasoTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables primitivas: ,byte,int,char,short,float,double
		int x = 9;
		//Conversión de variables:
		//implícitas
		long l = x;
		
		//explícita
		long l1 = 350;
		int x1 = (int)l1;
		
		short s = 1280;
		byte b = (byte)s;
		System.out.println("b = " + b);
		
		//Variables complejas-->Objetos: Trabajan con referencias.
		String frase = "Soy muy complejo";
		int posicion = frase.indexOf("o");
		char caracter = frase.charAt(0);
		
		//Conversiones entre String y variables numéricas
		
		String dni = "36122523B";
		//Obtener los 8 primeros dígitos y dividirlos entre 23
		
		String dni8digitos = dni.substring(0, 8);
		//Convertir este String en una variable numérica
		int dniNumero = Integer.parseInt(dni8digitos);
		
		float dniNumero2 = Float.parseFloat(dni8digitos);
		
		//Conversiones de número a String
		int numero = 345;
		String numero2 = Integer.toString(numero);
		
		
		//Lectura de datos con JOptionPane
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		
		//char-->Character
		//isDigit, isLetter,isWhiteSpace,isUpperCase...
		char letra = '2';
		boolean digito = Character.isDigit(letra);
		
		
		
		
	}

}
