import java.util.ArrayList;

public class EjemploSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Inmueble> pisos = new ArrayList<Inmueble>();
		
		pisos.add(new Inmueble("a5"));
		pisos.add(new Inmueble("a2"));
		pisos.add(new Inmueble("b5"));
		pisos.sort(null);
		
		
		
		
		
		
		numeros.add(340);
		numeros.add(45);
		
		numeros.sort(null);
		
		for(Integer i:numeros) {
			System.out.println(i);
		}
		nombres.add("Zacarias");
		nombres.add("Pedro");
		nombres.add("Alejandro");
		
		//Ordenarlos alfabéticamente
		nombres.sort(null);
		
		for(String n : nombres) {
			System.out.println(n);
		}
		
	}

}
