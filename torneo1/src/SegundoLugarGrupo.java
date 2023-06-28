public class SegundoLugarGrupo {
    SorteoGrupo sorteoGrupo = new SorteoGrupo();
    Equipos equipos = new Equipos();
    Inscripcion inscripcion = new Inscripcion();
        
    public void obtenerSegundoEquipo() {
        
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

        if (inscripcion.getEquipos().length == 8){

            for (Equipos equipo : sorteoGrupo.grupoA.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();

                if (puntos > maxPuntos2A) {
                    maxPuntos2A = puntos;
                    maxGoles2A = goles;
                    minAmarillas2A = amarillas;
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                } else if(puntos == maxPuntos2A && goles > maxGoles2A) {
                    maxGoles2A = goles;
                    minAmarillas2A = amarillas;
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                } else if(puntos == maxPuntos2A && goles == maxGoles2A && amarillas < minAmarillas2A) {
                    minAmarillas2A = amarillas;
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                } else if (puntos == maxPuntos2A && goles == maxGoles2A && amarillas == minAmarillas2A && rojas < minRojas2A){
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                }
            }
            sorteoGrupo.grupoA.setEquipoSegundo(equipoSegundoA);

            for (Equipos equipo : sorteoGrupo.grupoB.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();
                
                if (puntos > maxPuntos2B) {
                    maxPuntos2B = puntos;
                    maxGoles2B = goles;
                    minAmarillas2B = amarillas;
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                } else if(puntos == maxPuntos2B && goles > maxGoles2B) {
                    maxGoles2B = goles;
                    minAmarillas2B = amarillas;
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                } else if(puntos == maxPuntos2B && goles == maxGoles2B && amarillas < minAmarillas2B) {
                    minAmarillas2B = amarillas;
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                } else if (puntos == maxPuntos2B && goles == maxGoles2B && amarillas == minAmarillas2B && rojas < minRojas2B){
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                }
            }
            
            sorteoGrupo.grupoB.setEquipoSegundo(equipoSegundoB);
        } else {

            for (Equipos equipo : sorteoGrupo.grupoA.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();

                if (puntos > maxPuntos2A) {
                    maxPuntos2A = puntos;
                    maxGoles2A = goles;
                    minAmarillas2A = amarillas;
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                } else if(puntos == maxPuntos2A && goles > maxGoles2A) {
                    maxGoles2A = goles;
                    minAmarillas2A = amarillas;
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                } else if(puntos == maxPuntos2A && goles == maxGoles2A && amarillas < minAmarillas2A) {
                    minAmarillas2A = amarillas;
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                } else if (puntos == maxPuntos2A && goles == maxGoles2A && amarillas == minAmarillas2A && rojas < minRojas2A){
                    minRojas2A = rojas;
                    equipoSegundoA = equipo;
                }
            }
            sorteoGrupo.grupoA.setEquipoSegundo(equipoSegundoA);

            for (Equipos equipo : sorteoGrupo.grupoB.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();
                
                if (puntos > maxPuntos2B) {
                    maxPuntos2B = puntos;
                    maxGoles2B = goles;
                    minAmarillas2B = amarillas;
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                } else if(puntos == maxPuntos2B && goles > maxGoles2B) {
                    maxGoles2B = goles;
                    minAmarillas2B = amarillas;
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                } else if(puntos == maxPuntos2B && goles == maxGoles2B && amarillas < minAmarillas2B) {
                    minAmarillas2B = amarillas;
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                } else if (puntos == maxPuntos2B && goles == maxGoles2B && amarillas == minAmarillas2B && rojas < minRojas2B){
                    minRojas2B = rojas;
                    equipoSegundoB = equipo;
                }
            }
            
            sorteoGrupo.grupoB.setEquipoSegundo(equipoSegundoB);
            
            for (Equipos equipo : sorteoGrupo.grupoC.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();
                
                if (puntos > maxPuntos2C) {
                    maxPuntos2C = puntos;
                    maxGoles2C = goles;
                    minAmarillas2C = amarillas;
                    minRojas2C = rojas;
                    equipoSegundoC = equipo;
                } else if(puntos == maxPuntos2C && goles > maxGoles2C) {
                    maxGoles2C = goles;
                    minAmarillas2C = amarillas;
                    minRojas2C = rojas;
                    equipoSegundoC = equipo;
                } else if(puntos == maxPuntos2C && goles == maxGoles2C && amarillas < minAmarillas2C) {
                    minAmarillas2C = amarillas;
                    minRojas2C = rojas;
                    equipoSegundoC = equipo;
                } else if (puntos == maxPuntos2C && goles == maxGoles2C && amarillas == minAmarillas2C && rojas < minRojas2C){
                    minRojas2C = rojas;
                    equipoSegundoC = equipo;
                }
            }
            
            sorteoGrupo.grupoC.setEquipoSegundo(equipoSegundoC);

            for (Equipos equipo : sorteoGrupo.grupoD.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();
                
                if (puntos > maxPuntos2D) {
                    maxPuntos2D = puntos;
                    maxGoles2D = goles;
                    minAmarillas2D = amarillas;
                    minRojas2D = rojas;
                    equipoSegundoD = equipo;
                } else if(puntos == maxPuntos2D && goles > maxGoles2D) {
                    maxGoles2D = goles;
                    minAmarillas2D = amarillas;
                    minRojas2D = rojas;
                    equipoSegundoD = equipo;
                } else if(puntos == maxPuntos2D && goles == maxGoles2D && amarillas < minAmarillas2D) {
                    minAmarillas2D = amarillas;
                    minRojas2D = rojas;
                    equipoSegundoD = equipo;
                } else if (puntos == maxPuntos2D && goles == maxGoles2D && amarillas == minAmarillas2D && rojas < minRojas2D){
                    minRojas2D = rojas;
                    equipoSegundoD = equipo;
                }
            }
            
            sorteoGrupo.grupoD.setEquipoSegundo(equipoSegundoD);

        }
    }
}

