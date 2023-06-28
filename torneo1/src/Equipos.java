import java.util.Scanner;

public class Equipos {
    private byte CantidadJugadores;
    private String Capitan;
    private String Subcapitan;
    private String NombreEquipo;
    private String Comodines;
    private Boolean Eliminado;
    private Boolean Document1;
    private Boolean Document2;
    private Boolean InsJuga = true;
    private int puntos;
    private int goles;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private int partidosGanados;
    private int partidosEmpatados; 
    private int partidosPerdidos;
    final int integrantesMaximos = 14;
    final int integrantesMinimos = 9;
    final int MaxComodines = 2;
    static Scanner sc = new Scanner(System.in);
    Jugadores[] jugadores2;

      public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }
    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

      public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public void setPuntos (int puntos){
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }
    public void setGoles (int goles){
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }
    public void setTarjetasAmarillas (int tarjetasAmarillas){
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }
        public void setTarjetasRojas (int tarjetasRojas){
        this.tarjetasRojas = tarjetasRojas;
    }
    public int getTarjetasRojas() {
        return tarjetasRojas;
    }


    // Setter y Getter para InsJuga

    public void setInsJuga(Boolean InsJuga) {
        this.InsJuga = InsJuga;
    }

    public Boolean getInsJuga() {
        return InsJuga;
    }

    // Setter y Getter para cantidadJugadores
    public void setCantidadJugadores(byte cantidadJugadores) {
        this.CantidadJugadores = cantidadJugadores;
    }

    public byte getCantidadJugadores() {
        return CantidadJugadores;
    }

    // Setter y Getter para capitan
    public void setCapitan(String capitan) {
        this.Capitan = capitan;
    }

    public String getCapitan() {
        return Capitan;
    }

    // Setter y Getter para subcapitan
    public void setSubcapitan(String subcapitan) {
        this.Subcapitan = subcapitan;
    }

    public String getSubcapitan() {
        return Subcapitan;
    }

    // Setter y Getter para nombreEquipo
    public void setNombreEquipo(String nombreEquipo) {
        this.NombreEquipo = nombreEquipo;
    }

    public String getNombreEquipo() {
        return NombreEquipo;
    }

    // Setter y Getter para comodines
    public void setComodines(String comodines) {
        this.Comodines = comodines;
    }

    public String getComodines() {
        return Comodines;
    }

    // Setter y Getter para eliminado
    public void setEliminado(boolean eliminado) {
        this.Eliminado = eliminado;
    }

    public boolean isEliminado() {
        return Eliminado;
    }

    // Setter y Getter para Documen1
    public void setDocument1(Boolean Document1) {
        this.Document1 = Document1;
    }

    public Boolean getDocument1() {
        return Document1;
    }

    // Setter y Getter para Documen2
    public void setDocument2(Boolean Document2) {
        this.Document2 = Document2;
    }

    public Boolean getDocument2() {
        return Document2;
    }

    // Se ingresan los nombres de los jugadores

    public void NombreJugador() {
        for (int i = 0; i < jugadores2.length; i++) {
            jugadores2[i] = new Jugadores();
            boolean gamma = true;
            boolean delta = true;
            while (gamma) {
                System.out.println("Ingrese el nombre del " + (i + 1) + " Jugador: ");
                jugadores2[i].setNombreJugador(sc.nextLine());
                if (jugadores2[i].getNombrejugador().matches("[a-zA-Z ]+")) {
                    gamma = false;
                } else {
                    System.out.println("error : ingrese un nombre valido");
                }
            }
            while(delta){
            System.out.println("Ingrese el DNI de " + jugadores2[i].getNombrejugador() + ": ");
            try {
                jugadores2[i].setDNI(sc.nextInt());
                sc.nextLine();
                delta = false;
            } catch (Exception e) {
                System.out.println("Error: Debes ingresar un número válido.");
                sc.nextLine();
            }
        }
            System.out.println("Ingrese la posicion del jugador: ");
            jugadores2[i].setPocision(sc.nextLine());

        }

    }

    // Imprime los nombres de los jugadores
    public void Decirnombre() {
        for (int i = 0; i < jugadores2.length; i++) {

            System.out.println("El nombre del jugador es: " + jugadores2[i].getNombrejugador());
        }

    }

}