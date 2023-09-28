<div>
<h2 align="center">Árboles de Expresión</h1>
</div>

___

## Definición
**Es un árbol binario asociado a una expresión aritmética:**

- Los nodos internos representan operadores.

- Los nodos externos (hojas) representan operandos.

## Recorridos


## Construcción

**Construcción de un árbol a partir de una expresión _postfija_:**

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

**Construcción de un árbol a partir de una expresión _prefija_:**

- Algoritmo:

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

**Construcción de un árbol a partir de una expresión _prefija_:**

1. Expresión **_infija_**.
	- Se usa una pila y se tiene en cuenta la precedencia de los operadores.

2. Expresión **_postfija_**.
	- Se usa la estrategia 1).

3. Árbol de Expresión.
	
