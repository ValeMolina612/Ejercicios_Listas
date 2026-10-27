import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Problema: Comprando agua
 * Autor: Maria Valeria Molina Rosas
 * Grupo: GTID244
 * Fecha: 24 de octubre del 2026
 * Descripción: Clase principal que procesa la entrada y encuentra el agua más barata
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = br.readLine();
        if (linea == null || linea.trim().isEmpty()) return;

        StringTokenizer st = new StringTokenizer(linea);
        int n = Integer.parseInt(st.nextToken());

        ListaSimple lista = new ListaSimple();

        // Leer los N precios y agregarlos a la lista
        linea = br.readLine();
        if (linea != null) {
            st = new StringTokenizer(linea);
            for (int i = 0; i < n; i++) {
                int precio = Integer.parseInt(st.nextToken());
                lista.insertar(precio);
            }
        }

        // Obtener e imprimir el precio menor
        int menorPrecio = lista.obtenerMinimo();
        System.out.println(menorPrecio);
    }
}