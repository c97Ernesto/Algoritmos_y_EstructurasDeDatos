package tp5.ejercicio6;

import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.adjList.AdjListGraph;

public class Ejercicio6 {
	
	
	public static <T> void main(String[] args) {
		
		Graph<String> grafo = new AdjListGraph<String>();
		
		Vertex<String> casaCaperucita = grafo.createVertex("Casa Caperucita");
		Vertex<String> claro3 = grafo.createVertex("Claro 3");
		Vertex<String> claro1 = grafo.createVertex("Claro 1");
		Vertex<String> claro2 = grafo.createVertex("Claro 2");
		Vertex<String> claro5 = grafo.createVertex("Claro 5");
		Vertex<String> claro4 = grafo.createVertex("Claro 4");
		Vertex<String> casaAbuelita = grafo.createVertex("Casa Abuelita");
		
		grafo.connect(casaCaperucita, claro3, 4);
		grafo.connect(casaCaperucita, claro1, 3);
		grafo.connect(casaCaperucita, claro2, 4);
		
		grafo.connect(claro3, claro5, 15);
		
		grafo.connect(claro1, claro5, 3);
		
		grafo.connect(claro2, claro1, 4);
		grafo.connect(claro2, claro5, 11);
		grafo.connect(claro2, claro4, 10);
		
		grafo.connect(claro5, casaAbuelita, 4);
		
		grafo.connect(claro4, casaAbuelita, 9);
		
		
		BuscadorDeCaminos<T> buscadorDeCaminos = new BuscadorDeCaminos(grafo);
		
		System.out.println(buscadorDeCaminos.recorridosMasSeguro());

	}

}
