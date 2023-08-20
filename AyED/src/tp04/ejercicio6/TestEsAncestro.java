package tp04.ejercicio6;

import tp04.ejercicio1.ArbolGeneral;

public class TestEsAncestro {
	public static void main(String[] args) {
		ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> b = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> c = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> d = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> e = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> f = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> g = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> h = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> i = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> j = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> k = new ArbolGeneral<Integer>(11);
		ArbolGeneral<Integer> l = new ArbolGeneral<Integer>(12);
		ArbolGeneral<Integer> m = new ArbolGeneral<Integer>(13);
		ArbolGeneral<Integer> n = new ArbolGeneral<Integer>(14);
		
//		[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
//		[a, b, c, d, e, f, g, h, i, j,  k,  l,  m,  n]
		
		/*
		 ARBOL 
		 				  1	
		 		 /	   	   |        \
		 		/          |         \
		  	   2		   3		  4				5	
		     / | \         | 	     /  \          
		    /  |  \        |        /    \
		    6  7  8        9	   12    13
		    	  		   |			  |
		    	  		   |			  |
		    	  		   10			 14	
		    	  		   |
		    	  		   |
		    	  		   11
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
		
		Integer dato1 = c.getDato();
		Integer dato2 = n.getDato();
		
		if (a.esAncestro(dato1, dato2))
			System.out.println(dato1 +" SI es ancestro de "+ dato2);
		else
			System.out.println(dato1 +" NO es ancestro de "+ dato2);
	}
}