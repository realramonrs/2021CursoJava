package metodos;

public class EjerciciosMetodos {

	//Programa los siguientes métodos:
	//1. Método que reciba 3 números y devuelva la suma de todos ellos
	public static int suma3(int x,int y,int z) {
		return x + y + z;
	}
	//2. Método que reciba una matriz de n números y devuelva la suma de sus valores
	
	public static int sumaMatriz(int m[]) {
		int suma = 0;
		for(int i = 0;i<m.length;i++) {
			suma = suma + m[i];
		}
		return suma;
	}
	//3. Método que reciba un String y devuelva el número de letras mayúscylas
	public static int contarMayusculas(String s) {
		
		int contador = 0;
		for(int i = 0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				contador++;
			}
		}
		return contador;
	}
	//4. Método que reciba un String y devuelva el número de vocales.
	//5. Método que reciba un dni sin letra y devuelva la letra que le corresponde.
	//6. Método que reciba una matriz y devuelva otra matriz formada por los números primos 
	//de la matriz que recibe como argumento.
}
