package tp3.ejercicio09;

import java.util.Iterator;

import tp3.ejercicio01.GeneralTree;

public class Ejercicio09 {

	public static boolean esDeSeleccion(GeneralTree<Integer> arbol) {
		boolean esDeSeleccion = true;
		
		if ((arbol == null) || (arbol.isEmpty()))
			esDeSeleccion = false;
		
		if (esDeSeleccion && arbol.hasChildren()) {
			GeneralTree<Integer> hijoMin = new GeneralTree<Integer>(9999);
			GeneralTree<Integer> hijo;
			
			Iterator<GeneralTree<Integer>> i = arbol.getChildren().iterator();
			
			while (i.hasNext() && esDeSeleccion) {
				hijo = i.next();
				if (hijoMin.getData() > hijo.getData()) {
					hijoMin = hijo;
				}
				esDeSeleccion = esDeSeleccion(hijo);
			}
			
			if (esDeSeleccion && (arbol.getData() != hijoMin.getData())) {
				esDeSeleccion = false;
			}
		}
		
		return esDeSeleccion;
	}
	
	public static void main(String[] args) {
		
		GeneralTree<Integer> arbolVacio = null;
		
		GeneralTree<Integer> nivel0_12 = new GeneralTree<Integer>(12);
		
		GeneralTree<Integer> nivel1_12 = new GeneralTree<Integer>(12);
		GeneralTree<Integer> nivel1_25 = new GeneralTree<Integer>(25);
		
		GeneralTree<Integer> nivel2_35 = new GeneralTree<Integer>(35);
		GeneralTree<Integer> nivel2_12 = new GeneralTree<Integer>(12);
		GeneralTree<Integer> nivel2_25 = new GeneralTree<Integer>(25);
		
		GeneralTree<Integer> nivel3_35 = new GeneralTree<Integer>(35);
		GeneralTree<Integer> nivel3_14 = new GeneralTree<Integer>(14);
		GeneralTree<Integer> nivel3_12 = new GeneralTree<Integer>(12);
		GeneralTree<Integer> nivel3_33 = new GeneralTree<Integer>(33);
		
		GeneralTree<Integer> nivel4_35 = new GeneralTree<Integer>(35);
		GeneralTree<Integer> nivel4_35b = new GeneralTree<Integer>(35);
		GeneralTree<Integer> nivel4_83 = new GeneralTree<Integer>(83);
		GeneralTree<Integer> nivel4_90 = new GeneralTree<Integer>(90);
		GeneralTree<Integer> nivel4_33 = new GeneralTree<Integer>(33);
		
		nivel0_12.addChild(nivel1_12);
		nivel0_12.addChild(nivel1_25);
		
		
		nivel1_12.addChild(nivel2_35);
		nivel1_12.addChild(nivel2_12);
		
		nivel1_25.addChild(nivel2_25);
		
	
		nivel2_35.addChild(nivel3_35);
		
		nivel2_12.addChild(nivel3_14);
		nivel2_12.addChild(nivel3_12);
		nivel2_12.addChild(nivel3_33);
		
		nivel3_35.addChild(nivel4_35);
		nivel3_33.addChild(nivel4_35);
		nivel3_33.addChild(nivel4_83);
		nivel3_33.addChild(nivel4_90);
		nivel3_33.addChild(nivel4_33);
		
		//nivel0_12.nivel(null);
		
		System.out.println("");
		
		if (esDeSeleccion(nivel0_12)) {
			System.out.println("El arbol es de selección");
		} else
			System.out.println("El arbol no es de selección");
	}

}
