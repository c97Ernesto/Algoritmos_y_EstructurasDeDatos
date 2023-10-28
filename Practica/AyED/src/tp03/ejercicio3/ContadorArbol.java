package tp03.ejercicio3;

import tp02.ejercicio1.ListaDeEnteros;
import tp02.ejercicio1.ListaDeEnterosEnlazada;
import tp03.ejercicio1.ArbolBinario;

public class ContadorArbol {
	
	private ArbolBinario<Integer> arbolBinario;
	
	
	public ContadorArbol(ArbolBinario<Integer> a) {
		this.arbolBinario = a;
	}

	public ListaDeEnteros numerosPares() {
		ListaDeEnteros listaDeLosElementosDelArbol = new ListaDeEnterosEnlazada();
		
		this.recorridoInOrden(this.arbolBinario, listaDeLosElementosDelArbol);
		//this.recorridoPostOrden(this.arbolBinario, listaDeLosElementosDelArbol);
		
		return listaDeLosElementosDelArbol;
	}
	
	private void recorridoInOrden(ArbolBinario<Integer> ab, ListaDeEnteros listaDeEnteros) {
		
		if (ab.tieneHijoIzquierdo()) 
			recorridoInOrden(ab.getHijoIzquierdo(), listaDeEnteros);
		
		if (ab.getDato() % 2 == 0) 
			listaDeEnteros.agregarFinal(ab.getDato());
		
		if (ab.tieneHijoDerecho()) 
			recorridoInOrden(ab.getHijoDerecho(), listaDeEnteros);
		
	}
	
	private void recorridoPostOrden(ArbolBinario<Integer> ab, ListaDeEnteros listaDeEnteros) {
		
		if(ab.tieneHijoIzquierdo())
			recorridoPostOrden(ab.getHijoIzquierdo(), listaDeEnteros);
		
		if (ab.tieneHijoDerecho())
			recorridoPostOrden(ab.getHijoDerecho(), listaDeEnteros);
		
		if (ab.getDato() % 2 == 0)
			listaDeEnteros.agregarFinal(ab.getDato());
		
	}
	
}
