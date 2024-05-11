
Temas vistos:

Ordenando colecciones con Comparable y Comparator
Examples: https://aluracursos.com/blog/ordenando-colecciones-con-comparable-y-comparator

Collections clase madre de la interface List
Ejemplos de uso de la interface List
List<String> nombres = new ArrayList<>();
# ESTRUCTURA DE DATOS

https://www.aluracursos.com/blog/estructura-de-datos-introduccion

***
Java ofrece diferentes clases para representar una lista de objetos. Estas clases son útiles en diferentes escenarios, dependiendo de las necesidades de cada aplicación.

Las clases más comunes para representar una lista en Java son:

ArrayList

La característica principal de ArrayList es que se basa en un array dinámico. Almacena los elementos en una matriz interna y, a medida que se agregan nuevos elementos, el tamaño de la matriz se ajusta automáticamente para acomodar el nuevo elemento. De manera similar, cuando se elimina un elemento, el tamaño del array se ajusta para evitar desperdiciar espacio. ArrayList se usa ampliamente debido a su facilidad de uso y eficiencia de rendimiento.

LinkedList

La clase LinkedList proporciona una lista enlazada de elementos. A diferencia de ArrayList, que se basa en un array, LinkedList se basa en una lista vinculada, lo que significa que cada elemento de la lista es un objeto que contiene una referencia al siguiente elemento. Esto permite agregar y eliminar elementos de manera eficiente en cualquier posición de la lista, pero puede hacer que la búsqueda de un elemento específico sea menos eficiente.

LinkedList es una buena opción cuando insertar y eliminar elementos en cualquier posición de la lista es frecuente y cuando no es necesario acceder a elementos aleatoriamente.

Vector

La clase Vector es similar a ArrayList, pero está sincronizada, lo que significa que es segura de usar en threads simultáneos. Sin embargo, la sincronización añade una sobrecarga de rendimiento, por lo que Vector puede ser más lento que ArrayList en algunas situaciones.

Stack

La clase Stack implementa una pila, que es una colección ordenada de elementos donde la inserción y eliminación de elementos siempre ocurren en el mismo extremo de la lista. Los elementos se agregan y eliminan en un orden conocido como "last-in, first-out" (LIFO), es decir, el último elemento agregado es el primero en ser eliminado. La clase Stack se usa a menudo en algoritmos de procesamiento de texto, así como en otras situaciones donde LIFO es la forma natural de organizar datos.

Cada una de estas clases tiene sus propias fortalezas y debilidades, y la elección de cuál utilizar dependerá de las necesidades específicas de la aplicación. Para una mejor comprensión de las estructuras de datos, recomendamos leer el siguiente artículo:
****


Map y HashMap
