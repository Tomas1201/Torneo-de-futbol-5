import java.util.Random;

public class PartidoGrupos {
    SorteoGrupo sorteoGrupo = new SorteoGrupo();
    SorteoPartidos sorteoPartidos = new SorteoPartidos();
    Equipos equipos = new Equipos();
    Grupo grupo = new Grupo();
        public static void main(String[] args) {
            // Definir la cantidad de equipos y la cantidad de partidos a jugar en cada etapa del torneo
            int cantidadEquipos = 8;
            int cantidadPartidos = cantidadEquipos / 2;

            // Generar los resultados de los partidos
            for (int i = 0; i < cantidadPartidos; i++) {
                int equipoLocal = i;
                int equipoVisitante = cantidadEquipos - i - 1;

                int golesLocal = generarNumeroAleatorio(0, 10); // Generar un número aleatorio de goles para el equipo local
                int golesVisitante = generarNumeroAleatorio(0, 10); // Generar un número aleatorio de goles para el equipo visitante

                int faltasLocal = generarNumeroAleatorio(0, 20); // Generar un número aleatorio de faltas para el equipo local
                int faltasVisitante = generarNumeroAleatorio(0, 20); // Generar un número aleatorio de faltas para el equipo visitante

                // Determinar al ganador del partido
                String ganador;
                if (golesLocal > golesVisitante) {
                    ganador = "Equipo Local";
                } else if (golesLocal < golesVisitante) {
                    ganador = "Equipo Visitante";
                } else {
                    ganador = "Empate";
                }

                // Imprimir los resultados del partido
                System.out.println("Partido " + (i + 1) + ":");
                System.out.println("Equipo Local: " + equipoLocal + ", Goles: " + golesLocal + ", Faltas: " + faltasLocal);
                System.out.println("Equipo Visitante: " + equipoVisitante + ", Goles: " + golesVisitante + ", Faltas: " + faltasVisitante);
                System.out.println("Ganador: " + ganador);
                System.out.println();
            }
        }

        // Generar un número aleatorio en un rango dado
        public static int generarNumeroAleatorio(int min, int max) {
            Random random = new Random();
            return random.nextInt(max - min + 1) + min;
        }
    }