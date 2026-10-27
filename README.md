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

Estructura del repositorio
En la raíz está este archivo README.md y una carpeta por cada ejercicio, con el nombre indicado arriba en cada descripción. Las carpetas de los ejercicios 1, 3 y 5 contienen Nodo.java, una clase de lista (ColaCafeteria.java en el ejercicio 1 y ListaSimple.java en los ejercicios 3 y 5) y Main.java. La carpeta del ejercicio 7 contiene NodoEstudiante.java, ListaEstudiantesHonor.java y Main.java.

Cómo compilar y ejecutar
Se necesita tener instalado el JDK de Java, de forma que los comandos javac y java funcionen en la terminal.

Para probar un ejercicio, se entra a su carpeta desde la terminal, se compilan todos los archivos .java con javac y se ejecuta la clase Main con java. Para probar otro ejercicio solo se cambia de carpeta.

Ejemplo:
cd ejercicio3_ComprandoAgua
javac *.java
java Main


EJERCICIO 1
<img width="1198" height="152" alt="Captura de pantalla 2026-10-25 220026" src="https://github.com/user-attachments/assets/fe85c02c-c9cd-4055-bf40-4514ceb6a561" />

EJERCICIO 3
<img width="765" height="160" alt="Captura de pantalla 2026-10-25 230826" src="https://github.com/user-attachments/assets/26c90092-c5e2-45c7-947a-ecebef063816" />

EJERCICIO 5
<img width="1282" height="186" alt="Captura de pantalla 2026-10-26 203057" src="https://github.com/user-attachments/assets/e5f30247-58c5-4376-bb87-553ca24dc12e" />

EJERCICIO 7


