package parciales;

import tp03.ejercicio1.ArbolBinario;

//Implementar el método "sumaImparesPosOrderMayorA(ArbolBinario<Integer> ab, int limite)" que recibe un arbol
//binario de enteros positivos y número entero. Este método suma todos los números impares del árbol que son
//mayores al parámetro recibido realizandolo en un recorrido posOrder.

public class Parcial08 {
	
	
	public static Integer sumaImparesPosOrderMayorA(ArbolBinario<Integer> ab, int limite) {
		int total = -1;
		
		if (ab.esVacio()) {
			return total;
		} 
		else {
			total = sumaImparesPosOrderMayorAPrivado(ab, limite);
		}
		return total;
	}

	private static int sumaImparesPosOrderMayorAPrivado(ArbolBinario<Integer> ab, int limite) {
		int suma = 0;
		
		if (ab.esHoja()) {
			if ((ab.getDato() % 2 == 1) && ab.getDato() > limite) { 
				suma+= ab.getDato();
				System.out.println(ab.getDato());
			}
		} 
		else {
			if (ab.tieneHijoIzquierdo()) {
				suma+= sumaImparesPosOrderMayorAPrivado(ab.getHijoIzquierdo(), limite);
				
			}
			if (ab.tieneHijoDerecho()) {
				suma+= sumaImparesPosOrderMayorAPrivado(ab.getHijoDerecho(), limite); 
					
			}
			
			if ((ab.getDato() % 2 == 1) && ab.getDato() > limite) { 
				suma+= ab.getDato();
				System.out.println(ab.getDato());
			}
		} 
		
		
		return suma;
	}
	
	
	public static Integer sumaImparesPosOrderMayorA_V2(ArbolBinario<Integer> ab, int limite) {
		int sumaImpares = 0;
		
		if (ab != null) {
			System.out.println(ab.getDato());
			
			if (ab.getDato() % 2 != 0 && ab.getDato() > limite) {
				sumaImpares+= ab.getDato();
			}
			
			if(!ab.esHoja()) {
				if (ab.tieneHijoDerecho()) {
					sumaImpares+= sumaImparesPosOrderMayorA(ab.getHijoIzquierdo(), limite);
				}
				if (ab.tieneHijoDerecho()) {
					sumaImpares+= sumaImparesPosOrderMayorA(ab.getHijoDerecho(), limite);
				}
			}
		}
		return sumaImpares;
	}
}
