
public class TiposDeVariables {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reservar memoria --> Declarando variables
		//Variables son zonas de memoria a las que le ponemos un nombre para
		//poder acceder a ellas para guardar o consultar datos
		byte x = 20;
		int edad=0;//32 bits de memoria
		int edad2 = edad + 1;
		edad = 9;
		
		//byte(8 bits) , short(16 bits) , int(32 bits) , long(64 bits)
		//float ( 16 bits) ,double(32 bits)
		//char(8 bits)--> Caracteres alfanuméricos o símbolos
		char letraDni = 'W';
		
		boolean condicion = true;
		
		//Programa que calcule el área de un cuadrado
		int lado = 4;
		long area = lado*lado;
		System.out.println(area);
		
		//Modificación del valor de una variable:
		int valor = 1;
		//Incrementar en 10
		valor = valor + 10;
		valor+=10;
		//Disminuir en 10 
		valor-=10;
		
		
		//Variables complejas
		String frase = "Estoy aprendiendo a programar";
		
		
		
		
	}

}
