package tp2.ejercicio05;

import tp2.ejercicio01.BinaryTree;

public class TestProfundidadArbolBinario {
	public static <T> void main(String[] args) {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(5);
		
		BinaryTree<Integer> subIzquierdo = new BinaryTree<Integer>(2);
		
		BinaryTree<Integer> subDerecho = new BinaryTree<Integer>(null);		

		ab.addLeftChild(subIzquierdo);
		ab.addRightChild(subDerecho);
		
		subIzquierdo.addLeftChild(new BinaryTree<Integer>(1));
		subIzquierdo.addRightChild(new BinaryTree<Integer>(null));
		
		subDerecho.addLeftChild(new BinaryTree<Integer>(6));
		subDerecho.addRightChild(new BinaryTree<Integer>(8));
		
//			 5
//		2		 nil
//	  1	 nil    6  8
		
		
		ProfundidadDeArbolBinario arbolProfundo = new ProfundidadDeArbolBinario(ab);
		
		System.out.println(arbolProfundo.sumaElementosProfundidad2(2));
		
	}
}
