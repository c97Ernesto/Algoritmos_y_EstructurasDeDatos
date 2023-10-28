package parciales;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial09 {
	ArbolGeneral<Integer> arbol;
	
	public Parcial09 (ArbolGeneral<Integer> a) {
		this.arbol = a;
	}
	
	public ListaGenerica<Integer> resolver() {
		
		if (this.arbol != null) {
			ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
			this.posOrden(this.arbol, lista);
			return lista;
		} else
			return null;
	}
	
	private void posOrden(ArbolGeneral<Integer> a, ListaGenerica<Integer> l) {
		int suma = 0;
			
		if (a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();

			while (!hijos.fin()) {
				ArbolGeneral<Integer> nodoAux = hijos.proximo();
				if (hijos.tamanio() % 2 != 0) {
					suma += nodoAux.getDato();
				}
				posOrden(nodoAux, l);
			}
			if (hijos.tamanio() % 2 != 0)
				l.agregarFinal(suma);
		}
	}
}
