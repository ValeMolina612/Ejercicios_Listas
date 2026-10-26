/**
 * Problema: Formados en la cafetería
 * Autor: Maria Valeria Molina Rosas
 * Grupo: GTID244
 * Fecha: 25 de octubre del 2026
 * Descripción: Estructura de Cola para manejar las operaciones en O(1)
 */
public class ColaCafeteria {
    Nodo frente;
    Nodo fin;

    public ColaCafeteria() {
        this.frente = null;
        this.fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    // Inserta un elemento al final de la cola
    public void encolar(String nombre) {
        Nodo nuevo = new Nodo(nombre);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

        public String desencolar() {
        if (estaVacia()) return null;
        String nombre = frente.nombre;
        frente = frente.siguiente;
        if (frente == null) {
        
        }
        return nombre;
    }
}