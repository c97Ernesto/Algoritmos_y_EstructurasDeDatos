package parciales;

import tp03.ejercicio1.ArbolBinario;

public class Parcial08_test {
	public static void main(String[] args) {
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(2);

		ArbolBinario<Integer> b = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> c = new ArbolBinario<Integer>(5);

		ArbolBinario<Integer> d = new ArbolBinario<Integer>(16);
		ArbolBinario<Integer> e = new ArbolBinario<Integer>(6);

		ArbolBinario<Integer> f = new ArbolBinario<Integer>(8);

		ArbolBinario<Integer> g = new ArbolBinario<Integer>(13);

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
								13				64
*/

		int limite = 12;
		
		int testSuma = Parcial08.sumaImparesPosOrderMayorA(a, limite);
		
		System.out.println("Suma de impares mayores a "+ limite +" es: "+ testSuma);
	}

}
