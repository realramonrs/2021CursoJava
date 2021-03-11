
public class PruebaInmueble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Matriz de inmuebles
		Inmueble misViviendas[] = new Inmueble[10];
		
		
		misViviendas[0] = new Inmueble("A3","Calle Lepanto 45,Vigo",180000,240);
		misViviendas[1] = new Inmueble("A4","Calle Montero Rios 78,Vigo",350000,190);
		
		
		Inmueble i1 = new Inmueble("A5","Avda de Madrid 123,Pontevedra",56000,90);
		//Guardarlo en la matriz
	    Inmueble.guardarInmueble(i1, misViviendas);
	    
	    //Instanciación anónima
	    Inmueble.guardarInmueble(new Inmueble("A6","Avda Conde Lucanor,Ourense",450000,350), misViviendas);
	    
	    
		
		
		
		
		//Show properties with higher prize than 300000€
		System.out.println("Inmuebles con precio superior a 300000€");
		for(Inmueble inmueble : misViviendas) {
			if(inmueble!=null) {
				if(inmueble.getPrecio()>300000) {
					System.out.println(inmueble);
				}
			}
		}
		
		
		
		
		
		
	}

}
