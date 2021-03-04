
public class PuebaAutomovil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automovil.setConcesionario("Mosa Vigo");
		
		try {
			Automovil a1 = new Automovil("123jhgf4RTY");
			
			if(a1.getMatricula().startsWith("1")) {
				System.out.println("Empieza por 1");
			}
			System.out.println(a1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
