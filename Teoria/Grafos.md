<h1 align="center">Grafos</h1>

## Grafos

### [Definición](#definición-1)

### [Descripción y terminología](#descripción-y-terminología)

### [Conectividad](#conectividad-1)

### [Recorridos](#recorridos-1)


## Definición

## Descripción y terminología
- **Grafo**: Modelo matemático para representar relaciones entre los elementos de un conjunto (nodos/vértices). Se define como un par ordenado _(V,E)_ donde:
    - _V_: es un conjunto de vértices o nodos. Cada vértice representa un elemento del conjunto.
    - _E_: es un conjunto de pares (u,v), donde u y v pertenecen a V. Estos pares se llaman _aristas_ o _arcos_ y representan la relación entre dos vértices.

- **Grafo dirigido**: en un grafo dirigido la relación sobre V no es simétrica. Esto quiere decir que _si existe una arista_ desde el vértice _u al vértice v_, _no necesariamente existe_ una arista _desde v a u_.

    ![Grafos-GrafoDirigido-Ej1](./imgs/Grafos-GrafoDirigido-Ej1.svg)

    - Grafo no dirigido G(V,E).
    - V = {1, 2, 3, 4, 5}
    - E = {(1,2), (2,4), (3,1), (3,5), (5,3)}

- **Grafo no dirigido**: en un grafo no dirigido, la relación sobre V es simétrica. Esto significa que _si existe_ una arista entre los vértices _u y v_, _entonces existe_ una arista _entre v y u_

    ![Grafos-GrafoDirigido-Ej1](./imgs/Grafos-GrafoNoDirigido-Ej1.svg)

    - Grafo dirigido G(V,E).
    - V = {A, B, C, D, E}
    - E = {{B,A}, {B,E}, {B,D}, {A,E}, {C,D}, {C,E}}

- **Adyacencia**:  _v_ es adyacente a _u_ si existe una arista _(u,v)_ perteneciente a _E_.
- **Incidencia**: 
    - en un _grafo no dirigido_, una arista `(u,v)` **incide** en los vértices `u` y `v`. 
    - en un _grafo dirigido_, una arista `(u,v)` **incide** en v y **parte** de `u`.

- **Grado de un nodo**
    - En _grafos no dirigidos_ el grado de un nodo está dado por el número de arcos que inciden en él.
    - En _grafos dirigidos_ existen:
        - **grado de salida** `grado out`: es el número de arcos que parten de él.
        - **grado de entrada** `grado in`: es el número de arcos que inciden en él.
        - **grado del vértice**: será la suma de los grados de entrada y salida.

- **Grado de un Grafo**: es el máximo número de sus vértices.

- **Camino** desde `u` perteneciente a V a `v` perteneciente a V: secuencia _v<sub>1</sub>, v<sub>2</sub>, ..., v<sub>k</sub>_, tal que _u=v_

- **Longitud de un camino**

- **Camino Simple**

- **Ciclio**

- **Bucle**

- **Grafo acíclico**

- **Subgrafo**

- **Subgrafo Inducido**

- **Grafo ponderado, pesado o con costos**:

## Conectividad
### Conectividad en Grafos No Dirigidos
Un grafo no dirigido es **conexo** si hay un camino entre cada par de vértices.
![Grafos-ConectividadGrafoNoDirigido](./imgs/Grafos-Conectividad-GrafoNoDirigido.png)

### Bosque y Árbol
- Un **bosque** es un grafo sin ciclos.
- Un **árbol libre** es un bosque conexo.
- Un **árbol** es un árbol libre en el que un nodo se ha designado como raíz.
![Grafos-ConectividadGrafoNoDirigido](./imgs/Grafos-Conectividad-GrafoNoDirigido-bosque_y_arbol.png)

### Conectividad en Grafos Dirigidos
- `v` es **alcanzable** desde `u`, si existe un camino de `u` a `v`.
- Un grafo dirigido se denomina **fuertemente conexo** si existe un camino desde cualquier vértice a cualquier otro vértice.
![Grafos-Conectividad-GrafoDirigido](./imgs/Grafos-ConectividadGrafoDirigido.png)
- Si un grafo dirigido no es fuertemente conexo, pero el grafo subyacente (ignorando las direcciones de las aristas) es conexo, el grafo es **debilmente conexo**.

### Componentes Conexas
#### Componentes Conexas en Grafos No Dirigidos:
- Una **componente conexa** es un _subgrafo conexo_ tal que no existe otra componente conexa que lo contenga.
- Cada componente conexa es **maximal** (_subgrafo conexo maximal_), lo que significa que no se puede agregar ningún vértice adicional sin romper la propiedad de conexidad.
- Si un grafo no dirigido se encuentra formado por varias componentes conexas, se dice que el grafo es **no conexo**.
![Grafos-Conectividad-GrafoDirigido](./imgs/Grafos-Conectividad-GrafoNoDirigidoComponenteConexa.png)

#### Componentes Fuertemente Conexas en Grafos Dirigidos: 
- Una **componente fuertemente conexa**, es el máximo subgrafo fuertemente conexo.

-  Un grafo dirigido es **no fuertemente conexo** si está formado por varias componentes fuertemente conexas.
![Grafos-Conectividad-GrafoDirigido](./imgs/Grafos-Conectividad-GrafoDirigidoComponenteFuertementeConexa.png)

## Recorridos
### Recorrido en Profundidad: DFS (Depth First Search).
#### Estrategia:
- Se comienza desde un vértice determinado.
- Se marca el vértice actual como visitado.
- Se explora xada camino que sale del vértice actual. Se profundiza cada camino hasta que se llega a un vértice ya visitado.
- Una vez que se termina de explorar un camino, se sigue con el siguiente no explorado, y se repite el proceso hasta que se hayan visitado todos los vértices alcanzables desde el vértice inicial
- Si existen vértices no alcanzables desde el vértice inicial, el recorrido quedará incompleto. En ese caso, se selecciona el vértice no visitado como nuevo vértice de partida y se repite el proceso.

#### Esquma recursivo: _Dado G = (V,E)_
1. Marcar todos los vértices como no visitados.
2. Elegir un vértice `u` como punto de partida.
3. Marcar `u` como visitado.
4. Para todo `v` adyacente a `u`, `(u,v)` perteneciente a _E_, si `v` no ha sido visitado, repeterir _3_ y _4_ para `v`
- Finalizar cuando se hayan alcnazado todos los nodos alcanzables desde `u`.
- Si desde `u` no fueron alcanbles todos los nodos del grafo: volver a _2_, elegir un nuevo vértice de partida `v` no visitado, y repetir el proceso hasta que se hayan recorrido todos los vértices.

    ```
    dfs(v: vértice){
        marca[v]:= visitado;
        para cada nodo w adyacente a v {
            si w no está visitado
                dfs(w);
        }
    }

    main: dfs(grafo){
        inicializar marca en false (arreglo de booleanos);
        para cada vértice v del grafo{
            si v no está visitado
                dfs(v);
        }
    }
    ```

#### Tiempo de ejecucución

### Recorrido en Amplitud: BFS (Breath First Search).
Es una generalización del recorrido por niveles de un árbol.
- _Primero se exploran todos los vértices a una distancia de 1 arista del vértice inicial, luego los vértices a una distancia de 2 aristas y así sucesivamente._
#### Estrategia:
- Comienza desde un vértice inicial.
- Se marca ese vértice como visitado.
- Se exploran los vértices adyacentes al incial en el orden que aparecen en la lista de adyacencia y se marca cada vértice como visitado.

#### Esquma iterativo: _Dado G = (V,E)_
1. Encolar el vértice origen `u`
2. Marcar el vértice `u` como visitado
3. Procesar la cola.
4. -- Desencolar `u` de la cola
5. ---- Para todo adyacente a `u`, `(u,v)` perteneciente a _E_
6. ------ si `v` no ha sido visitado
7. -------- encolar y visitar `v`
- Si desde `u` no fueron alcanzados todos los nodos del grafo: volver a _1_, elegir un nuevo vértice de partida no visitado, y repetir el proceso hasta que se hayan recorrido todos los vértices.
- Costo _T(|V|,|E|)_ es de _O(|V|+|E|)_ (orden lineal).

### Bosque de expansión generado a partir de un recorrido BFS
_Puede ser un árbol o una colección de árboles generados a partir de un recorrido BFS, donde cada árbol representa una parte conexa del grafo original. Cada árbol se forma a partir de un nodo inicial y las sucesivas visitas al los nodos adyacentes_.

_Se pueden generar un arbol o más de uno (bosque)_


- El recorrido **no es único**: depende del nodo incial y del orden de visita de los adyacentes.
- El orden de visita de unos nodos a partir de otros puede ser visto como un árbol: **arbol de expansión (abarcador) en profundidad asociado al grafo.**
- Si aparecen varios árboles: **bosque de expansión (o abarcador) en profundidad**

![Grafos-BosqueExpansion-Img2](./imgs/Grafos-BosqueExpansion-Img2.png)


![Grafos-BosqueExpansion-Img3](./imgs/Grafos-BosqueExpansion-Img3.png)


#### Clasificación de los arcos de un grafo dirigido en el bosque de expansión de un DFS

- Arcos **tree** (del árbol): son los arcos en el bosque depth-first-search, que conducen a vértices no visitados durante la búsqueda.
- Arcos **forward**: son los arcos _u→v_ que no están en el bosque, donde _v_ es _descendiente_, pero no es hijo en el árbol.
- Arcos **backward**: son los arcos _u→v_, donde _v_ es _antecesor_ en el árbol. Un arco de un vértice a si mismo es considerado un arco back.
- Arcos **cross**: son todos los otros arcos *u→v*, donde *v* no es ni antecesor ni descendiente de *u*. Son arcos que pueden ir entre vértices del mismo árbol
o entre vértices de diferentes árboles en el bosque depth-first-search.

**Ejemplo**: El recorrido en profundidad de un grafo G _no dirigido_ ha producido el árbol que se muestra en el figura, en el que cada nodo está numerado siguiendo el orden de visita del recorrido en profundidad.
![Grafos-BosqueExpansion-Img3](./imgs/Grafos-Ejemplo2.png)

- **a** → F. Si 6 fuera adyacente al nodo 4, tendría que ser descendiente del nodo 4 al ser un _grafo no dirigido_.
- **b** → V. En el grafo original el nodo 2 puede ser adyancente al nodo 5 y el nodo 4 al nodo 1.
- **c** → F. Los nodos 6 y 7 no pueden ser adyacentes porque para que se cumpla el nodo 6 tendría que haber sido descendiente del nodo 7 antes de existir el camino de 1 a 7. En cambio los nodos 5 y 7 no son adyacentes por el mismo caso que el anterior.
- **d** → F. Puede ser adyacente además a los nodos 4 y 5 mediante una arista _backward_
- **e** → F. No se puede hablar de un grafo fuertemente conexo en un grafo no dirifigo. Solo podría ser conexo.

## Aplicaciones del DFS
### Problema 1: Encontrar las componentes conexas de un grafo no dirigido.
- Si el **grafo es conexo**: un recorrido desde cualquier vértice visitará a **todos** los vértices del grafo
- Si no lo es:
    - Partiendo desde un vértice, tendremos una componente conexa (conjunto de vértices recorridos).
    - Para descrubrir más componentes conexas, habrá que repetir el recorrido desde un vértice no visitado hasta que todos los vértices hayan sido visitados.

    ![Grafos-Aplicaciones-EncontrarComponentesConexas](./imgs/Grafos-Aplicaciones-EncontrarComponentesConexas.png)

### Problema 2: Prueba de aciclicidad.
- En **Grafos No Dirigidos**: Hacer un recorrido dfs. Existe algún ciclo si y sólo si aparece algún arco que no es del árbol de expansión.
- En **Grafos Dirigidos** (digrafos): Hacer un dfs. Existe ciclo si y sólo si aparece algún arco de retroceso.

Orden de complejidad de la prueba de aciclicidad: igual que los recorridos.
- Con **matrices** de adyacencia: **O(|V|²)**.
- Con **listas** de adyacencia: **O(|V| + |E|)**.

### Problema 3: Encontrar las componentes fuertemente conexas.
Una aplicación clásica del depth-first search es descomponer un grafo dirigido en componentes fuertemente conexas (o conectadas).

Una **componente fuertemente conexa** de un grafo dirigido _G=(V,E)_ es el conjunto máximo de vértices _V’ ⊆ V_ tal que para cada par de vértices _u_ y _v_
en _V’_, existe un camino tanto _u→v_ como _u→v_.

**Algoritmo de Kosaraju**: _Es un algoritmo de tiempo lineal para encontrar las componentes fuertemente conexas de un digrafo._
- Se realizab dos dfs y se recorren todas las aristas una vez para crear el grafo reverso. _O(|V|+|E|)_

- Pasos:
    1. Aplicar DFS(G) rotulando los vértices de G en post-orden (apilar).
    2. Construir el grafo reverso de G, es decir G<sup>R</sup> (invertir los arcos).
    3. Aplicar DFS (G<sup>R</sup>) comenzando por los vértices de mayor rótulo (tope de la pila).
    4. Cada árbol de expansión resultante del paso 3 es una componente fuertemente conexa.
    - Si resulta **un único árbol** entonces el digrafo es **fuertemente conexo**.
    
![Grafos-Aplicaciones-ComponentesFuertementeConexasKosajaru](./imgs/Grafos-Aplicaciones-ComponentesFuertementeConexasKosajaru.png)