public class Grupo {
    private Equipos[] equipo;
    private String nombreGrupo;
    private Equipos equipoGanador;
    private Equipos equipoSegundo;

    public void setEquipo(Equipos[] equipo) {
        this.equipo = equipo;
    }
    public Equipos[] getEquipo(){
        return equipo;
    }
    public void setNombreGrupo (String nombre){
        this.nombreGrupo = nombre;
    }
    public String getNombreGrupo(){
        return nombreGrupo;
    }
        public Equipos getEquipoGanador() {
        return equipoGanador;
    }
    public void setEquipoGanador(Equipos equipoGanador) {
        this.equipoGanador = equipoGanador;
    }
        public Equipos getEquipoSegundo() {
        return equipoSegundo;
    }
    public void setEquipoSegundo(Equipos equipoSegundo) {
        this.equipoSegundo = equipoSegundo;
    }
}
