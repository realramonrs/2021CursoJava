
public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaBancaria c1 = new CuentaBancaria("90876543S","Aron",600);
		
		c1.ingresarDinero(350);
		c1.ingresarDinero(700);
		c1.retirarDinero(350);
		
		//Visualizar el historico
		
		for(int i = 0;i<c1.historico.length;i++) {
			if(c1.historico[i]!=null) {
				System.out.println(c1.historico[i]);
			}
			else {
				break;
			}
		}
		
		
		
		
		
	}

}
