package parciales;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial13 {
	
	public static ListaGenerica<ArbolGeneral<Integer>> devolverCamino(ArbolGeneral<Integer> arbol){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		
		return null;
		
	}
	
	public static void recorrer(ArbolGeneral<Integer> a, ListaEnlazadaGenerica<Integer> l, ListaGenerica<Integer> camino) {
		l.agregarFinal(a.getDato());
		
		if (a.esHoja()) {
			if (l.tamanio() > camino.tamanio()) {
				clonar(l, camino);
			}
		}
		else {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) {
				recorrer(hijos.proximo(), l, camino);
				l.eliminarEn(l.tamanio());
			}
		}
		
			
		
	}

	private static void clonar(ListaEnlazadaGenerica<Integer> l, ListaGenerica<Integer> camino) {
		// TODO Auto-generated method stub
		camino.comenzar();
		while(!camino.fin())
			camino.eliminar(camino.proximo());
		l.comenzar();
		while(!l.fin())
			camino.agregarFinal(l.proximo());
	}
}
