
public class Isla extends Inmueble {

	private int tentadoras;

	public Isla(String codigo, String direccion, float precio, float superficie, int tentadoras) {
		super(codigo, direccion, precio, superficie);
		this.tentadoras = tentadoras;
	}

	public int getTentadoras() {
		return tentadoras;
	}

	public void setTentadoras(int tentadoras) {
		this.tentadoras = tentadoras;
	}
	
	
}
