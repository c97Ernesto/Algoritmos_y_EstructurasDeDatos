<div>
<h1 align="center">Árboles Generales</h1>
</div>


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

**Árbol Completo:** Dado un árbol T de grado **k**  y altura **h**, diremos que **T** es _completo_ si es lleno de altura h-1 y el nivel h se completa de izquierda a derecha.

- _Cantidad de nodos de un árbol **Completo**:_ Sea T un árbol completo de grado **k** y altura **h**, la cantidad  de nodos N varía entre (k<sup>h</sup> + k - 2) / (k - 1) y (k<sup>h+1</sup> - 1) / (k - 1)




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




