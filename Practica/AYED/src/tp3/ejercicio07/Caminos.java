package tp3.ejercicio07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tp3.ejercicio01.GeneralTree;

public class Caminos {

	GeneralTree<Integer> agInt;
	
	public Caminos(GeneralTree<Integer> arbolDeEnteros) {
		agInt = arbolDeEnteros;
	}
	
	public List<Integer> caminoAHojaMasLejana(){
		List<Integer> caminoActual = new ArrayList<Integer>();
		List<Integer> caminoMax = new ArrayList<Integer>();
		
		recorrido(agInt, caminoActual, caminoMax);
		
		return caminoMax;
	}
	
	private void recorrido(GeneralTree<Integer> ag, List<Integer> caminoAct, List<Integer> caminoMax) {
		caminoAct.add(ag.getData());
		
		if (ag.isLeaf()) {
			if (caminoMax.size() < caminoAct.size()) {
				caminoMax.addAll(0, caminoMax);
				actualizarListaMax(caminoAct, caminoMax);
			}
		} 
		else {			
			List<GeneralTree<Integer>> hijos = ag.getChildren();
			for (GeneralTree<Integer> hijo : hijos) {
				recorrido(hijo, caminoAct, caminoMax);
			}
		}
		caminoAct.removeLast();
	}
	
	
	private void actualizarListaMax(List<Integer> caminoAct, List<Integer> caminoMax) {
		Iterator<Integer> i = caminoAct.iterator();
		while (i.hasNext()) {
			caminoMax.add(i.next());
		}
		caminoAct.removeAll(caminoAct);
	}

//	probar con una lista invertida donde agregue los nodos de atrás hacia adelante
	public List<Integer> recorrido2(GeneralTree<Integer> ag){
		List<Integer> listaAct = new ArrayList<Integer>();
		
		if (ag.isEmpty())		//retorno lista vacía
			return listaAct;
		
		if (ag.isLeaf()) {		//retorna la lista con la hoja
			listaAct.add(ag.getData());
			return listaAct;
		}
		
		List<GeneralTree<Integer>> hijos = ag.getChildren();
		for (GeneralTree<Integer> hijo : hijos) {
			//lista de hijos donde calculo cual tiene más
			List<Integer> listaHijos = recorrido2(hijo);
			
			
			if (listaHijos.size() > listaAct.size())
				listaAct = recorrido2(hijo);
		}
		
		//agrego el padre a la lista de hijos que más tenía
		listaAct.add(ag.getData());	
		
		return listaAct;
	}
	
	
}
