/**
 * - Problema: Ticket de Compras Ordenado
 * - Autor: Maria Valeria Molina Rosas
 * - Grupo: GTID244
 * - Fecha: 26/10/2026
 * - Descripción: Implementa una lista enlazada simple encargada de insertar 
 *   los elementos ordenados de mayor a menor precio y calcular la suma total.
 */
public class ListaSimple {
    private Nodo cabeza;
    private double sumaTotal;

    /**
     * Constructor para inicializar la lista vacía y la suma total acumulada en 0.0.
     */
    public ListaSimple() {
        this.cabeza = null;
        this.sumaTotal = 0.0;
    }

    /**
     * Inserta un producto en la lista manteniendo un orden descendente por precio.
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     */
    public void insertarOrdenado(String nombre, double precio) {
        Nodo nuevoNodo = new Nodo(nombre, precio);
        sumaTotal += precio; // Acumulamos el costo para el total final

        // Caso 1: Si la lista está vacía o el precio del nuevo nodo es mayor a la cabeza
        if (cabeza == null || precio > cabeza.precioProducto) {
            nuevoNodo.siguiente = cabeza; // El nuevo apunta a la antigua cabeza
            cabeza = nuevoNodo;           // La cabeza ahora es el nuevo nodo
        } else {
            // Caso 2: Buscar la posición correcta manipulando punteros en la lista
            Nodo actual = cabeza;
            
            // Avanzamos mientras el siguiente nodo exista y su precio sea mayor al nuevo
            while (actual.siguiente != null && actual.siguiente.precioProducto > precio) {
                actual = actual.siguiente; // Desplazamiento del puntero actual
            }
            
            // Manipulación de punteros para insertar en medio o al final
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        }
    }

    /**
     * Imprime el ticket de compras formateado tal como lo pide omegaUp y muestra el total.
     */
    public void imprimirTicket() {
        Nodo actual = cabeza;
        int contador = 1;
        
        // Recorremos la lista completa desde la cabeza hasta el final
        while (actual != null) {
            System.out.println(contador + " | " + actual.nombreProducto + " | " + formatPrecio(actual.precioProducto));
            actual = actual.siguiente; // Mover puntero al siguiente nodo
            contador++;
        }
        
        // Imprimir el total final de las compras
        System.out.println();
        System.out.println(formatPrecio(sumaTotal));
    }

    /**
     * Método auxiliar para formatear los decimales correctamente en la salida.
     */
    private String formatPrecio(double valor) {
        if (valor == (long) valor) {
            return String.format("%d", (long) valor);
        } else {
            return String.format("%.2f", valor).replaceAll("0*$", "").replaceAll("\\.$", "");
        }
    }
}