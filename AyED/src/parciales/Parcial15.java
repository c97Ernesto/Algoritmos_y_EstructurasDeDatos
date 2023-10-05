package parciales;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;

//En la clase EjercicioDeArbolBinario, se debe implementar un método que reciba un
//árbol binario de enteros y un número entero positivo. Este método deberá retornar
//todos los caminos desde la raíz hasta una hoja del árbol, donde la suma de los valores
//del camino sea estrictamente mayor que el número dado, en caso de no existir un
//camino valido, retornar una lista vacía.
//El método debe tener la siguiente firma:
//"public ???? caminoMayorA (ArbolBinario<Integer> arbol, Integer num)"

public class Parcial15 {

	public ListaGenerica<ListaGenerica<Integer>> caminoMayorA(ArbolBinario<Integer> arbol, Integer num) {
		ListaGenerica<ListaGenerica<Integer>> lista = new ListaEnlazadaGenerica<ListaGenerica<Integer>>();
		ListaGenerica<Integer> camino = new ListaEnlazadaGenerica<Integer>();
		
		if (arbol.esVacio()) {
			return null;
		} 
		else {
			caminoMayorAPrivado(arbol, num, lista, camino);
		}
		return lista; 
	}

	private void caminoMayorAPrivado(ArbolBinario<Integer> arbol, Integer num,
			ListaGenerica<ListaGenerica<Integer>> lista, ListaGenerica<Integer> camino) {
		
		int dato = arbol.getDato();
		
		camino.agregarFinal(dato);
		
		if (arbol.esHoja()) {
			System.out.println(dato);
			
			if (num-dato < 0) {
				agregarCaminoALista(lista, camino);
			}
		} 
		else {
			if (arbol.tieneHijoIzquierdo()) {
				caminoMayorAPrivado(arbol.getHijoIzquierdo(), (num-dato), lista, camino);
				camino.eliminarEn(camino.tamanio());
				
			}
			if (arbol.tieneHijoDerecho()) {
				caminoMayorAPrivado(arbol.getHijoDerecho(), (num-dato), lista, camino);
				camino.eliminarEn(camino.tamanio());
			}
		}
	
	}

	private void agregarCaminoALista(ListaGenerica<ListaGenerica<Integer>> listaDeListas,
			ListaGenerica<Integer> camino) {
		
		ListaEnlazadaGenerica<Integer> copia = new ListaEnlazadaGenerica<Integer>();
		
		camino.comenzar();
		while (!camino.fin()) {
			copia.agregarFinal(camino.proximo());
		}
		
		listaDeListas.agregarFinal(copia);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}