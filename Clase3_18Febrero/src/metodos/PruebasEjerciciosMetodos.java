package metodos;

public class PruebasEjerciciosMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Código prueba método ejercicio1:
		int resultado = EjerciciosMetodos.suma3(3, 4, 9);
		int x=9,y=3,z=5;
		int resultado2 = EjerciciosMetodos.suma3(x, y, z);
		//Código de pruena método ejercicio2
		int a[] = new int[50];
		MisMetodosConArrays.llenarArray(a);
		
		int suma = EjerciciosMetodos.sumaMatriz(a);
		
		//Código de prueba del método ejercicio 3
		String frase = "En un Lugar de la Mancha...";
		int mayusculas = EjerciciosMetodos.contarMayusculas(frase);
		
	}

}
