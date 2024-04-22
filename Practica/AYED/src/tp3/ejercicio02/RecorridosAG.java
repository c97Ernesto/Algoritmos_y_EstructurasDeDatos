package tp3.ejercicio02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tp3.ejercicio01.GeneralTree;

public class RecorridosAG {

	/*
	 * Método que retorna una lista con los elementos impares del árbol 'a', que
	 * sean mayor al valor 'n', recorrido en preorden
	 */
	public static List<Integer> numerosImparesMayoresQuePreOrden(GeneralTree<Integer> a, Integer n) {
		List<Integer> listaEnteros = new ArrayList<Integer>();

		if (!a.isEmpty()) {
			numerosImparesMayoresQuePreOrden(a, n, listaEnteros);
			return listaEnteros;
		} else
			return listaEnteros;
	}

	private static void numerosImparesMayoresQuePreOrden(GeneralTree<Integer> a, Integer n,
			List<Integer> listaEnteros) {

		int dato = a.getData();

		if (dato % 2 == 1 && dato > n) {
			listaEnteros.add(dato);
		}

		if (a.hasChildren()) {
			List<GeneralTree<Integer>> hijos = a.getChildren();

			for (GeneralTree<Integer> hijo : hijos) {
				numerosImparesMayoresQuePreOrden(hijo, n, listaEnteros);
			}
		}

	}

	public static List<Integer> numerosImparesMayoresQueInOrden(GeneralTree<Integer> a, Integer n) {
		List<Integer> listaEnteros = new ArrayList<Integer>();

		if (!a.isEmpty()) {
			numerosImparesMayoresQueInOrden(a, n, listaEnteros);
			return listaEnteros;
		} else
			return listaEnteros;

	}

	private static void numerosImparesMayoresQueInOrden(GeneralTree<Integer> a, Integer n, List<Integer> listaEnteros) {

		List<GeneralTree<Integer>> hijos = a.getChildren();

		Iterator<GeneralTree<Integer>> i = hijos.iterator();

		if (a.hasChildren())
			numerosImparesMayoresQueInOrden(i.next(), n, listaEnteros);

		if (a.getData() % 2 == 1 && a.getData() > n)
			listaEnteros.add(a.getData());

		while (i.hasNext()) {
			numerosImparesMayoresQueInOrden(i.next(), n, listaEnteros);
		}
	}

	public static List<Integer> numerosImparesMayoresQuePostOrden(GeneralTree<Integer> a, Integer n) {
		List<Integer> listaEnteros = new ArrayList<Integer>();

		if (!a.isEmpty()) {
			numerosImparesMayoresQuePostOrden(a, n, listaEnteros);
			return listaEnteros;
		} else
			return listaEnteros;
	}

	private static void numerosImparesMayoresQuePostOrden(GeneralTree<Integer> a, Integer n,
			List<Integer> listaEnteros) {

		if (a.hasChildren()) {
			List<GeneralTree<Integer>> hijos = a.getChildren();

			for (GeneralTree<Integer> hijo : hijos) {
				numerosImparesMayoresQuePostOrden(hijo, n, listaEnteros);

			}
		}

		int dato = a.getData();
		if (dato % 2 == 1 && dato > n) {
			listaEnteros.add(dato);
		}

	}

}
