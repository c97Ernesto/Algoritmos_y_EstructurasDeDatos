package tp2.ejercicio08;

import tp2.ejercicio01.BinaryTree;

public class Ejercicio08 {

	public static boolean esPrefijo(BinaryTree<Integer> ab1, BinaryTree<Integer> ab2) {
		
		if (ab1.isEmpty() || ab2.isEmpty()) {
			return false;
		}
		else 
			return esPrefijox(ab1, ab2);
	}
	
	private static boolean esPrefijox(BinaryTree<Integer> ab1, BinaryTree<Integer> ab2) {
		boolean esPrefijo = true;
			
		if ((ab1.getData() == ab2.getData())) {
			if (ab1.hasLeftChild()) {
				if (ab2.hasLeftChild()) 
					esPrefijo = esPrefijox(ab1.getLeftChild(), ab2.getLeftChild());
				else
					esPrefijo = false;
			}
			if (ab1.hasRightChild()) {
				if (ab2.hasRightChild()) 
					esPrefijo = esPrefijox(ab1.getRightChild(), ab2.getRightChild());
				else
					esPrefijo = false;
			}
		}
		else
			esPrefijo = false;
		
		return esPrefijo;		
	}
	
}
