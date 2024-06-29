package tp5.ejercicio6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tp5.ejercicio1.Edge;
import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.adjList.AdjListGraph;

public class BuscadorDeCaminos<T> {

	Graph<T> bosque = new AdjListGraph<T>();

	public BuscadorDeCaminos(Graph<T> mapaCaperucita) {
		this.bosque = mapaCaperucita;
	}

	public List<List<String>> recorridosMasSeguro(){
		List<List<String>> listaDeListas = new ArrayList<List<String>>();
		List<String> lista = new ArrayList<String>();
		
		int pos = 0;
		while (pos < this.bosque.getSize() && !this.bosque.getVertex(pos).getData().toString().equals("Casa Caperucita")) {
			pos++;
		}
		
		if (this.bosque.getVertex(pos).getData().toString().equals("Casa Caperucita")) {
			recorridoMasSeguro(pos, new boolean[this.bosque.getSize()], bosque, lista, listaDeListas, 0);
		}
		
		return listaDeListas;
	}

	private void recorridoMasSeguro(int pos, boolean[] marca, Graph<T> grafo, List<String> l, List<List<String>> ll,
			int cantFrutas) {
		marca[pos] = true;
		Vertex<T> vertice = grafo.getVertex(pos);

		l.add(vertice.getData().toString());
		
		System.out.println(cantFrutas);

		if (cantFrutas <= 15) {
			
			if (vertice.getData().toString().equals("Casa Abuelita")) {
				System.out.println(l);
				ll.add(new ArrayList<String>(l));	
			} 
			else {
				List<Edge<T>> aristas = grafo.getEdges(vertice);
				Iterator<Edge<T>> i = aristas.iterator();
				while (i.hasNext()) {
					Edge<T> arista = i.next();
					int posVerticeDestino = arista.getTarget().getPosition();

					if (!marca[posVerticeDestino]) {
						recorridoMasSeguro(posVerticeDestino, marca, grafo, l, ll, cantFrutas + arista.getWeight());
					}
				}
			}
		}
		l.remove(l.size() - 1);
		marca[pos] = false;
	}

}
