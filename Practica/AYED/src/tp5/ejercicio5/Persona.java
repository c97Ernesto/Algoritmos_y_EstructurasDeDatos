package tp5.ejercicio5;

public class Persona {

	boolean esJubilado;
	String nombre;
	String domicilio;
	private boolean recibioJubilacion;
	
	public Persona(boolean esJubilado, String nombre, String domicilio) {
		this.esJubilado = esJubilado;
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	
	@Override
	public String toString() {
		String cadena = esJubilado ? "Es Jubilado | " : "No es Jubilado | ";
			
		cadena+= "Nombre: "+ this.nombre + " | Domicilio: "+ this.domicilio;
		return cadena;
	}


	public boolean recibioJubilacion() {
		return this.recibioJubilacion	;
	}

	public void setRecibioJubilacion(boolean recibioJubilacion) {
		this.recibioJubilacion = recibioJubilacion;
	}
}
