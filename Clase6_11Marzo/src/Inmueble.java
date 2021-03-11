
public class Inmueble {

	private String codigo;
	private String direccion;
	private float precio;
	private float superficie;
	public Inmueble(String codigo, String direccion, float precio, float superficie) {
		super();
		this.codigo = codigo;
		this.direccion = direccion;
		this.precio = precio;
		this.superficie = superficie;
	}
	public Inmueble(String codigo) {
		super();
		this.codigo = codigo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getSuperficie() {
		return superficie;
	}
	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}
	@Override
	public String toString() {
		return "Inmueble [codigo=" + codigo + ", direccion=" + direccion + ", precio=" + precio + ", superficie="
				+ superficie + "]";
	}
	
	
}
