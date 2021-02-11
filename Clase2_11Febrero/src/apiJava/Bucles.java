package apiJava;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejemplo While
		//System.out.println("1 2 3 4 5 6 7 8 9 10 ...");
		int i = 1;
		
		while(i<30) {
			System.out.print(i + " ");
			i++;
		}
		
		
		System.out.println();
		System.out.println("Ejemplo con bucle for:");
		//Ejemplo For
		for(int j = 1;j<=30;j++) {
			System.out.print(j +" ");
		}
			System.out.println();
			System.out.println("Ejemplo bucle while: ");
		//do while
		int k = 1;
		do {
			System.out.print(k+ " ");
			k++;
		}
		while(k<=30);
	}

}
