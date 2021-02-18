package metodos;

public class PruebasArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[] = {1,2,3,4,5,6,7,8,9};
				
		MisMetodosConArrays.pArray(m);
		
		//código de prueba del método llenar array
		System.out.println("Prueba método llenararray:");
		int m2[] = new int[100];
		MisMetodosConArrays.llenarArray(m2);
		MisMetodosConArrays.pArray(m2);
	}

}
