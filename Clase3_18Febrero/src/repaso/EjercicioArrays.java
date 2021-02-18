package repaso;

import java.util.Random;

public class EjercicioArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Contar valores por debajo de la media
		//Declaro array con capacidad para 100 números
		int matriz[] = new int[50];
		Random aleatorio = new Random();
		int n = aleatorio.nextInt(50);
		
		for(int i = 0;i<matriz.length;i++) {
			matriz[i] = aleatorio.nextInt(50);
		}
		
		//Mostrar el array por pantalla
		for(int valor:matriz) {
			System.out.print(valor + " ");
		}
		System.out.println();
		//Calcular la media
		int suma = 0;
		float media = 0;
		
		for(int i = 0;i<matriz.length;i++) {
			suma = suma + matriz[i];
		}
		
		media = suma/matriz.length;
		
		System.out.println("La media es : " + media);
		
		//Contar valores que están por debajo de la media
		int contador = 0;
		
		/*for(int i = 0;i<matriz.length;i++) {
			
		}*/
		for(int valor:matriz) {
			if(valor<media) {
				contador++;
			}
		}
		
		System.out.println("Hay " + contador + " valores por debajo de la media");
		
	}

}
