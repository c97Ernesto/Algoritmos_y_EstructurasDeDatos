package tp03.ejercicio2;

import tp03.ejercicio1.ArbolBinario;

public class Test_Ejercicio02 {
	
	public static void main(String[] args) {
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(3); 
		ArbolBinario<Integer> b = new ArbolBinario<Integer>(4); 
		ArbolBinario<Integer> c = new ArbolBinario<Integer>(6); 
		ArbolBinario<Integer> d = new ArbolBinario<Integer>(8); 
		ArbolBinario<Integer> e = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> f = new ArbolBinario<Integer>(11);
		ArbolBinario<Integer> g = new ArbolBinario<Integer>(22);
		
		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);
		b.agregarHijoIzquierdo(d);
		b.agregarHijoDerecho(e);
		c.agregarHijoIzquierdo(f);
		f.agregarHijoDerecho(g);
//											3
//									4				6
//								8		2		11	
//												  22
										
		
		System.out.println("Cantidad de hojas: " + a.contarHojas());
		
	}	
}
