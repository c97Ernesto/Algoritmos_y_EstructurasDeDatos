package tp03.ejercicio1;

import tp02.ejercicio03.ColaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}
	
//	a) contarHojas():int Devuelve la cantidad de árbol/subárbol hojas del árbol receptor.
	public int contarHojas() {
		int cantHojas = 0;
		
		if (this.esHoja()) {
			return 1;
			
		} else {
			if (this.tieneHijoIzquierdo()) {
				cantHojas = cantHojas + this.getHijoIzquierdo().contarHojas(); 
			}
			if (this.tieneHijoDerecho()) {
				cantHojas = cantHojas + this.getHijoDerecho().contarHojas();
			}
		}
		
		return cantHojas;

	}
	

    public ArbolBinario<T> espejo() {
    	ArbolBinario<T> arbolEspejo = new ArbolBinario<T>(this.getDato());
    	
    	if (this.tieneHijoIzquierdo()) {
    		arbolEspejo.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
    	}
		if (this.tieneHijoDerecho()) {
			arbolEspejo.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
		}
    	
		return arbolEspejo;
	}


	public void entreNiveles(int n, int m){
		ArbolBinario<T> nodo = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		
		
		cola.encolar(this);
		cola.encolar(null);
		
		int nivel = 0;
		while (!cola.esVacia()) {
			nodo = cola.desencolar();
			
			if (nodo != null) {
				
				if (nivel >= n && nivel <= m) {
					System.out.print(nodo.getDato());
				}
				
				if (nodo.tieneHijoIzquierdo()) {
					cola.encolar(nodo.getHijoIzquierdo());
				}
				if (nodo.tieneHijoDerecho()) {
					cola.encolar(nodo.getHijoDerecho());
					
				}
			}
			else if(!cola.esVacia()) {
				nivel++;
				cola.encolar(null);
			}
			
		}
	}

	

}
