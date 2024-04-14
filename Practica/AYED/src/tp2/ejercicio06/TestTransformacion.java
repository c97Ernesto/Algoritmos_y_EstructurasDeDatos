package tp2.ejercicio06;

import tp2.ejercicio01.BinaryTree;
import tp2.ejercicio05.ProfundidadDeArbolBinario;

public class TestTransformacion {
	public static <T> void main(String[] args) {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(5);
		
		BinaryTree<Integer> subIzquierdo = new BinaryTree<Integer>(2);
		
		BinaryTree<Integer> subDerecho = new BinaryTree<Integer>(7);
//		BinaryTree<Integer> subDerecho = new BinaryTree<Integer>(null);

		ab.addLeftChild(subIzquierdo);
		ab.addRightChild(subDerecho);
		
		subIzquierdo.addLeftChild(new BinaryTree<Integer>(1));
		subIzquierdo.addRightChild(new BinaryTree<Integer>(4));
//		subIzquierdo.addRightChild(new BinaryTree<Integer>(null));
		
		subDerecho.addLeftChild(new BinaryTree<Integer>(6));
		subDerecho.addRightChild(new BinaryTree<Integer>(8));
		
//			 5
//		2		 7
//	  1	 4     6  8
		
		
		Transformacion arbolProfundo = new Transformacion(ab);
		
		arbolProfundo.suma().entreNiveles(0, 2);
		
	}
}

