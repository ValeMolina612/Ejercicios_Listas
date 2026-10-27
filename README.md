# Ejercicios_Listas
Estudiante: María Valeria Molina Rosas

Grupo: GTID244

Materia: Estructuras de datos

Modalidad: Individual, lenguaje Java

Fecha: 26/10/2026

Docente: Rodriguez barron gabriel 


Descripción del proyecto
Este repositorio contiene la solución de 4 problemas de la plataforma omegaUp usando listas enlazadas implementadas desde cero. Cada solución tiene su propia clase Nodo y su propia clase de lista, junto con una clase Main que lee la entrada y muestra la salida.

En ninguna solución se usan las estructuras que ya trae Java, como LinkedList, ArrayList o Vector. Todo el manejo de los nodos y de los punteros (siguiente) está escrito a mano.

Documentación del código
Cada archivo comienza con un encabezado que indica el autor, el grupo, la fecha y el problema que resuelve. Las clases y los métodos principales tienen comentarios Javadoc que explican qué hacen, qué reciben y qué devuelven. Además, las partes donde se mueven los punteros tienen comentarios internos que explican qué referencia cambia y por qué. Los nombres de variables y métodos son descriptivos y están en español.

Ejercicios resueltos
Ejercicio 1: Formados en la cafetería. Se simula una cafetería con dos filas: una de trabajadores y una de alumnos. Los trabajadores se atienden primero y los alumnos solo cuando no hay trabajadores esperando. Se usa lista simple con referencia al frente y al final (cola FIFO), porque las personas llegan por el final y se atienden por el inicio, y con ambas referencias las dos operaciones son inmediatas, O(1). Se necesitan dos listas, una por cada fila. Carpeta: ejercicio1_FormadosEnLaCafeteria.

Ejercicio 3: Comprando agua. Se busca, entre los precios de varias marcas de agua, el más barato. Se usa lista simple porque basta recorrer todos los precios una sola vez comparando contra el menor encontrado hasta el momento. Carpeta: ejercicio3_ComprandoAgua.

Ejercicio 5: Supermercado. Se arma un ticket con los productos ordenados de mayor a menor precio y se muestra el total de la compra. Se usa lista simple ordenada: cada producto se inserta directamente en su lugar correcto, así la lista siempre está ordenada y no hace falta ordenar al final. Carpeta: ejercicio5_Supermercado.



Ejercicio 7: Cuadro de Honor. Se muestra, en orden alfabético, el nombre de los alumnos con promedio de 9.5 o más. Se usa lista simple ordenada alfabéticamente: solo se insertan los alumnos que cumplen el promedio y cada nombre se coloca directamente en su posición. Carpeta: ejercicio7_CuadrodeHonor.
