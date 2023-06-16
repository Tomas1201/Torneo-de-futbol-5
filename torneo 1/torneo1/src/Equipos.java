import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Equipos {
      private int CantidadJugadores;
      private String Capitan;
      private String Subcapitan;
      private String NombreEquipo;
      private String Comodines;
      private Boolean Eliminado;
      private Boolean Document1;
      private Boolean Document2;
      private Boolean InsJuga = true;
     final int integrantesMaximos = 14;
     final int integrantesMinimos = 9;
     final int MaxComodines = 2;
          

     //static Jugadores Juga = new Jugadores();
     static Scanner sc = new Scanner(System.in);
     private List<Jugadores> Jugadores = new ArrayList<>();
    

    //
    public List<Jugadores> getLista(){
        return Jugadores;
    }
    //Setter y Getter para InsJuga
        public void setInsJuga(Boolean InsJuga){
            this.InsJuga = InsJuga;
        }

        public Boolean getInsJuga(){
            return InsJuga;
        }

    // Setter y Getter para cantidadJugadores
    public void setCantidadJugadores(int cantidadJugadores) {
        this.CantidadJugadores = cantidadJugadores;
    }

    public int getCantidadJugadores() {
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

    //Setter y Getter para Documen1
    public void setDocument1(Boolean Document1){
        this.Document1 = Document1;
    }

    public Boolean getDocument1(){
        return Document1;
    }

    //Setter y Getter para Documen2
    public void setDocument2(Boolean Document2){
        this.Document2 = Document2;
    }

    public Boolean getDocument2(){
        return Document2;
    }

//Se ingresan los nombres de los jugadores
    public void NombreJugador(){
for(int i =0;i < CantidadJugadores;i++){

Jugadores jugadores = new Jugadores();

System.out.println("Ingrese el nombre del "+(i+1)+" Jugador: ");
jugadores.setNombreJugador(sc.nextLine()); 
System.out.println("Ingrese el DNI de "+jugadores.getNombrejugador()+": " );
        jugadores.setDNI(sc.nextInt());
        sc.nextLine();
System.out.println("Ingrese la posicion del jugador: ");
        jugadores.setPocision(sc.nextLine());

  Jugadores.add(jugadores);
    }

 }
//Imprime los nombres de los jugadores
public void Decirnombre(){
    for(int i = 0; i < CantidadJugadores;i++){
Jugadores jugadores = Jugadores.get(i);
System.out.println("El nombre del jugador es: "+jugadores.getNombrejugador());
    }

}

}