// import java.util.ArrayList;
// import java.util.List;
// import java.util.Comparator;


// public class faseEliminacion {
//     public static void main(String[] args) {
//         // Nombres de equipos en variables String
//         String equipoGanadorA = "Equipo 1";
//         String equipoGanadorB = "Equipo 2";
//         String equipoGanadorC = "Equipo 3";
//         String equipoGanadorD = "Equipo 4";

//         // Convertir los nombres de los equipos a una lista
//         List<String> PartidoOctavos = convertirAEquiposOctavos(equipoGanadorA, equipoGanadorB, equipoGanadorC, equipoGanadorD);

//         // Imprimir la lista de equipos de octavos de final
//         System.out.println("Equipos de Octavos de Final:");
//         for (String equipo : PartidoOctavos) {
//             System.out.println(equipo);
//         }
//     }

//     private static List<String> convertirAEquiposOctavos(String... nombresEquipos) {
//         List<String> equiposOctavos = new ArrayList<>();
        
//         for (String nombreEquipo : nombresEquipos) {
//             equiposOctavos.add(nombreEquipo);
//         }

//         return equiposOctavos;
//     }
//  public void clasificarEquipos() {
//         equipos.sort(Comparator.comparingInt((Equipo equipo) -> equipo.puntos).reversed());
//         clasificados.clear();
//         clasificados.addAll(equipos.subList(0, 8)); // Tomar los 8 primeros equipos clasificados
//     }
//      public void generarPartidosEliminatoria() {
//         List<PartidoOctavos> partidosEliminatoria = new ArrayList<>();

//          // Generar partidos de cuartos de final
//         for (int i = 0; i < clasificados.size(); i += 2) {
//             Equipo equipoLocal = clasificados.get(i);
//             Equipo equipoVisitante = clasificados.get(i + 1);
//             Partido partido = new Partido(equipoLocal, equipoVisitante);
//             partidosEliminatoria.add(partido);
//         }
//          // Generar partidos de semifinales
//         List<Partido> partidosSemifinales = new ArrayList<>();
//         for (int i = 0; i < partidosEliminatoria.size(); i += 2) {
//             Partido partido1 = partidosEliminatoria.get(i);
//             Partido partido2 = partidosEliminatoria.get(i + 1);
//             Equipo ganador1 = determinarGanador(partido1);
//             Equipo ganador2 = determinarGanador(partido2);
            
//             Partido partidoSemifinal1 = new Partido(ganador1, ganador2);
//             Partido partidoSemifinal2 = new Partido(ganador2, ganador1);
//             partidosSemifinales.add(partidoSemifinal1);
//             partidosSemifinales.add(partidoSemifinal2);
//         }
//         // Generar partido final
//         Partido partidoFinal = new Partido(partidosSemifinales.get(0).equipoLocal, partidosSemifinales.get(1).equipoLocal);

// }}


