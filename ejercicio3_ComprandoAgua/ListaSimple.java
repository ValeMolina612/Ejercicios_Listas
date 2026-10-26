/**
 * Problema: Comprando agua
 * Autor: Maria Valeria Molina Rosas
 * Grupo: GTID244
 * Fecha: 24 de octubre del 2026
 * Descripción: Lista Simplemente Enlazada para insertar precios y encontrar el mínimo
 */
public class ListaSimple {
    Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    // Inserta un nuevo precio al final de la lista
    public void insertar(int precio) {
        Nodo nuevo = new Nodo(precio);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Recorre la lista para encontrar y retornar el precio mínimo
    public int obtenerMinimo() {
        if (cabeza == null) return -1;
        int min = cabeza.precio;
        Nodo actual = cabeza.siguiente;
        while (actual != null) {
            if (actual.precio < min) {
                min = actual.precio;
            }
            actual = actual.siguiente;
        }
        return min;
    }
}