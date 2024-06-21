package tp5.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tp1.ejercicio08.Queue;
import tp5.ejercicio1.Edge;
import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;

public class Recorridos {

	/* dfs(Graph<T> grafo): List<T>: Retorna una lista con los datos de los vértices, 
	 * con el recorrido en profundidad del grafo recibido como parámetro.*/
	public <T> List<T> dfs(Graph<T> grafo){
		boolean[] marca = new boolean[grafo.getSize()];
		
		List<T> listaDeDatos = new ArrayList<T>();
		
		for (int i = 0; i < grafo.getSize(); i++) {
			if (!marca[i]) {
				dfs(i, grafo, marca, listaDeDatos);
			}
		}
		return listaDeDatos;
	}

	private <T> void dfs(int posVertice, Graph<T> grafo, boolean[] marca, List<T> lista) {
		marca[posVertice] = true;
		Vertex<T> vertice = grafo.getVertex(posVertice);
		lista.add(vertice.getData());
		
		List<Edge<T>> aristas = grafo.getEdges(vertice);
		
		Iterator<Edge<T>> i = aristas.iterator();
		
		while (i.hasNext()) {
			int posVerticeDestino = i.next().getTarget().getPosition();
			
			if (!marca[posVerticeDestino]) {
				dfs(posVerticeDestino, grafo, marca, lista);
			}
		}
	}

	
	// bfs(Graph<T> grafo): List<T>: retorna una lista con los datos de vértices, con el recorrido en amplitud del grafo recibido como parámetro.
	public <T> List<T> bfs(Graph<T> grafo){
		boolean[] marca = new boolean[grafo.getSize()];
		
		List<T> listaDeDatos = new ArrayList<T>();
		
		for (int i = 0; i < grafo.getSize(); i++) {
			if (!marca[i]) {
				bfs(i, grafo, marca, listaDeDatos);
			}
		}
		return listaDeDatos;
	}

	private <T> void bfs(int pos, Graph<T> grafo, boolean[] marca, List<T> listaDeDatos) {
		Queue<Vertex<T>> cola = new Queue<Vertex<T>>();
		cola.enqueue(grafo.getVertex(pos));
		marca[pos] = true;
		
		while(!cola.isEmpty()) {
			Vertex<T> vertice = cola.dequeue();
			listaDeDatos.add(vertice.getData());
			
			List<Edge<T>> aristas = grafo.getEdges(vertice);
			
			for (Edge<T> arista: aristas) {
				int posVerticeDestino = arista.getTarget().getPosition();
				
				if (!marca[posVerticeDestino]) {
					marca[posVerticeDestino] = true;
					Vertex<T> verticeDestino = arista.getTarget();
					cola.enqueue(verticeDestino);
				}
			}
		}	
	}
	
}
