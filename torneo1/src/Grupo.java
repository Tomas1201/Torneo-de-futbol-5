public class Grupo {
    Equipos equipos = new Equipos();
    private Equipos[] equipo;
    private String nombreGrupo;
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
}
