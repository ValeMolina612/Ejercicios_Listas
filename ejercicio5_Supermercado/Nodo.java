/**
 * Problema: Ticket
 * Autor: Maria Valeria Molina Rosas
 * Grupo: GTID244
 * Fecha: 26/10/2026
 * Descripción: Representa un nodo individual que almacena el nombre, el precio 
 * del producto y el puntero hacia el siguiente nodo en la lista simple
 */
public class Nodo {
    String nombreProducto;
    double precioProducto;
    Nodo siguiente;

    /**
     Constructor para inicializar el nodo con un producto, su precio y su puntero en nulo.
     */

    public Nodo(String nombre, double precio) {
        this.nombreProducto = nombre;
        this.precioProducto = precio;
        this.siguiente = null;
    }
}