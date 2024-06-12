### [Ejercicio 1](#ejercicio-1-1)

	
### Ejercicio 2
	
### Ejercicio 3

### Ejercicio 5
Evalúe la siguiente expresión postfija y determine cuál es el resultado.

- 6 5 * 7 3 − 4 8 + * +
	- (a) 78 --> V
	- (b) 66
	- (c) 34
	- (d) 44
	
```txt
Apilo 1er subárbol R1 = *
					  6   5
					
Apilo 2do subárbol R2 = -
					  7   3

Apilo 3er subárbol R3 = +
					  4   8
					  
Desapilo últimos dos subárboles y apilo subárbol R4 = *
													R2 R3
													
Desapilo últimos dos subárboles (R1 y R4) y creo el árbol R5 = +
															 R1	R4															 
R1 = 30, R2 = 4, R3 = 12
R4 = 4 * 12 = 48
R5 = 30 + 48 = 78
```

#### [Ejercicio 6](#ejercicio-6)

#### 7.- ¿Cuál es el número mínimo de nodos en un árbol binario completo de altura 4?

```
							n1
				n2						n3

		  n4        n5			   n6        n7

		n8  n9	 n10  n11    	n12 n12	 n14 n15

	  n16

Pod definición de árbol binario completo de altura h el número de nodos varía entre (2^h() y (2^(h+1) - 1)

RTA: 2⁴ = 16 nodos

```

#### Ejercicio 8
- Construya el árbol de expresión correspondiente a la siguiente expresión postfija.
	- 6 5 * 7 3 − 4 8 * + +
				
```txt
Operando 6: apilo
	6
	
Operando 5: apilo
	6 5 
	
Operador *: tomo como raíz, desapilo hijos y apilo subárbol		
	R1
R1 = *
    6 5

Operando 7: apilo
	R1 7

Operando 3: apilo
	R1 7 3
	
Operador -: tomo como raíz, despilo hijos y apilo subárbol						
	R1 R2
R2 = -
	7 3
	
Operando 4: apilo
	R1 R2 4

Operando 8: apilo
	R1 R2 4 8
	
Operador *: tomo como raíz, despilo hijos y apilo subárbol
	R1 R2 R3
R3 = *
	4 8
	
Operador +: tomo como raíz, desapilo hijos y apilo subárbol
	R1 R4
R4 =  +
	R2 R3
	
Operador +: tomo como raíz, despilo hijos u apilo árbol
	R5
R5 =  +
	R1 R4
	
					+
		*						+
	6		5				-		*
						  7   3   4   8

```


#### Ejercicio 10
- Construya el árbol de expresión correspondiente a la siguiente expresión prefija.
	-  `+ + a e / * - b c d f `

	- ¿Cuál es la profundidad del nodo d?
		- (a) 1  
		- (b) 2  
		- (c) 3  <--
		- (d) 4

```java

+ es operador => raíz 											+
	llamo con hijo izquierdo

+ es operador => raiz, 											+
	llamo con hijo izquierdo							+

a es operando => lo agrego como hijo hizquierdo					+
	vuelvo de la recursión --> +						+
	llamo con hijo derecho							a		

e es operando => lo agrego como hijo derecho					+
	no hay más llamados									+
	vuelvo de la recursion --> +					a		e
	no quedan llamados
	vuelvo de la recursión --> +
	llamo con el hijo derecho
	
/ es operador => raíz										+
	llamo con hijo izquierdo						+				/
												a		e		
														
* es operador => raíz										+
	llamo con hijo izquierdo						+				/
												a		e		*
														
- es operador => raíz										+
	llamo con hijo izquierdo						+				/
												a		e		*
															  -   
	
b es operando => lo agrego como hijo izquierdo				+
	vuelvo de la recursión --> -					+				/
	llamo con hijo derecho						a		e		*
															  -
															 b
	
c es operando => lo agrego como hijo derecho				+
	vuelvo de la recursión --> -					+				/
	no hay más llamados							a		e		*
	vuelvo de la recursión --> *							  -
	llamo con hijo derecho									 b c
	
d es operando => lo agrego como derecho						+
	no hay más llamados								+				/
	vuelvo de la recursión --> /				a		e		*
	llamo con hijo derecho									  -	  d
															 b c
	
f es operando => lo agrego como derecho						+
	no hay más llamados								+				/
	vuelvo de la recursión --> /				a		e		*		f
															  -	  d
															 b c
															 
No hay más elementos
	
	

```

#### Ejercicio 11
- Obtenga la siguiente expresión prefija de la siguiente expresión postfija.
	- `A B C * D - E F / G / - * `

```txt

```

#### Ejercicio 18
- Un árbol general lleno de grado 4, tiene 21 nodos
	- Cual es la altura del árbol ?
	
	- Desarrolle.

- Rta: **La altura del árbol es 2.**
	- La cantidad de nodos de un árbol lleno es: (k<sup>h+1</sup> - 1) / (k - 1).
	- Entonces: (k<sup>h+1</sup> - 1) / (k - 1) = 21
	- Siendo k = grado del árboles
		- (4<sup>h+1</sup> - 1) / (4 - 1) = 21 **==>** (4<sup>h+1</sup> - 1) = 21 * 3 **==>** 4<sup>h+1</sup> = 64
	- Siendo que 64 = 4 <sup>3</sup>, reescribimos la ecuación:
		- 4<sup>h+1</sup> = 4<sup>3</sup> 
	- Dado que tenemos bases iguales, los exponentes deben ser iguales
		- h+1 = 3 
		- _h = 2_
	
	
		 

#### Ejercicio 19
- Cual es la cantidad mínima de nodos en un árbol general completo de grado 3 y altura 4?

- Rta: **41 nodos como mínimo.**
	- La cantidad de nodos de un árbol general completo varía entre: (k<sup>h</sup> + k - 2) / (k - 1) y (k<sup>h+1</sup> - 1) / (k - 1)
	- Siendo (k<sup>h</sup> + k - 2) / (k - 1) la cantidad mínima de nodos que puede tener un árbol general completo.
	- Entonces: 
		- (3<sup>4</sup> + 3 - 2) / (3 - 1) = 41
	

#### Ejercicio 20
- Si un Árbol general lleno de grado 5 tiene 125 hojas.
	1. Cuál es la cantidad de nodos internos del árbol.
	2. Desarrolle el proceso realizado para obtener la respuesta anterior.

- Rta: **La cantidad de nodos internos es de 31.**
	- Dado que la cantidad de hojas de un árbol está dada por el grado  del árbol.
	- Entonces 5<sup>h</sup> = 125 ==> 5<sup>3</sup> = 125
		- Tenemos que en la altura 3 tenemos 125 nodos hojas
	- Tenemos: 5<sup>0</sup> + ... + 5<sup>3</sup> = cantidad de nodos
	- Como necesitamos solo los nodos internos del árboles:
		- 5<sup>0</sup>	 + 5<sup>1</sup> + 5<sup>2</sup> = 31


___

### Ejercicio 1
Dado un árbol binario T cuyo recorrido postorden es A G F E B J I H C D y su recorrido inorden es
A B G E F D J H I C ¿cuántos son los descendientes del nodo “C”?
- (a) 2   
- (b) 1   
- (c) 3  ✅️
- (d) ninguna de las anteriores       

PASO 1: 
- raíz D					
- lado izquierdo A B G E F
- lado derecho J H I C

	```
				D
		ABGEF		JHIC
	```
		
PASO 2: A G F E B y J I H C
- raíces B y C
	- lado izquierdo de B, A
	- lado derecho de B, G E F
	- lado izquierdo de C, J H I
	- lado derecho de C, no tiene

	```
				D
		B				C
	  A	  GEF	     JHI
	```
		
PASO 3: G F E y J I H
- raíces E y H
	- lado izquierdo de E, G
	- lado derecho de E, F
	- lado izquierdo de H, J
	- lado derecho de H, I
	```
				D
		B				C
	  A	  E	      	 H
	     G F	  	J I	
	```
 	  

### Ejercicio 5

### Ejercicio 6
	
### Ejercicio 7	


		
		
		
		
		
		
		
		
		
		
		
		
		
