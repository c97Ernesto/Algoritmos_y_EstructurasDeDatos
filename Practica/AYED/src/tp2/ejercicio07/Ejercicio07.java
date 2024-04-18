package tp2.ejercicio07;

import tp2.ejercicio01.BinaryTree;

public class Ejercicio07 {

	private BinaryTree<Integer> binaryTree;
	
	public Ejercicio07(BinaryTree<Integer> ab) {
		this.binaryTree = ab;
	}
	
	/*
	 * El método devuelve true si el subárbol cuya raíz es “num”, tiene en su subárbol 
	 * izquierdo una cantidad mayor estricta de árboles con un único hijo que en su 
	 * subárbol derecho. Y false en caso contrario. Consideraciones:
	 * 		-Si “num” no se encuentra en el árbol, devuelve false.
	 * 		- Si el árbol con raíz “num” no cuenta con una de sus ramas, considere que 
	 * 		en esa rama hay -1 árboles con único hijo.
	 * */
	
	public boolean isLeftTree(int num) {
		BinaryTree<Integer> subArbolNum = new BinaryTree<Integer>();
		if (this.binaryTree == null || this.binaryTree.isEmpty()) {
			return false;
		}
		else
			subArbolNum = buscarNum(this.binaryTree, num);
			return cantHijos(subArbolNum.getLeftChild()) > cantHijos(subArbolNum.getRightChild());
		
	}
	
	
	private int cantHijos(BinaryTree<Integer> ab) {
		
		if (ab == null || ab.isEmpty())
			return 0;

		int hi = -1;
		if (ab.hasLeftChild())
			hi += cantHijos(ab.getLeftChild());
		
		int hd = -1;
		if (ab.hasRightChild())
			hd += cantHijos(ab.getRightChild());
		
		if (hi > hd)
			return 1;
		else
			return -1;
		
	}

	private BinaryTree<Integer> buscarNum(BinaryTree<Integer> ab, int n) {
		BinaryTree<Integer> nodo = new BinaryTree<Integer>();
		
		if (ab.getData() == n)
			nodo = ab;
		else
			if (ab.hasRightChild())
				nodo = buscarNum(ab.getRightChild(), n);
			if (ab.hasLeftChild())
				nodo = buscarNum(ab.getLeftChild(), n);
			
		return nodo;
	}


}
