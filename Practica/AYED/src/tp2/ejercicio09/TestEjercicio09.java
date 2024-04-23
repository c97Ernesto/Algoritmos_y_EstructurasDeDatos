package tp2.ejercicio09;

import tp2.ejercicio01.BinaryTree;

public class TestEjercicio09 {

	public static void main(String[] args) {
		BinaryTree<Integer> veinte = new BinaryTree<Integer>(20);
		BinaryTree<Integer> cinco = new BinaryTree<Integer>(5);
		BinaryTree<Integer> treinta = new BinaryTree<Integer>(30);
		BinaryTree<Integer> cincoNeg = new BinaryTree<Integer>(-5);
		BinaryTree<Integer> diez = new BinaryTree<Integer>(10);
		BinaryTree<Integer> cincuenta = new BinaryTree<Integer>(50);
		BinaryTree<Integer> nuevoNeg = new BinaryTree<Integer>(-9);
		BinaryTree<Integer> uno = new BinaryTree<Integer>(1);
		BinaryTree<Integer> cuatro = new BinaryTree<Integer>(4);
		BinaryTree<Integer> seis = new BinaryTree<Integer>(6);
		

		veinte.addLeftChild(cinco);
		veinte.addRightChild(treinta);

		cinco.addLeftChild(cincoNeg);
		cinco.addRightChild(diez);
		treinta.addLeftChild(cincuenta);
		treinta.addRightChild(nuevoNeg);

		diez.addLeftChild(uno);
		cincuenta.addRightChild(cuatro);
		
		cuatro.addRightChild(seis);
		
		Ejercicio09 ej9 = new Ejercicio09();

		BinaryTree<Dato> abDatos = ej9.sumAndDiff2(veinte);
		
		ej9.recorrerArbol(abDatos);
		
	}
}
