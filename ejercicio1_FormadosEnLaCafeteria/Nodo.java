/**
 * Problema: Formados en la cafetería
 * Autor: Maria Valeria Molina Rosas
 * Grupo: GTID244
 * Fecha: 24 de octubre del 2026
 * Descripción: Clase Nodo que almacena el nombre de una persona y un puntero al siguiente nodo
 */

public class Nodo {

    String nombre; // Nombre de la persona (alumno o trabajador)
    Nodo siguiente; // Puntero al siguiente nodo en la lista
    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;

    }

} 