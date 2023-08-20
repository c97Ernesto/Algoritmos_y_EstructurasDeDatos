package parciales;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial01 {
	
	private ArbolGeneral<Integer> arbol;
	
	
	public Parcial01(ArbolGeneral<Integer> a) {
		this.arbol = a;
	}


	public Integer buscarMayorEnPostOrden() {
		return this.buscar(this.arbol);
		
	}


	private Integer buscar(ArbolGeneral<Integer> a) {
		
		int max = 0;
		
		if (a.esHoja()) {
			return a.getDato();
		} else {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) {
				max = Math.max(max, buscar(hijos.proximo()));
			}
		}
		
		return max;
	}
}
