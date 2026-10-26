
/**
 * Problema: Formados en la cafetería
 * Autor: Maria Valeria Molina Rosas
 * Grupo: GTID244
 * Fecha: 25 de octubre del 2026
 * Descripción: Estructura de Cola para manejar las operaciones en O(1)
 */

// Clase Nodo para representar a cada persona en la cola
class Nodo {
    String nombre;
    Nodo siguiente;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }
}

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

    // Inserta un elemento al final de la cola en O(1)
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

    // Remueve y retorna el elemento del frente de la cola en O(1)
    public String desencolar() {
        if (estaVacia()) {
            return null;
        }
        String nombre = frente.nombre;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null; // Si la cola queda vacía actualizamos fin también
        }
        return nombre;
    }
}