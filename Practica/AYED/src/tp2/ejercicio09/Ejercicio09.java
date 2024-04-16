package tp2.ejercicio09;

import tp2.ejercicio01.BinaryTree;

public class Ejercicio09 {

	public BinaryTree<Dato> sumAndDiff(BinaryTree<Integer> arbol) {
		BinaryTree<Dato> nuevoArbol = new BinaryTree<Dato>();

		if (!arbol.isEmpty()) {
			recorrerArbol(arbol, nuevoArbol, 0);
			return nuevoArbol;
		} else
			System.out.println("No hay datos");
			return null;
	}

	private void recorrerArbol(BinaryTree<Integer> arbol, BinaryTree<Dato> nuevoArbol, int n) {
		Dato datos = new Dato();
		datos.setSuma(arbol.getData() + n);
		datos.setDiferencia(arbol.getData() - n);

		nuevoArbol.setData(datos);

		BinaryTree<Dato> nodo;
		if (arbol.hasLeftChild()) {
			nodo = new BinaryTree<Dato>();
			recorrerArbol(arbol.getLeftChild(), nodo, arbol.getData() + n);
			nuevoArbol.addLeftChild(nodo);
		}
		if (arbol.hasRightChild()) {
			nodo = new BinaryTree<Dato>();
			recorrerArbol(arbol.getRightChild(), nodo, arbol.getData() + n);
			nuevoArbol.addRightChild(nodo);
		}

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
