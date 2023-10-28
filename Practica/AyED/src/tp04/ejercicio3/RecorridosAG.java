package tp04.ejercicio3;

import tp02.ejercicio03.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RecorridosAG {
	private ArbolGeneral<Integer> arbolDeEnteros;
	
	public RecorridosAG(ArbolGeneral<Integer> ag) {
		this.arbolDeEnteros = ag;
	}

	/*Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	pasados como parámetros, recorrido en preorden.*/
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(Integer n) {
		ListaGenerica<Integer> listInt = new ListaEnlazadaGenerica<Integer>();
		
		if (this.arbolDeEnteros != null) {  
			this.preOrden(this.arbolDeEnteros, n, listInt);
			return listInt;
		} else 
			return null;	
	}
	
	private void preOrden(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> listInt) {
		int num = a.getDato();		//obtengo el dato (opcional)
		
		if ((num > n) && ((num % 2) != 0)) 	//proceso el dato
			listInt.agregarFinal(num);
		
		if (a.tieneHijos()) {	//pregunto por los hijos
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) {	//mientras tenga hijos llamo recursivamente
				this.preOrden(hijos.proximo(), n, listInt);
			}
		}
	}
	
	
	
//	public ListaGenerica<Integer> numerosImparesMayoresQueInOrden(Integer n) {
//		ListaGenerica<Integer> listInt = new ListaEnlazadaGenerica<Integer>();
//		
//		if (this.arbolDeEnteros != null) {
//			this.inOrden(this.arbolDeEnteros, n, listInt);
//			return listInt;
//		} else 
//			return null;
//		
//	}
//	
//	private void inOrden (ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> l) {
//		int num = a.getDato();
//		
//		if (a.tieneHijos()) {
//			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
//			hijos.comenzar();
//			
//			
//			while(!hijos.fin()) {
//				this.inOrden(hijos.proximo(), n, l);
//			}
//		}
//		
//	}
	
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePostOrden(Integer n) {
		ListaGenerica<Integer> listInt = new ListaEnlazadaGenerica<Integer>();
		
		if (this.arbolDeEnteros != null) {
			this.postOrden(this.arbolDeEnteros, n, listInt);
			return listInt;
		} else 
			return null;
		
	}
	
	private void postOrden(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> l) {
		int num = a.getDato();
		
		if (a.tieneHijos()) {		//pregunto por los hijos
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) {		//mientra siga teniendo, llamo recursivamente
				this.postOrden(hijos.proximo(), n, l);	
			}
		}
		if ((num > n) && ((num % 2) != 0)) 	//proceso el dato
			l.agregarFinal(num);
	}
	
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePorNiveles(Integer n) {
		if (this.arbolDeEnteros != null) {
			ListaGenerica<Integer> listInt = new ListaEnlazadaGenerica<Integer>();
			ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<>();
			ArbolGeneral<Integer> nodo;
			
			cola.encolar(this.arbolDeEnteros);		//encolo raíz
			
			while (!cola.esVacia()) {			//mientra siga habiendo nodos en la cola:
				nodo = cola.desencolar();			//los desencolo
				
				if ((nodo.getDato() > n) && (nodo.getDato() % 2 != 0))	//pregunto por la condición del dato del nodo 
					listInt.agregarFinal(nodo.getDato());
				
				if (nodo.tieneHijos()) {		//si tiene más nodos enlazados:
					ListaGenerica<ArbolGeneral<Integer>> hijos = nodo.getHijos(); 
					hijos.comenzar();
					
					while (!hijos.fin()) //recorro los nodos hijos y los encolo
						cola.encolar(hijos.proximo());
				}
			}
			
			return listInt;
			
		} else
			return null;
		
	}
	
	
	
	
}
