import java.util.*;
public class LecturaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que calcula el área y el volumen de una esfera
		//cuyo radio introduce el usuario por teclado
		float radio;
		double area,volumen;
		
		//El radio hay que pedirlo al usuario
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el radio de la esfera");
		
		radio = lector.nextFloat();
		
	//	area = Math.PI*radio*radio;
		area = Math.PI*Math.pow(radio, 2);
		
		volumen = (4/3)*Math.PI*Math.pow(radio,3);
		
		
		
		
	}

}
