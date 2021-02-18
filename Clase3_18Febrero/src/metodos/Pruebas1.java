package metodos;

import java.util.Random;
import java.util.Scanner;

public class Pruebas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Código de prueba de la función isPar:
		int n;
		System.out.println("Introduzca un número:");
		Scanner lector = new Scanner(System.in);
		n = lector.nextInt();
		
		if(MisMetodos1.isPar(n)) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
			
		//Código de prueba de la función isPrimo
		int matriz[] = new int[100];
		Random aleatorio = new Random();
		for(int i = 0;i<matriz.length;i++) {
			matriz[i] = aleatorio.nextInt(100);
		}
		System.out.println("Números primos: ");
		for(int valor:matriz) {			
			if(MisMetodos1.isPrimo(valor)) {
				System.out.print(valor+" ");
			}
		}
	}

}
