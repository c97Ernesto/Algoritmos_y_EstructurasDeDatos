package tp3.ejercicio01;

import java.util.LinkedList;
import java.util.List;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	
	/*
	 * Inicializa un árbol que tiene como raíz un nodo y este nodo tiene el dato
	 * que se pasa como parámetro y una lista vacía*/
	public GeneralTree(T data) {
		this.data = data;
	}

	/*
	 * Inicializa un árbol que tiene como raíz un nodo y este nodo tiene el dato 
	 * que se pasa como parámetro y al parámetro 'children' como la lista de hijos*/
	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	
	/*
	 * Retorna el dato almacenado en la raíz del árbol*/
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	/*
	 * Retorna la lista de hijos de la raíz del árbol*/
	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	/*
	 * Agrega un hijo al final de la lista de hijos del árbol*/
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	/*
	 * Devuelve VERDADERO si la lista de HIJOS del árbol NO ES NULL*/
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	/*
	 * Devuelve VERDADERO si el DATO del árbol ES NULL y NO tiene hijos*/
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}

	/*
	 * public int altura(): int devuelve la altura del árbol, es decir, la longitud 
	 * del camino más largo desde el nodo raíz hasta una hoja.*/
	public int altura() {	 
			
		return 0;
	}
	
	/*
	 * public int nivel(T dato) devuelve la profundidad o nivel del dato en el árbol. 
	 * El nivel de un nodo es la longitud del único camino de la raíz al nodo.*/
	public int nivel(T dato){
		return 0;
	  }

	/*
	 * public int ancho(): int la amplitud (ancho) de un árbol se define como la 
	 * cantidad de nodos que se encuentran en el nivel que posee la mayor cantidad de nodos.*/
	public int ancho(){
		return 0;
	}
	
	
	
}