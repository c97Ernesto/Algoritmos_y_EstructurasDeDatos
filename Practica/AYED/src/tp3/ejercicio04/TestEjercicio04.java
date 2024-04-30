package tp3.ejercicio04;

import tp3.ejercicio01.GeneralTree;

public class TestEjercicio04 {

	public static void main(String[] args) {
		
		
		AreaEmpresa a1 = new AreaEmpresa("A1", 1);
		AreaEmpresa a2 = new AreaEmpresa("A2", 2);
		AreaEmpresa a3 = new AreaEmpresa("A3", 3);
		AreaEmpresa a4 = new AreaEmpresa("A4", 4);
		AreaEmpresa a5 = new AreaEmpresa("A5", 5);
		AreaEmpresa a6 = new AreaEmpresa("A6", 6);
		AreaEmpresa a7 = new AreaEmpresa("A7", 7);
		AreaEmpresa a8 = new AreaEmpresa("A8", 8);
		AreaEmpresa a9 = new AreaEmpresa("A9", 9);
		AreaEmpresa a10 = new AreaEmpresa("A10", 10);
		AreaEmpresa a11 = new AreaEmpresa("A11", 11);
		AreaEmpresa a12 = new AreaEmpresa("A12", 12);
		AreaEmpresa a13= new AreaEmpresa("A13", 13);
		AreaEmpresa a14 = new AreaEmpresa("A14", 14);
		AreaEmpresa a15 = new AreaEmpresa("A15", 15);
		AreaEmpresa a16 = new AreaEmpresa("A16", 16);
		
		GeneralTree<AreaEmpresa> arbolVacio = new GeneralTree<>();
		
		// Nodo raíz que contiene el dato 1
		GeneralTree<AreaEmpresa> arbol = new GeneralTree<AreaEmpresa>(a1);

		// Crear hijos para el árbol
		GeneralTree<AreaEmpresa> hijo1 = new GeneralTree<>(a2);
		GeneralTree<AreaEmpresa> hijo2 = new GeneralTree<>(a3);
		GeneralTree<AreaEmpresa> hijo3 = new GeneralTree<>(a4);
		
		// Agrego nietos
		GeneralTree<AreaEmpresa> nieto1 = new GeneralTree<>(a5);
		GeneralTree<AreaEmpresa> nieto2 = new GeneralTree<>(a6);
		GeneralTree<AreaEmpresa> nieto3 = new GeneralTree<>(a7);
		GeneralTree<AreaEmpresa> nieto4 = new GeneralTree<>(a8);
		GeneralTree<AreaEmpresa> nieto5 = new GeneralTree<>(a9);
		GeneralTree<AreaEmpresa> nieto6 = new GeneralTree<>(a10);
		
		GeneralTree<AreaEmpresa> bisNieto1 = new GeneralTree<>(a11);
		GeneralTree<AreaEmpresa> bisNieto2 = new GeneralTree<>(a12);
		GeneralTree<AreaEmpresa> bisNieto3 = new GeneralTree<>(a13);
		GeneralTree<AreaEmpresa> bisNieto4 = new GeneralTree<>(a14);
		GeneralTree<AreaEmpresa> bisNieto5 = new GeneralTree<>(a15);
		GeneralTree<AreaEmpresa> bisNieto6 = new GeneralTree<>(a16);
		

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
			
		arbol.addChild(hijo3);	//1 --> 4
			hijo3.addChild(nieto5);		//4 --> 9
				nieto5.addChild(bisNieto5);		//9 --> 15
				nieto5.addChild(bisNieto6);		//9 --> 16
			
			hijo3.addChild(nieto6);		//4 --> 10
			
//								1
//								
//				2				3				4
//				
//				5           6   7   8		 9     10
//								|	|		/\
//			  11 12			    13  14	   15 16
			
			AnalizadorArbol analizador = new AnalizadorArbol();
			
			System.out.println("Promedio máximo del árbol por nivel: " + analizador.devolverMaximoPromedio(arbol));
			
	}
	
}
