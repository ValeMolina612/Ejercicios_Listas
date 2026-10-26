/**
 * Problema: Comprando agua
 * Autor: Maria Valeria Molina Rosas
 * Grupo: GTID244
 * Fecha: 24 de octubre del 2026
 * Descripción: Clase Nodo que almacena el precio de una marca de agua
 */
public class Nodo {
    int precio; // Precio de la botella de agua
    Nodo siguiente; // Puntero al siguiente nodo en la lista

    public Nodo(int precio) {
        this.precio = precio;
        this.siguiente = null;
    }
}