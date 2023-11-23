public class Grupo {


    private Equipos[] equipo;
    private String nombreGrupo;
    private Equipos equipoGanador;
    private Equipos equipoSegundo;

    private Equipos equipoTercero;
    private Equipos equipoCuarto;


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


    public Equipos getEquipoTercero() {
        return equipoTercero;
    }

    public void setEquipoTercero(Equipos equipoTercero) {
        this.equipoTercero = equipoTercero;
    }

    public Equipos getEquipoCuarto() {
        return equipoCuarto;
    }

    public void setEquipoCuarto(Equipos equipoCuarto) {
        this.equipoCuarto = equipoCuarto;
    }

}
