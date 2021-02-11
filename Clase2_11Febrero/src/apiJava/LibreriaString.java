package apiJava;

public class LibreriaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
		String cadena = "Java es impresionante";
		//Obtener número de caracteres:
		int numeroCaracteres = cadena.length();
		//Buscar una secuencia de caracteres
		boolean encontrado = cadena.contains("pre");
		
		if(encontrado==true) {
			System.out.println("Se ha encontrado el mensaje en la cadena");
		}
		else {
			System.out.println("No se ha encontrado el mensaje");
		}
		
		//Obtener la posición de un caracter en la cadena
		int posicion = cadena.indexOf('a');
		//Obtener el caracter que hay en una posicion:
		char caracter = cadena.charAt(0);
		
		//Concatenar strings -->+= o funcion concat
		cadena+=" me pasaría horas programando";
		cadena.concat(" me gusta más que Twitter, casi...");
		
		//Comprobar si empiezar o acaba por una determinada secuencia de caracteres
		if(cadena.startsWith("ser")) {
			
		}
		
		if(cadena.endsWith("ser")) {
			//Escribir código
		}
		
		//Obtener una secuencia de caracteres a partir del String original
		cadena = "Veo series de muñecos chilenos";
		String subCadena = cadena.substring(2);//Todos los caracteres desde la posición 2 hasta el final
		System.out.println(subCadena);
		
		subCadena = cadena.substring(2,4);//del caracter 2 al 4
		
		//Dividir un string en varias partes
		String palabras[] = cadena.split("o");
		
		//Comparación de Strings
		
		String cadena1 = "hola";
		String cadena2 = "hola";
		boolean iguales = cadena1 == cadena2;
		boolean iguales2 = cadena1.contentEquals(cadena2);
		
		System.out.println(cadena1 + " " + cadena2 + " son iguales: " + iguales);
		System.out.println(cadena1 + " " + cadena2 + " son iguales: " + iguales2);
		
		
	}

}
