package introduccion;

import java.util.Scanner;

public class LecturaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		int edad;
		System.out.println("Introduce la edad: ");
		edad = lector.nextInt();
		
		
		if(edad > 18) {
			System.out.println("Mayor de edad");
		}
		else {
			System.out.println("Menor de edad.");
		}
		
		 
		
	}

}
