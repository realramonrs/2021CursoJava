package introduccion;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores:símbolos que realizan una función
		//Matemáticos : +,-,*,/,%(resto de la división entera)
		
		int x1 = 9,x2 = 5;
		int resultado = x1 + x2;
		float resultado2 = (float)x1/x2;
		int resultado3 = x1%x2;
		System.out.println("Resultado = " + resultado);
		System.out.println("Resultado2 = " + resultado2);
		System.out.println("Resultado3 = " + resultado3);
		
		//Operadores asignacion = , += , -= , *= , /=
		int r1 = 9;
		r1+=2; // r1 = r1 + 2;
		//Operadores incremento ++ y decremento --
		r1 = 0;
		r1++; //r1+=1 , r1 = r1 + 1;
		r1--;
		
		++r1;
		--r1;
		r1 = 0;
		int r2 = r1++;
		
		System.out.println("r2 = " + r2);
		
		//Operadores relacionales--> ==(igual que) <,<=,>,>=,!=(distinto que)
		
		//Devuelven una variable booleana
		int d1 = 0,d2=9;
		boolean condicion = d1 > d2;
		boolean condicion2 = d1 != d2;
		boolean condicion3 = d1==d2;
		
		//Operador condicional ? :
		
		//Si d1 es 0 quiero que d2 = 10, sino que d2 = 0;
		d2 = d1==0?10:0;
		
		System.out.println("d2 = " + d2);
		
		//Operadores lógicos:
		//AND --> &&
		//OR --> ||
		//Not --> !
		boolean condicion4 = d2!=0 && d1!=0;
		boolean condicion5 = d2!=0 || d1!=0;
		
		
		
		
		
		
		
		
		
	}

}
