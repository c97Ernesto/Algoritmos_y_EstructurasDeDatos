package parciales;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/*
	Implementar una clase con un método que reciba un árbol general de enteros y retorne
todos los árboles cuya raíz tenga un valor más pequeño que la suma de los valores de sus
descendientes. 
 */
public class Parcial10 {
	
	public ListaGenerica<ArbolGeneral<Integer>> devolverSubArboles(ArbolGeneral<Integer> ag) {
		ListaGenerica<ArbolGeneral<Integer>> listaDeArboles = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		if (!ag.esVacio()) {
			sumaDescendientes(ag, listaDeArboles);
			return listaDeArboles;
		}
		else {
			return null;
		}
	}
	
	public int sumaDescendientes(ArbolGeneral<Integer> ag, ListaGenerica<ArbolGeneral<Integer>> listaDeArboles) {
		int num = ag.getDato();
		int sumaHijos = 0;
		
		if (ag.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos = ag.getHijos();
			hijos.comenzar();
			
			while (!hijos.fin()) {
				ArbolGeneral<Integer> nodo = hijos.proximo();
				sumaHijos = sumaDescendientes(nodo, listaDeArboles);
			}
			if (sumaHijos > num) {
				listaDeArboles.agregarFinal(ag);
			}
		}
		
		return sumaHijos + num;
	}
	
	
	
}
