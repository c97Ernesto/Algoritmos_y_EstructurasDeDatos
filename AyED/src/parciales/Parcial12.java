package parciales;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class Parcial12 {
	
	public static ListaGenerica<Integer> resolver(ArbolBinario<Integer> arbol) {
		ListaGenerica<Integer> listaValores = new ListaEnlazadaGenerica<>();
		if (arbol != null) {
			contarNodos(arbol, listaValores);
			return listaValores;
			
		} else return null;
	}
	
	private static int contarNodos(ArbolBinario<Integer> a, ListaGenerica<Integer> l) {
		int cant = 1; 
		int cantHijosIzq = 0; int cantHijosDer = 0;
		
		if (a.esHoja()) {
			l.agregarFinal(a.getDato());
		}
		else {
			if (a.tieneHijoIzquierdo()) {
				cantHijosIzq+= contarNodos(a.getHijoIzquierdo(), l);
				cant+= cantHijosIzq;
			}
			if (a.tieneHijoDerecho()) {
				cantHijosDer+= contarNodos(a.getHijoDerecho(), l);
				cant+= cantHijosDer;
			}
			if (cantHijosIzq == cantHijosDer) {
				l.agregarFinal(a.getDato());
			}
		}
		return cant;
	}
	
}
