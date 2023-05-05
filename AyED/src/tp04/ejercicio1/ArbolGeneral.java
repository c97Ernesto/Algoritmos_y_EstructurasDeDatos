package tp04.ejercicio1;

import tp02.ejercicio03.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ArbolGeneral<T> {
//	ATRIBUTOS
	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
	
//	CONSTRUCTORES
//	El constructor ArbolGeneral(T dato) inicializa un árbol que tiene como raíz un nodo general. Este
//	nodo tiene el dato pasado como parámetro y una lista vacía.
	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

//	El constructor ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) inicializa un árbol
//	que tiene como raíz un nodo general. Este nodo tiene el dato pasado como parámetro y tiene como
//	hijos la lista pasada como parámetro.
	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato); //llamamos aL otro contructor de ésta misma clase, reutilizamos código.
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

//	METODOS
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
	
//	public int altura(): int devuelve la altura del árbol, es decir, la longitud del camino más largo
//	desde el nodo raíz hasta una hoja.
	public Integer altura() {
		int altura = 0;
		
		if (this.esHoja()) {
			return altura;
		}
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				altura = Math.max(altura, hijos.proximo().altura());
			}
			altura+= +1;
		}
		return altura;
	}

//	public int nivel(T dato) devuelve la profundidad o nivel del dato en el árbol. El nivel de un nodo
//	es la longitud del único camino de la raíz al nodo.
	public Integer nivel(T dato) {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		ArbolGeneral<T> nodo;
		
		cola.encolar(this);
		cola.encolar(null);
		
		int nivel = 0; boolean ok = false;
		
		while(!cola.esVacia() && !ok) {
			nodo = cola.desencolar();
			
			if (nodo != null) {
				if (nodo.getDato() == dato) {
					ok = true;
				} 
				else if (nodo.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> hijos = nodo.getHijos();
					hijos.comenzar();
					while(!hijos.fin()) {
						cola.encolar(hijos.proximo());
					}
				} 
			} 
			else if(!cola.esVacia() && !ok) {
				nivel++;
				cola.encolar(null);
			}
		}
		
		if (ok) return nivel;
		else return -1;
		
	}

//	public int ancho(): int la amplitud (ancho) de un árbol se define como la cantidad de nodos que
//	se encuentran en el nivel que posee la mayor cantidad de nodos.
	public Integer ancho() {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		ArbolGeneral<T> nodo;
		
		cola.encolar(this);
		cola.encolar(null);
		
		int cantNodos = 0, maxCantNodos = 0; 
		
		while (!cola.esVacia()) {
			nodo = cola.desencolar();
			
			if (nodo != null) {
				cantNodos++;
				
				if (nodo.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> hijos = nodo.getHijos();
					hijos.comenzar();
					while (!hijos.fin()) {
						cola.encolar(hijos.proximo());	
					}
				}
			} else {
				maxCantNodos = Math.max(cantNodos, maxCantNodos);
				cantNodos = 0;
				
				if (!cola.esVacia()) {
					cola.encolar(null);
				}
			}
		}
		
		return maxCantNodos;
	}

}