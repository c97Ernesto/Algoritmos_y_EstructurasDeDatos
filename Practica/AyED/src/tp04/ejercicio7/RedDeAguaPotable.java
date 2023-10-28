package tp04.ejercicio7;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RedDeAguaPotable {
	
	ArbolGeneral<String> arbol;
	
	public RedDeAguaPotable(ArbolGeneral<String> a) {
		this.arbol=a;
	}
	
	public double minimoCaudal(double caudal) {
		if (this.arbol != null) 
			return this.recorrerProfundidad(this.arbol, caudal);
		else
			return -1;
	}
	private double recorrerProfundidad(ArbolGeneral<String> a, double caudal) {
		double min = caudal;
		
		if (a.esHoja())
			return caudal;
		else {
			ListaGenerica<ArbolGeneral<String>> hijos = a.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) {
				min = Math.min(min, recorrerProfundidad(hijos.proximo(), caudal/hijos.tamanio()));
			}
		}
		return min;
	}
	
}
