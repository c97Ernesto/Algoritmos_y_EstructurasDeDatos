package parciales;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class Parcial05 {
	
	public ListaGenerica<Integer> resolver(ArbolBinario<Integer> a) {
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		
		this.resolverPostOrden(a, lista);
		
		return lista;
	}
	
	private int resolverPostOrden(ArbolBinario<Integer> a, ListaGenerica<Integer> l) {
		int hijosI = 0; int hijosD = 0;
		int cantHijos = 0;
		
		if (a.esHoja()) {
			l.agregarFinal(a.getDato());
			return 1;
			
		} else {
			if (a.tieneHijoIzquierdo()) {
				hijosI+= resolverPostOrden(a.getHijoIzquierdo(), l);
				cantHijos+= hijosI;
				
			}
			if (a.tieneHijoDerecho()) {
				hijosD+= resolverPostOrden(a.getHijoDerecho(), l);
				cantHijos+= hijosD;
			}
			
			if (hijosD == hijosI)
				l.agregarFinal(a.getDato());
			
			return cantHijos + 1;
		}
	}
	
}
