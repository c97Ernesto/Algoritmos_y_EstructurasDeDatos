<div>
<h1 align="center">Colas de Prioridad</h1>
</div>


### [Definición](#definición-1)

### [Distintas Implementaciones](#distintas-implementaciones-1)

### [Heap Binaria](#heap-binaria-1)

### [Operaciones](#operaciones-1)

### [Construcción de una Heap](#construcción-de-una-heap-1)

### [HeapSort](#ordenación-de-vectores-usando-Heap)


## Definición
**Una _Cola de Prioridad_ es una estructura de datos que permite al menos dos operaciones**

- **Insert:** Inserta un elemento en la estructura.

- **DeleteMin:** Encuentra recupera y elimina un elemento mínimo.

## Distintas Implementaciones
**Una Cola de Prioridad puede ser implementada en:**

- Lista Ordenada
	- La operación **Insert** tiene O(N) operaciones.
	- La operación **DeleteMin** tiene O(1) operaciones.

- Lista no Ordenada
	- La operación **Insert** tiene O(1) operaciones.
	- La operación **DeleteMin** tiene O(N) operaciones.

- Árbol Binario de Búsqueda
	- Las operaciones **Insert** y **DeleteMin** tienen en promedio O(log N) operaciones.
	
	
## Heap Binaria
Es una Implementación de Colas de Prioridad que no usa punteros y permite implementar ambas operaciones (Insert y DeleteMin) con O(log N) operaciones en el peor de los casos.

**Cumple con dos propiedades:**

- Propiedad Estructural.
- Propiedad de Orden.

**Propiedad Estructural:** Donde una Heap es un Árbol Binario Completo.

- En un Árbol Binario Lleno de altura _h_, los nodos internos tienen exáctamente 2 hijos y las hojas tienen la misma profundidad.

- Un Árbol Binario Completo de altura h es un árbol binario lleno de altura _h - 1_ y en el nivel h, los nodos se completan de izquierda a derecha

- El número de nodos _n_ de un árbol binario completo de altura _h_ satisface:
	- 2<sup>h</sup> <= n <= 2<sup>(h+1)</sup>-1
	
- Dado que un árbol binario completo es una estructura de datos regular, puede almacenarse en un arreglo, tal que: 

	- La raíz está almacenada en la posición 1
	
	- Para un elemento que está en la posición i:
		- el hijo izquierdo está en la posición 2*i
		- el hijo derecho está en la posición 2*i+1
		- el padre está en la posición i/2


**Propiedad de Orden:** Además de ser completo el árbol debe tener un orden

- MinHeap

	- El elemento mínimo (de menor prioridad) está almacenado en la raíz.
	
	- El dato almacenado en cada nodo es menor o igual al de sus hijos.
	
- MaxHeap
	
	- Se usa la propiedad inversa.
	
## Implementación de una Heap

Una Heap H **consta de**:

- Un arreglo que contiene los datos.

- Un valor que me indica el número de elementos almacenados.

Ventajas:

- No necesita usar punteros.

- Fácil implementación de las operaciones.
	
## Operaciones

**Insert:** 

- El dato se inserta como último items en la heap (al final del arreglo)
	- Si la propiedad de orden es violada se debe hacer un filtrado de los elementos.

- Se hace un filtrado hacia arriba (**Percolate Up**) para restaurar la propiedad de orden
	- El filtrado hacia arriba restaura la propiedad de orden intercambiando la _clave_ a lo largo del camino desde el lugar de inserción
	- El filtrado termina cuando la _clave_ alcanza la raíz o un nodo cuyo padre tiene una _clave_ menor
	- Ya que el algoritmo recorre la altura de la heap, tiene _O(long n)_ intercambios.
	
	
**Delte Min:**

- Se guarda el dato de la raíz.

- Elimino el último elemento y lo almaceno en la raíz.

- Se debe hacer un filtrado hacia abajo (**Percolate Down**) para restaurar la propiedad de orden.
	- Similar al filtrado hacia arriba.
	- Restaura la propiedad de orden intercambiando el dato de la raíz hacia abajo a lo largo del camino que contiene los hijos.
	- El filtrado termina cuando se encuentra el lugar correcto dónde insertarlo.
	- Ya que el algoritmo recorre la altura de la heap, tiene _O(long n)_ intercambios.

**Otras Operaciones:**

- DecreaseKey (x, Δ, H)
	- Decrementa la clave que está en la posición x de la heap H, en una cantidad Δ.
	
- IncreaseKey (x, Δ,, H)
	- Incrementa la clave que está en la posición x de la heap H, en una cantidad Δ.

- DeleteKey (x)
	- Elimina la clave que está en la posición x.
	- Puede realizarse con:
		- DecreaseKey (x, ∞, H)
		- DeleteMin (H)
		
## Construcción de una Heap

- Se pueden insertar los elementos de a uno, realizando (n log n) operaciones en total.

- Se puede usar un algoritmo (**BuildHeap**) de orden lineal, es decir, porporcional a los n elementos.
	- Insertar los elementos desordenados en un árbol binario completo.
	- Filtrar hacia abajo cada uno de los elementos.

### Algoritmo Build Heap

Para filtrar: 

- se elige el menor de los hijos.
- se compara el menor de los hijos con el padre.

Se empieza a filtrar desde el elemento que está en la posición (tamaño / 2):

- se filtran los nodos qie tienen hijos
- el resto de los nodos son hojas.

```java
// Ejemplo: Dada la siguiente lista de elementos, aplicar Build Heap: [5 8 12 9 7 10 21 6 14 4].
Arranco desde array.size / 2 = pos nro 5.
	- Percolate Down (7): 5 8 12 9 4 10 21 6 14 7
	- Percolate Down (9): 5 8 12 6 4 10 21 9 14 7
	- Percolate Down (12): 5 8 10 6 4 12 21 9 14 7
	- Percolate Down (8): 5 4 10 6 8 12 21 9 14 7 -> 5 4 10 6 7 12 21 9 14 8
	- Percolate Down (5): 4 5 10 6 7 12 21 9 14 8 -> 
```


#### Cantidad de operaciones requeridas:

- En el filtrado de cada nodo recorremos su altura

- Para acotar la cantidad de operaciones _(tiempo de ejecución)_ del algoritmo BuildHeap, debemos calcular la suma de las alturas de todos los nodos.
	- Teorema: En un arbol binario lleno de altura h que contiene 2<sup>h+1</sup> -1 nodos, la suma de las alturas de los nodos es: 2<sup>h+1</sup> - 1 - (h + 1)

- Un árbol binario completo no es un árbol binario lleno, pero el resultado obtenido es una cota superior de la suma de las alturas de los nodos en un árbol binario completo.

- Un árbol binario completo tiene entre 2<sup>h</sup> y 2<sup>h+1</sup> - 1 nodos, el teorema implica que esta suma es de O(n) donde n es el número de nodos.

- Este resultado muestra que la operación  BuidHeap es de orden lineal.
	
## Ordenación de vectores usando Heap
Dado un conjunto de _n_ elementos y se los quiere ordenar en forma creciente, existen dos alternativas:

1. _Algoritmo que usa una heap y requiere una cantidad aproximada de (n log n) operaciones._

	- Construir una MinHeap, realizar **n** DeleteMin operaciones e ir guardando los elementos extraídos en otro arreglo.
	
	- Desventaja: requiere el doble de espacio	

	```java
	// Ejemplo: Construir una MinHeap, realizar 6 DeleteMin operaciones e ir guradando los elementos extraídos en otro arreglo
		entrada: [50 30 18 25 22 12]
		salida: [12]
	```
	
2. _Algoritmo **HeapSort** que requiere una cantidad aproximada de (n log n) operaciones, pero **menos espacio**_ 

	- Construir una MaxHeap con los elementos que se desean ordenar, intercambiar el último elemento con el primero, decrementar el tamaño de la heap y filtrar hacia abajo. Usa solo el espacio de almacenamiento de la heap.

	```java
	// Ejemplo [50 30 18 25 22 12 15 9]:
		Intercambio el 1er elementos con el último, decremento el tamaño y filtro el elemento en caso de que sea necesario

		- [50 30 18 25 22 12 15 9]
		
			- Intercambio y decremento tamaño: [9 30 18 25 22 12 15 | 50]
			- Filtro: [30 25 18 9 22 12 15 | 50]

			- Intercambio y decremento tamaño: [15 25 18 9 22 12 | 30 50]
			- Filtro: [25 22 18 9 15 12 | 30 50]

			- Intercambio y decremento tamaño: [12 22 18 9 15 | 25 30 50]
			- Filtro: [22 15 18 9 12 | 25 30 50]

			- Intercambio y decremento tamaño: [12 15 18 9 | 22 25 30 50]
			- Filtro: [18 15 12 9 | 22 25 30 50]

			- Intercambio y decremento tamaño: [9 15 12 | 18 22 25 30 50]
			- Filtro: [15 9 12 | 18 22 25 30 50]

			- Intercambio y decremento tamaño: [12 9 | 15 18 22 25 30 50]
			- Filtro: [12 9 | 15 18 22 25 30 50]

			- Intercambio y decremento tamaño: [9 | 12 15 18 22 25 30 50]
			
		
	```








