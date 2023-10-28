package tp03.ejercicio5;

import tp03.ejercicio1.ArbolBinario;

public class TestProfundidad {
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
		b.agregarHijoDerecho(g);
		c.agregarHijoIzquierdo(f);
		c.agregarHijoDerecho(e);
//											3
//									4				6
//								8		22		11     2	
//												  
										
		
		ProfundidadDeArbolBinario test = new ProfundidadDeArbolBinario(a);
		
		int sumaTotalEnElNivel = test.sumaElementosProfundidad(2);
		
		System.out.print(sumaTotalEnElNivel);
		
		
		
	}
}
