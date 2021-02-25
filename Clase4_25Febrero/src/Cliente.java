
public class Cliente {

	private String dni;
	String nombre;
	int edad;
	String email;
	
	public Cliente() {
		
	}
	public Cliente(String dni,String nombre,int edad,String email) {
		setDni(dni);
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}
	
	//Métodos de acceso para el dni
	public void setDni(String dni) {
		if(dni.length()==9) {
			this.dni = dni;
		}
	}
	
	public String getDni() {
		return this.dni;
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if(edad>0 && edad <120) {
			this.edad = edad;
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return dni + " " + nombre + " " + edad + " " + email;
	}
}
