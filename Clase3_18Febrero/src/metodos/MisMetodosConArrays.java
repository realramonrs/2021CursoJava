package metodos;

import java.util.Random;

public class MisMetodosConArrays {

	//Método que printa un array
	public static void pArray(int m[]) {
		for(int valor:m) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
	
	//Método que llene un array con valores aleatorios
	public static void llenarArray(int m[]) {
		Random aleatorio = new Random();
		for(int i = 0;i<m.length;i++) {
			m[i] = aleatorio.nextInt(50);
		}
	}
}
