package parciales;

import tp02.ejercicio03.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class Parcial11 {
	private static final ArbolBinario<Integer> FIN_NIVEL = new ArbolBinario<Integer>(null);
	
	private ArbolBinario<Integer> arbol;
	
	public Parcial11(ArbolBinario<Integer> ab) {
		this.arbol = ab;
	}
	
	public ArbolBinario<Integer> minEnNivelAB(int n) {
		return this.recorridoPorNivel(this.arbol, n);
	}
	
	private ArbolBinario<Integer> recorridoPorNivel(ArbolBinario<Integer> ab, int n) {
		ArbolBinario<Integer> nodo;
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		
		cola.encolar(ab);
		cola.encolar(FIN_NIVEL);
		
		
		ArbolBinario<Integer> minimo = new ArbolBinario<Integer>(9999);
		
		int nivel = 0;
		while (!cola.esVacia() && nivel <= n) {
			nodo = cola.desencolar();
			
			if (nodo != FIN_NIVEL) {
				if (nodo.getDato() < minimo.getDato() && nivel == n) 
					minimo.setDato(nodo.getDato()); 
				
				if(nodo.tieneHijoIzquierdo())
					cola.encolar(nodo.getHijoIzquierdo());
				if (nodo.tieneHijoDerecho())
					cola.encolar(nodo.getHijoDerecho());
				
			} else { 
				if (!cola.esVacia()) {
					nivel++;
					cola.encolar(FIN_NIVEL);
				}	
			}
		}
		return minimo;
	}
}
