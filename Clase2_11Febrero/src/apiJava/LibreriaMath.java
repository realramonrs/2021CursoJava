package apiJava;

import java.util.*;

public class LibreriaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Vamos a ver funciones de la librer�a Math");
		Scanner lector;
		String cadena="Me encanta programar";
		
		//Voy a explicar la librer�a Math
		/*
		 * Este es un comentario
		 * que ocupa
		 * m�ltiples l�neas
		 */
		
		int numero = 15;
		double raiz = Math.sqrt(numero); //Raiz cuadrada
		double potencia = Math.pow(numero, 5);
		double logaritmo = Math.log10(numero);
		double coseno = Math.cos(numero);
		
		//Redondeo de valores
		double numeroDecimal = 5.28923;
		double numeroEntero = Math.round(numeroDecimal);
		System.out.println(numeroDecimal + " , " + numeroEntero);
		double enteroPorAbajo = Math.floor(numeroDecimal);
		double enteroPorArraiba = Math.ceil(numeroDecimal);
		
		System.out.println(numeroDecimal + " , " + enteroPorAbajo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
