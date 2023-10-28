package parciales;

import tp03.ejercicio1.ArbolBinario;

//Escribir en una clase que contenga una única variable de instancia de tipo ArbolBinario de valores
//enteros no repetidos. El método público debe tener la siguiente firma: "public boolean isTwoTree(int num)".
//El método devuelve true si el subárbol cuya raíz es "num", tiene en sus subárbol izquierdo la misma
//cantidad de árboles con dos hijos en su subárbol derecho. Y falso en caso contrario.

public class Parcial06 {

	private ArbolBinario<Integer> arbolBinario = new ArbolBinario<Integer>();

	public Parcial06(ArbolBinario<Integer> arbolBinario) {
		this.arbolBinario = arbolBinario;
	}

	public boolean isTwoTree(int num) {
		boolean ok = false;

		if (this.arbolBinario.esVacio()) {
			System.out.println("arbolVacio");
			return ok;
		} else {
			ArbolBinario<Integer> nodo = buscarNodo(this.arbolBinario, num);

			if (!nodo.esVacio()) {
				System.out.println("El elemento buscado es: " + nodo.getDato());
				
				if (nodo.tieneHijoIzquierdo() && nodo.tieneHijoDerecho()) {
					return (contarNodos(nodo.getHijoDerecho()) + contarNodos(nodo.getHijoIzquierdo()) % 2 == 0);
				}
				
				
				
			} else
				System.out.println("No existe el elemento.");
		}
		return ok;
	}

	private ArbolBinario<Integer> buscarNodo(ArbolBinario<Integer> ab, int num) {
		ArbolBinario<Integer> elemento = new ArbolBinario<Integer>();
		
		if (ab.esHoja()) {
			if (ab.getDato() == num) {
				elemento = ab;
			}
		} 
		else {
			
			if (ab.getDato() == num) {
				elemento = ab;
			}
			else {
				
				if (ab.tieneHijoIzquierdo()) {
					elemento = buscarNodo(ab.getHijoIzquierdo(), num);
				}
				
				if (ab.tieneHijoDerecho() && elemento.esVacio() ) {
					elemento = buscarNodo(ab.getHijoDerecho(), num);
					}
				}	
			}
		
		return elemento;
	}

	private int contarNodos(ArbolBinario<Integer> ab) {
		int cant = -1;
		
		if (ab.esHoja()) {
			cant++;
		} 
		else {
			
			if (ab.tieneHijoIzquierdo()) {
				cant+= contarNodos(ab.getHijoIzquierdo());
			}
			if (ab.tieneHijoDerecho())
				cant+= contarNodos(ab.getHijoDerecho());
		}
		
		return cant;
	}
	
	
}
