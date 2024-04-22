# Prácticas: 

### [Práctica 1: Listas.](#prc3a1ctica-1-listas-1)

### [Práctica 2: Árboles Binarios](#prc3a1ctica-2-c3a1rboles-binarios-1).

## Práctica 1: Listas.

## Práctica 2: Árboles Binarios.
Implemente cada ejercicio en un paquete que contenga los números del TP y del ejercicio. Ejemplo tp2.ejercicio3 (dentro del proyecto llamado “AYED”).

![P2-ArbolesBinarios-Ejer1](imgs/P2-ArbolesBinarios-Ejer1.svg)

### [Ejercicio 1](AYED/src/tp2/ejercicio01/BinaryTree.java)
Considere la siguiente especificación de la clase Java BinatyTree(con la representación hijo izquierdo e hijo derecho).

- El constructor `BinaryTree(T data)` inicializa un árbol con el dato pasado como parámetro y ambos hijos nulos.
- Los métodos `getLeftChild():BinaryTree<T>` y `getRightChild():BinaryTree<T>`, retornan los hijos izquierdo y derecho respectivamente del árbol. Si no tiene el hijo tira error.
- El método `addLeftChild(BinaryTree<T> child)` y `addRightChild(BinaryTree<T> child)` agrega un hijo como hijo izquierdo o derecho del árbol.
- El método `removeLeftChild()` y `removeRightChild()`, eliminan el hijo correspondiente.
- El método `isEmpty()` indica si el árbol está vacío y el método `isLeaf()` indica si no tiene hijos.
- El método `hasLeftChild()` y `hasRightChild()` devuelve un booleano indicando si tiene dicho hijo el árbol receptor del mensaje.

**a)** Analice la implementación en JAVA de la clase `BinaryTree` brindada por la cátedra.

### [Ejercicio 2](AYED/src/tp2/ejercicio02)
Agregue a la clase `BinaryTree` los siguientes métodos:
- `contarHojas():int`. Devuelve la cantidad de árbol/subárbol hojas del árbol receptor.

```java
//RESOLUCIÓN

public int contarHojas() {
	int total = 0;
		
	if (this.isLeaf()) 
		total = 1;
	else
		if (this.hasLeftChild())
			total = this.getLeftChild().contarHojas();
	
		if (this.hasRightChild())
			total+= this.getRightChild().contarHojas();

	return total;
}
```

- `espejo(): BinaryTree<T>`. Devuelve el árbol binario espejo del árbol receptor.
```java
//RESOLUCIÓN

public BinaryTree<T> espejo() {
	BinaryTree<T> nodo = new BinaryTree<T>(this.getData());
	
	if (!this.isLeaf()) {
					
		if (this.hasLeftChild()) 
			nodo.addRightChild(this.getLeftChild().espejo());
			
		if (this.hasRightChild()) 
			nodo.addLeftChild(this.getRightChild().espejo());

	}
	return  nodo;
}
```

- `entreNiveles(int n, m)`. Imprime el recorrido por niveles de los elementos del árbol receptor entre los niveles n y m (ambos inclusive). (0 ≤ n < m ≤ altura del árbol).

```java
//RESOLUCIÓN

public void entreNiveles(int n, int m) {
	BinaryTree<T> nodo = new BinaryTree<T>(this.getData());
	Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();

	cola.enqueue(this);
	cola.enqueue(null);
		
	int nivel = 0;
		
	while (!cola.isEmpty() && nivel <= m) {
		nodo = cola.dequeue();
			
		if (nodo != null) {
			System.out.print(nodo.getData()+" - ");
			
			if (nodo.hasLeftChild())
				cola.enqueue(nodo.getLeftChild());
			
			if (nodo.hasRightChild())
				cola.enqueue(nodo.getRightChild());
		}
		else {
			if (!cola.isEmpty()) 
				nivel++;
				cola.enqueue(null);
		}
	}
}
```

### [Ejercicio 3](AYED/src/tp2/ejercicio03/ContadorArbol.java)
Defina una clase Java denominada `ContadorArbol` cuya función principal es proveer métodos de validación sobre árboles binarios de enteros. Para ello la clase tiene como variable de instancia un `BinaryTree<Integer>`. Implemente en dicha clase un método denominado `numerosPares()` que devuelve en una estructura adecuada (sin ningún criterio de orden) todos los elementos pares del árbol (divisibles por 2).
- Implemente el método realizando un recorrido InOrden.
- Implemente el método realizando un recorrido PostOrden.

```java
//RESOLUCIÓN

public class ContadorArbol {

	private BinaryTree<Integer> abbEnteros;
	
	public ContadorArbol(BinaryTree<Integer> abbEnteros) {
		this.abbEnteros = abbEnteros;
	}
	
  // Implemente el método realizando un recorrido InOrden.
	public List<Integer> numerosParesInorden(){
		List<Integer> listaEnteros = new ArrayList<Integer>();
		
		if (!this.abbEnteros.isEmpty()) {
			this.numerosParesInorden(listaEnteros, this.abbEnteros);
		}
		
		return listaEnteros;
	}
	
	private void numerosParesInorden(List<Integer> listaEnteros, BinaryTree<Integer> abb){
		Integer num = abb.getData();
		
		if (abb.hasLeftChild())
			this.numerosParesInorden(listaEnteros, abb.getLeftChild());
		
		if (num % 2 == 1)
			listaEnteros.add(num);
		
		if (abb.hasRightChild())
			this.numerosParesInorden(listaEnteros, abb.getRightChild());
	}
	

	//Implemente el método realizando un recorrido PosOrden.
	public List<Integer> numerosParesPostOrden(){
		List<Integer> listaEnteros = new ArrayList<Integer>();
		
		if (!this.abbEnteros.isEmpty()) {
			this.numerosParesPostOrden(listaEnteros, this.abbEnteros);
		}
		
		return listaEnteros;
	}
	
	private void numerosParesPostOrden(List<Integer> listaEnteros, BinaryTree<Integer> abb){
		Integer num = abb.getData();
		
		if (abb.hasLeftChild())
			this.numerosParesPostOrden(listaEnteros, abb.getLeftChild());
		
		if (abb.hasRightChild())
			this.numerosParesPostOrden(listaEnteros, abb.getRightChild());
		
		if (num % 2 == 1)
			listaEnteros.add(num);
	}
}
```

### [Ejercicio 4](AYED/src/tp2/ejercicio04/)
Una red binaria es una red que posee una topología de árbol binario lleno. Por ejemplo:

![P2-ArbolesBinarios-Ejer4](imgs/P2-ArbolesBinarios-Ejer4.png)

Los nodos que conforman una red binaria llena tiene la particularidad de que todos ellos conocen cuál es su retardo de reenvío. El retardo de reenvío se define como el período comprendido entre que un nodo recibe un mensaje y lo reenvía a sus dos hijos.

Su tarea es calcular el mayor retardo posible, en el camino que realiza un mensaje desde la raíz hasta llegar a las hojas en una red binaria llena. En el ejemplo, debería retornar 10+3+9+12=34 (Si hay más de un máximo retorne el último valor hallado).

> Nota: asuma que cada nodo tiene el dato de retardo de reenvío expresado en cantidad de segundos.

1. Indique qué estrategia (recorrido en profundidad o por niveles) utilizará para resolver el problema.
2. Cree una clase Java llamada RedBinariaLlena donde implementará lo solicitado en el método `retardoReenvio():int`

```java
// VERSIÓN 1
public class RedBinariaLlena {

	private BinaryTree<Integer> binaryTree;
	
	public RedBinariaLlena(BinaryTree<Integer> binaryTree) {
		this.binaryTree = binaryTree;
	}
	
	public int retardoReenvio() {
		if (!this.binaryTree.isEmpty())
			return this.recorridoEnProfundidad(this.binaryTree);
		else
			return -1;
	}
	
	private int recorridoEnProfundidad(BinaryTree<Integer> binaryTree) {
		int subIzq = 0;
		int subDer = 0;
		
		if (binaryTree.isLeaf()) 
			return binaryTree.getData();
		
		else {
			if (binaryTree.hasLeftChild())
				subIzq+= recorridoEnProfundidad(binaryTree.getLeftChild());
			if (binaryTree.hasLeftChild())
				subDer+= recorridoEnProfundidad(binaryTree.getRightChild());
			
			return (Math.max(subIzq, subDer) + binaryTree.getData());
		}
	}
}

```

```java
// VERSIÓN 2
public class RedBinariaLlena2 {

	private BinaryTree<Integer> binaryTree;

	public RedBinariaLlena2(BinaryTree<Integer> binaryTree) {
		this.binaryTree = binaryTree;
	}
	
	public int retardoReenvio() {
		return this.retardo(binaryTree);
	}

	private int retardo(BinaryTree<Integer> arbol) {

		if (arbol == null || arbol.isEmpty())
			return 0;

		int valorI = retardo(arbol.getLeftChild()); // no hay que preguntar si es null, sale antes.
		int valorD = retardo(arbol.getRightChild());

		return Math.max(valorI, valorD) + arbol.getData();
	}

}
```