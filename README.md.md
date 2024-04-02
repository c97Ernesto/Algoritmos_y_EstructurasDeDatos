<h1 align="center">Algoritmos y Estructuras de Datos</h1>


## Temas que se abarcan
### [Estructuras de datos lineales.]()
- Listas.
- Pilas.
- Colas.

### [Estructuras de dato no lineales.]()
- Árboles Binarios.
- Árboles Generales.
- Colas de prioridad.
- Grafos.

### [Análisis de algoritos]().
- Cálculo de tiempo de ejecución.
- Orden de ejecución de los algorimots.



## Clases en Java
#### Una clase es un bloque de código o un molde, que describe el estado y el comportamiento que tendrán los objetos que con ella se creen.
- Un archivo origen en java debe tener como mínimo:
	- en la primera línea la palabra clave _package_ seguida del nombre del paquete.
	- la palabra clave _class_ seguida del nombre de la clase.
- Um archivo origem java debe guardarse con el mismo nombre que la clase (y con extensión _.java_)

### Declaración de una Clase
Para agregar estado y comportamiento debemos incluir:

**Variables de instancia:** consituyen el estado de un objeto. Normalmente, las variables de instancia se declaran como **_private_**, lo que significa que se puede acceder a ellas directamente sólo desde la clase donde se definen.
- La declaración de una variable incluye: 
	- un **identificador** o nombre de la variable.
	- un **tipo** de dato primitivo o referencial.
	- un especificador de acceso (opcional).


**Métodos de instancia:** definen las operaciones que pueden realizar los objetos de un tipo de clase. Un método es un bloque de código, similar a los que es una función o procedimiento en los lenguajes procedurales como PASCAL.
- La declaración de un método especifica:
	- un **nombre**.
	- una lista opcional de **argumentos**
	- un **tipo** de retorno.
	- un **modificador de acceso** (opcional).

## Tipo de datos en java
En **Java** hay dos tipos de datos: primitivo y referencial o de una clase en particular.

#### Tipo primitivos:
Las varbiables de tipo primitivo mantienen valores simples y NO son objetos. Existen 8 tipos de datos primitivos.
- **Entero**: byte, short, int, long
- **Punto flotante**: float y double
- Un **carácter** de texto: char
- **Lógico**: boolean

#### Tipos de una clase:
Las variables que referencias a un **objeto** son llamadas **variables de referencia** y contienen la ubicación (dirección de memoria) de objetos en memoria.

### Inicialización de datos
Si la definición de una clase, no inicializa variables de instancia, las mismas toman valores por defecto.
- Las variables de instancia de tipo **primitivo** se inicializan con los siguientes valores por defecto:
	- boolean = false 
	- char = '\uoooo' (nulo)
	- byte, short, int, long = 0
	- flat, double = 0.0

- Las variables de instancia que son referencias a objetos, se inicializan con el valor por defecto **null**.

### Clases Wrappers
Java no considera a los tipos de datos primitivos como objetos, los datos numéricos, booleanos y de caracter se tratan en su forma primitiva por razones de eficiencia.

Java proporciona clases **wrappers** para manipular a los datos primitivos como objetos. Los datos primitivos están envueltos (wrapped) en un objeto que se crea en torno a ellos.

Cada tipo de dato primitivo en java, posee un clase _wrapper_ corresondiente en el paquete **java.lang**. Cada objeto de la clase _wrapper_ encapsula a un único valor primitivo.

- char = Character
- boolean = Boolean
- byte = Byte
- short = Short
- int = Integer
- long = Long
- float = Float
- double = Double

#### Autoboxing
Es la conversión automática que realiza el compilador de Java entre los tipos primitivos y sus clases wrapper corresondientes. Por ejemplo, convertir un int en un Integer.
```java
Integer num1 = 10;  // Autoboxing de int a Integer
Double num2 = 5.5;  // Autoboxing de double a Double
```


#### Unboxing
Es la conversiòn al revé, es decir conversión de wrapper a un primitivo. Por ejemplo, de Double a double.
```java
Integer num1 = new Integer(10);
int num2 = num1;  // Unboxing de Integer a int

Double num3 = new Double(5.5);
double num4 = num3;  // Unboxing de Double a double
```

#### Ejemplo del impacto de un algoritmo