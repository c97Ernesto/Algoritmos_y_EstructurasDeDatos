package parciales;

import tp02.ejercicio03.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class Parcial04 {
	
	public void colorearArbol(ArbolBinario<String> arbol, Integer maxColor) {
		ColaGenerica<ArbolBinario<String>> cola = new ColaGenerica<ArbolBinario<String>>();
		ArbolBinario<String> nodo;
		
		cola.encolar(arbol);
		cola.encolar(null);
		
		int cantNodos = 0; int nivel = 0;
		
		while (!cola.esVacia()) {
			nodo = cola.desencolar();
			
			if (nodo != null) {
				
				if (cantNodos < maxColor) {
					if (nivel % 2 != 0)
						nodo.setDato("Rojo");
					else
						nodo.setDato("Negro");
				} else {
					nodo.setDato("Verde");
				}
				
				if (arbol.tieneHijoIzquierdo())
					cola.encolar(nodo.getHijoIzquierdo());
				if (arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());
				
				cantNodos++;
			} 
			else {
				if (!cola.esVacia()) {
					cantNodos = 0;
					nivel++;
					cola.encolar(null);
				}
			}
		}
	}
}
