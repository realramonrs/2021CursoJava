import java.util.Scanner;

public class SentenciasDeSeleccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero=-9 ;
		double raiz;
		
		if(numero>=0) {
			raiz = Math.sqrt(numero);
			System.out.println("La raiz es: " + raiz);
		}
		else {
			System.out.println("No se puede calcular la raiz");
		}
		
		//Programa que detecta el mínimo de dos números
		int x,y;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Intro valor de x:");
		x = lector.nextInt();
		
		System.out.println("Intro valor de y:");
		y = lector.nextInt();
		
		
		if(x<y) {
			
			System.out.println("El más pequeño es : " + x);
		}
				
		else {
			System.out.println("El más pequeño es : " + y);
		}
			
		
		
		
		
		
		
		
	}

}
