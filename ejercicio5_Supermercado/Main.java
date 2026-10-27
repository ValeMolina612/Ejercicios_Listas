import java.util.Scanner;

/**
 * - Problema: Ticket de Compras Ordenado
 * - Autor: Maria Valeria Molina Rosas
 * - Grupo: GTID244
 * - Fecha: 26/10/2026
 * - Descripción: Clase principal que gestiona la lectura de datos de entrada desde consola,
 *   los procesa mediante la lista enlazada y genera la salida compatible con omegaUp.
 */
public class Main {
    /**
     * Método principal de ejecución.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            return;
        }