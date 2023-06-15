import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Inscripcion {
 private List<Equipos> equipos = new ArrayList<>();
private byte CantidadEquipos;
 static byte decision = -1;
    static Scanner sc = new Scanner(System.in);
    static Equipos equi1 = new Equipos();
    static Jugadores juga = new Jugadores();
    
public List<Equipos> getEquipos(){
    return equipos;
}
public void InscripEquipo(){
    System.out.println("Indique la cantidad de equipos a ingresar: ");
    CantidadEquipos = sc.nextByte();
    sc.nextLine();

    for(int pepe = 1;pepe <= CantidadEquipos;pepe++){
        Equipos Equipo = new Equipos();
        //System.out.println("El equipo que esta por ingresar cuenta con ");
        System.out.println("Ingrese el nombre del "+(pepe+1)+" Equipo: ");
            Equipo.setNombreEquipo(sc.nextLine());
        System.out.println("Ingrese el nombre de del capitan: ");
            Equipo.setCapitan(sc.nextLine());    
        System.out.println("Ingrese el nombre del Subcapitan:");
            Equipo.setSubcapitan(sc.nextLine());   

             while(Equipo.getInsJuga()){
                System.out.println("Ingrese la cantidad de jugadores: ");
                        Equipo.setCantidadJugadores(sc.nextInt()); 
                         sc.nextLine();

                if(Equipo.getCantidadJugadores()<= 14 && Equipo.getCantidadJugadores()>= 9){

                    System.out.println("Todos los los jugadores del equipo cuenta con Obra social?");
                    Equipo.setDocument1(sc.nextBoolean());
                         if(Equipo.getDocument1()){
                           
                        System.out.println("El "+(pepe+1)+ " se registro exitosamente");   
                                            
                                Equipo.setInsJuga(false);
                    sc.nextLine();        
                            }

                 else{
                    System.out.println("Lo sentimos pero todos los jugadores deben de contar con Obra social");
                 }
                System.out.println("Todos los Jugadores Cuentan con Apto Medico acreditado por un medico?");
                     Equipo.setDocument2(sc.nextBoolean());
                        sc.nextLine();
                        if(Equipo.getDocument2()){
                                Equipo.NombreJugador();
                              Equipo.Decirnombre();
                        }
                        else{
                            System.out.println("Lo sentimos pero todos los jugadores deben de contar con Apto medico");
                        }
                            

                        
                  }
                    
                 else if(Equipo.getCantidadJugadores() < 9){
                System.out.println("Su equipo no cumple con la cantidad de jugadores minimo");
                 }
                 else{
               
                System.out.println("Su equipo exede la cantidad de jugadores permitido");
                System.out.println("Decea realizar alguna de las siguiente operaciones?");
                System.out.println("Descartar inscripcion(1), Reinscribir Jugadores(2), Salir(0)");
                switch(decision){
                    case 1:
                    pepe--;
                    Equipo.setInsJuga(false);
                    break;
                    case 2:
                    break;
                    case 0:
                    Equipo.setInsJuga(false);
                    break;
                }
            }}

    



    
 }

}
}