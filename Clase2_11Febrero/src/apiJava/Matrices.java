package apiJava;

import java.util.Arrays;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 9;
		int matriz[] = new int[15];
		matriz[0] = 9;
		matriz[1] = 4;
		matriz[2] = matriz[0] + matriz[1];
		
		int matriz2[] = {1,4,3,2,5,7,9};
		
		int numeroElementos = matriz2.length;
		String cadena = "Hola soy un string";
		int numeroCaracteres = cadena.length();
		
		System.out.println("Datos de la matriz con un for:");
		//Visualizar por pantalla todos los datos de la matriz
		for(int i = 0;i<matriz.length;i++) {
			System.out.print(matriz[i] + " ");
		}
		
		System.out.println("Con la función tostring:");
		System.out.println(Arrays.toString(matriz));
		
		System.out.println();
		System.out.println("Con un foreach:");
		//Bucle for mejorado
		for(int valor : matriz) {
			System.out.print(valor + " ");
		}
		
		
		
		
		
	}

}
