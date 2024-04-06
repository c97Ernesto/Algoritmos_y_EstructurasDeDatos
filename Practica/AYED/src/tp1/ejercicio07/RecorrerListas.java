package tp1.ejercicio07;

import java.util.ArrayList;
import java.util.LinkedList;

public class RecorrerListas {

	// Implemente un método recursivo que invierta el orden de los elementos en un
	// ArrayList.
	public void invertirArrayList(ArrayList<Integer> lista, int pri, int ult) {
		if (pri < ult) {
			int n = lista.get(pri);
			lista.add(pri, lista.get(ult));
			lista.add(ult, n);
			invertirArrayList(lista, pri + 1, ult + 1);
		}
	}

	// Implemente un método recursivo que calcule la suma de los elementos en un
	// LinkedList.
	public int sumarLinkedList(LinkedList<Integer> lista, int i) {
		if (i < lista.size()) {
			return lista.get(i) + sumarLinkedList(lista, i + 1);
		} else
			return 0;
	}

}
