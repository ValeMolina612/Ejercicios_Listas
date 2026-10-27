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
     */
    public ListaSimple() {
        this.cabeza = null;
        this.sumaTotal = 0.0;
    }