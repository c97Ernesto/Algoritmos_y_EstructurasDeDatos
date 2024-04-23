package tp2.ejercicio09;

import tp2.ejercicio01.BinaryTree;

public class Ejercicio09 {

	public BinaryTree<Dato> sumAndDiff2(BinaryTree<Integer> arbol) {
		BinaryTree<Dato> nuevoArbol;

		if (!arbol.isEmpty()) {
			nuevoArbol = recorrerArbol(arbol, 0, 0);
		} else {
			nuevoArbol = new BinaryTree<Dato>();
		}
		return nuevoArbol;
	}
	
		
	private BinaryTree<Dato> recorrerArbol(BinaryTree<Integer> arbol, int anterior, int suma) {
		Dato datos = new Dato();
		
		datos.setSuma(arbol.getData() + suma);
		datos.setDiferencia(arbol.getData() - anterior);

		BinaryTree<Dato> resultado = new BinaryTree<>(datos);
		if (arbol.hasLeftChild()) {
			BinaryTree<Dato> hi = recorrerArbol(arbol.getRightChild(), arbol.getData(), datos.getSuma());
			resultado.addLeftChild(hi);
		}
		if (arbol.hasRightChild()) {
			BinaryTree<Dato> hd = recorrerArbol(arbol.getRightChild(), arbol.getData(), datos.getSuma());
			resultado.addRightChild(hd);
		}
		
		return resultado;
	}

	public void recorrerArbol(BinaryTree<Dato> ab) {
		System.out.println(ab.getData().getSuma() + "/" + ab.getData().getDiferencia());

		if (ab.hasLeftChild()) {
			recorrerArbol(ab.getLeftChild());
		}

		if (ab.hasRightChild()) {
			recorrerArbol(ab.getRightChild());
		}

	}

}
