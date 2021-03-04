
public class Automovil {

	private String matricula;
	private float precio;
	private float kilometros;
	private static String concesionario;
	
	
	public Automovil() {
		super();
	}

	public Automovil(String matricula) throws Exception {
		setMatricula(matricula);
	}
	
	public Automovil(String matricula,float precio) throws Exception {
		setMatricula(matricula);
		this.precio = precio;
	}
	
	public Automovil(String matricula,float kilometros,float precio) throws Exception  {
		setMatricula(matricula);
		this.precio = precio;
		this.kilometros = kilometros;
	}

	@Override
	public String toString() {
		return "Automovil [matricula=" + matricula + ", precio=" + precio + ", kilometros=" + kilometros + "]";
	}
	
	
	
	//Métodos de acceso para matrícula
	public void setMatricula(String matricula) throws Exception {
		//Validar si tiene 4 digitos y 3 caracteres
		int contadorDigitos = 0;
		int contadorLetras = 0;
		for(int i = 0;i<matricula.length();i++) {
			if(Character.isDigit(matricula.charAt(i))) {
				contadorDigitos++;
			}
			else if(Character.isLetter(matricula.charAt(i))) {
				contadorLetras++;
			}
			else {
				break;
			}
		}
		
		if(contadorDigitos==4 && contadorLetras==3) {
			this.matricula = matricula;
		}
		else {
			throw new Exception("Error en la matrícula");
		}
		
		
	}

	public String getMatricula() {
		return matricula;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getKilometros() {
		return kilometros;
	}

	public void setKilometros(float kilometros) {
		this.kilometros = kilometros;
	}

	public static String getConcesionario() {
		return concesionario;
	}

	public static void setConcesionario(String concesionario) {
		Automovil.concesionario = concesionario;
	}
	
	
	
	
}
