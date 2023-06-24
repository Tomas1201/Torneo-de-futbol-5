public class Jugadores {
    private int DNI;
    private Boolean Obrasocial;
    private Boolean Aptomedica;
    private String Posicion;
    private String NombreJugador;
    private String CondiciondeJugador; // si el jugador juega, esta en banca o no es sitado

    // metodo constructor
    public Jugadores() {

    }

    // setters
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setPocision(String Posicion) {
        this.Posicion = Posicion;
    }

    public void setAptomedico(Boolean AptoMedico) {
        this.Aptomedica = AptoMedico;
    }

    public void setNombreJugador(String NombreJugador) {
        this.NombreJugador = NombreJugador;
    }

    public void setObrasocial(Boolean Obrasocial) {
        this.Obrasocial = Obrasocial;
    }

    public void setCondicionJugador(String Condicion) {
        this.CondiciondeJugador = Condicion;
    }

    // getters
    public String getNombrejugador() {
        return NombreJugador;
    }

    public int DNI() {
        return DNI;
    }

    public Boolean Obrasocial() {
        return Obrasocial;
    }

    public Boolean Aptomedico() {
        return Aptomedica;
    }

    public String Posicion() {
        return Posicion;
    }

    public String CondicionJugador() {
        return CondiciondeJugador;
    }

    public void VeriApto() {

    }

}
