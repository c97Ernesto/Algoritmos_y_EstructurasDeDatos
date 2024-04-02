package tp2.ejercicio02;

import tp2.ejercicio01.BinaryTree;

public class TestBianaryTree {

	public static void main(String[] args) {
		
		BinaryTree<Integer> abb = new BinaryTree<Integer>(5);
		
		BinaryTree<Integer> subIzquierdo = new BinaryTree<Integer>(2);
		
		BinaryTree<Integer> subDerecho = new BinaryTree<Integer>(7);
		

		abb.addLeftChild(subIzquierdo);
		
		abb.addRightChild(subDerecho);
		
		subIzquierdo.addLeftChild(new BinaryTree<Integer>(1));
		subIzquierdo.addRightChild(new BinaryTree<Integer>(3));
		
		subDerecho.addLeftChild(new BinaryTree<Integer>(6));
		subDerecho.addRightChild(new BinaryTree<Integer>(8));
		
		System.out.println(abb.contarHojas());
		
		System.out.println(abb.toString());
		
	}

}
