<div>
<h1 align="center">Árboles de Expresión</h1>
</div>

## Definición
**Es un árbol binario asociado a una expresión aritmética:**

- Los nodos internos representan operadores.

- Los nodos externos (hojas) representan operandos.


## Construcción

#### Construcción de un árbol a partir de una expresión _postfija_:
- Como los primeros elementos que se encuentran son operandos la construcción del árbol de abajo hacia arriba.
- Algoritmo iterativo que utiliza una pila:

```java

	tomo un caracter de la expresión
	mientras (existe caracter) hacer
	
		si (es un operando)
			creo un nodo y lo apilo.
		
		si (es un operador lo tomo como raíz de los dos últimos creados)
			creo un nodo R,
			desapilo y lo agrego como hijo derecho de R
			desapilo y lo agrego como hijo izquierdo de R
			apilo R.
			
		tomo otro caracter
	fin	

```

#### Construcción de un árbol a partir de una expresión _prefija_:
- Algoritmo:
- Como los primeros elementos que se van a encontrar son los operador, la construcción del árbol es de arriba hacia abajo.

```java

	ArbolExpresión (ab: ArbolBinario, expresión: string)
		
		si (la expresión es nula)
			termino.
			
		si (es un operador)
			creo nodo raíz R
			ArbolExpresión (subArbolIzq de R, expresión sin el 1er caracter)
			ArbolExpresión (subArbolDer de R, expresión sin el 1er caracter)
			
		si (es un operando)
			creo un nodo hoja
	

```

#### Construcción de un árbol a partir de una expresión _infija_:
1. Pasamos expresión InFija a PostFija.

2. Resolvemos expresión PostFija.

3. Obtenemos el árbol de expresión.
	
Estrategia del algoritmo para convertir expresión infija en posfija:

- Si es **operando**, se coloca en la Salida.
	
- Si es un **operador**, se maneja un pila según la prioridad del operador en relación al tope de la pila:
	- operador con > prioridad que el tope, se apila
	- operador con < prioridad que el tope, se desapila el elemento colocandolo en la salida.
	- Se vuelve a comparar el operador con el tope de la pila.

- Si es **"("** o **")"**:
	- "(", se apila.
	- ")", se desapila todo hasta "(".
	
- Cuando se llega al final de la expresión, se desapilan todos los elementos llevándolos a la salida, hasta que al pila quede vacía.

#### Prioridad de los operadores.
1. potencia
2. multiplicación y división
3. suma y resta.

