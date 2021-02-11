package apiJava;

import java.util.Scanner;

public class EjercicioLibreriaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer dos variables a y b y calcular la hipotenusa
		double a,b,h;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el valor de a: ");
		a = lector.nextDouble();
		System.out.println("Introduce el valor de b: ");
		b = lector.nextDouble();
		
		h = Math.sqrt(a*a + Math.pow(b, 2));
		System.out.println("La hipotenusa vale: " + h);
		
		

	}

}
