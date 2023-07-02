 public class SegundoLugarGrupo {
   public static void obtenerSegundoEquipo() {
        
        Equipos equipoSegundoA = null;
        int maxPuntos2A = Integer.MIN_VALUE;
        int maxGoles2A = Integer.MIN_VALUE;
        int minAmarillas2A = Integer.MIN_VALUE;
        int minRojas2A = Integer.MIN_VALUE;
        Equipos equipoSegundoB = null;
        int maxPuntos2B = Integer.MIN_VALUE;
        int maxGoles2B = Integer.MIN_VALUE;
        int minAmarillas2B = Integer.MIN_VALUE;
        int minRojas2B = Integer.MIN_VALUE;
        Equipos equipoSegundoC = null;
        int maxPuntos2C = Integer.MIN_VALUE;
        int maxGoles2C = Integer.MIN_VALUE;
        int minAmarillas2C = Integer.MIN_VALUE;
        int minRojas2C = Integer.MIN_VALUE;
        Equipos equipoSegundoD = null;
        int maxPuntos2D = Integer.MIN_VALUE;
        int maxGoles2D = Integer.MIN_VALUE;
        int minAmarillas2D = Integer.MIN_VALUE;
        int minRojas2D = Integer.MIN_VALUE;

        if (Inscripcion.getEquipos2().length == 8){

            for (Equipos equipo : SorteoGrupo.grupoA.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();

                if (puntos > maxPuntos2A && equipo != SorteoGrupo.grupoA.getEquipoGanador()) {
                    maxPuntos2A = puntos;
                    maxGoles2A = goles;
                    minAmarillas2A = amarillas;
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                } else if(puntos == maxPuntos2A && goles > maxGoles2A && equipo != SorteoGrupo.grupoA.getEquipoGanador()) {
                    maxGoles2A = goles;
                    minAmarillas2A = amarillas;
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                } else if(puntos == maxPuntos2A && goles == maxGoles2A && amarillas < minAmarillas2A && equipo != SorteoGrupo.grupoA.getEquipoGanador()) {
                    minAmarillas2A = amarillas;
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                } else if (puntos == maxPuntos2A && goles == maxGoles2A && amarillas == minAmarillas2A && rojas < minRojas2A && equipo != SorteoGrupo.grupoA.getEquipoGanador()){
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                }
            }
            SorteoGrupo.grupoA.setEquipoSegundo(equipoSegundoA);

            for (Equipos equipo : SorteoGrupo.grupoB.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();
                
                if (puntos > maxPuntos2B && equipo != SorteoGrupo.grupoB.getEquipoGanador()) {
                    maxPuntos2B = puntos;
                    maxGoles2B = goles;
                    minAmarillas2B = amarillas;
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                } else if(puntos == maxPuntos2B && goles > maxGoles2B && equipo != SorteoGrupo.grupoB.getEquipoGanador()) {
                    maxGoles2B = goles;
                    minAmarillas2B = amarillas;
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                } else if(puntos == maxPuntos2B && goles == maxGoles2B && amarillas < minAmarillas2B && equipo != SorteoGrupo.grupoB.getEquipoGanador()) {
                    minAmarillas2B = amarillas;
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                } else if (puntos == maxPuntos2B && goles == maxGoles2B && amarillas == minAmarillas2B && rojas < minRojas2B && equipo != SorteoGrupo.grupoB.getEquipoGanador()){
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                }
            }
            
            SorteoGrupo.grupoB.setEquipoSegundo(equipoSegundoB);
        } else {

            for (Equipos equipo : SorteoGrupo.grupoA.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();

                if (puntos > maxPuntos2A && equipo != SorteoGrupo.grupoA.getEquipoGanador()) {
                    maxPuntos2A = puntos;
                    maxGoles2A = goles;
                    minAmarillas2A = amarillas;
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                } else if(puntos == maxPuntos2A && goles > maxGoles2A && equipo != SorteoGrupo.grupoA.getEquipoGanador()) {
                    maxGoles2A = goles;
                    minAmarillas2A = amarillas;
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                } else if(puntos == maxPuntos2A && goles == maxGoles2A && amarillas < minAmarillas2A && equipo != SorteoGrupo.grupoA.getEquipoGanador()) {
                    minAmarillas2A = amarillas;
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                } else if (puntos == maxPuntos2A && goles == maxGoles2A && amarillas == minAmarillas2A && rojas < minRojas2A && equipo != SorteoGrupo.grupoA.getEquipoGanador()){
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                }
            }
            SorteoGrupo.grupoA.setEquipoSegundo(equipoSegundoA);

            for (Equipos equipo : SorteoGrupo.grupoB.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();
                
                if (puntos > maxPuntos2B && equipo != SorteoGrupo.grupoB.getEquipoGanador()) {
                    maxPuntos2B = puntos;
                    maxGoles2B = goles;
                    minAmarillas2B = amarillas;
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                } else if(puntos == maxPuntos2B && goles > maxGoles2B && equipo != SorteoGrupo.grupoB.getEquipoGanador()) {
                    maxGoles2B = goles;
                    minAmarillas2B = amarillas;
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                } else if(puntos == maxPuntos2B && goles == maxGoles2B && amarillas < minAmarillas2B && equipo != SorteoGrupo.grupoB.getEquipoGanador()) {
                    minAmarillas2B = amarillas;
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                } else if (puntos == maxPuntos2B && goles == maxGoles2B && amarillas == minAmarillas2B && rojas < minRojas2B && equipo != SorteoGrupo.grupoB.getEquipoGanador()){
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                }
            }
            
            SorteoGrupo.grupoB.setEquipoSegundo(equipoSegundoB);
            
            for (Equipos equipo : SorteoGrupo.grupoC.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();
                
                if (puntos > maxPuntos2C && equipo != SorteoGrupo.grupoC.getEquipoGanador()) {
                    maxPuntos2C = puntos;
                    maxGoles2C = goles;
                    minAmarillas2C = amarillas;
                    minRojas2C = rojas;
                    equipoSegundoC = equipo;
                } else if(puntos == maxPuntos2C && goles > maxGoles2C && equipo != SorteoGrupo.grupoC.getEquipoGanador()) {
                    maxGoles2C = goles;
                    minAmarillas2C = amarillas;
                    minRojas2C = rojas;
                    equipoSegundoC = equipo;
                } else if(puntos == maxPuntos2C && goles == maxGoles2C && amarillas < minAmarillas2C && equipo != SorteoGrupo.grupoC.getEquipoGanador()) {
                    minAmarillas2C = amarillas;
                    minRojas2C = rojas;
                    equipoSegundoC = equipo;
                } else if (puntos == maxPuntos2C && goles == maxGoles2C && amarillas == minAmarillas2C && rojas < minRojas2C && equipo != SorteoGrupo.grupoC.getEquipoGanador()){
                    minRojas2C = rojas;
                    equipoSegundoC = equipo;
                }
            }
            
            SorteoGrupo.grupoC.setEquipoSegundo(equipoSegundoC);

            for (Equipos equipo : SorteoGrupo.grupoD.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();
                
                if (puntos > maxPuntos2D && equipo != SorteoGrupo.grupoD.getEquipoGanador()) {
                    maxPuntos2D = puntos;
                    maxGoles2D = goles;
                    minAmarillas2D = amarillas;
                    minRojas2D = rojas;
                    equipoSegundoD = equipo;
                } else if(puntos == maxPuntos2D && goles > maxGoles2D && equipo != SorteoGrupo.grupoD.getEquipoGanador()) {
                    maxGoles2D = goles;
                    minAmarillas2D = amarillas;
                    minRojas2D = rojas;
                    equipoSegundoD = equipo;
                } else if(puntos == maxPuntos2D && goles == maxGoles2D && amarillas < minAmarillas2D && equipo != SorteoGrupo.grupoD.getEquipoGanador()) {
                    minAmarillas2D = amarillas;
                    minRojas2D = rojas;
                    equipoSegundoD = equipo;
                } else if (puntos == maxPuntos2D && goles == maxGoles2D && amarillas == minAmarillas2D && rojas < minRojas2D && equipo != SorteoGrupo.grupoD.getEquipoGanador()){
                    minRojas2D = rojas;
                    equipoSegundoD = equipo;
                }
            }
            
            SorteoGrupo.grupoD.setEquipoSegundo(equipoSegundoD);

        }
    }
}

