<h1 align="center">Árboles</h1>

### [Árboles binarios](#c3a1rboles-binarios-1)
### [Árboles de expresión](#c3a1rboles-de-expresic3b3n-1)
### [Árboles Generales](#c3a1rboles-generales-1)


# Árboles Binarios

### [Definición](#definición-1)

### [Descripción y terminología](#descripción-y-terminología-1)

### [Recorridos](#recorridos-1)


## Definición
**Un _Árbol Binario_ es una colección de nodos, tal que:**

- Puede esta vacío.

- Puede estar formado por un nodo distinguido R, llamado **raíz** y dos sub-árboles T<sub>1</sub> y T<sub>2</sub>, donde la raíz de cada subárbol T<sub>i</sub> está conectado a R por medio de una arista.

## Descripción y terminología

Cada nodo puede tener a lo sumo dos hijos.

Cuando un nodo no tiene ningún hijo se denomina **hoja**.

Los nodos que tienen el mismo nodo padre se denominan **hermanos**.

Conceptos: 

- **Camino:** desde n<sub>1</sub> hasta n<sub>k</sub>, es una secuencia de nodos n<sub>1</sub>, n<sub>2</sub> ... n<sub>k</sub> tal que n<sub>i</sub> es el padre de n<sub>i+1</sub>, para 1 <= i <= k.
	- La longitud del camino es el número de aristas, es decir k-1.
	- Existe un camino de longitud cero desde cada nodo a si mismo.
	- Existe un único camino desde la raíz a cada nodo.
	
- **Profundidad:** de n<sub>i</sub> es la longitud del único camino desde la raíz hasta n<sub>i</sub>.
	- La raíz tiene profundidad cero.
	
- **Grado** de n<sub>i</sub> es el número de hijos del nodo n<sub>i</sub>.
    - En árboles binarios el grado de cualquier nodo nunca va a ser mayor a 2.

- **Altura** de n<sub>i</sub> es la longitud del camino más largo desde n<sub>i</sub> hasta una hoja.
	- Las hojas tienen altura 0.
	- La altura de un árbol es la altura del nodo raíz.
	
- **Ancestro/Descendiente:** si existe un camino desde n<sub>1</sub> a n<sub>2</sub>, se dice que n<sub>1</sub> es ancestro de n<sub>2</sub>.

**Árbol Binario Lleno:** Dado un árbol binario T de altura **h**, diremos que T es _lleno_ si cada nodo interno tiene grado 2 y todas las hojas están en el mismo nivel (h).

- _Cantidad de nodos de un árbol binario lleno:_ Sea T un árbol binario lleno de altura _h_, la cantidad de nodos N es N = 2<sup>0</sup>+2<sup>1</sup>+2<sup>2</sup>+...+2<sup>h</sup> = 2<sup>h+1</sup>-1

**Árbol Binario Completo:** Dado un árbol binario T de altura **h**, diremos que T es _completo_ si es lleno de altura h-1 y el nivel (h) se completa de izquierda a derecha.

- _Cantidad de nodos de un árbol binario completo:_ Sea T un árbol binario completo de altura _h_, la cantidad de nodos N varía entre 2<sup>h</sup> y 2<sup>h+1</sup>-1


## Recorridos

**PreOrden**
- Se procesa primero la raíz y luego los hijos, izquierdo y derecho.

```java
public void preOrden(BinaryTree<T> binaryTree) {

	System.out.println(binaryTree.getData());    // acción

    if (binaryTree.hasLeftChild()) {
        preorden(binaryTree.getLeftChild());
    }

    if (binaryTree.hasRightChild) {
        preOrden(binaryTree.getRightChild());
    }
}
```

**InOrden**
- Se procesa primero el hijo izquierdo, luego la raíz y último el hijo derecho.

```java
public void inOrden(BinaryTree<T> binaryTree) {

    if (binaryTree.hasLeftChild()) {
        preorden(binaryTree.getLeftChild());
    }

    System.out.println(binaryTree.getData());    // acción

    if (binaryTree.hasRightChild) {
        preOrden(binaryTree.getRightChild());
    }
}
```
**PostOrden**
- Se procesan primero los hijos, izquierdo y derecho, y luego la ráiz.

```java
public void postOrden(BinaryTree<T> binaryTree) {

    if (binaryTree.hasLeftChild()) {
        preorden(binaryTree.getLeftChild());
    }

    if (binaryTree.hasRightChild) {
        preOrden(binaryTree.getRightChild());
    }

    System.out.println(binaryTree.getData());    // acción

}
```
**PorNiveles:**
- Se procesan los nodos teniendo en cuenta sus niveles, primero la raíz, luego los hijos, los hijos de estos, etc.

```java
public void porNiveles(BinaryTree<T> binaryTree) {
    BinaryTree<T> nodo;
    Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();

    cola.enqueue(binaryTree);
    cola.enqueue(null);     //se encola null para determinar el nivel en que nos encontramos

    while (!cola.isEmpty()) {
        nodo = cola.dequeue();

        if (nodo != null) {
            System.out.println(binaryTree.getData());    //acción

            if (nodo.hasLeftChild()) 
                cola.enqueue(nodo.getLeftChild());

            if (nodo.hasLeftChild) 
                cola.enqueue(nodo.getRightChild());
        }
        else {
            if (!cola.isEmpty())
                cola.enqueue(null);
        }
    }
}
```



# Árboles de Expresión

## Definición
**Es un árbol binario asociado a una expresión aritmética:**

- Los nodos internos representan operadores.

- Los nodos externos (hojas) representan operandos.


## Construcción

#### Construcción de un árbol a partir de una expresión _posfija_ (estrategia 1):
Este proceso es posible ya que la expresión posfija está organizada en una forma en la que los operandos aparecen antes que los operadores. Esto nos permite contruir el árbol utilziando una pila, donde se apilan operandos hasta que se encuentra un nodo operador que tome los dos últimos nodos de la pila como hijos.

```
procedure econvertir(expr_posf)

    crear una Pila vacía

    mientras (existe caracter) hacer
        tomo un caracter de la expresión

    	si (es un operando)
    		creo un nodo y lo apilo.

    	si (es un operador lo tomo como raíz de los dos últimos creados)
		    creo un nodo R,
		    desapilo y lo agrego como hijo derecho de R
		    desapilo y lo agrego como hijo izquierdo de R
		    apilo R.

    desapilar árbol de expresión posfija final
```

#### Construcción de un árbol a partir de una expresión _prefija_ (estrategia 2):
Este proceso es posible ya que la expresión prefija está organizada en una forma en la que los operadores siempre aparecen antes de los operandos. Cuando se llega a las hojas, la recursión retorna y permite ir armando el árbol desde abajo hacia arriba

```java
procedure convertir(expre_pref)

    tomo el primer caracter de la expresión
    creo un nodo R con ese operador

    si el caracter es un operador
        agregar como hijo izquierdo de R (convertir(expr_pref - 1 caracter))
        agrego como hijo derecho de R(convertir(expr_pref - 1 carater))

    //es un operando
    devuelvo el nodo R
```

#### Construcción de un árbol a partir de una expresión _infija_:
1. Pasamos expresión InFija a PosFija.

2. Resolvemos expresión PosFija.

3. Obtenemos el árbol de expresión.
	
``` 
crear una Pila vacía
mientras (existe un caracter) hacer
    tomo un caracter de la expresión
    si es un operando
        se coloca en la salida
    si es un operador se analiza su prioridad respecto del tope de la pila
        si es un "(" o ")"
            "(" se apila
            ")" se desapila todo hasta el "(", incluido éste
        sino
            pila vacía u operador con > prioridad que el tope
                se apila
            operador con <= pioridad que el tope
                se desapila, se manda a la salida y se vuelve a comparar el operador con el tope de la pila
// se termina de procesar la expresión infija
Se desapilan todos los elementos llevándolos a la salida, hasta que la pila quede vacía.
```

- Método que evalúa y retorna un número de acuerdo a la expresión  artimética representada por el _ArbolBinario_ que es enviado como parámetro.

    ```java
    public Integer evaluar(BinaryTree<Character> arbol) {
        Character c = arbol.getData();
        if ((c == '+') || (c == '-') || (c == '/') || c == '*') {
            // es operador
            int operador_1 = evaluar(arbol.getLeftChild());
            int operador_2 = evaluar(arbol.getRightChild());
            switch (c) {
                case '+':
                    return operador_1 + operador_2;
                case '-':
                    return operador_1 - operador_2;
                case '*':
                    return operador_1 * operador_2;
                case '/':
                    return operador_1 / operador_2;
            }
        }
        // es operando
        return Integer.parseInt(c.toString());
    }
    ```

#### Prioridad de los operadores.
1. potencia
2. multiplicación y división
3. suma y resta.



# Árboles Generales

### [Definición](#definición-1)

### [Descripción y terminología](#descripción-y-terminología-1)

### [Recorridos](#recorridos-1)


## Definición

**Un Árbol es una colección de nodos, tal que:**

- puede estar vacío. (Árbol vacío)

- puede estar formado por un nodo distinguido _R_, llamado **raíz** y un conjunto de árboles T<sub>1</sub>, T<sub>2</sub>, ... ,T<sub>k</sub>, k >= 0 (subárboles), donde la raíz de cada subárbol T<sub>i</sub>, está conectado a _R_ por medio de una arista.

## Descripción y terminología

- **Grado** de n<sub>i</sub> es el número de hijos del nodo n<sub>i</sub>.
	- El grado de un árbol es el grado del nodo con mayor grado.

- **Altura** de n<sub>i</sub> es la longitud del camino más largo desde n<sub>i</sub> hasta una hoja.
	- Las hojas tienen altura 0.
	- La altura de un árbol es la altura del nodo raíz.

- **Profundidad / Nivel:** de n<sub>i</sub> es la longitud del único camino desde la raíz hasta n<sub>i</sub>.
	- La raíz tiene profundidad o nivel _cero_.
	
**Árbol Lleno:** Dado un árbol T de grado **k** y altura **h**, diremos que  **T** es _lleno_ si cada nodo interno tiene grado k y todas las hojas están en el mismo nivel (h).

- _Cantidad de nodos de un árbol **Lleno**:_ Sea T un árbol lleno de grado **k** y altura **h**, la cantidad  de nodos N es (k<sup>h+1</sup> - 1) / (k - 1)

**Árbol Completo:** Dado un árbol T de grado **k**  y altura **h**, diremos que **T** es _completo_ si es lleno de altura h-1 y el nivel h se completa de izquierda a derecha.

- _Cantidad de nodos de un árbol **Completo**:_ Sea T un árbol completo de grado **k** y altura **h**, la cantidad  de nodos N varía entre (k<sup>h</sup> + k - 2) / (k - 1) y (k<sup>h+1</sup> - 1) / (k - 1)




## Recorridos

**PreOrden**
- Se procesa primero la raíz y luego los hijos.

```java
//VERSION_1
public void preOrder(GeneralTree<T> ag) {
    System.out.println(ag.getData());    // acción

    List<GeneralTree<T>> children = ag.getChildren();
    for (GeneralTree<T> child: children)
        preOrder(child)
}
//VERSION_2
public void preOrder(GeneralTree<T> ag){
    System.out.println(ag.getData());    // acción

    List<GeneralTree<T>> children = ag.getChildren()
    Iterator<GenralTree<T>> it = children.iterator();
    while(it.hasNext()){
        GeneralTree<T> child = it.next();
        preOrder(child)
    }
}

```

**InOrden**
- Se procesa el primer hijo, luego la raíz y por último los hijos restantes.
```java
	private static void inOrder(GeneralTree<Integer> ag){

		List<GeneralTree<Integer>> hijos = ag.getChildren();
		Iterator<GeneralTree<Integer>> i = hijos.iterator();

		if (ag.hasChildren())
			numerosImparesMayoresQueInOrden(i.next(), n, listaEnteros);

        System.out.println(ag.getData());    // acción

		while (i.hasNext()) {
			numerosImparesMayoresQueInOrden(i.next(), n, listaEnteros);
		}
	}
```

**PostOrden**
- Se procesan primero los hijos y luego la ráiz.

```java
public void postOrder(GeneralTree<T> ag) {
    List<GeneralTree<T>> hijos = ag.getChildren();
    Iterator<GenralTree<T>> it = children.iterator();
    while(it.hasNext()){
        GeneralTree<T> child = it.next();
        preOrder(child)
    }
    
    System.out.println(ag.getDato());    // acción
}
```
**PorNiveles:**
- Se procesan los nodos teniendo en cuenta sus niveles.

```java
public void traversalLevel(GeneralTree<T> ag) {
	GeneralTree<T> nodoAux;
	Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
	
	cola.enqueue(ag);
	cola.enqueue(null);
	
	while (!cola.isEmpty()) {
		nodoAux = cola.dequeue();
		
		if (nodoAux != null) {
			//acción
		
			if (nodoaux.hasChildren()) {
				List<GeneralTree<T>> hijos = nodoAux.getChildren();
				for (GeneralTree<T> hijo: hijos)
					cola.enqueue(hijo);
				}
			}
		} else {		
			if (!cola.isEmpty()) {
				System.out.println("Otro nivel!!");
				cola.enqueue(null);
			}
		}	
	}
}
```