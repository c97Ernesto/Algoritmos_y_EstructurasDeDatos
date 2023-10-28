package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class RedBinariaLlena {

	private ArbolBinario<Integer> arbolBinario;

	public RedBinariaLlena(ArbolBinario<Integer> ab) {
		this.arbolBinario = ab;
	}

	public int retardoEnvio() {
		
		if (this.arbolBinario != null) {
			return recorridoEnProfundidad(this.arbolBinario);
		} else {
			return -1;
		}
	}

	private int recorridoEnProfundidad(ArbolBinario<Integer> ab) {
		if (ab.esHoja()) {
			return ab.getDato();
		} else {
			return ab.getDato() + Math.max(recorridoEnProfundidad(ab.getHijoIzquierdo()),
				recorridoEnProfundidad(ab.getHijoDerecho()));
		}
	}

}
