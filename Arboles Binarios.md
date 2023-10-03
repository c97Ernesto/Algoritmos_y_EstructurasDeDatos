<div>
<h2 align="center">Árboles Binarios</h1>
</div>


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
public void preOrden(ArbolBinario<T> ab) {

	System.out.println(ab.getDato());    // acción

    if (ab.tieneHijoIzquierdo()) {
        preorden(ab.getHijoIzquierdo());
    }

    if (ab.tieneHijoDerecho) {
        preOrden(ab.getHijoDerecho());
    }
}
```

**InOrden**
- Se procesa primero el hijo izquierdo, luego la raíz y último el hijo derecho.

```java
public void inOrden(ArbolBinario<T> ab) {

    if (ab.tieneHijoIzquierdo()) {
        preorden(ab.getHijoIzquierdo());
    }

    System.out.println(ab.getDato());    // acción

    if (ab.tieneHijoDerecho) {
        preOrden(ab.getHijoDerecho());
    }
}
```
**PostOrden**
- Se procesan primero los hijos, izquierdo y derecho, y luego la ráiz.

```java
public void postOrden(ArbolBinario<T> ab) {

    if (ab.tieneHijoIzquierdo()) {
        preorden(ab.getHijoIzquierdo());
    }

    if (ab.tieneHijoDerecho) {
        preOrden(ab.getHijoDerecho());
    }

    System.out.println(ab.getDato());    // acción

}
```
**PorNiveles:**
- Se procesan los nodos teniendo en cuenta sus niveles.

```java
public void porNiveles(ArbolBinario<T> ab) {
    ArbolBinario<T> nodo;
    ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();

    cola.encolar(ab);
    cola.encolar(null);     //se encola null para determinar el nivel en que nos encontramos

    while (!cola.esVacia()) {
        nodo = cola.desencolar();

        if (nodo != null) {
            System.out.println(ab.getDato());    //acción

            if (nodo.tieneHijoIzquierdo) {
                cola.encolar(nodo.getHijoIzquierdo());
            }

            if (nodo.tieneHijoDerecho) {
                cola.encolar(nodo.getHijoDerecho());
            }
        }
        else {
            if (!cola.esVacia()){
                cola.encolar(null);
            }
        }

    }
}
```




