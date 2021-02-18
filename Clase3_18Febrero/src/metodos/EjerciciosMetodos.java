package metodos;

public class EjerciciosMetodos {

	//Programa los siguientes m�todos:
	//1. M�todo que reciba 3 n�meros y devuelva la suma de todos ellos
	public static int suma3(int x,int y,int z) {
		return x + y + z;
	}
	//2. M�todo que reciba una matriz de n n�meros y devuelva la suma de sus valores
	
	public static int sumaMatriz(int m[]) {
		int suma = 0;
		for(int i = 0;i<m.length;i++) {
			suma = suma + m[i];
		}
		return suma;
	}
	//3. M�todo que reciba un String y devuelva el n�mero de letras may�scylas
	public static int contarMayusculas(String s) {
		
		int contador = 0;
		for(int i = 0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				contador++;
			}
		}
		return contador;
	}
	//4. M�todo que reciba un String y devuelva el n�mero de vocales.
	//5. M�todo que reciba un dni sin letra y devuelva la letra que le corresponde.
	//6. M�todo que reciba una matriz y devuelva otra matriz formada por los n�meros primos 
	//de la matriz que recibe como argumento.
}
