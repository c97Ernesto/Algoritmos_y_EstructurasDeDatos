package parciales;

import tp03.ejercicio1.ArbolBinario;

public class Parcial07 {
	
	private ArbolBinario<String> arbol;
	
	public Parcial07(ArbolBinario<String> a) {
		this.arbol = a;
	}
	
	public int contar() {
		return this.contarNodos(arbol);
	}
	
	public ArbolBinario<String> buscar(String dato) {
		return this.buscarNodo(this.arbol, dato);
	}
	
	private int contarNodos(ArbolBinario<String> a) {
		int cantidad = 1;
		
		if (!a.esHoja()) {
			if (a.tieneHijoIzquierdo()) {
				cantidad += contarNodos(a.getHijoIzquierdo());	
			}
			if (a.tieneHijoDerecho()) {
				cantidad += contarNodos(a.getHijoDerecho());
			}
		}
		return cantidad;
	}
	
	private ArbolBinario<String> buscarNodo(ArbolBinario<String> a, String dato) {
		ArbolBinario<String> nodo = null;
		
		if (a.getDato() == dato)
			nodo = a;
		
		if (!a.esHoja()){
			if(a.tieneHijoIzquierdo() && nodo == null)
				nodo = this.buscarNodo(a.getHijoIzquierdo(), dato);
			if(a.tieneHijoDerecho() && nodo == (null))
				nodo = this.buscarNodo(a.getHijoDerecho(), dato);
		}
		return nodo;
			
	}
	
}
