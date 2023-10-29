package parciales;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial02 {
	
	
	public int contar (ArbolGeneral<Integer> a, int valor) {
		int cant = 0;
		
		if (a.esHoja() && valor == 0)
			cant++;
		else {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				cant = contar(hijos.proximo(), valor - a.getDato());
			}
		}
		
		return cant;
	}
	
}
