# Práctica de Algoritmos de Ordenamiento

## 📌 Información General

- **Título:** Práctica de Algoritmo de busqueda binaria
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Jaime Loja
- **Fecha:** 20/04/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto implementa y compara diferentes algoritmos de busqueda binaria y ordenamiento en Java :
- En el siguiente algoritmo 1 utilice el metodo de ordenamiento de burbuja mejorado una vez ordenado el arreglo se implemento el codigo de busqueda binaria que 1 agarra el valor de la mitad y ve si es mayor o menor al valor buscado si es elimina la mitad del arreglo incluyendo el valor de la mitad y repite el mismo procedimiento hazlo encontrar el valor caso contrario no se encontro y regresa un -1 para que fuera del metodo se compare y se muestre si se encontro o no

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Entrada

```plaintext
----------Programa iniciado----------
Persona:
    Nombre= Juan
    Edad= 4     
Persona:
    Nombre= Maria
    Edad= 5      
Persona:
    Nombre= Carlos
    Edad= 18      
Persona:
    Nombre= Ana
    Edad= 60   
Persona:
    Nombre= Luis
    Edad= 25    
Persona:
    Nombre= Sofia
    Edad= 12     
Persona:
    Nombre= Pedro
    Edad= 8      
Persona:
    Nombre= Martin
    Edad= 9
Persona:
    Nombre= Luis
    Edad= 40

El tamaño de la lista es de= 9

Ingrese la edad a buscar:
9
4 | 5 | 8 | 9 | 12 | 18 | 25 | 40 | 60 | 
bajo = 0   alto = 8   centro = 4   edad en el centro = 12    --> Izquierda

4 | 5 | 8 | 9 |
bajo = 0   alto = 3   centro = 1   edad en el centro = 5    --> Derecha

8 | 9 |
bajo = 2   alto = 3   centro = 2   edad en el centro = 8    --> Derecha

9 | 
bajo = 3   alto = 3   centro = 3   edad en el centro = 9    --> Encontrado


Persona con Edad 9 es Martin

Persona:
    Nombre= Martin
    Edad= 9
```

---