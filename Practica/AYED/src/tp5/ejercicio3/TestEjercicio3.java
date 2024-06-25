package tp5.ejercicio3;

import java.util.ArrayList;
import java.util.List;

import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.adjList.AdjListGraph;

public class TestEjercicio3 {

	public static <T> void main(String[] args) {
		
		Graph<String> grafoCiudades = new AdjListGraph<String>();
		
		Vertex<String> buenosAires = grafoCiudades.createVertex("Buenos Aires");
		Vertex<String> santiago = grafoCiudades.createVertex("Santiago");
		Vertex<String> asuncion = grafoCiudades.createVertex("Asunción");
		Vertex<String> roma = grafoCiudades.createVertex("Roma");
		Vertex<String> madrid = grafoCiudades.createVertex("Madrid");
		Vertex<String> caracas = grafoCiudades.createVertex("Caracas");
		Vertex<String> tokio = grafoCiudades.createVertex("Tokio");
		Vertex<String> paris = grafoCiudades.createVertex("Paris");
		
		
		grafoCiudades.connect(buenosAires, paris, 77);
		grafoCiudades.connect(buenosAires, santiago, 3);
		grafoCiudades.connect(buenosAires, asuncion, 6);
		
		grafoCiudades.connect(santiago, roma, 4);
		
		grafoCiudades.connect(asuncion, madrid, 10);
		grafoCiudades.connect(asuncion, caracas, 2);
		
		grafoCiudades.connect(roma, tokio, 80);
		
		grafoCiudades.connect(madrid, tokio, 60);
		
		grafoCiudades.connect(caracas, tokio, 20);
		grafoCiudades.connect(caracas, madrid, 2);
		
		grafoCiudades.connect(tokio, buenosAires, 10);
		
		grafoCiudades.connect(paris, roma, 4);
		grafoCiudades.connect(paris, madrid, 65);
		grafoCiudades.connect(paris, tokio, 35);
		
		
		
		for (int i = 0; i < grafoCiudades.getSize(); i++) {
			System.out.print(grafoCiudades.getVertex(i).getData().toString()+ " ");
		}
		
		System.out.println();

		// 1.
		System.out.println("Ejercicio 1");
		Mapa<T> mapa = new Mapa(grafoCiudades);
		System.out.println(mapa.devolverCamino("Paris", "Santiago"));
		System.out.println();
		
		// 2.
		System.out.println("Ejercicio 2");
		Mapa<T> mapa2 = new Mapa(grafoCiudades);
		List<String> listaCiudades = new ArrayList<String>();
		listaCiudades.add("Roma");
		System.out.println(mapa2.devolverCaminoExceptuando("Paris", "Santiago", listaCiudades));
		System.out.println();
		
		// 3.
		System.out.println("Ejercicio 3");
		Mapa<T> mapa3 = new Mapa(grafoCiudades);
		System.out.println(mapa3.caminoMasCorto("Paris", "Madrid"));
		System.out.println();
		
		// 4.
		System.out.println("Ejercicio 4");
		Mapa<T> mapa4 = new Mapa(grafoCiudades);
		System.out.println(mapa4.caminoSinCargarCombustible("Paris", "Madrid", 56));
	}

}
