/**
 * - Problema: Cuadro de Honor Ordenado Alfabéticamente
 * - Autor: Maria Valeria Molina Rosas
 * - Grupo: GID244
 * - Fecha: 26/10/2026
 * - Descripción: Implementa una lista enlazada simple encargada de insertar 
 *   los nombres de los alumnos de forma ordenada alfabéticamente (de la A a la Z).
 */
public class ListaEstudiantesHonor {
    private NodoEstudiante cabeza;

    /**
     * Constructor para inicializar la lista enlazada vacía.
     */
    public ListaEstudiantesHonor() {
        this.cabeza = null;
    }

    /**
     * Inserta un estudiante en la lista manteniendo un orden alfabético estricto.
     * @param nombre Nombre del estudiante.
     * @param promedio Promedio académico del estudiante.
     */
    public void insertarAlfabeticamente(String nombre, double promedio) {
        NodoEstudiante nuevoNodo = new NodoEstudiante(nombre, promedio);

        // Caso 1: Si la lista está vacía o el nuevo nombre va antes alfabéticamente que la cabeza
        if (cabeza == null || nombre.compareToIgnoreCase(cabeza.nombreEstudiante) < 0) {
            nuevoNodo.siguiente = cabeza; // El nuevo nodo apunta a la antigua cabeza
            cabeza = nuevoNodo;           // La cabeza ahora pasa a ser el nuevo nodo
        } else {
            // Caso 2: Buscar la posición correcta manipulando punteros
            NodoEstudiante actual = cabeza;
            
            // Avanzamos mientras el siguiente nodo exista y su nombre sea menor alfabéticamente que el nuevo
            while (actual.siguiente != null && actual.siguiente.nombreEstudiante.compareToIgnoreCase(nombre) < 0) {
                actual = actual.siguiente; // Desplazamiento del puntero actual al siguiente nodo
            }
            
            // Manipulación de punteros para insertar en medio o al final de la lista
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        }
    }

    /**
     * Imprime los nombres de los alumnos que integran el cuadro de honor.
     */
    public void imprimirCuadroHonor() {
        NodoEstudiante actual = cabeza;
        
        // Recorremos la lista completa desde la cabeza hasta el final
        while (actual != null) {
            System.out.println(actual.nombreEstudiante);
            actual = actual.siguiente; // Mover puntero al siguiente nodo
        }
    }
}