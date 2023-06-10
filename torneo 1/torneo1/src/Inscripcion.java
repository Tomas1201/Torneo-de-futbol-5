import java.util.Scanner;

public class Inscripcion {

    static Scanner sc = new Scanner(System.in);
    static Equipos qui1 = new Equipos();
    static Jugadores juga = new Jugadores();

    static void datosPepe(){
        
        for(int i=0; i<16; i++){//datos de equipo
            
        System.out.println("Ingresar el nombre de su equipo:");  
            qui1.NombreEquipos[i] = sc.nextLine();

        System.out.println("Ingresar el nombre de su capitan:");  
            qui1.Capitan[i] = sc.nextLine();

        System.out.println("Ingresar el nombre de su subcapitan:");  
            qui1.Subcapitan[i] = sc.nextLine();
        
        System.out.println("Ingresar la cantidad de jugadores:");  
            qui1.integrantes[i] = sc.nextInt();
        }


    }
    static void cajaPepe(){//datos de los jugadores

        for(int j=0; j<17;j++){
            for(int i=0; i<j; i++){

            System.out.println("Ingresar el nombre del "+i+"° jugador: ");  
                juga.NombreJugadores[j][i] = sc.nextLine();
            System.out.println("ingrese el numero de DNI del Jugador: ");
                juga.numeroDni[j][i] = sc.nextLong();
                //esta parte va dentro de un IF
            System.out.println("¿El jugador cuenta con fotocopia de obra social?");
                juga.Obrasocial[j][i] = sc.nextBoolean();
            System.out.println("¿El jugador cuenta con Apto medico firmado por un medico avilitado?");
                juga.Aptomedica[j][i] = sc.nextBoolean();
                //hasta aca el IF
                //estructura de decision para los casos
                System.out.println("Condicion del jugador(en juego-1),(en banca-2),(No sitado-3)");
                //si juego entonces
                System.out.println("Ingrese la posicion del jugador: ");
                //menu para eleguir la posicion
                juga.posicion[j][i] = sc.nextLine();//aca el valor seria dependiendo del menu

            }  
        }
    }
    
}


