public class GanadorGrupo {
    SorteoGrupo sorteoGrupo = new SorteoGrupo();
    Equipos equipos = new Equipos();
    Inscripcion inscripcion = new Inscripcion();
        
    public void obtenerEquipoGanador() {
        
        Equipos equipoGanadorA = null;
        int maxPuntosA = Integer.MIN_VALUE;
        int maxGolesA = Integer.MIN_VALUE;
        int minAmarillasA = Integer.MIN_VALUE;
        int minRojasA = Integer.MIN_VALUE;
        Equipos equipoGanadorB = null;
        int maxPuntosB = Integer.MIN_VALUE;
        int maxGolesB = Integer.MIN_VALUE;
        int minAmarillasB = Integer.MIN_VALUE;
        int minRojasB = Integer.MIN_VALUE;
        Equipos equipoGanadorC = null;
        int maxPuntosC = Integer.MIN_VALUE;
        int maxGolesC = Integer.MIN_VALUE;
        int minAmarillasC = Integer.MIN_VALUE;
        int minRojasC = Integer.MIN_VALUE;
        Equipos equipoGanadorD = null;
        int maxPuntosD = Integer.MIN_VALUE;
        int maxGolesD = Integer.MIN_VALUE;
        int minAmarillasD = Integer.MIN_VALUE;
        int minRojasD = Integer.MIN_VALUE;

        if (inscripcion.getEquipos().length == 8){

            for (Equipos equipo : sorteoGrupo.grupoA.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();

                if (puntos > maxPuntosA) {
                    maxPuntosA = puntos;
                    maxGolesA = goles;
                    minAmarillasA = amarillas;
                    minRojasA = rojas;
                    equipoGanadorA = equipo;
                } else if(puntos == maxPuntosA && goles > maxGolesA) {
                    maxGolesA = goles;
                    minAmarillasA = amarillas;
                    minRojasA = rojas;
                    equipoGanadorA = equipo;
                } else if(puntos == maxPuntosA && goles == maxGolesA && amarillas < minAmarillasA) {
                    minAmarillasA = amarillas;
                    minRojasA = rojas;
                    equipoGanadorA = equipo;
                } else if (puntos == maxPuntosA && goles == maxGolesA && amarillas == minAmarillasA && rojas < minRojasA){
                    minRojasA = rojas;
                    equipoGanadorA = equipo;
                }
            }
            sorteoGrupo.grupoA.setEquipoGanador(equipoGanadorA);

            for (Equipos equipo : sorteoGrupo.grupoB.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();
                
                if (puntos > maxPuntosB) {
                    maxPuntosB = puntos;
                    maxGolesB = goles;
                    minAmarillasB = amarillas;
                    minRojasB = rojas;
                    equipoGanadorB = equipo;
                } else if(puntos == maxPuntosB && goles > maxGolesB) {
                    maxGolesB = goles;
                    minAmarillasB = amarillas;
                    minRojasB = rojas;
                    equipoGanadorB = equipo;
                } else if(puntos == maxPuntosB && goles == maxGolesB && amarillas < minAmarillasB) {
                    minAmarillasB = amarillas;
                    minRojasB = rojas;
                    equipoGanadorB = equipo;
                } else if (puntos == maxPuntosB && goles == maxGolesB && amarillas == minAmarillasB && rojas < minRojasB){
                    minRojasB = rojas;
                    equipoGanadorB = equipo;
                }
            }
            
            sorteoGrupo.grupoB.setEquipoGanador(equipoGanadorB);
        } else {

            for (Equipos equipo : sorteoGrupo.grupoA.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();

                if (puntos > maxPuntosA) {
                    maxPuntosA = puntos;
                    maxGolesA = goles;
                    minAmarillasA = amarillas;
                    minRojasA = rojas;
                    equipoGanadorA = equipo;
                } else if(puntos == maxPuntosA && goles > maxGolesA) {
                    maxGolesA = goles;
                    minAmarillasA = amarillas;
                    minRojasA = rojas;
                    equipoGanadorA = equipo;
                } else if(puntos == maxPuntosA && goles == maxGolesA && amarillas < minAmarillasA) {
                    minAmarillasA = amarillas;
                    minRojasA = rojas;
                    equipoGanadorA = equipo;
                } else if (puntos == maxPuntosA && goles == maxGolesA && amarillas == minAmarillasA && rojas < minRojasA){
                    minRojasA = rojas;
                    equipoGanadorA = equipo;
                }
            }
            sorteoGrupo.grupoA.setEquipoGanador(equipoGanadorA);

            for (Equipos equipo : sorteoGrupo.grupoB.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();
                
                if (puntos > maxPuntosB) {
                    maxPuntosB = puntos;
                    maxGolesB = goles;
                    minAmarillasB = amarillas;
                    minRojasB = rojas;
                    equipoGanadorB = equipo;
                } else if(puntos == maxPuntosB && goles > maxGolesB) {
                    maxGolesB = goles;
                    minAmarillasB = amarillas;
                    minRojasB = rojas;
                    equipoGanadorB = equipo;
                } else if(puntos == maxPuntosB && goles == maxGolesB && amarillas < minAmarillasB) {
                    minAmarillasB = amarillas;
                    minRojasB = rojas;
                    equipoGanadorB = equipo;
                } else if (puntos == maxPuntosB && goles == maxGolesB && amarillas == minAmarillasB && rojas < minRojasB){
                    minRojasB = rojas;
                    equipoGanadorB = equipo;
                }
            }
            
            sorteoGrupo.grupoB.setEquipoGanador(equipoGanadorB);
            
            for (Equipos equipo : sorteoGrupo.grupoC.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();
                
                if (puntos > maxPuntosC) {
                    maxPuntosC = puntos;
                    maxGolesC = goles;
                    minAmarillasC = amarillas;
                    minRojasC = rojas;
                    equipoGanadorC = equipo;
                } else if(puntos == maxPuntosC && goles > maxGolesC) {
                    maxGolesC = goles;
                    minAmarillasC = amarillas;
                    minRojasC = rojas;
                    equipoGanadorC = equipo;
                } else if(puntos == maxPuntosC && goles == maxGolesC && amarillas < minAmarillasC) {
                    minAmarillasC = amarillas;
                    minRojasC = rojas;
                    equipoGanadorC = equipo;
                } else if (puntos == maxPuntosC && goles == maxGolesC && amarillas == minAmarillasC && rojas < minRojasC){
                    minRojasC = rojas;
                    equipoGanadorC = equipo;
                }
            }
            
            sorteoGrupo.grupoC.setEquipoGanador(equipoGanadorC);

            for (Equipos equipo : sorteoGrupo.grupoD.getEquipo()) {
                int puntos = equipo.getPuntos();
                int goles = equipo.getGoles();
                int amarillas = equipo.getTarjetasAmarillas();
                int rojas = equipo.getTarjetasRojas();
                
                if (puntos > maxPuntosD) {
                    maxPuntosD = puntos;
                    maxGolesD = goles;
                    minAmarillasD = amarillas;
                    minRojasD = rojas;
                    equipoGanadorD = equipo;
                } else if(puntos == maxPuntosD && goles > maxGolesD) {
                    maxGolesD = goles;
                    minAmarillasD = amarillas;
                    minRojasD = rojas;
                    equipoGanadorD = equipo;
                } else if(puntos == maxPuntosD && goles == maxGolesD && amarillas < minAmarillasD) {
                    minAmarillasD = amarillas;
                    minRojasD = rojas;
                    equipoGanadorD = equipo;
                } else if (puntos == maxPuntosD && goles == maxGolesD && amarillas == minAmarillasD && rojas < minRojasD){
                    minRojasD = rojas;
                    equipoGanadorD = equipo;
                }
            }
            
            sorteoGrupo.grupoD.setEquipoGanador(equipoGanadorD);

        }
    }
}