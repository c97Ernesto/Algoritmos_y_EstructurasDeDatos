package parciales;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class Parcial15_test {
	
	public static void main(String[] args) {
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(2);

		ArbolBinario<Integer> b = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> c = new ArbolBinario<Integer>(5);

		ArbolBinario<Integer> d = new ArbolBinario<Integer>(16);
		ArbolBinario<Integer> e = new ArbolBinario<Integer>(6);

		ArbolBinario<Integer> f = new ArbolBinario<Integer>(8);

		ArbolBinario<Integer> g = new ArbolBinario<Integer>(22);

		ArbolBinario<Integer> h = new ArbolBinario<Integer>(25);

		ArbolBinario<Integer> i = new ArbolBinario<Integer>(64);

		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);

		b.agregarHijoIzquierdo(d);
		b.agregarHijoDerecho(e);

		c.agregarHijoIzquierdo(f);
		c.agregarHijoDerecho(h);

		f.agregarHijoIzquierdo(g);

		h.agregarHijoDerecho(i);
/*		
							2
				1						5
			16		6				8		25
								22				64
*/
		
		ArbolBinario<Integer> a2 = new ArbolBinario<Integer>(2);

		ArbolBinario<Integer> b2 = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> c2 = new ArbolBinario<Integer>(5);

		ArbolBinario<Integer> d2 = new ArbolBinario<Integer>(16);
		ArbolBinario<Integer> e2 = new ArbolBinario<Integer>(6);

		ArbolBinario<Integer> f2 = new ArbolBinario<Integer>(8);

		ArbolBinario<Integer> g2 = new ArbolBinario<Integer>(22);

		ArbolBinario<Integer> h2 = new ArbolBinario<Integer>(25);

		ArbolBinario<Integer> i2 = new ArbolBinario<Integer>(64);

		a2.agregarHijoIzquierdo(b2);
		a2.agregarHijoDerecho(c2);

		b2.agregarHijoIzquierdo(d2);
		b2.agregarHijoDerecho(e2);

		c2.agregarHijoIzquierdo(f2);
		c2.agregarHijoDerecho(h2);

		f2.agregarHijoIzquierdo(g2);

		h2.agregarHijoDerecho(i2);
		
		
		
		ListaGenerica<ListaGenerica<Integer>> listaDeListas = new ListaEnlazadaGenerica<ListaGenerica<Integer>>();
		
		listaDeListas = new Parcial15().caminoMayorA(a, 9);
		
		while (!listaDeListas.fin()) {
			ListaGenerica<Integer> lista = listaDeListas.proximo();  
			
			System.out.println("Camino: ");
			while (!lista.fin()) {
				System.out.println(lista.proximo());
			}
		}
		
	}
	
	
}
