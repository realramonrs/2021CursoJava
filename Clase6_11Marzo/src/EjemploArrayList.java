
import java.util.*;

public class EjemploArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear una lista de Inmuebles.
		
		ArrayList<Inmueble> misPisos = new ArrayList<Inmueble>();
		
		//Añadir inmuebles : add
		
		misPisos.add(new Inmueble("A1","Calle Torrecedeira 34,Vigo",195000,200));
		misPisos.add(new Inmueble("A2","Calle Plaza María Pita,A Coruña",210000,190));
		
		
		//Más métodos de la clase ArrayList
		//Obtener el precio del primer piso
		  float precio = misPisos.get(0).getPrecio();
		  
		 //Obtener el número de viviendas almacenadas
		  int cantidad = misPisos.size();
		  
		 //Recorrer el arrayList con for normal
		  System.out.println("Mostrar pisos guardados: ");
		  for(int i = 0;i<misPisos.size();i++) {
			  System.out.println(misPisos.get(i));
		  }
		  
		  //Eliminar objetos de la lista
		  misPisos.remove(0);
		  
		  
		  misPisos.sort(null);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
