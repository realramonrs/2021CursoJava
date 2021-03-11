import java.util.ArrayList;

public class PruebaInmuebleHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Inmueble> misInmuebles = new ArrayList<Inmueble>();
		misInmuebles.add(new Piso("A1","Calle del Olvido 34,Lugo",80000,230,2,1,true,3));
		misInmuebles.add(new Aparcamiento("A3", "Calle De la Alegría 2", 2000, 20, true));
		misInmuebles.add(new Isla("R3","Oceano Pacífico",3400,2000000,4));
				
		
		for(Inmueble i : misInmuebles) {
			if(i!=null)
			System.out.println(i);
		}
		
		//Quiero saber cuantos pisos tengo guardados
		//Operador instanceof
		int contadorPisos = 0;
		for(Inmueble i : misInmuebles) {
			if(i instanceof Piso) {
				contadorPisos++;
			}
		}
		
		
		
		
		
	}

}
