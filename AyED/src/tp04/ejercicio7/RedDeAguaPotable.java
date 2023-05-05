package tp04.ejercicio7;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RedDeAguaPotable {
	
	ArbolGeneral<Integer> arbol = new ArbolGeneral<Integer>(2);
	
	public double minimoCaudal(double caudal) {
		
		return minimoCaudal(0, 0);
		
	}
	
	private double minimoCaudal(int n, int caudal) {
		
		if (this.arbol.esHoja())
			return caudal;
		else {
			ListaGenerica<ArbolGeneral<Integer>> hijos = this.arbol.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) {
				Math.max(minimoCaudal(n, caudal), minimoCaudal(n, caudal));
			}
		}
	}
	
}
