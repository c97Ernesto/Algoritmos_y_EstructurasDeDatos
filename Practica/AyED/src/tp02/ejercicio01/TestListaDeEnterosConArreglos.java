package tp02.ejercicio01;

import tp02.ejercicio1.ListaDeEnterosConArreglos;

public class TestListaDeEnterosConArreglos {
	
	
	public static void main(String[] args) {

		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		
		lista.agregarFinal(3);
		lista.agregarFinal(4);
		lista.agregarFinal(5);
		
		lista.comenzar();
//		for (int i = 1; i <= lista.tamanio(); i++ ) {
//			System.out.println(lista.proximo());
//		}
		while (!lista.fin()) {
			System.out.println(lista.proximo());
		}
		
	}
	
}
