
public class Aparcamiento extends Inmueble {

	private boolean exterior;

	public Aparcamiento(String codigo, String direccion, float precio, float superficie, boolean exterior) {
		super(codigo, direccion, precio, superficie);
		this.exterior = exterior;
	}

	public boolean isExterior() {
		return exterior;
	}

	public void setExterior(boolean exterior) {
		this.exterior = exterior;
	}

	@Override
	public String toString() {
		return "Aparcamiento [exterior=" + exterior + ", toString()=" + super.toString() + "]";
	}
	
	
}
