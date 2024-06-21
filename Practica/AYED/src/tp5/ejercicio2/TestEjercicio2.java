package tp5.ejercicio2;

import java.util.List;

import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.adjList.AdjListGraph;

public class TestEjercicio2 {

	public static void main(String[] args) {
		Graph<String> letras = new AdjListGraph<String>();
		
		Vertex<String> a = letras.createVertex("a");
		Vertex<String> b = letras.createVertex("b");
		Vertex<String> c = letras.createVertex("c");
		Vertex<String> d = letras.createVertex("d");
		Vertex<String> e = letras.createVertex("e");
		
		letras.connect(a, b);
		letras.connect(a, e);
		
		letras.connect(b, c);
		letras.connect(b, d);
		
		letras.connect(d, a);
		
		letras.connect(e, c);
		
		Recorridos recorridoDfs = new Recorridos();
		List<String> listadoDfs= recorridoDfs.dfs(letras);
		System.out.println(listadoDfs);
		
		Recorridos recorridoBfs = new Recorridos();
		List<String> listadoBfs = recorridoBfs.bfs(letras);
		System.out.println(listadoBfs);
		
	
	}
	
}
