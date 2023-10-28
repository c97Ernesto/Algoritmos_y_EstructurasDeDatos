package tp03.ejercicio5;

import tp02.ejercicio03.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ProfundidadDeArbolBinario {

	private ArbolBinario<Integer> arbolBinario;
	
	public ProfundidadDeArbolBinario(ArbolBinario<Integer> ab) {
		this.arbolBinario = ab;
	}
	
	public int sumaElementosProfundidad(int p) {
		
		if (this.arbolBinario != null)
			return this.recorridoPorNiveles(this.arbolBinario, p);
		else
			return -1;	
	}
	
	private int recorridoPorNiveles(ArbolBinario<Integer> abInt, int profundidad) {
		ArbolBinario<Integer> nodo = null;
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		
		cola.encolar(abInt);
		cola.encolar(null);
		
		int nivel = 0;
		int suma = 0;
		
		while (!cola.esVacia() && nivel <= profundidad) {
			nodo = cola.desencolar();
			
			if (nodo != null) {
				if (nivel == profundidad)
					suma = suma + nodo.getDato();
				
				if (nodo.tieneHijoIzquierdo()) 
					cola.encolar(nodo.getHijoIzquierdo());
				
				if (nodo.tieneHijoDerecho())
					cola.encolar(nodo.getHijoDerecho());
				
			} else if(!cola.esVacia()) {
				cola.encolar(null);
				nivel++;
			}
		}
		
		return suma;
		
	}
	
}
