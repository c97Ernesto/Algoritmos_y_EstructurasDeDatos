package tp2.ejercicio06;

import tp2.ejercicio01.BinaryTree;

public class Transformacion {

	private BinaryTree<Integer> abInteger;

	public Transformacion(BinaryTree<Integer> binaryTree) {
		this.abInteger = binaryTree;
	}

	public BinaryTree<Integer> suma() {
		suma(this.abInteger);
		return this.abInteger;

	}

	private int suma(BinaryTree<Integer> ab) {
		
		if (ab == null || ab.isEmpty())
			return 0;

		int n = ab.getData();
//		if (ab.getData() == null)
//			n = 0;
//		else
//			n = ab.getData();
		int hi = this.suma(ab.getLeftChild());
		int hd = this.suma(ab.getRightChild());
		ab.setData(hi + hd);
		return n + hi + hd;

	}
}
