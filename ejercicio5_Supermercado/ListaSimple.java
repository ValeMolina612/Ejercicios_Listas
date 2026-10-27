/**
 * - Problema: Ticket de Compras Ordenado
 * - Autor: Maria Valeria Molina Rosas
 * - Grupo: GIDS
 * - Fecha: 26/10/2026
 * - Descripción: Implementa una lista enlazada simple encargada de insertar 
 *   los elementos ordenados de mayor a menor precio y calcular la suma total.
 */
public class ListaSimple {
    private Nodo cabeza;
    private double sumaTotal;

    /**
     * Constructor para inicializar la lista vacía y la suma total acumulada en 0.0.
     **/
    public ListaSimple() {
        this.cabeza = null;
        this.sumaTotal = 0.0;
    }

    /**
     * Inserta un producto en la lista manteniendo un orden descendente por precio.
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     **/
    public void insertarOrdenado(String nombre, double precio) {
        Nodo nuevoNodo = new Nodo(nombre, precio);
        sumaTotal += precio; // Acumulamos el costo para el total final

        // Caso 1: Si la lista está vacía o el precio del nuevo nodo es mayor a la cabeza, se inserta al inicio
        if (cabeza == null || precio > cabeza.precioProducto) {
            nuevoNodo.siguiente = cabeza; // El nuevo apunta a la antigua cabeza
            cabeza = nuevoNodo;           // La cabeza ahora es el nuevo nodo
        } else {
            // Caso 2: Buscar la posición correcta manipulando punteros en la lista
            Nodo actual = cabeza;