package tp2.ejercicio07;

import tp2.ejercicio01.BinaryTree;

public class TestEjercicio07 {

	public static void main(String[] args) {
		
		BinaryTree<Integer> dos = new BinaryTree<Integer>(2);
		BinaryTree<Integer> siete = new BinaryTree<Integer>(7);
		BinaryTree<Integer> cincoNeg = new BinaryTree<Integer>(-5);
		BinaryTree<Integer> veintiTres = new BinaryTree<Integer>(23);
		BinaryTree<Integer> seis = new BinaryTree<Integer>(6);
		BinaryTree<Integer> dieciNueve = new BinaryTree<Integer>(19);
		BinaryTree<Integer> tresNeg = new BinaryTree<Integer>(-3);
		BinaryTree<Integer> cincuentaYcinco = new BinaryTree<Integer>(55);
		BinaryTree<Integer> once = new BinaryTree<Integer>(11);
		BinaryTree<Integer> cuatro = new BinaryTree<Integer>(4);
		BinaryTree<Integer> dieciOcho = new BinaryTree<Integer>(18);
		
		dos.addLeftChild(siete);
		dos.addRightChild(cincoNeg);
		
		siete.addLeftChild(veintiTres);
		siete.addRightChild(seis);
		cincoNeg.addRightChild(dieciNueve);
		
		veintiTres.addLeftChild(tresNeg);
		seis.addLeftChild(cincuentaYcinco);
		seis.addRightChild(once);
		dieciNueve.addRightChild(cuatro);
		
		cuatro.addLeftChild(dieciOcho);
		
//			 2
//		 7		 -5
//	  23   6       19  
//	-3	 55 11	     4
//				   18
		
		Ejercicio07 ej = new Ejercicio07(dos);
		
		if (ej.isLeftTree(7) == true) 
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto");
	}

}
