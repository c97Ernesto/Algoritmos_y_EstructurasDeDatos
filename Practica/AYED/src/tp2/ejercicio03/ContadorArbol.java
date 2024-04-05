package tp2.ejercicio03;

import java.util.ArrayList;
import java.util.List;

import tp2.ejercicio01.BinaryTree;

public class ContadorArbol {

	private BinaryTree<Integer> abbEnteros;
	
	public ContadorArbol(BinaryTree<Integer> abbEnteros) {
		this.abbEnteros = abbEnteros;
	}
	
	public List<Integer> numerosParesInorden(){
		List<Integer> listaEnteros = new ArrayList<Integer>();
		
		if (!this.abbEnteros.isEmpty()) {
			this.numerosParesInorden(listaEnteros, this.abbEnteros);
		}
		
		return listaEnteros;
	}
	
	private void numerosParesInorden(List<Integer> listaEnteros, BinaryTree<Integer> abb){
		Integer num = abb.getData();
		
		
		if (abb.hasLeftChild())
			this.numerosParesInorden(listaEnteros, abb.getLeftChild());
		
		if (num % 2 == 1)
			listaEnteros.add(num);
		
		if (abb.hasRightChild())
			this.numerosParesInorden(listaEnteros, abb.getRightChild());
		
	}
	
	
	public List<Integer> numerosParesPostOrden(){
		List<Integer> listaEnteros = new ArrayList<Integer>();
		
		if (!this.abbEnteros.isEmpty()) {
			this.numerosParesPostOrden(listaEnteros, this.abbEnteros);
		}
		
		return listaEnteros;
	}
	
	private void numerosParesPostOrden(List<Integer> listaEnteros, BinaryTree<Integer> abb){
		Integer num = abb.getData();
		
		
		if (abb.hasLeftChild())
			this.numerosParesPostOrden(listaEnteros, abb.getLeftChild());
		
		if (abb.hasRightChild())
			this.numerosParesPostOrden(listaEnteros, abb.getRightChild());
		
		if (num % 2 == 1)
			listaEnteros.add(num);
	}
	
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
		
		ContadorArbol contador = new ContadorArbol(abb);
		
		List<Integer> lista = new ArrayList<Integer>();
		
		//lista = contador.numerosParesInorden();
		lista = contador.numerosParesPostOrden();
		
		System.out.println(lista);
		
	}
	
	
}
