package tp02.ejercicio01;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class ImprimirListaRecursivo {
	
	public static void imprimirRecursivo(ListaDeEnterosEnlazada lista, int tamanio) {
		
		if (tamanio > 0) {
			System.out.println(lista.elemento(tamanio));
			imprimirRecursivo(lista, --tamanio);
		}
	}

	public static void main(String[] args) {
		
		ListaDeEnterosEnlazada listaDeEnterosEnlazada = new ListaDeEnterosEnlazada();
		
		listaDeEnterosEnlazada.agregarFinal(6);
		listaDeEnterosEnlazada.agregarFinal(7);
		listaDeEnterosEnlazada.agregarFinal(8);
		listaDeEnterosEnlazada.agregarFinal(9);
		
		imprimirRecursivo(listaDeEnterosEnlazada, listaDeEnterosEnlazada.tamanio());
		
	}

}
