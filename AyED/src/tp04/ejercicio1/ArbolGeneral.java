package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

//	El método getDato():T retorna el dato almacenado en la raíz del árbol.
	public T getDato() {
		return dato;
	}

	
	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

//	El constructor ArbolGeneral(T dato) inicializa un árbol que tiene como raíz un nodo general. Este
//	nodo tiene el dato pasado como parámetro y una lista vacía.
	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

//	El constructor ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) inicializa un árbol
//	que tiene como raíz un nodo general. Este nodo tiene el dato pasado como parámetro y tiene como
//	hijos la lista pasada como parámetro.
	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato); //llamamos a otro contructor de ésta misma clase, reutilizamos código.
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

//	El método getHijos():ListaGenerica<ArbolGeneral<T>>, retorna la lista de hijos de la raíz del
//	árbol.
	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

//	El método agregarHijo(ArbolGeneral<T> unHijo) agrega unHijo a la lista de hijos del árbol
	public void agregarHijo(ArbolGeneral<T> unHijo) {
		this.getHijos().agregarFinal(unHijo);
	}

	
	public boolean esHoja() {
		return !this.tieneHijos();
	}
	
//	El método tieneHIjos() devuelve verdadero si la lista de hijos del árbol no es null y tampoco es
//	vacía
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
//	El método esVacio() devuelve verdadero si el dato del árbol es null y además no tiene hijos.
	public boolean esVacio() {
		return this.dato == null && !this.tieneHijos();
	}

//	El método eliminarHijo(ArbolGeneral<T> unHijo) pregunta si el nodo actual tiene hijos, si los tiene
//	crea una nueva instancia de una lista con esos hijos, y pregunta si el hijo está en esa lista para
//	eliminarlo.
	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}
	
	public Integer altura() {
		// Falta implementar..
		return 0;
	}

	public Integer nivel(T dato) {
		// falta implementar
		return -1;
	}

	public Integer ancho() {
		// Falta implementar..
		return 0;
	}

}