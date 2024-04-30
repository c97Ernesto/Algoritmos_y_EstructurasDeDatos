package tp3.ejercicio04;

import java.util.Iterator;
import tp1.ejercicio08.Queue;
import tp3.ejercicio01.GeneralTree;

public class AnalizadorArbol {
	
	public double devolverMaximoPromedio(GeneralTree<AreaEmpresa> arbol) {
		if (arbol.isEmpty()) {
			return -1;
		}
		else
			return devolverPromedio(arbol);
	}
	
	private double devolverPromedio(GeneralTree<AreaEmpresa> arbol) {
		GeneralTree<AreaEmpresa> nodoAux;
		Queue<GeneralTree<AreaEmpresa>> queue = new Queue<>();
		
		queue.enqueue(arbol);
		queue.enqueue(null);
		
		int maxPromedio = -1;
		int sumaPorNivel = 0;
		int nodosPorNivel = 0;
		
		while (! queue.isEmpty()) {
			nodoAux = queue.dequeue();
			
			if (nodoAux != null) {
				sumaPorNivel+= nodoAux.getData().getTardanza();
				nodosPorNivel+= 1;
				
				if (nodoAux.hasChildren()) {
					Iterator<GeneralTree<AreaEmpresa>> i = nodoAux.getChildren().iterator();
					while(i.hasNext())
						queue.enqueue(i.next());
				}		
			}
			else
				if (! queue.isEmpty() || nodosPorNivel != 0) {
					queue.enqueue(null);
					maxPromedio = Math.max(sumaPorNivel/nodosPorNivel, maxPromedio);
					sumaPorNivel = 0;
					nodosPorNivel = 0;
				}
		}
		
		return maxPromedio;
		
	}
	
}
