<h1 align="center">Grafos</h1>

## Grafos

### [Definición](#definición-1)

### [Descripción y terminología](#descripción-y-terminología-1)

### [Recorridos](#recorridos-1)


## Definición


### Descripción y terminología
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