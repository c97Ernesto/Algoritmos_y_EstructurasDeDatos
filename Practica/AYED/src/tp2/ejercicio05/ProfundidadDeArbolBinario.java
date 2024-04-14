package tp2.ejercicio05;

import tp2.ejercicio01.BinaryTree;

public class ProfundidadDeArbolBinario {

	private BinaryTree<Integer> abInteger;

	public ProfundidadDeArbolBinario(BinaryTree<Integer> abInteger) {
		this.abInteger = abInteger;
	}

	public int sumaElementosProfundidad(int profundidad) {
		if (profundidad >= 0 && !this.abInteger.isEmpty()) {
			return sumaElementosProfundidad(abInteger, profundidad);
		} else
			return -1;
	}

	private int sumaElementosProfundidad(BinaryTree<Integer> ab, int p) {
		int suma = 0;
		
		if (p >= 0) {
			if (p == 0 && !(ab.getData() == null))
				suma+= ab.getData();
			else {
				p-= 1;
				
				if (ab.hasLeftChild()) 
					suma+= sumaElementosProfundidad(ab.getLeftChild(), p);
				
				if (ab.hasRightChild()) 
					suma+= sumaElementosProfundidad(ab.getRightChild(), p);
			}
		}
		return suma;
	}
	
	
	public int sumaElementosProfundidad2(int profundidad){
		return sumaElementosProfundidad2(this.abInteger, profundidad);
	}
		
	private int sumaElementosProfundidad2(BinaryTree<Integer> arbol, int prof){
		
		if ((arbol == null) || (arbol.isEmpty()))
			return 0;
			
		if (prof == 0)
			return arbol.getData();
		
		int nuevaprof = prof - 1;
		return	sumaElementosProfundidad2(arbol.getLeftChild(), nuevaprof) + sumaElementosProfundidad2(arbol.getRightChild(), nuevaprof);
	}
}
	
	

