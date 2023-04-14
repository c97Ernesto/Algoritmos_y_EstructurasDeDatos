package tp03.ejercicio3;

import tp02.ejercicio1.ListaDeEnteros;
import tp03.ejercicio1.ArbolBinario;


public class TestContadorArbol {
	
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
										
		
		ContadorArbol test = new ContadorArbol(a);
		
		ListaDeEnteros l = test.numerosPares();
		
		l.comenzar();
		while (!l.fin()) {
			System.out.println(l.proximo());
		} 
		
	}
}
