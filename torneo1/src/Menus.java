import java.util.Scanner;

public class Menus {
        Scanner sc = new Scanner(System.in);
        Jugadores juga = new Jugadores();


    public void cartelera() throws Exception{
        System.out.println();
        System.out.println("                                                                       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                                                                       ~      Bienvenidos al torneo del multiverso!!      ~");
        System.out.println("                                                                       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println();
        //  System.out.println("                  ╔═════════════════════╦════════════════╦═════════════════════════════╦═════════════════════╦═══════════════════════════╦══════════════╦═══════════════════════════╦══════════╗");
        // System.out.println("                   ║ Inscribir equipo(1) ║ Ver Fixture(2) ║ Ver Planillas de equipos(3) ║ Inicio de torneo(4) ║ Resultados de partidos(5) ║ Apuestas?(6) ║ Informacion del torneo(7) ║ Salir(0) ║");
        // System.out.println("                   ╚═════════════════════╩════════════════╩═════════════════════════════╩═════════════════════╩═══════════════════════════╩══════════════╩═══════════════════════════╩══════════╝");
    }


    public void Menu_principal() throws Exception{
        System.out.println();
        // String texto = "Inscribir equipo(1) | Ver Fixture(2) | Ver Planillas de equipos(3) | Inicio de torneo(4) \n| Resultados de partidos(5) | Apuestas?(6) | Informacion del torneo(7) | Salir(0)";
       String texto = "      \u2554\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2557\n      \u2551 Inscribir equipo(1) \u2551 Ver Fixture(2) \u2551 Ver Planillas de equipos(3) \u2551 Inicio de torneo(4) \u2551 Resultados de partidos(5) \u2551 Apuestas?(6) \u2551 Informacion del torneo(7) \u2551 Salir(0) \u2551\n      \u255A\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u255D";
        for (int i = 0; i < texto.length(); i++) {
        System.out.print(texto.charAt(i));
        Thread.sleep(1);
        }
        
        System.out.println();
    }

    public void reglas() throws Exception{
         String texto = "Bienvenido al torneo de los 7 universos";
        for (int i = 0; i < texto.length(); i++) {
        System.out.print(texto.charAt(i));
        Thread.sleep(5);
        }
        Thread.sleep(1000);
        System.out.println();
        String texto2 = "\1Antes de comenzar con la inscripcion debe de conocer las reglas para poder inscribir a un equipo";
         for (int i = 0; i < texto2.length(); i++) {
        System.out.print(texto2.charAt(i));
        Thread.sleep(5);
        }
        Thread.sleep(1000);
        System.out.println();
        String texto3 = "1.Todos los equipos deben de tener toda la documentacion solicita de lo contrari su equipo sera rechazado";
         for (int i = 0; i < texto3.length(); i++) {
        System.out.print(texto3.charAt(i));
        Thread.sleep(5);}
         System.out.println();
         System.out.println();
        
    }


    public void eleccion(){
        System.out.println("¿Decea seguir ingresando equipos");

    }

}
