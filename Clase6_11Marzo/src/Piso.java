
public class Piso extends Inmueble {

	private int habitaciones;
	private int ba�os;
	private boolean ascensor;
	private int planta;
	public Piso(String codigo, String direccion, float precio, float superficie, int habitaciones, int ba�os,
			boolean ascensor, int planta) {
		super(codigo, direccion, precio, superficie);
		this.habitaciones = habitaciones;
		this.ba�os = ba�os;
		this.ascensor = ascensor;
		this.planta = planta;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	public int getBa�os() {
		return ba�os;
	}
	public void setBa�os(int ba�os) {
		this.ba�os = ba�os;
	}
	public boolean isAscensor() {
		return ascensor;
	}
	public void setAscensor(boolean ascensor) {
		this.ascensor = ascensor;
	}
	public int getPlanta() {
		return planta;
	}
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	@Override
	public String toString() {
		return "Piso [habitaciones=" + habitaciones + ", ba�os=" + ba�os + ", ascensor=" + ascensor + ", planta="
				+ planta + ", toString()=" + super.toString() + "]";
	}
	
	
}
