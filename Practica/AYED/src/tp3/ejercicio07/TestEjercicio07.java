package tp3.ejercicio07;

import java.util.List;

import tp3.ejercicio01.GeneralTree;

public class TestEjercicio07 {
	
	public static void main(String[] args) {
		
		GeneralTree<Integer> arbolVacio = new GeneralTree<>();
		
		// Nodo raíz que contiene el dato 1
		GeneralTree<Integer> arbol = new GeneralTree<>(1);

		// Crear hijos para el árbol
		GeneralTree<Integer> hijo1 = new GeneralTree<>(2);
		GeneralTree<Integer> hijo2 = new GeneralTree<>(3);
		GeneralTree<Integer> hijo3 = new GeneralTree<>(4);
		
		// Agrego nietos
		GeneralTree<Integer> nieto1 = new GeneralTree<>(5);
		GeneralTree<Integer> nieto2 = new GeneralTree<>(6);
		GeneralTree<Integer> nieto3 = new GeneralTree<>(7);
		GeneralTree<Integer> nieto4 = new GeneralTree<>(8);
		GeneralTree<Integer> nieto5 = new GeneralTree<>(9);
		GeneralTree<Integer> nieto6 = new GeneralTree<>(10);
		
		GeneralTree<Integer> bisNieto1 = new GeneralTree<>(11);
		GeneralTree<Integer> bisNieto2 = new GeneralTree<>(12);
		GeneralTree<Integer> bisNieto3 = new GeneralTree<>(13);
		GeneralTree<Integer> bisNieto4 = new GeneralTree<>(14);
		GeneralTree<Integer> bisNieto5 = new GeneralTree<>(16);
		
		GeneralTree<Integer> tataraNieto1 = new GeneralTree<>(15);
		
		
		

		arbol.addChild(hijo1);	//1 --> 2
			hijo1.addChild(nieto1);		//2 --> 5	
				nieto1.addChild(bisNieto1);		//5 --> 11
				nieto1.addChild(bisNieto2);		//5 --> 12
		
		
		arbol.addChild(hijo2);	//1 --> 3
			hijo2.addChild(nieto2);		//3 --> 6
				
			hijo2.addChild(nieto3);		//3 --> 7
				nieto2.addChild(bisNieto3);		//7 --> 13
				
			hijo2.addChild(nieto4);		//3 --> 8
				nieto4.addChild(bisNieto4);		//8 --> 14
					bisNieto4.addChild(tataraNieto1);
			
		arbol.addChild(hijo3);	//1 --> 4
			hijo3.addChild(nieto5);		//4 --> 9
				nieto5.addChild(bisNieto5);		//9 --> 16
				
			
			hijo3.addChild(nieto6);		//4 --> 10
			
//								1
//								
//				2				3				4
//				
//				5           6   7   8		 9     10
//								|	|	     |
//			  11 12			    13  14	     16
//			                        |
//			                        15

			Caminos camino = new Caminos(arbol);
			
			List<Integer> lista = camino.recorrido2(arbolVacio);
			List<Integer> lista2 = camino.recorrido2(arbolVacio);
			
			System.out.println(lista.toString());
			System.out.println(lista2.toString());
	}
}
