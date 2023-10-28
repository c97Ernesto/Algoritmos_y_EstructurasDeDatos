package tp02.ejercicio03;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ColaGenerica<T> {
	
	private ListaGenerica<T> datos = new ListaEnlazadaGenerica<T>();
	
	public void encolar(T elemento){
		this.datos.agregarFinal(elemento);
	}
	
	public T desencolar() {
		T elemento = this.tope();
		this.datos.eliminar(elemento);
		return elemento;
	}
	
	public T tope() {
		return this.datos.elemento(1);
	}
	
	public boolean esVacia() {
		return this.datos.tamanio() == 0;
	}
}
