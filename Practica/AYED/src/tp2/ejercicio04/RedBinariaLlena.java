package tp2.ejercicio04;

import tp2.ejercicio01.BinaryTree;

public class RedBinariaLlena {

	private BinaryTree<Integer> binaryTree;
	
	public RedBinariaLlena(BinaryTree<Integer> binaryTree) {
		this.binaryTree = binaryTree;
	}
	
	
	public int retardoReenvio() {
		return this.recorridoEnProfundidad(this.binaryTree);
	}
	
	private int recorridoEnProfundidad(BinaryTree<Integer> binaryTree) {
		int subIzq = 0;
		int subDer = 0;
		
		if (binaryTree.isLeaf()) 
			return binaryTree.getData();
		
		else {
			if (binaryTree.hasLeftChild())
				subIzq+= recorridoEnProfundidad(binaryTree.getLeftChild());
			if (binaryTree.hasLeftChild())
				subDer+= recorridoEnProfundidad(binaryTree.getRightChild());
			
			return (Math.max(subIzq, subDer) + binaryTree.getData());
		}
	}
	
}
