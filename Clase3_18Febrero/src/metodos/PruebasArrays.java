package metodos;

public class PruebasArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[] = {1,2,3,4,5,6,7,8,9};
				
		MisMetodosConArrays.pArray(m);
		
		//c�digo de prueba del m�todo llenar array
		System.out.println("Prueba m�todo llenararray:");
		int m2[] = new int[100];
		MisMetodosConArrays.llenarArray(m2);
		MisMetodosConArrays.pArray(m2);
	}

}
