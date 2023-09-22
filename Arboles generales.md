<div>
<h1 align="center">Árboles Binarios</h1>
</div>


### Definiciones

### Descripción y terminología

### Aplicaciońes

### Representaciones

### [Recorridos](#recorridos-1)

## Recorridos

**PreOrden**
- Se procesa primero la raíz y luego los hijos.

```java
public void preOrden(ArbolGeneral<T> ab) {
System.out.println(ab.getDato());    // acción

    ListaGenerica<ArbolGeneral<T>> hijos = ab.getHijos();
    
    hijos.comenzar();
    while (!hijos.fin()) {
		preOrden(hijos.proximo());
    }
    
}
```

**InOrden**
- Se procesa el primer hijo, luego la raíz y por último los hijos restantes.

**PostOrden**
- Se procesan primero los hijos y luego la ráiz.

```java
public void postOrden(ArbolGeneral<T> ab) {
    ListaGenerica<ArbolGeneral<T>> hijos = ab.getHijos();
    
    hijos.comenzar();
    while (!hijos.fin()) {
		preOrden(hijos.proximo());
    }
    
    System.out.println(ab.getDato());    // acción
    
}
```
**PorNiveles:**
- Se procesan los nodos teniendo en cuenta sus niveles.

```java
public void porNiveles(ArbolGeneral<T> ab) {
	ArbolGeneral<T> nodo;
	ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
	
	cola.encolar(ab);
	cola.encolar(null);
	
	while (!cola.esVacia()) {
		nodo = cola.desencolar();
		
		if (nodo != null) {
			//acción
		
			if (nodo.tieneHijos()) {
				ListaGenerica<ArbolGeneral<T>> hijos = nodo.getHijos();
				
				hijos.comenzar();
				while (!hijos.fin()) {
					cola.encolar(elemento);
				}
			}
			
		} else {		
			if (!cola.esVacia()) {
				System.out.println("Otro nivel!!");
				cola.enconlar(null);
			}
		}	
	}
}
```




