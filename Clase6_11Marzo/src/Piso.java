
public class Piso extends Inmueble {

	private int habitaciones;
	private int baños;
	private boolean ascensor;
	private int planta;
	public Piso(String codigo, String direccion, float precio, float superficie, int habitaciones, int baños,
			boolean ascensor, int planta) {
		super(codigo, direccion, precio, superficie);
		this.habitaciones = habitaciones;
		this.baños = baños;
		this.ascensor = ascensor;
		this.planta = planta;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	public int getBaños() {
		return baños;
	}
	public void setBaños(int baños) {
		this.baños = baños;
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
		return "Piso [habitaciones=" + habitaciones + ", baños=" + baños + ", ascensor=" + ascensor + ", planta="
				+ planta + ", toString()=" + super.toString() + "]";
	}
	
	
}
