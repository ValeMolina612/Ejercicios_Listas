/**
 * - Problema: Cuadro de Honor Ordenado Alfabéticamente
 * - Autor: Maria Valeria Molina Rosas
 * - Grupo: GIDS
 * - Fecha: 26/10/2026
 * - Descripción: Representa un nodo individual que almacena el nombre del alumno, 
 *   su promedio y el puntero hacia el siguiente nodo en la lista enlazada simple.
 */
public class NodoEstudiante {
    String nombreEstudiante;
    double promedioEstudiante;
    NodoEstudiante siguiente;

    /**
     * Constructor para inicializar el nodo con el nombre y promedio del alumno.
     * @param nombre Nombre completo del estudiante.
     * @param promedio Promedio académico del estudiante.
     */
    public NodoEstudiante(String nombre, double promedio) {
        this.nombreEstudiante = nombre;
        this.promedioEstudiante = promedio;
        this.siguiente = null;
    }
}