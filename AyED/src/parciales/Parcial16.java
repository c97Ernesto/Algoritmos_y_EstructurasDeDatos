package parciales;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class Parcial16 {

	private ArbolBinario<Integer> arbolBinario = new ArbolBinario<Integer>();
	
	public Parcial16(ArbolBinario<Integer> arbol) {
		this.arbolBinario = arbol;
	}
	
	public ListaGenerica<Integer> procesar() {
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		
		if (!this.arbolBinario.esVacio()) {
			recorrerPreOrden(this.arbolBinario, lista);
			return lista;
		} else {
			System.out.println("Arbol Vacío.");
			return lista;
		}
	}
	
	private void encontrarPar(ArbolBinario<Integer> ab) {
		
	}
	
	private void recorrerPreOrden(ArbolBinario<Integer> ab, ListaGenerica<Integer> lista) {
				
		if (!ab.esHoja()) {
			
			if (ab.getDato() % 2 == 0) {
				if (ab.tieneHijoIzquierdo() && ab.tieneHijoDerecho()) {
					lista.agregarFinal(ab.getDato());
				}
			}
			
			
			if (ab.tieneHijoIzquierdo()) {
				recorrerPreOrden(ab.getHijoIzquierdo(), lista);  
			}
			if (ab.tieneHijoDerecho()) {
				recorrerPreOrden(ab.getHijoDerecho(), lista);
			}
			
		}
		
	}
	
}
