package tp2.ejercicio08;

import tp2.ejercicio01.BinaryTree;

public class TestEjercicio08 {
	public static void main(String[] args) {
		
		BinaryTree<Integer> dos = new BinaryTree<Integer>(2);
		BinaryTree<Integer> siete = new BinaryTree<Integer>(7);
		BinaryTree<Integer> cincoNeg = new BinaryTree<Integer>(-5);
		BinaryTree<Integer> veintiTres = new BinaryTree<Integer>(23);
		BinaryTree<Integer> seis = new BinaryTree<Integer>(6);
		BinaryTree<Integer> dieciNueve = new BinaryTree<Integer>(19);
		BinaryTree<Integer> tresNeg = new BinaryTree<Integer>(-3);
		BinaryTree<Integer> cincuentaYcinco = new BinaryTree<Integer>(55);
		BinaryTree<Integer> once = new BinaryTree<Integer>(11);
		BinaryTree<Integer> cuatro = new BinaryTree<Integer>(4);
		BinaryTree<Integer> dieciOcho = new BinaryTree<Integer>(18);
		
		dos.addLeftChild(siete);
		dos.addRightChild(cincoNeg);
		
		siete.addLeftChild(veintiTres);
		siete.addRightChild(seis);
		cincoNeg.addRightChild(dieciNueve);
		
		veintiTres.addLeftChild(tresNeg);
		seis.addLeftChild(cincuentaYcinco);
		seis.addRightChild(once);
		dieciNueve.addRightChild(cuatro);
		cincoNeg.addLeftChild(dieciOcho);
		dieciOcho.addRightChild(tresNeg);
		
//			 2
//		7		 -5
//	 23   6    18   19  
//-3	55 11	-3    4
//				    
		
		
		BinaryTree<Integer> dos1 = new BinaryTree<Integer>(2);
		BinaryTree<Integer> siete1 = new BinaryTree<Integer>(7);
		BinaryTree<Integer> cincoNeg1 = new BinaryTree<Integer>(-5);
		BinaryTree<Integer> veintiTres1 = new BinaryTree<Integer>(23);
		BinaryTree<Integer> seis1 = new BinaryTree<Integer>(6);
		BinaryTree<Integer> dieciNueve1 = new BinaryTree<Integer>(19);
		BinaryTree<Integer> tresNeg1 = new BinaryTree<Integer>(-3);
		BinaryTree<Integer> cincuentaYcinco1 = new BinaryTree<Integer>(55);
		BinaryTree<Integer> once1 = new BinaryTree<Integer>(11);
		BinaryTree<Integer> cuatro1 = new BinaryTree<Integer>(4);
		BinaryTree<Integer> dieciOcho1 = new BinaryTree<Integer>(18);
		
		dos1.addLeftChild(siete1);
		dos1.addRightChild(cincoNeg1);
		
		siete1.addLeftChild(veintiTres1);
		siete1.addRightChild(seis1);
		cincoNeg1.addRightChild(dieciNueve1);
		
		veintiTres1.addLeftChild(tresNeg1);
		seis1.addLeftChild(cincuentaYcinco1);
		seis1.addRightChild(once1);
		dieciNueve1.addRightChild(cuatro1);
		cincoNeg1.addLeftChild(dieciOcho1);
		dieciOcho1.addRightChild(tresNeg1);
		
		
//		 				2
//	   		7		 				-5
//  	23     	   6     		18   	 19  
//   -3         55   11	          -3	    4
//  			 	
	
		System.out.println(Ejercicio08.esPrefijo(dos, dos1));
			
			
	}
}
