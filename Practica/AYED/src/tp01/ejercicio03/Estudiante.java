package tp01.ejercicio03;

public class Estudiante {
	
	private String nombre;
	private String apellido;
	private String comision;
	private String direccion;
	private String email;
	
	
	public Estudiante() {
		
	}
	
	public Estudiante(String nombre, String apellido, String comision, String direccion, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.comision = comision;
		this.direccion = direccion;
		this.email = email;
	}




	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	

	public String tusDatos() {
		
		String datos = "Nombre: "+ this.getNombre() +
				" | Apellido: "+ this.getApellido() + 
				" | Email: "+ this.getEmail() +
				" | Comisión: "+ this.getComision() +
				" | Dirección: "+ this.getDireccion();
		
		return datos;
	}
	
}
