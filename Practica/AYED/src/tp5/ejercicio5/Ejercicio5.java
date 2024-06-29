package tp5.ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tp5.ejercicio1.Edge;
import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;

public class Ejercicio5 {

	public List<Persona> bfs(Graph<Persona> grafo, Persona empleado, int distancia) {
		
		Vertex<Persona> verticeOrigen = grafo.search(empleado);
		
		if (verticeOrigen != null){
			return bfs(grafo, verticeOrigen, distancia);
		}
		return new ArrayList<Persona>();
	}

	private List<Persona> bfs(Graph<Persona> grafo, Vertex<Persona> verticeInicio, int distancia) {
		List<Persona> jubilados = new ArrayList<Persona>();
		tp1.ejercicio08.Queue<Vertex<Persona>> queue = new tp1.ejercicio08.Queue<Vertex<Persona>>();
		
		boolean[] marca = new boolean[grafo.getSize()];		
		marca[verticeInicio.getPosition()] = true;
		
		queue.enqueue(verticeInicio);
		queue.enqueue(null);
		
		while (!queue.isEmpty() && distancia > 0) {
			Vertex<Persona> verticeAux = queue.dequeue();
			
			if (verticeAux != null) {
				System.out.println(verticeAux.getData().toString());
				
				if (!verticeAux.getData().recibioJubilacion()) {
					jubilados.add(verticeAux.getData());
				}
				
				List<Edge<Persona>> aristas = grafo.getEdges(verticeAux);
				Iterator<Edge<Persona>> i = aristas.iterator();
				
				while (i.hasNext()) {
					Vertex<Persona> verticeDestino = i.next().getTarget(); 
					
					if (!marca[verticeDestino.getPosition()]) {
						marca[verticeDestino.getPosition()] = true;
						queue.enqueue(verticeDestino);
					}
				}
			} else if (!queue.isEmpty()){
				distancia-= 1;
				queue.enqueue(null);
			}
			
			
		}
		
		return jubilados;
	}
	
}
