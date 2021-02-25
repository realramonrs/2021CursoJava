import java.util.ArrayList;

public class CuentaBancaria {

	String dniTitular;
	String nombre;
	double saldo;
	/*float interes;*/
	String historico[];
	ArrayList<String> historico2;
	/*boolean activado;*/
	
	//Constructores
	public CuentaBancaria() {
		saldo = 0;
		dniTitular = null;
		nombre = null;
		historico = new String[100];
	}
	
	public CuentaBancaria(String dni,String nombre,double saldo) {
		dniTitular = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		historico = new String[100];
	}
	
	
	
	public void retirarDinero(double cantidad) {
		if(saldo - cantidad > -1000) {
			saldo = saldo - cantidad;
			//Actualizar el histórico
			actualizarHistorico(cantidad, false);
		}
	}
	
	public void ingresarDinero(double cantidad) {
		if(cantidad <= 1000) {
			saldo = saldo + cantidad;
			//Actualizar el histórico
			actualizarHistorico(cantidad, true);
		}
	}
	
	@Override
	
	public String toString() {
		return dniTitular + " " + nombre + " " + saldo;
	}
	
	private void actualizarHistorico(double cantidad,boolean ingreso) {
		if(ingreso) {
			for(int i = 0;i<historico.length;i++) {
				if(historico[i]==null) {
					historico[i] = "Ingresa " + cantidad + " euros. Nuevo saldo: " + saldo;
					break;
				}
			}
		}
		else {
			for(int i = 0;i<historico.length;i++) {
				if(historico[i]==null) {
					historico[i] = "Retira " + cantidad + " euros. Nuevo saldo: " + saldo;
					break;
				}
			}
		}
	}
	
	
}
