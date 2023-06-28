public class GanadorGrupo {
     
    public Equipos obtenerEquipoGanador(Grupo grupo) {
        
            Equipos[] equipos = grupo.getEquipo();
            Equipos equipoGanador = null;
            int maxPuntos = Integer.MIN_VALUE;
            
            for (Equipos equipo : equipos) {
                int puntos = equipo.getPuntos();
                
                if (puntos > maxPuntos) {
                    maxPuntos = puntos;
                    equipoGanador = equipo;
                }
            }
            
            return equipoGanador;
        }
}