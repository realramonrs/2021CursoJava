package introduccion;

public class SentenciasSeleccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejemplo if else
		int edad = 9;
		
		if(edad>=18 && edad<45) {
			System.out.println("Puede pasar, es ud mayor de edad pero no muy mayor");
		}
		else {
			System.out.println("Es ud menor de edad, vayase a casa");
		}
		
		//Programa que me indica el estado en que se encuentra
		//el agua
		float temperaturaDelAgua = 34;
		
		if(temperaturaDelAgua <= 0) {
			System.out.println("Estado s�lido: hielo");
		}
		else if(temperaturaDelAgua<=100) {
			System.out.println("Estado l�quido: agua");
		}
		else {
			System.out.println("Estado gaseoso: vapor");
		}
		
		//Sentencias if anidadas: 
		//Programa que clasifica un n�mero como par o impar y mayor o menor de 100
		
		int numero = 342;
		
		if(numero<100) {
			if(numero%2==0) {
				System.out.println("N�mero > 100 par");
			}
			else {
				System.out.println("N�mero > 100 impar");
			}			
		}
		else {
			if(numero%2==0) {
				System.out.println("N�mero < 100 par");
			}
			else {
				System.out.println("N�mero < 100 impar");
			}
		}
		
		//********************************************//
		// ejemplo switch --> sirve para evaluar valores discretos de una sola variable
		
		int opcion = 2;
		
		switch(opcion) {
		case 1:
			System.out.println("Has escogido opcion 1");
			break;
		case 2:
			System.out.println("Has escogido opcion 2");
			break;
		case 3:
			System.out.println("Has escogido opcion 3");
			break;
			default:
				System.out.println("Error en la opci�n");
				break;
		}
		
		
		
		
		
		
		
		
	}

}
