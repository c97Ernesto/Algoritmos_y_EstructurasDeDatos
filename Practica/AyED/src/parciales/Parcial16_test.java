package parciales;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class Parcial16_test {
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
		
		e.agregarHijoIzquierdo(d);
		e.agregarHijoDerecho(i);

		c.agregarHijoIzquierdo(f);
		c.agregarHijoDerecho(h);

		f.agregarHijoIzquierdo(g);
		f.agregarHijoDerecho(i);

		h.agregarHijoDerecho(i);
/*		
									2
					1								5
			16				6				8				25
						16		64		22		64				64
*/
		Parcial16 test = new Parcial16(a);
		
		ListaGenerica<Integer> l = test.procesar();
		
		l.comenzar();
		while (!l.fin()) {
			System.out.println(l.proximo());
		}
		
	}
}
