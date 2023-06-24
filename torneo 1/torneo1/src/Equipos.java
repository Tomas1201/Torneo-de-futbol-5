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
     final int integrantesMaximos = 14;
     final int integrantesMinimos = 9;
     final int MaxComodines = 2;
          

     //static Jugadores Juga = new Jugadores();
     static Scanner sc = new Scanner(System.in);
     
    Jugadores[] jugadores2 = new Jugadores[CantidadJugadores];


    //Setter y Getter para InsJuga
        public void setInsJuga(Boolean InsJuga){
            this.InsJuga = InsJuga;
        }

        public Boolean getInsJuga(){
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
jugadores2[i] = new Jugadores();
System.out.println("Ingrese el nombre del "+(i+1)+" Jugador: ");
jugadores2[i].setNombreJugador(sc.nextLine()); 
System.out.println("Ingrese el DNI de "+jugadores2[i].getNombrejugador()+": " );
        jugadores2[i].setDNI(sc.nextInt());
        sc.nextLine();
System.out.println("Ingrese la posicion del jugador: ");
        jugadores2[i].setPocision(sc.nextLine());

    }

 }
//Imprime los nombres de los jugadores
public void Decirnombre(){
    for(int i = 0; i < jugadores2.length;i++){

System.out.println("El nombre del jugador es: "+jugadores2[i].getNombrejugador());
    }

}

}