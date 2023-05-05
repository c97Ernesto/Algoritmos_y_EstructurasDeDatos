package tp04.ejercicio5;

import tp04.ejercicio1.ArbolGeneral;

public class TestEjercicio5 {

	public static void main(String[] args) {
		
		AreaEmpresa dato = new AreaEmpresa ("A",1);
		ArbolGeneral<AreaEmpresa> a = new ArbolGeneral<AreaEmpresa>(dato);
		
		dato = new AreaEmpresa ("B",3);
		ArbolGeneral<AreaEmpresa> b = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa ("C",3);
		ArbolGeneral<AreaEmpresa> c = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa ("D",3);
		ArbolGeneral<AreaEmpresa> d = new ArbolGeneral<AreaEmpresa>(dato);
		
		dato = new AreaEmpresa ("E",9);
		ArbolGeneral<AreaEmpresa> e = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa ("F",9);
		ArbolGeneral<AreaEmpresa> f = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa ("G",9);
		ArbolGeneral<AreaEmpresa> g = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa ("H",9);
		ArbolGeneral<AreaEmpresa> h = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa ("I",9);
		ArbolGeneral<AreaEmpresa> i = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa ("J",9);
		ArbolGeneral<AreaEmpresa> j = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa ("K",9);
		ArbolGeneral<AreaEmpresa> k = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa ("L",9);
		ArbolGeneral<AreaEmpresa> l = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa ("M",9);
		ArbolGeneral<AreaEmpresa> m = new ArbolGeneral<AreaEmpresa>(dato);
		
		a.agregarHijo(b);
		a.agregarHijo(c);
		a.agregarHijo(d);
		
		b.agregarHijo(e);
		b.agregarHijo(f);
		b.agregarHijo(g);
		
		c.agregarHijo(h);
		c.agregarHijo(i);
		c.agregarHijo(j);
		
		d.agregarHijo(k);
		d.agregarHijo(l);
		d.agregarHijo(m);
		
		AnalizarArbol test = new AnalizarArbol();
		
		System.out.println(test.devolverMaximoPromedio(a));


	}

}
