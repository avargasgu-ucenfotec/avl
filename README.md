# Segundo estudio de caso
El presente trabajo consiste en el desarrollo de una investigación en torno a la implementación de los algoritmos de evaluación del factor de balance en los árboles autobalanceados AVL, así como de los algoritmos de rotación que permiten la corrección de los desbalances que aparecen en dichas estructuras.

## Requerimientos
- [x] Indagar, documentar y representar gráficamente el funcionamiento de los algoritmos de:
   - [x] evaluación del factor de balance de los nodos de un árbol AVL
   - [x] rotación de los nodos para la corrección de desbalances de un árbol AVL
- [x] Investigar las principales aplicaciones de árboles AVL, listándolas y explicando por qué los árboles AVL son las estructuras de datos adecuadas para ellas
- [x] Programar un árbol AVL que efectúe de forma adecuada la funcionalidad de dicha estructura de datos
   - [x] implementar **rotarIzquierda()** dentro de la clase **NodoAVL**
   - [x] implementar **rotarDerecha()** dentro de la clase **NodoAVL**
   - [x] implementar **rotarIzquierdaDerecha()** dentro de la clase **NodoAVL**
   - [x] implementar **rotarDerechaIzquierda()** dentro de la clase **NodoAVL**
   - [x] implementar **buscar()** dentro de la clase **AVL**
   - [x] implementar **insertar()** dentro de la clase **AVL**
   - [x] implementar **eliminar()** dentro de la clase **AVL**
- [x] El código entregado debe incluir una rutina **main()** que ponga a disposición del usuario un **menu()**, mediante el cual se pueda interactuar de forma eficiente e intuitiva con el árbol AVL desarrollado
   - [x] opción "buscar nodo"
   - [x] opción "insertar nodo"
   - [x] opción "eliminar nodo"
   - [x] opción "imprimir árbol" 

## Casos de prueba
### Flujo 1. Buscar un nodo en un árbol vacío
#### Paso 1. Visualizar el estado inicial del sistema
El usuario selecciona la opción 4 del menú con el fin de visualizar que no existe un árbol almacenado.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 4
```
```
El árbol está vacío.
```
Se confirma que el árbol está vacío.

#### Paso 2. Buscar un elemento en un árbol vacío
El usuario selecciona la opción 1 del menú con el fin de buscar el elemento "1" en el árbol vacío.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 1
Digite el número entero que desea buscar en el árbol: 1
```
```
El árbol está vacío.
```
Se confirma que el elemento no se encuentra en el árbol vacío.

### Flujo 2. Insertar múltiples elementos en un árbol vacío.
#### Paso 1. Visualizar el estado inicial del sistema
El usuario selecciona la opción 4 del menú con el fin de visualizar que no existe un árbol almacenado.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 4
```
```
El árbol está vacío.
```
Se confirma que el árbol está vacío.

#### Paso 2. Insertar los siguientes elementos: "3", "2", "5", "1", "4", "8", "7", "6".
El usuario selecciona la opción 2 del menú con el fin de insertar el elemento "3" en el árbol vacío.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 2
Digite el número entero que desea insertar en el árbol: 3
```
El usuario selecciona la opción 2 del menú con el fin de insertar el elemento "2" en el árbol vacío.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 2
Digite el número entero que desea insertar en el árbol: 2
```
El usuario selecciona la opción 2 del menú con el fin de insertar el elemento "5" en el árbol vacío.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 2
Digite el número entero que desea insertar en el árbol: 5
```
El usuario selecciona la opción 2 del menú con el fin de insertar el elemento "1" en el árbol vacío.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 2
Digite el número entero que desea insertar en el árbol: 1
```
El usuario selecciona la opción 2 del menú con el fin de insertar el elemento "4" en el árbol vacío.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 2
Digite el número entero que desea insertar en el árbol: 4
```
El usuario selecciona la opción 2 del menú con el fin de insertar el elemento "8" en el árbol vacío.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 2
Digite el número entero que desea insertar en el árbol: 8
```
El usuario selecciona la opción 2 del menú con el fin de insertar el elemento "7" en el árbol vacío.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 2
Digite el número entero que desea insertar en el árbol: 7
```
El usuario selecciona la opción 2 del menú con el fin de insertar el elemento "6" en el árbol vacío.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 2
Digite el número entero que desea insertar en el árbol: 6
```
#### Paso 3. Visualizar el árbol AVL almacenado
El usuario selecciona la opción 4 del menú con el fin de visualizar el árbol almacenado.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 4
```
```
                       3                                             
           2                       5                     
     1                       4           7         
                                      6     8  
```
Se confirma que los elementos fueron insertados correctamente y que el árbol resultante está balanceado.

### Flujo 3. Buscar un elemento existente en un árbol AVL
#### Paso 1. Visualizar el árbol AVL almacenado
El usuario selecciona la opción 4 del menú con el fin de visualizar el árbol almacenado.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 4
```
```
                       3                                             
           2                       5                     
     1                       4           7         
                                      6     8  
```
Se confirma que existe un árbol AVL almacenado.

#### Paso 2. Buscar un elemento existente en el árbol AVL almacenado
El usuario selecciona la opción 1 del menú con el fin de buscar el elemento "1" en el árbol AVL.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 1
Digite el número entero que desea buscar en el árbol: 1
```
```
El número entero sí se encuentra en el árbol.
```

### Flujo 4. Buscar un elemento no existente en un árbol AVL
#### Paso 1. Visualizar el árbol AVL almacenado
El usuario selecciona la opción 4 del menú con el fin de visualizar el árbol almacenado.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 4
```
```
                       3                                             
           2                       5                     
     1                       4           7         
                                      6     8  
```
Se confirma que existe un árbol AVL almacenado.

#### Paso 2. Buscar un elemento no existente en el árbol AVL almacenado
El usuario selecciona la opción 1 del menú con el fin de buscar el elemento "9" en el árbol AVL.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 1
Digite el número entero que desea buscar en el árbol: 9
```
```
El número entero no se encuentra en el árbol.
```

### Flujo 5. Eliminar un elemento existente de un árbol AVL
#### Paso 1. Visualizar el árbol AVL almacenado
El usuario selecciona la opción 4 del menú con el fin de visualizar el árbol almacenado.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 4
```
```
                       3                                             
           2                       5                     
     1                       4           7         
                                      6     8  
```
Se confirma que existe un árbol AVL almacenado.

#### Paso 2. Eliminar un elemento existente en el árbol AVL almacenado
El usuario selecciona la opción 3 del menú con el fin de eliminar el elemento "1" en el árbol AVL.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 3
Digite el número entero que desea eliminar del árbol: 1
```

#### Paso 3. Visualizar el árbol AVL almacenado
El usuario selecciona la opción 4 del menú con el fin de visualizar el árbol almacenado.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 4
```
```
           5                     
     3           7         
  2     4     6     8   
```
Se confirma que el elemento "1" fue eliminado del árbol, y que dicho árbol fue balanceado.

#### Paso 4. Cerrar el programa
El usuario selecciona la opción 0 del menú con el fin de cerrar el programa.
```
 === Menú principal === 

[1] Buscar nodo
[2] Insertar nodo
[3] Eliminar nodo
[4] Imprimir árbol
[0] Salir

Seleccione una opción del menú: 4
```
```
Cerrando el programa...
```
