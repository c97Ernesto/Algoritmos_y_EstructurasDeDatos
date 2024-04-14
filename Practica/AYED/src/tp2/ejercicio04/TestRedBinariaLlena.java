package tp2.ejercicio04;

import tp2.ejercicio01.BinaryTree;

public class TestRedBinariaLlena {

	public static void main(String[] args) {
		
		BinaryTree<Integer> ab = new BinaryTree<Integer>(5);
		
		BinaryTree<Integer> subIzquierdo = new BinaryTree<Integer>(2);
		
		BinaryTree<Integer> subDerecho = new BinaryTree<Integer>(7);		

		ab.addLeftChild(subIzquierdo);
		ab.addRightChild(subDerecho);
		
		subIzquierdo.addLeftChild(new BinaryTree<Integer>(1));
		subIzquierdo.addRightChild(new BinaryTree<Integer>(3));
		
		subDerecho.addLeftChild(new BinaryTree<Integer>(6));
		//subDerecho.addRightChild(new BinaryTree<Integer>(8));
		
//			5
//		2		7
//	  1	 3	  6  8
		
		
		RedBinariaLlena arbolLleno = new RedBinariaLlena(ab);
		
		System.out.println(arbolLleno.retardoReenvio());
	}
	
}
