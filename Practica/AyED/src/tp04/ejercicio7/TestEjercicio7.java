package tp04.ejercicio7;

import tp04.ejercicio1.ArbolGeneral;

public class TestEjercicio7 {
	public static void main(String[] args) {
		ArbolGeneral<String> a = new ArbolGeneral<String>("A");
		ArbolGeneral<String> b = new ArbolGeneral<String>("B");
		ArbolGeneral<String> c = new ArbolGeneral<String>("C");
		ArbolGeneral<String> d = new ArbolGeneral<String>("D");
		ArbolGeneral<String> e = new ArbolGeneral<String>("E");
		ArbolGeneral<String> f = new ArbolGeneral<String>("F");
		ArbolGeneral<String> g = new ArbolGeneral<String>("G");
		ArbolGeneral<String> h = new ArbolGeneral<String>("H");
		ArbolGeneral<String> i = new ArbolGeneral<String>("I");
		ArbolGeneral<String> j = new ArbolGeneral<String>("J");
		ArbolGeneral<String> k = new ArbolGeneral<String>("K");
		ArbolGeneral<String> l = new ArbolGeneral<String>("L");
		ArbolGeneral<String> m = new ArbolGeneral<String>("M");
		ArbolGeneral<String> n = new ArbolGeneral<String>("N");
	
//	[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
//	[a, b, c, d, e, f, g, h, i, j,  k,  l,  m,  n]
	
	/*
	 ARBOL 
	 				  A	
	 		 /	   	   |        \
	 		/          |         \
	  	   B		   C		  D				E	
	     / | \         | 	     /  \          
	    /  |  \        |        /    \
	    F  G  H        I	   L      M
	    	  		   |			  |
	    	  		   |			  |
	    	  		   J			  N	
	    	  		   |
	    	  		   |
	    	  		   K
	 */
		a.agregarHijo(b);
		a.agregarHijo(c);
		a.agregarHijo(d);
		a.agregarHijo(e);
		
		b.agregarHijo(f);
		b.agregarHijo(g);
		b.agregarHijo(h);
		
		c.agregarHijo(i);i.agregarHijo(j);j.agregarHijo(k);
		
		d.agregarHijo(l);
		d.agregarHijo(m); m.agregarHijo(n);
		
		RedDeAguaPotable test = new RedDeAguaPotable(a);
		System.out.println(test.minimoCaudal(1000));
		
	}
}
