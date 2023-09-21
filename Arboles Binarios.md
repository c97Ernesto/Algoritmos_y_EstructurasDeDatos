<div>
<h2 align="center">Árboles Binarios</h1>
</div>

[Ir a la sección importante](#recorridos-1)



### Definiciones

### Descripción y terminología

### Aplicaciońes

### Representaciones

### [Recorridos](#recorridos-1)

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
    ArbolBinario<T> nodo = null;
    ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();

    cola.encolar(ab.getDato());
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




