package parciales;

import tp02.ejercicio03.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class Parcial03 {
	
	public void colorearArbol(ArbolBinario<String> a, Integer n, Integer m) {
		ColaGenerica<ArbolBinario<String>> cola = new ColaGenerica<ArbolBinario<String>>();
		ArbolBinario<String> nodo;
		
		cola.encolar(a);
		cola.encolar(null);
		
		int nivel = 0;
		
		while(!cola.esVacia()) {
			nodo = cola.desencolar();
			
			if (nodo != null) {
				
				if (nivel >= n && nivel <= m) 
					nodo.setDato("Rojo");
				else
					nodo.setDato("Negro");
					
				if (nodo.tieneHijoIzquierdo())
					cola.encolar(nodo.getHijoIzquierdo());
				if (nodo.tieneHijoDerecho())
					cola.encolar(nodo.getHijoDerecho());
				
			} else 
				if (!cola.esVacia()) {
					cola.encolar(null);
					nivel++;
				}
		}
	}
}
