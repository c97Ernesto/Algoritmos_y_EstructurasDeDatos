package parciales;

import tp03.ejercicio1.ArbolBinario;

//Inciso A)
//En la clase EjercicioDeArbolBinario, se debe implementar un método que reciba dos
//árboles binarios de enteros, el método deberá retornar verdadero si ambos árboles
//tienen la misma forma, falso en caso contrario.
//El método debe tener la siguiente firma:
//Public ?? compararFormaDelArbol (ArbolBinario<Integer> abUno, ArbolBinario<Integer> abDos)

public class Parcial14 {

	public static boolean compararFormaDelArbol (ArbolBinario<Integer> abUno, ArbolBinario<Integer> abDos) {
		
		if (abUno.esVacio() && abDos.esVacio()) {
			return true;
			
		} else if (!abUno.esVacio() && abDos.esVacio() || abUno.esVacio() && !abDos.esVacio()){
			return false;
			
		} else {
			return compararFormaDelArbolPrivado(abUno, abDos);
		}
	}
	
	private static boolean compararFormaDelArbolPrivado(ArbolBinario<Integer> abUno, ArbolBinario<Integer> abDos) {
		
		boolean tieneDerecho = false;
		boolean tieneIzquierdo = false;
		
		System.out.println(abUno.getDato());
		System.out.println(abDos.getDato());
		
		if (abUno.esHoja() && abDos.esHoja()) {
			tieneDerecho = true;
			tieneIzquierdo = true;
		} else {
			
			if (abUno.tieneHijoIzquierdo() && abDos.tieneHijoIzquierdo()) {
				tieneIzquierdo = compararFormaDelArbolPrivado(abUno.getHijoIzquierdo(), abDos.getHijoIzquierdo());
				
			} else {
				tieneIzquierdo = (!abUno.tieneHijoIzquierdo() && !abDos.tieneHijoIzquierdo());
			}
			
			if (abUno.tieneHijoDerecho() && abDos.tieneHijoDerecho() && tieneIzquierdo) {
				tieneDerecho = compararFormaDelArbolPrivado(abUno.getHijoDerecho(), abDos.getHijoDerecho());
				
			} else {
				tieneDerecho = (!abUno.tieneHijoDerecho() && !abDos.tieneHijoDerecho()); 
			}
		}
		
		return tieneIzquierdo && tieneDerecho;
		
	}
	
}
