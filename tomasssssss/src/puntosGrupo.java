import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class Equipo {
    String nombre;
    int partidosGanados;
    int partidosEmpatados;
    int partidosPerdidos;
    int puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }
}

class TorneoFutbol {
    List<Equipo> equipos;

    public TorneoFutbol() {
        equipos = new ArrayList<>();
    }

    public void agregarEquipo(String nombreEquipo) {
        equipos.add(new Equipo(nombreEquipo));
    }

    public void generarPartidos() {
        Random random = new Random();

        // Generar partidos de la fase de grupos (ida y vuelta)
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                Equipo equipo1 = equipos.get(i);
                Equipo equipo2 = equipos.get(j);

                // Partido de ida
                int resultadoIda = random.nextInt(3); // 0: empate, 1: equipo1 gana, 2: equipo2 gana
                registrarResultado(resultadoIda, equipo1, equipo2);

                // Partido de vuelta
                int resultadoVuelta = random.nextInt(3);
                registrarResultado(resultadoVuelta, equipo2, equipo1);
            }
        }
    }

    private void registrarResultado(int resultado, Equipo equipoLocal, Equipo equipoVisitante) {
        if (resultado == 0) {
            equipoLocal.partidosEmpatados++;
            equipoVisitante.partidosEmpatados++;
            equipoLocal.puntos++;
            equipoVisitante.puntos++;
        } else if (resultado == 1) {
            equipoLocal.partidosGanados++;
            equipoVisitante.partidosPerdidos++;
            equipoLocal.puntos += 3;
        } else {
            equipoLocal.partidosPerdidos++;
            equipoVisitante.partidosGanados++;
            equipoVisitante.puntos += 3;
        }
    }

    public void calcularResultadosFinales() {
        equipos.sort(Comparator.comparingInt((Equipo equipo) -> equipo.puntos).reversed());
    }

    public void mostrarResultadosFinales() {
        System.out.println("Resultados Finales del Torneo:");
        System.out.println("=============================");

        for (int i = 0; i < equipos.size(); i++) {
            Equipo equipo = equipos.get(i);
            System.out.println((i + 1) + ". " + equipo.nombre + " - Puntos: " + equipo.puntos);
        }
    }
}

public class puntosGrupo {
    public static void main(String[] args) {
        TorneoFutbol torneo = new TorneoFutbol();

        // Agregar equipos al torneo
        torneo.agregarEquipo("Equipo A");
        torneo.agregarEquipo("Equipo B");
        torneo.agregarEquipo("Equipo C");
        torneo.agregarEquipo("Equipo D");

        // Generar partidos y calcular resultados
        torneo.generarPartidos();
        torneo.calcularResultadosFinales();

        // Mostrar resultados
        torneo.mostrarResultadosFinales();
    }
}
