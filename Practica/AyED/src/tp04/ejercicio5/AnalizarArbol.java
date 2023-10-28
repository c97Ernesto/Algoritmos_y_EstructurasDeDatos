package tp04.ejercicio5;

import tp02.ejercicio03.ColaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class AnalizarArbol {
	private static final ArbolGeneral<AreaEmpresa> FIN_NIVEL = new ArbolGeneral<AreaEmpresa>(null);
	
	public int devolverMaximoPromedio(ArbolGeneral<AreaEmpresa> arbol) {
		ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
		ArbolGeneral<AreaEmpresa> nodo;
		
		cola.encolar(arbol);
		cola.encolar(FIN_NIVEL);
		
		int promedio = 0, maxPromedio = 0, cantNodos = 0;
		
		while (!cola.esVacia()) {
			nodo = cola.desencolar();
			
			if (nodo != FIN_NIVEL) {
				promedio+= nodo.getDato().getTardanza();
				cantNodos+= 1;
				
				if (nodo.tieneHijos()) {
					ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = nodo.getHijos();
					hijos.comenzar();
					while (!hijos.fin()) {
						cola.encolar(hijos.proximo());
					}
				}
			} else {
				promedio = promedio / cantNodos;
				maxPromedio = Math.max(maxPromedio, promedio);
				
				promedio = 0;
				cantNodos = 0;
				
				if (!cola.esVacia()) {
					cola.encolar(FIN_NIVEL);
				}
			}	
		}
		return maxPromedio;
	}
}
