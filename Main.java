import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Problema: Formados en la cafetería
 * Autor: Maria Valeria Molina Rosas
 * Grupo: GTID244
 * Fecha: 25 de octubre del 2026
 * Descripción: Clase principal que procesa la entrada estándar y gestiona los eventos de la cafetería
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = br.readLine();
        if (linea == null || linea.trim().isEmpty()) return;
        
        StringTokenizer st = new StringTokenizer(linea);
        int n = Integer.parseInt(st.nextToken());

        ColaCafeteria colaTrabajadores = new ColaCafeteria();
        ColaCafeteria colaAlumnos = new ColaCafeteria();
        StringBuilder salida = new StringBuilder();

        for (int i = 0; i < n; i++) {
            linea = br.readLine();
            if (linea == null) break;
            st = new StringTokenizer(linea);
            String tipoEvento = st.nextToken();

            if (tipoEvento.equals("LLEGA")) {
                String tipoPersona = st.nextToken();
                String nombre = st.nextToken();
                
                if (tipoPersona.equals("TRABAJADOR")) {
                    colaTrabajadores.encolar(nombre);                } else if (tipoPersona.equals("ALUMNO")) {
                    colaAlumnos.encolar(nombre);             } else if (tipoEvento.equals("ATIENDE")) {
                // Política: Se da preferencia a la gente formada en la cola de los trabajadores; 
                // los alumnos son atendidos sólo si no hay trabajadores formados[cite: 1].
                if (!colaTrabajadores.estaVacia()) {
                    salida.append(colaTrabajadores.desencolar()).append("\n");
                } else if (!colaAlumnos.estaVacia()) {
                    salida.append(colaAlumnos.desencolar()).append("\n");
                }
            }
        }
        
        // Imprimir todos los resultados acumulados eficientemente
        System.out.print(salida.toString());
    }
}