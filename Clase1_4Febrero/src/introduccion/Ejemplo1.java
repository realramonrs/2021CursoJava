package introduccion;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Mensajes por pantalla
		
		System.out.println("Me encanta programar en Java, me compr� un libro");
		
		//Tipos de variables num�ricas
		byte b1 = 34; //Valores desde -128 a 127
		short c1 = 345; //Valores hasta 32764
		int i1 = 3400;
		long l1 = 45_456_456;
		
		//Declarar varias variables en la misma linea
		int x1 = 0, x2 = 0,x3 = 0,x4 = 0;
		//Las variables declaradas dentro de un m�todo no se inicializan a ning�n valor
		x2 = x1 +3;
		
		int temperaturaMedia = 23;
		
		
		//Variables con decimales
		float temperatura = (float)5.6;
		float temperatura2 = 4.567f;
		double maximaPrecision = 45.987654321;
		
		boolean condicion = false;
		boolean condicion2 = true;
		
		char caracter = 'r';
		
		//Variable compleja--> Objetos
		String frase = "Estoy flipando!";
		
		int car = frase.indexOf('o');
		
		//Mostrar por pantalla valores de variables:
		System.out.println("Posici�n o en frase: "+car);
		
	}

}
