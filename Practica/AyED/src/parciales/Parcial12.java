package parciales;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;

//Implementar el método con la siguiente firma: "resolver(ArbolBinario<Integer> arbol)", 
//que devuelva una lista con los valores de los nodos que tengan el mismo número de descendientes 
//tanto por su subárbol izquierdo como por el derecho.

public class Parcial12 {

	public static ListaGenerica<Integer> resolver(ArbolBinario<Integer> arbol) {
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();

		if (arbol.esVacio())
			return null;

		else
			contarNodos(arbol, lista);
		return lista;

	}

	private static int contarNodos(ArbolBinario<Integer> arbol, ListaGenerica<Integer> lista) {
		int cantIzquierdos = 0;
		int cantDerechos = 0;

		if (arbol.tieneHijoIzquierdo()) {
			cantIzquierdos += contarNodos(arbol.getHijoIzquierdo(), lista);

		}
		if (arbol.tieneHijoDerecho()) {
			cantDerechos += contarNodos(arbol.getHijoDerecho(), lista);

		}

		if (cantIzquierdos == cantDerechos) {
			lista.agregarFinal(arbol.getDato());
			return 1;
		} else
			return 0;

	}

//	public static ListaGenerica<Integer> resolver(ArbolBinario<Integer> arbol) {
//		ListaGenerica<Integer> listaValores = new ListaEnlazadaGenerica<>();
//		if (arbol != null) {
//			contarNodos(arbol, listaValores);
//			return listaValores;
//			
//		} else return null;
//	}
//	
//	private static int contarNodos(ArbolBinario<Integer> a, ListaGenerica<Integer> l) {
//		int cant = 1; 
//		int cantHijosIzq = 0; int cantHijosDer = 0;
//		
//		if (a.esHoja()) {
//			l.agregarFinal(a.getDato());
//		}
//		else {
//			if (a.tieneHijoIzquierdo()) {
//				cantHijosIzq+= contarNodos(a.getHijoIzquierdo(), l);
//				cant+= cantHijosIzq;
//			}
//			if (a.tieneHijoDerecho()) {
//				cantHijosDer+= contarNodos(a.getHijoDerecho(), l);
//				cant+= cantHijosDer;
//			}
//			if (cantHijosIzq == cantHijosDer) {
//				l.agregarFinal(a.getDato());
//			}
//		}
//		return cant;
//	}

}
