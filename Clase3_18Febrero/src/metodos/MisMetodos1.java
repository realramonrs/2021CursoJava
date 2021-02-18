package metodos;

public class MisMetodos1 {
	
	//Método que me indique si un número es par
	public static boolean isPar(int numero) {

		if(numero % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrimo(int numero) {
		int contador = 0;
		
		for(int i = 2;i<=numero/2;i++) {
			if(numero%i==0) {
				contador+=1;
				break;
			}
		}
		
		if(contador==0) {
			return true;
		}
		else {
			return false;
		}
	}//Llave cierr método isPrimo

}//Llave final de la clase
