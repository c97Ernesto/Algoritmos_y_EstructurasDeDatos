package parciales;

import tp03.ejercicio1.ArbolBinario;

public class Parcial08 {
	
	public static Integer sumaImparesPosOrderMayorA(ArbolBinario<Integer> ab, int limite) {
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
