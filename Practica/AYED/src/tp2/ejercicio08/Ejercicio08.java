package tp2.ejercicio08;

import tp2.ejercicio01.BinaryTree;

public class Ejercicio08 {

	public boolean esPrefijo(BinaryTree<Integer> ab1, BinaryTree<Integer> ab2) {
		
		if (ab1.isEmpty() || ab2.isEmpty()) {
			return false;
		}
		else
			return recorrerHastaNivel2(ab1, ab2, 0);
			
	}

	private boolean recorrerHastaNivel2(BinaryTree<Integer> ab1, BinaryTree<Integer> ab2, int nivel) {
		boolean ok = true;
		
		//si estoy en los niveles 0 o 1
		if ((nivel < 2) && (!ab1.isEmpty() && !ab2.isEmpty())) { 
			
			if ((ab1.getData() == ab2.getData())) {
				
				if ((nivel < 1)) {	//si el nivel es 0 me fijo si el nodo tiene los dos hijos
					nivel++;
					if ((ab1.hasLeftChild() && ab2.hasLeftChild()) && ab1.hasRightChild() && ab2.hasRightChild()) {
						ok = (recorrerHastaNivel2(ab1.getLeftChild(), ab2.getLeftChild(), nivel) 
								&& recorrerHastaNivel2(ab1.getRightChild(), ab2.getRightChild(), nivel)) ;
					}
					else	// distinta estructura
						ok = false;
				}
				else {
					// el nivel era 1
					nivel++;
					if (ab1.hasRightChild() && ab2.hasRightChild())
						ok = recorrerHastaNivel2(ab1.getRightChild(), ab2.getRightChild(), nivel);
					else	//distinta estructura
						ok = false;
				}
			}
			else	// no tienen el mismo dato
				ok = false;
		}
		else
			if (nivel == 2)
				ok = (ab1.getData() == ab2.getData());
			else
				ok = false;
		return ok;
	}
	
}
