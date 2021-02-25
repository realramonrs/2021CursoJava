
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear una cuenta bancaria
		int n;
		String g;
		CuentaBancaria cb = new CuentaBancaria();
		CuentaBancaria cb2 = new CuentaBancaria();
		CuentaBancaria cb3 = new CuentaBancaria("12345678A","Maria Sotelo",780);
		cb.dniTitular="12345678X";
		cb.nombre="Pedro Garcia";
		cb.saldo = 300;
		
		cb2.dniTitular = "9876986E";
		cb2.nombre ="Saul Moran";
		cb2.saldo = 500;
				
		
		System.out.println(cb.dniTitular + " " + cb.nombre + " " + cb.saldo);
		System.out.println(cb2.dniTitular + " " + cb2.nombre + " " + cb2.saldo);
		//Ingresar o retirar dinero
		cb.retirarDinero(200);
		cb2.retirarDinero(400);
		System.out.println(cb.dniTitular + " " + cb.nombre + " " + cb.saldo);
		System.out.println(cb2.dniTitular + " " + cb2.nombre + " " + cb2.saldo);
		cb.ingresarDinero(900);
		cb2.ingresarDinero(450);
		System.out.println(cb.dniTitular + " " + cb.nombre + " " + cb.saldo);
		System.out.println(cb2.dniTitular + " " + cb2.nombre + " " + cb2.saldo);
		
		System.out.println(cb);
		System.out.println(cb2.toString());
		
		
		CuentaNueva cN = new CuentaNueva();
		
		
	}

}
