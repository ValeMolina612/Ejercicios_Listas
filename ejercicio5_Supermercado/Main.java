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
     **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            return;
        }
        
        int n = scanner.nextInt();
        ListaSimple listaCompras = new ListaSimple();
        
        // Lectura de los N productos y almacenamiento ordenado
        for (int i = 0; i < n; i++) {
            String nombre = scanner.next();
            double precio = scanner.nextDouble();
            listaCompras.insertarOrdenado(nombre, precio);
        }
        
        // Impresión del resultado final en formato de ticket
        listaCompras.imprimirTicket();
        
        scanner.close();
    }
}