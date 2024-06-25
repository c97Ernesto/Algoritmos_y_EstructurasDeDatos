package tp5.ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tp5.ejercicio1.Edge;
import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.adjList.AdjListGraph;

public class Mapa<T> {

	Graph<T> mapaCiudades = new AdjListGraph<T>();
	
	public Mapa(Graph<T> mapaGraph){
		this.mapaCiudades = mapaGraph;
	}
	
//	devolverCamino (String ciudad1, String ciudad2): List<String>
//	Retorna la lista de ciudades que se deben atravesar para ir de ciudad1 a ciudad2 en caso de que se
//	pueda llegar, si no retorna la lista vacía. (Sin tener en cuenta el combustible).
	public List<String> devolverCamino(String ciudad1, String ciudad2){
		boolean[] marca = new boolean[this.mapaCiudades.getSize()];
		
		List<String> camino = new ArrayList<String>();
		
		int i = 0;
		while (i < this.mapaCiudades.getSize()) { 
			if (this.mapaCiudades.getVertex(i).getData().toString().equals(ciudad1)) {
				System.out.println("Arranca en: " + i);
				devolverCamino(i, ciudad2, camino, this.mapaCiudades, marca);
			}
			i++;
		}
		return camino;
	}

	private void devolverCamino(int pos, String ciudadDestino, List<String> camino,  Graph<T> grafo, boolean[] marca) {
		marca[pos] = true;
		
		Vertex<T> vertice = grafo.getVertex(pos);
		
		List<Edge<T>> aristas = grafo.getEdges(vertice);  
		Iterator<Edge<T>> i = aristas.iterator();
		
		while (i.hasNext() && camino.size() == 0) {	
			int posVerticeDestino = i.next().getTarget().getPosition();
			
			if (!marca[posVerticeDestino]) {
				
				devolverCamino(posVerticeDestino, ciudadDestino, camino, grafo, marca);
			}
		}
		
		if ((vertice.getData().toString().equals(ciudadDestino)) || camino.size() != 0) {
			camino.addFirst(vertice.getData().toString());
		}
	}
	
	
//	devolverCaminoExceptuando (String ciudad1, String ciudad2, List<String> ciudades): List<String>
//	Retorna la lista de ciudades que forman un camino desde ciudad1 a ciudad2, sin pasar por las ciudades
//	que están contenidas en la lista ciudades pasada por parámetro, si no existe camino retorna la lista
//	vacía. (Sin tener en cuenta el combustible).
	public List<String> devolverCaminoExceptuando(String ciudad1, String ciudad2, List<String> ciudades) {
		boolean[] marca = new boolean[this.mapaCiudades.getSize()];
		List<String> camino = new ArrayList<String>();
		
		int posVertice = 0;
		while (posVertice < marca.length && !this.mapaCiudades.getVertex(posVertice).getData().toString().equals(ciudad1)) {
			posVertice++;
		}
		if (this.mapaCiudades.getVertex(posVertice).getData().toString().equals(ciudad1)) {
			devolverCaminoExceptuando(posVertice, ciudad2, ciudades, marca, camino, mapaCiudades);
		}
		
		return camino;	
	}

	private void devolverCaminoExceptuando(int pos, String ciudadDestino, List<String> ciudades, 
			boolean[] marca, List<String> camino, Graph<T> mapa) {
		marca[pos] = true;
		Vertex<T> vertice = mapa.getVertex(pos);
		
		if(!ciudades.contains(vertice.getData().toString())) {
			
			List<Edge<T>> aristas = mapa.getEdges(vertice);
			Iterator<Edge<T>> i = aristas.iterator();
			
			while (i.hasNext() && camino.size() == 0) {
				int posVerticeDestino = i.next().getTarget().getPosition();
				
				if (!marca[posVerticeDestino]) {
					devolverCaminoExceptuando(posVerticeDestino, ciudadDestino, ciudades, marca, camino, mapa);
				}
			}
			
			if (vertice.getData().toString().equals(ciudadDestino) || camino.size() != 0) {
				camino.addFirst(vertice.getData().toString());
			}
		}
	}
	
	
//	3. caminoMasCorto(String ciudad1, String ciudad2): List<String>
//	Retorna la lista de ciudades que forman el camino más corto para llegar de ciudad1 a ciudad2, si no
//	existe camino retorna la lista vacía. (Las rutas poseen la distancia).
	
	public List<String> caminoMasCorto(String ciudad1, String ciudad2){
		boolean[] marca = new boolean[this.mapaCiudades.getSize()];
		List<String> caminoAct = new ArrayList<String>();
		List<String> caminoMin = new ArrayList<String>();
		
		int posVertice = 0;
		while (posVertice < marca.length && !this.mapaCiudades.getVertex(posVertice).getData().toString().equals(ciudad1)) {
			posVertice++;
		}
		if (this.mapaCiudades.getVertex(posVertice).getData().toString().equals(ciudad1)) {
			caminoMasCorto(posVertice, marca, ciudad2, caminoAct, caminoMin, this.mapaCiudades, 0, Integer.MAX_VALUE);
		}
		return caminoMin;
	}

	private int caminoMasCorto(int posVertice, boolean[] marca, String destino, List<String> caminoAct,
			List<String> caminoMin, Graph<T> mapa, int distancia, int distanciaMin) {
		
		marca[posVertice] = true;
		Vertex<T> vertice = mapa.getVertex(posVertice);
//		System.out.println("distancia = " + distancia);
		caminoAct.add(vertice.getData().toString());
		
		if (vertice.getData().toString().equals(destino)) {
			if (distancia < distanciaMin) {
				distanciaMin = distancia;
//				System.out.println("distanciaMin = " + distanciaMin);
				copiarLista(caminoAct, caminoMin);
			}		
		}
		else {			
			List<Edge<T>> aristas = mapa.getEdges(vertice);
			Iterator<Edge<T>> i = aristas.iterator();
			
			while (i.hasNext()) {
				Edge<T> arista = i.next();
				int posVerticeDestino = arista.getTarget().getPosition();
				
				if (!marca[posVerticeDestino]) {
					
					distanciaMin = Math.max(distanciaMin, caminoMasCorto(posVerticeDestino, marca, destino, caminoAct, 
							caminoMin, mapa, distancia + arista.getWeight(), distanciaMin));
				}
			}
		}
		caminoAct.removeLast();
		
		marca[posVertice] = false;
		
		return distanciaMin;
	}
	
	private void copiarLista(List<String> caminoAct, List<String> caminoMin) {
		caminoMin.removeAll(caminoMin);
		
		Iterator<String> i = caminoAct.iterator();
		while(i.hasNext()) {
			caminoMin.add(i.next());
		}
	}
	
	
//	caminoSinCargarCombustible(String ciudad1, String ciudad2, int tanqueAuto): List<String>
//	Retorna la lista de ciudades que forman un camino para llegar de ciudad1 a ciudad2. El auto no debe
//	quedarse sin combustible y no puede cargar. Si no existe camino retorna la lista vacía.
	
	public List<String> caminoSinCargarCombustible(String ciudad1, String ciudad2, int tanqueAuto){
		boolean[] marca = new boolean[this.mapaCiudades.getSize()];
		List<String> caminoAct = new ArrayList<String>();
		
		int pos = 0;
		while (pos < this.mapaCiudades.getSize() && !this.mapaCiudades.getVertex(pos).getData().toString().equals(ciudad1)) {	
			pos++;
		}
		if (this.mapaCiudades.getVertex(pos).getData().toString().equals(ciudad1)) {
			caminoSinCargarCombustible(pos, marca, ciudad2, tanqueAuto, caminoAct, this.mapaCiudades);
		}
		return caminoAct;
	}

	private void caminoSinCargarCombustible(int pos, boolean[] marca, String destino, int tanqueAuto,
			List<String> caminoAct, Graph<T> grafo) {
		
		marca[pos] = true;
		Vertex<T> vertice = grafo.getVertex(pos);
		
		List<Edge<T>> aristas = grafo.getEdges(vertice);
		Iterator<Edge<T>> i = aristas.iterator();
		
//		System.out.println("dato: " + vertice.getData().toString());
		
		while (i.hasNext() && caminoAct.size() == 0) {
			Edge<T> arista = i.next();

//			System.out.println("peso: " + (tanqueAuto - arista.getWeight()));
			
			if (tanqueAuto - arista.getWeight() > 0) {	
				int posVerticeDestino = arista.getTarget().getPosition();
				
				if (!marca[posVerticeDestino]) {
					caminoSinCargarCombustible(posVerticeDestino, marca, destino, tanqueAuto - arista.getWeight(), caminoAct, grafo);
				}
			}	
		}
		
		marca[pos] = false;
		
		if ((vertice.getData().toString().equals(destino) && tanqueAuto > 0) || caminoAct.size() != 0) {
			caminoAct.addFirst(vertice.getData().toString());
		}
		
	}
	
	
	
//	caminoConMenorCargaDeCombustible (String ciudad1, String ciudad2, int tanqueAuto): List<String>
//	Retorna la lista de ciudades que forman un camino para llegar de ciudad1 a ciudad2 teniendo en cuenta
//	que el auto debe cargar la menor cantidad de veces. El auto no se debe quedar sin combustible en
//	medio de una ruta, además puede completar su tanque al llegar a cualquier ciudad. Si no existe camino
//	retorna la lista vacía.
	
	
	
}
