package tp02.ejercicio01;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class TestListaDeEnterosEnlazada {


	public static void main(String[] args) {
		
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		
		lista.agregarFinal(6);
		lista.agregarFinal(7);
		lista.agregarFinal(8);
		
		lista.comenzar();
//		for (int i = 1; i <= lista.tamanio(); i++ ) {
//			System.out.println(lista.proximo());
//		}
		while (!lista.fin()) {
			System.out.println(lista.proximo());
		}
	}
	
}
