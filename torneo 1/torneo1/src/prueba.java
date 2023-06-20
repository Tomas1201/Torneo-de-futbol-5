import java.util.Scanner;
public class prueba {
    static int numero;
    static int pepe;
   static Scanner sc = new Scanner(System.in);
   static Inscripcion ins = new Inscripcion();
   int cantidadEquipos = 14;
   static Equipos[] Equipo = new Equipos[14];


   public void prueba1(){
   for(int i = 0; i < cantidadEquipos;i++){
    Equipo[i] = new Equipos();
     System.out.println("Ingrese el nombre del "+(pepe+1)+" Equipo: ");
            Equipo[i].setNombreEquipo(sc.nextLine());
        System.out.println("Ingrese el nombre de del capitan: ");
            Equipo[i].setCapitan(sc.nextLine());    
        System.out.println("Ingrese el nombre del Subcapitan:");
            Equipo[i].setSubcapitan(sc.nextLine());   

             while(Equipo[i].getInsJuga()){
                System.out.println("Ingrese la cantidad de jugadores: ");
                        Equipo[i].setCantidadJugadores(sc.nextInt()); 
                         sc.nextLine();

                if(Equipo[i].getCantidadJugadores()<= 14 && Equipo[i].getCantidadJugadores()>= 9){

                    System.out.println("Todos los los jugadores del equipo cuenta con Obra social?");
                    Equipo[i].setDocument1(sc.nextBoolean());
                         if(Equipo[i].getDocument1()){
                           
                        System.out.println("El "+(pepe+1)+ " se registro exitosamente");   
                                            
                                Equipo[i].setInsJuga(false);
                    sc.nextLine();        
                            }

                 else{
                    System.out.println("Lo sentimos pero todos los jugadores deben de contar con Obra social");
                 }
                System.out.println("Todos los Jugadores Cuentan con Apto Medico acreditado por un medico?");
                     Equipo[i].setDocument2(sc.nextBoolean());
                        sc.nextLine();
                        if(Equipo[i].getDocument2()){
                                Equipo[i].NombreJugador();
                              Equipo[i].Decirnombre();
                        }
                        else{
                            System.out.println("Lo sentimos pero todos los jugadores deben de contar con Apto medico");
                        }
                            

                        
                  }
                    
                 else if(Equipo[i].getCantidadJugadores() < 9){
                System.out.println("Su equipo no cumple con la cantidad de jugadores minimo");
                 }
                 else{
               
                System.out.println("Su equipo exede la cantidad de jugadores permitido");
                System.out.println("Decea realizar alguna de las siguiente operaciones?");
                System.out.println("Descartar inscripcion(1), Reinscribir Jugadores(2), Salir(0)");
                switch(decision){
                    case 1:
                    pepe--;
                    Equipo[i].setInsJuga(false);
                    break;
                    case 2:
                    break;
                    case 0:
                    Equipo[i].setInsJuga(false);
                    break;
                }
            }}
   }}
}