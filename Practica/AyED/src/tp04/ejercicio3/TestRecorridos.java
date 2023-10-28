package tp04.ejercicio3;

import tp04.ejercicio1.ArbolGeneral;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;

public class TestRecorridos {

	public static void main(String[] args) {
		ArbolGeneral<Integer> b1 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> b2 = new ArbolGeneral<Integer>(13);
		ArbolGeneral<Integer> b3 = new ArbolGeneral<Integer>(3);
		ListaGenerica<ArbolGeneral<Integer>> hijosB = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		hijosB.agregarFinal(b1);
		hijosB.agregarFinal(b2);
		hijosB.agregarFinal(b3);
		ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(0, hijosB);
		
		ArbolGeneral<Integer> c1 = new ArbolGeneral<Integer>(17);
		ArbolGeneral<Integer> c2 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> c3 = new ArbolGeneral<Integer>(19);
		ListaGenerica<ArbolGeneral<Integer>> hijosC = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		hijosC.agregarFinal(c1);
		hijosC.agregarFinal(c2);
		hijosC.agregarFinal(c3);
		b2.agregarHijo(c1);
		b2.agregarHijo(c2);
		b2.agregarHijo(c3);
		
		ArbolGeneral<Integer> d1 = new ArbolGeneral<Integer>(7);
		ListaGenerica<ArbolGeneral<Integer>> hijosD = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		hijosD.agregarFinal(d1);
		c3.agregarHijo(d1);
		
//											0
//											
//								1			13			3
//								
//										17	5	19
//										
//												7
		
		ListaGenerica<Integer> listaDeEnterosPre = new RecorridosAG(a).numerosImparesMayoresQuePreOrden(1);
		listaDeEnterosPre.comenzar();
		while (!listaDeEnterosPre.fin()) 
			System.out.print(listaDeEnterosPre.proximo() + " - ");
		
		System.out.println();
		
		
		ListaGenerica<Integer> listaDeEnterosPost = new RecorridosAG(a).numerosImparesMayoresQuePostOrden(1);
		listaDeEnterosPost.comenzar();
		while (!listaDeEnterosPost.fin()) 
			System.out.print(listaDeEnterosPost.proximo() + " - ");
		
		System.out.println();
		
		
		ListaGenerica<Integer> listaDeEnterosNivel = new RecorridosAG(a).numerosImparesMayoresQuePorNiveles(1);
		listaDeEnterosNivel.comenzar();
		while(!listaDeEnterosNivel.fin())
			System.out.print(listaDeEnterosNivel.proximo() + " - ");
		
		System.out.println();
	}

}
