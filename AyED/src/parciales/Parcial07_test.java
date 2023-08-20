package parciales;

import tp03.ejercicio1.ArbolBinario;

public class Parcial07_test {
	
    public static void main(String[] args) {
        ArbolBinario<String> a = new ArbolBinario<>("A");
        
        ArbolBinario<String> b = new ArbolBinario<>("B");
        ArbolBinario<String> c = new ArbolBinario<>("C");
        
        ArbolBinario<String> d = new ArbolBinario<>("D");
        ArbolBinario<String> e = new ArbolBinario<>("E");
        ArbolBinario<String> f = new ArbolBinario<>("F");
        ArbolBinario<String> g = new ArbolBinario<>("G");
        
        ArbolBinario<String> h = new ArbolBinario<>("H");
        ArbolBinario<String> i = new ArbolBinario<>("I");
        ArbolBinario<String> j = new ArbolBinario<>("J");
        
        ArbolBinario<String> k = new ArbolBinario<>("K");
        ArbolBinario<String> l = new ArbolBinario<>("L");
        ArbolBinario<String> m = new ArbolBinario<>("M");
        ArbolBinario<String> n = new ArbolBinario<>("N");
        			
//        				A
//        	 B						C
//        D		E				F		G
//      H		  I							  J
//             	 K L						 M N
        
        
        a.agregarHijoIzquierdo(b);
        a.agregarHijoDerecho(c);
        
        b.agregarHijoIzquierdo(d);
        b.agregarHijoDerecho(e);
        c.agregarHijoIzquierdo(f);
        c.agregarHijoDerecho(g);
        
        d.agregarHijoIzquierdo(h);
        e.agregarHijoIzquierdo(i);
        g.agregarHijoDerecho(j);
        
        i.agregarHijoIzquierdo(k);
        i.agregarHijoDerecho(l);
        j.agregarHijoIzquierdo(m);
        j.agregarHijoDerecho(n);
        
        Parcial07 test = new Parcial07(d);	
        System.out.println(test.contar());
        
        System.out.println(test.buscar("D"));
    }
}
