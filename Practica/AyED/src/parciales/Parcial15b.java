package parciales;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

//En la clase EjercicioDeArbolBinario, se debe implementar un método que reciba un
//árbol binario de enteros y un número entero positivo. Este método deberá retornar
//todos los caminos desde la raíz hasta una hoja del árbol, donde la suma de los valores
//del camino sea estrictamente mayor que el número dado, en caso de no existir un
//camino valido, retornar una lista vacía.
//El método debe tener la siguiente firma:
//"public ???? caminoMayorA (ArbolGeneral<Integer> arbol, Integer num)"

public class Parcial15b {

	public ListaGenerica<ListaGenerica<Integer>> caminoMayorA(ArbolGeneral<Integer> arbol, Integer num) {
		ListaGenerica<ListaGenerica<Integer>> listaDeListas = new ListaEnlazadaGenerica<ListaGenerica<Integer>>();
		ListaGenerica<Integer> camino = new ListaEnlazadaGenerica<Integer>();
		
		if (arbol.esVacio()) {
			return null;
		}
		else {
			recorridoPosOrden(arbol, num, listaDeListas, camino);
			return listaDeListas;
		}
	}

	private void recorridoPosOrden(ArbolGeneral<Integer> arbol, Integer num,
			ListaGenerica<ListaGenerica<Integer>> listaDeListas, ListaGenerica<Integer> camino) {
		
		camino.agregarFinal(arbol.getDato());
		
		if (arbol.esHoja()) {
			
			if (num - arbol.getDato() < 0) {
				agregarCaminoALista(listaDeListas, camino);
			}
		}
		else {
			ListaGenerica<ArbolGeneral<Integer>> hijos = arbol.getHijos();
			
			hijos.comenzar();
			while (!hijos.fin()) {
				recorridoPosOrden(hijos.proximo(), num-arbol.getDato(), listaDeListas, camino);
				camino.eliminarEn(camino.tamanio());
			}
			
		}
		
	}

	private void agregarCaminoALista(ListaGenerica<ListaGenerica<Integer>> listaDeListas,
			ListaGenerica<Integer> camino) {
		
		ListaGenerica<Integer> copia = new ListaEnlazadaGenerica<Integer>();
		
		camino.comenzar();
		while (!camino.fin()) {
			copia.agregarFinal(camino.proximo());
		}
		
		listaDeListas.agregarFinal(copia);
		
	}
	
}
