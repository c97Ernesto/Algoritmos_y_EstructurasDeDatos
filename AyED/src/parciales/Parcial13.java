package parciales;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial13 {
	
	public static ListaGenerica<Integer> devolverCamino(ArbolBinario<Integer> arbol, Integer num){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		ListaGenerica<Integer> camino = new ListaEnlazadaGenerica<Integer>();
		
		if (arbol.esVacio()) {
			return null;
		} else {
//			recorrer(arbol, lista, num);
			recorrerPosOrden(arbol, num, lista, camino);
			return lista;
		}
	}
	
	

//	public static boolean recorrer(ArbolBinario<Integer> a, ListaGenerica<Integer> lista, Integer n) {
//		boolean ok = false;
//		
//		lista.agregarFinal(a.getDato());
//		
//		if (a.esHoja()) {
//			ok = ((n - a.getDato()) < 0);
//		}
//		else {
//			if (a.tieneHijoIzquierdo()) {
//				ok = recorrer(a.getHijoIzquierdo(), lista, n-a.getDato());
//			}
//			if (a.tieneHijoDerecho() && ok == false) {
//				ok = recorrer(a.getHijoDerecho(), lista, n-a.getDato());
//			}
//			
//			if (ok == false) {
//				lista.eliminar(lista.tamanio());
//			}
//		}
//		
//		return ok;
//		
//	}
	
	private static void recorrerPosOrden(ArbolBinario<Integer> arbol, Integer num, ListaGenerica<Integer> lista, ListaGenerica<Integer> camino) {
		
		lista.agregarFinal(arbol.getDato());
		
		if (arbol.esHoja()) {
			if (((num - arbol.getDato()) < 0) && camino.esVacia()) {
				clonar(lista, camino);
			}
		} 
		else {
			
			if (arbol.tieneHijoIzquierdo() && camino.esVacia()) {
				recorrerPosOrden(arbol.getHijoIzquierdo(), num-arbol.getDato(), lista, camino);
				lista.eliminar(lista.tamanio());
			}
			if (arbol.tieneHijoDerecho()&& camino.esVacia()) {
				recorrerPosOrden(arbol.getHijoDerecho(), num-arbol.getDato(), lista, camino);
				lista.eliminar(lista.tamanio());
			}
		}
		
	}

	private static void clonar(ListaGenerica<Integer> lista, ListaGenerica<Integer> camino) {
		// TODO Auto-generated method stub
		camino.comenzar();
		while(!camino.fin())
			camino.eliminar(camino.proximo());
		lista.comenzar();
		while(!lista.fin())
			camino.agregarFinal(lista.proximo());
	}
}
