package tp02.ejercicio03;

import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;


public class PilaGenerica<T> {

	private ListaGenerica<T> datos = new ListaEnlazadaGenerica<>();
	
	public void apilar(T elemento){
		this.datos.agregarInicio(elemento);
	}
	
	public T desapilar() {
		T elemento = this.tope();
		this.datos.eliminar(elemento);
		return elemento;
	}
	
	public T tope() {
		T elemento = this.datos.elemento(1);
		return elemento;
	}
	
	public boolean esVacia() {
		return this.datos.tamanio() == 0;
	}
	
}
