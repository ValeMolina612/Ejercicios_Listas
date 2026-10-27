import java.util.Scanner;
import java.util.Locale;

/**
 * - Problema: Cuadro de Honor Ordenado Alfabéticamente
 * - Autor: Maria Valeria Molina Rosas
 * - Grupo: GTID244
 * - Fecha: 26/10/2026
 * - Descripción: Clase principal que gestiona la lectura de datos de entrada desde consola,
 *   aplica el filtro de promedio >= 9.5 y genera la salida ordenada requerida por omegaUp.
 */
public class Main {
    /**
     * Método principal de ejecución.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        if (!scanner.hasNextInt()) {
            return;
        }
        
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente después del entero N
        
        ListaEstudiantesHonor cuadroHonor = new ListaEstudiantesHonor();
        
        // Lectura de los N registros (cada uno ocupa 2 líneas: nombre y promedio)
        for (int i = 0; i < n; i++) {
            String nombre = scanner.nextLine();
            double promedio = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea pendiente después del double
            
            // Filtro: Solo ingresan los alumnos con promedio de 9.5 o más
            if (promedio >= 9.5) {
                cuadroHonor.insertarAlfabeticamente(nombre, promedio);
            }
        }
        
        // Impresión del resultado final del cuadro de honor ordenado
        cuadroHonor.imprimirCuadroHonor();
        
        scanner.close();
    }
}