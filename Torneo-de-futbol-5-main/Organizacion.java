import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TorneoFutbol {
    public static void main(String[] args) {
        int cantidadEquipos = 8;
        int cantidadGrupos = 2;
        int equiposPorGrupo = cantidadEquipos / cantidadGrupos;
        List<List<String>> grupos = generarGrupos(cantidadGrupos, equiposPorGrupo);
 
    // Generar los grupos con los equipos
    public static List<List<String>> generarGrupos(int cantidadGrupos, int equiposPorGrupo) {
        List<List<String>> grupos = new ArrayList<>();
        List<String> equipos = obtenerEquipos();
        Random random = new Random();

        // Mezclar los equipos aleatoriamente
        for (int i = equipos.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = equipos.get(i);
            equipos.set(i, equipos.get(j));
            equipos.set(j, temp);
        }

        // Distribuir los equipos en los grupos
        int index = 0;
        for (int i = 0; i < cantidadGrupos; i++) {
            List<String> grupo = new ArrayList<>();
            for (int j = 0; j < equiposPorGrupo; j++) {
                grupo.add(equipos.get(index));
                index++;
            }
            grupos.add(grupo);
        }

        return grupos;
    }

    // Obtener una lista de equipos
    public static List<String> obtenerEquipos() {
        List<String> equipos = new ArrayList<>();
        equipos.add("Equipo 1");
        equipos.add("Equipo 2");
        equipos.add("Equipo 3");
        equipos.add("Equipo 4");
        equipos.add("Equipo 5");
        equipos.add("Equipo 6");
        equipos.add("Equipo 7");
        equipos.add("Equipo 8");
        return equipos;
    }
        // Etapa de grupos
        System.out.println("Etapa de Grupos:");
        for (int i = 0; i < cantidadPartidos; i++) {
            // Generar resultados de los partidos y determinar ganadores
            // hay q llamar a la clase simulacion para "jugar" los partidos

            System.out.println("Partido " + (i + 1) + ":");
            // Imprimir resultados...
            System.out.println();
        }

        // Etapa de eliminación directa (cuartos de final)
        System.out.println("Cuartos de Final:");
        for (int i = 0; i < cantidadPartidos / 2; i++) {
            // Generar resultados de los partidos y determinar ganadores
            // hay q llamar a la clase simulacion para "jugar" los partidos

            System.out.println("Partido " + (i + 1) + ":");
            // Imprimir resultados...
            System.out.println();
        }

        // Etapa de eliminación directa (semifinales)
        System.out.println("Semifinales:");
        // hay q llamar a la clase simulacion para "jugar" los partidos

        // Etapa de eliminación directa (final)
        System.out.println("Final:");
        // hay q llamar a la clase simulacion para "jugar" los partidos

        // Imprimir ganador del torneo
        System.out.println("¡El ganador del torneo es: [Nombre del Equipo]!");

    }

    // Generar un número aleatorio en un rango dado
    public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
