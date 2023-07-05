public class GanadorGrupo {

    public static void obtenerEquipoGanador() throws Exception{

     
    SorteoGrupo sorteoGrupo = new SorteoGrupo();
    Equipos equipos = new Equipos();
    Inscripcion inscripcion = new Inscripcion();
        
    

        
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


        if (Inscripcion.getEquipos2().length == 8){

            for (Equipos equipo : SorteoGrupo.grupoA.getEquipo()) {

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

            SorteoGrupo.grupoA.setEquipoGanador(equipoGanadorA);
            System.out.println("El ganador del grupo A es " + equipoGanadorA.getNombreEquipo() + ", con " + equipoGanadorA.getPuntos() + " puntos, " + equipoGanadorA.getGoles() + " goles, " + equipoGanadorA.getTarjetasAmarillas() + " tarjetas amarillas y " + equipoGanadorA.getTarjetasRojas() + " tarjetas rojas!");
             Thread.sleep(1000);
            for (Equipos equipo : SorteoGrupo.grupoB.getEquipo()) {

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

            SorteoGrupo.grupoB.setEquipoGanador(equipoGanadorB);
            System.out.println("El ganador del grupo B es " + equipoGanadorB.getNombreEquipo() + ", con " + equipoGanadorB.getPuntos() + " puntos, " + equipoGanadorB.getGoles() + " goles, " + equipoGanadorB.getTarjetasAmarillas() + " tarjetas amarillas y " + equipoGanadorB.getTarjetasRojas() + " tarjetas rojas!");
             Thread.sleep(1000);
        } else {

            for (Equipos equipo : SorteoGrupo.grupoA.getEquipo()) {

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

            SorteoGrupo.grupoA.setEquipoGanador(equipoGanadorA);
            System.out.println("El ganador del grupo A es " + equipoGanadorA.getNombreEquipo() + ", con " + equipoGanadorA.getPuntos() + " puntos, " + equipoGanadorA.getGoles() + " goles, " + equipoGanadorA.getTarjetasAmarillas() + " tarjetas amarillas y " + equipoGanadorA.getTarjetasRojas() + " tarjetas rojas!");
             Thread.sleep(1000);
            for (Equipos equipo : SorteoGrupo.grupoB.getEquipo()) {

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
            

            SorteoGrupo.grupoB.setEquipoGanador(equipoGanadorB);
            System.out.println("El ganador del grupo B es " + equipoGanadorB.getNombreEquipo() + ", con " + equipoGanadorB.getPuntos() + " puntos, " + equipoGanadorB.getGoles() + " goles, " + equipoGanadorB.getTarjetasAmarillas() + " tarjetas amarillas y " + equipoGanadorB.getTarjetasRojas() + " tarjetas rojas!");
             Thread.sleep(1000);
            for (Equipos equipo : SorteoGrupo.grupoC.getEquipo()) {

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
            

            SorteoGrupo.grupoC.setEquipoGanador(equipoGanadorC);
            System.out.println("El ganador del grupo C es " + equipoGanadorC.getNombreEquipo() + ", con " + equipoGanadorC.getPuntos() + " puntos, " + equipoGanadorC.getGoles() + " goles, " + equipoGanadorC.getTarjetasAmarillas() + " tarjetas amarillas y " + equipoGanadorC.getTarjetasRojas() + " tarjetas rojas!");
             Thread.sleep(1000);
            for (Equipos equipo : SorteoGrupo.grupoD.getEquipo()) {

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
            

            SorteoGrupo.grupoD.setEquipoGanador(equipoGanadorD);
            System.out.println("El ganador del grupo D es " + equipoGanadorD.getNombreEquipo() + ", con " + equipoGanadorD.getPuntos() + " puntos, " + equipoGanadorD.getGoles() + " goles, " + equipoGanadorD.getTarjetasAmarillas() + " tarjetas amarillas y " + equipoGanadorD.getTarjetasRojas() + " tarjetas rojas!");

             Thread.sleep(1000);
        }
    }
}