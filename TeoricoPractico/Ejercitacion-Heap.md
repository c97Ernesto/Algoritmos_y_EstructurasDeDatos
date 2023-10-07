#### [Ejercicio 1](#ejercicio-1)
- A partir de una heap inicialmente vacía, inserte de a uno los siguientes valores:
	- 6, 4, 15, 2, 10, 11, 8, 1, 13, 7, 9, 12, 5, 3, 14
	
#### Ejercicio 2
1. ¿Cuántos elementos hay, al menos, en una heap de altura h?
	- Al tener que cumplir la propiedad estructural de un árbol binario completo, la cantidad mínima de elementos de una heap de altura h es de: **2<sup>h</sup> elementos**

2. ¿Dónde se encuentra ubicado el elemento mínimo en una max-heap?
	- El elemento mínimo estará almacenado en una de sus hojas.

3. ¿El siguiente arreglo es una max-heap : [23, 17, 14, 6, 13, 10, 1, 5, 7, 12] ?
 	- No es una MaxHeap ya que no estaría cumpliendo la propiedad de orden de una MaxHeap, donde cada uno de los hijos tiene que ser menor al padre. El elemento 6 no es mayor que uno de sus hijos (7)
	
#### Ejercicio 3
Dados los siguientes árboles, indique si representan una heap. Justifique su respuesta.

- 

#### Ejercicio 4
- Dibuje todas las min-heaps posibles para este conjunto de claves: {A, B, C, D, E}
	- A B C E D
	- A B E C D
	- A B E D C
	- A B D E C
	- A B D C E
	- A C B D E
	- A C B E D	
	
#### [Ejercicio 5](#ejercicio-5)
- A partir de una min-heap inicialmente vacía, dibuje la evolución del estado de la heap al ejecutar las siguientes operaciones:
	- Insert(5), Insert(4), Insert(7), Insert(1), DeleteMin(), Insert(3), Insert(6), DeleteMin(), DeleteMin(), Insert(8), DeleteMin(), Insert(2), DeleteMin(), DeleteMin()


#### [Ejercicio 6](#ejercicio-6)
Aplique el algoritmo BuildHeap, para construir una min-heap en tiempo lineal, con los siguientes valores.
- {150, 80, 40, 10, 70, 110, 30, 120, 140, 60, 50, 130, 100, 20, 90}

#### [Ejercicio 7](#ejercicio-7)
Aplique el algoritmo HeapSort, para ordenar descendentemente los siguientes elementos:

- {15, 18, 40, 1, 7, 10, 33, 2, 140, 500, 11, 12, 13, 90}

- Muestre paso a paso la ejecución del algoritmo sobre los datos.

#### [Ejercicio 23](#ejercicio-23)
- Aplique dos pasos de la segunda fase del algoritmo HeapSort en la siguiente MinHeap, resultado de la primer fase:
	- 21, 27, 23, 40, 34, 29, 25 52
	


___

### Ejercicio 1

- insert 6 = 6 

- insert 4 = 6 4 
	- percolateUp = 4 6

- insert 15 = 4 6 15 

- insert 2 = 4 6 15 2 
	- percolateUp = 4 2 15 6 --> 2 4 15 6

- insert 10 = 2 4 15 6 10

- insert 11 = 2 4 15 6 10 11 
	- percolateUp = 2 4 11 6 10 15

- insert 8 = 2 4 11 6 10 15 8 
	- percolateUp = 2 4 8 6 10 15 11

- insert 1 = 2 4 8 6 10 15 11 1 
	- percolateUp = 2 4 8 1 10 15 11 6 --> 2 1 8 4 10 15 11 6 --> 1 2 8 4 10 15 11 6
	

- insert 13 = 1 2 8 4 10 15 11 6 13

- insert 7 = 1 2 8 4 10 15 11 6 13 7 
	- percolateUp = 1 2 8 4 7 15 11 6 13 10

- insert 9 = 1 2 8 4 7 15 11 6 13 10 9

- insert 12 = 1 2 8 4 7 15 11 6 13 10 9 12 
	- percolateUp = 1 2 8 4 7 12 11 6 13 10 9 15

- insert 5 = 1 2 8 4 7 12 11 6 13 10 9 15 5 
	- percolateUp = 1 2 8 4 7 5 11 6 13 10 9 15 12 --> 1 2 5 4 7 8 11 6 13 10 9 15 12

- insert 3 = 1 2 5 4 7 8 11 6 13 10 9 15 12 3 
	- percolateUp = 1 2 5 4 7 8 3 6 13 10 9 15 12 11 --> 1 2 3 4 7 8 5 6 13 10 9 15 12 11

- insert 14 = 1 2 3 4 7 8 5 6 13 10 9 15 12 11 14

_Arreglo Final_ = **1 2 3 4 7 8 5 6 13 10 9 15 12 11 14**

### Ejercicio 5
- Insert(5) = 5
	
- Insert(4) = 5 4

	- PercolateUp = 4 5
	
- Insert(7) = 4 5 7

- Insert(1) = 4 5 7 1

	- PercolateUp = 4 1 7 5 --> 1 4 7 5

- DeleteMin() = 5 4 7

	- PercolateDown	= 4 5 7
	
- Insert(3) = 4 5 7 3
	- PercolateUp = 4 3 7 5 --> 3 4 7 5

- Insert(6) = 3 4 7 5 6

- DeleteMin() = 6 4 7 5

	- PercolateDown = 4 6 7 5
	
	- PercolateDown = 4 5 7 6

- DeleteMin() = 6 5 7
	- PercolateDown = 5 6 7

- Insert(8) = 5 6 7 8
 
- DeleteMin() = 8 6 7 

	- PercolateDown = 6 8 7

- Insert(2) = 6 8 7 2

	- PercolateUp = 6 2 7 8
	
	- PercolateUp = 2 6 7 8
	
- DeleteMin() = 8 6 7

	- PercolateDown = 6 8 7
 
- DeleteMin() = 7 8

### Ejercicio 6
**{150, 80, 40, 10, 70, 110, 30, 120, 140, 60, 50, 130, 100, 20, 90}**

Se empieza a filtrar desde el elemento que está en la posición (tamaño / 2)

Se elige el menor de los hijos y se compara con el padre.

- Filtramos 30
	- 150, 80, 40, 10, 70, 110, 20, 120, 140, 60, 50, 130, 100, **30**, 90
	
- Filtramos 110
	- 150, 80, 40, 10, 70, 100, 20, 120, 140, 60, 50, 130, **110**, 30, 90
	
- Filtramos 70
	- 150, 80, 40, 10, 50, 100, 20, 120, 140, 60, **70**, 130, 110, 30, 90
	
- No Filtramos 10
	- 150, 80, 40, 10, 50, 100, 20, 120, 140, 60, 70, 130, 110, 30, 90
	
- Filtramos 40
	- 150, 80, 20, 10, 50, 100, **40**, 120, 140, 60, 70, 130, 110, 30, 90
	
	- 150, 80, 20, 10, 50, 100, 30, 120, 140, 60, 70, 130, 110, **40**, 90
	
- No Filtramos 80
	- 150, 10, 20, 80, 50, 100, 30, 120, 140, 60, 70, 130, 110, 40, 90

- No Filtramos 20 
	- 150, 10, 20, 80, 50, 100, 30, 120, 140, 60, 70, 130, 110, 40, 90
	
- No Filtramos 10
	- 150, 10, 20, 80, 50, 100, 30, 120, 140, 60, 70, 130, 110, 40, 90
	
- Filtramos 150
	- 10, 50, 20, 80, 60, 100, 30, 120, 140, **150**, 70, 130, 110, 40, 90
	
**10, 50, 20, 80, 60, 100, 30, 120, 140, 150, 70, 130, 110, 40, 90**
	
### Ejercicio 7	
	
- {15, 18, 40, 1, 7, 10, 33, 2, 140, 500, 11, 12, 13, 90}

- Construyo una MinHeap para ordenar ascendentemente

	- {1, 2, 10, 15, 7, 12, 33, 18, 140, 500, 11, 40, 13, 90}
	
- Aplico el algoritmo HeapSort para ordenar descendentemente

	- Intercambio
		- 90, 2, 10, 15, 7, 12, 33, 18, 140, 500, 11, 40, 13 | 1
		
	- Filtro
		- 2, 7, 10, 15, 11, 12, 33, 18, 140, 500, 90, 40, 13 | 1
	
	- Intercambio
		- 13, 7, 10, 15, 11, 12, 33, 18, 140, 500, 90, 40| 2, 1
		
	- Filtro
		- 7, 11, 10, 15, 13, 12, 33, 18, 140, 500, 90, 40| 2, 1
	
	- Intercambio
		- 40, 11, 10, 15, 13, 12, 33, 18, 140, 500, 90 | 7, 2, 1
		
	- Filtro
		- 10, 11, 12, 15, 13, 40, 33, 18, 140, 500, 90 | 7, 2, 1
		
	- Intercambio
		- 90, 11, 12, 15, 13, 40, 33, 18, 140, 500 | 10, 7, 2, 1
		
	- Filtro
		- 11, 13, 12, 15, 90, 40, 33, 18, 140, 500 | 10, 7, 2, 1
	
	- Intercambio	
		- 500, 13, 12, 15, 90, 40, 33, 18, 140 | 11, 10, 7, 2, 1
		
	- Filtro
		- 12, 13, 33, 15, 90, 40, 500, 18, 140 | 11, 10, 7, 2, 1
		
	- Intercambio
		- 140, 13, 33, 15, 90, 40, 500, 18 | 12, 11, 10, 7, 2, 1
		
	- Filtro
		- 13, 15, 33, 18, 90, 40, 500, 140 | 12, 11, 10, 7, 2, 1
		
	- Intercambio
		- 140, 15, 33, 18, 90, 40, 500 | 13, 12, 11, 10, 7, 2, 1
		
	- Filtro
		- 15, 18, 33, 140, 90, 40, 500 | 13, 12, 11, 10, 7, 2, 1
		
	- Intercambio
		- 500, 18, 33, 140, 90, 40 | 15 13, 12, 11, 10, 7, 2, 1
		
	- Filtro
		- 18, 90, 33, 140, 500, 40 | 15, 13, 12, 11, 10, 7, 2, 1
		
	- Intercambio
		- 40, 90, 33, 140, 500 | 18, 15, 13, 12, 11, 10, 7, 2, 1
		
	- Filtro
		- 33, 90, 40, 140, 500 | 18, 15, 13, 12, 11, 10, 7, 2, 1
	
	- Intercambio
		- 500, 90, 40, 140 | 33, 18, 15, 13, 12, 11, 10, 7, 2, 1
		
	- Filtro
		- 40, 90, 500, 140 | 33, 18, 15, 13, 12, 11, 10, 7, 2, 1
		
	- Intercambio
		- 140, 90, 500 | 40, 33, 18, 15, 13, 12, 11, 10, 7, 2, 1
		
	- Filtro
		- 90, 140, 500 | 40, 33, 18, 15, 13, 12, 11, 10, 7, 2, 1
		
	- Intercambio
		- 500, 140 | 90, 40, 33, 18, 15, 13, 12, 11, 10, 7, 2, 1
		
	- Filtro
		- 140, 500 | 90, 40, 33, 18, 15, 13, 12, 11, 10, 7, 2, 1
		
	- Intercambio
		- 500 | 140, 90, 40, 33, 18, 15, 13, 12, 11, 10, 7, 2, 1
		
**500, 140, 90, 40, 33, 18, 15, 13, 12, 11, 10, 7, 2, 1**	
	
### Ejercicio 23

		
		
		
		
		
		
		
		
		
		
		
		
		
		
