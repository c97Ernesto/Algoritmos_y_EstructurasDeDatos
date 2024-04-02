package tp2.ejercicio03;

import java.util.List;

import tp2.ejercicio01.BinaryTree;

public class ContadorArbol {

	private BinaryTree<Integer> abbEnteros;
	
	public ContadorArbol(BinaryTree<Integer> abbEnteros) {
		this.abbEnteros = abbEnteros;
	}
	
	
	public List<Integer> numerosPares(){
		Integer num = this.abbEnteros.getData();
		List<Integer> listaEnteros;
		
		if (this.abbEnteros.isLeaf()) {
			if (num % 2 == 0)
				listaEnteros.add(num);
		} 
		else {
			if (this.abbEnteros.hasLeftChild())
				
		}
			 
		
		return ;
	}
	
}
