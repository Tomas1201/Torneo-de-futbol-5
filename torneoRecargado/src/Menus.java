import java.util.Scanner;

public class Menus {
    Scanner sc = new Scanner(System.in);
    Jugadores juga = new Jugadores();
    static Inscripcion ins = new Inscripcion();
    static Equipos[] juan;
    static String[] pep;
    SorteoGrupo sorteoGrupo;

 //  int puntosEquipo1 = sorteoGrupo.grupoA.getEquipo()[0].getPuntos();


    public void cartelera() throws Exception {
        System.out.println();
        System.out.println("                                                                       \u001b[31m╔══════════════════════════════════════════════════╗");
        System.out.println("                                                                       ║      Bienvenidos al torneo del multiverso!!      ║");
        System.out.println("                                                                       ╚══════════════════════════════════════════════════╝\u001b[0m");
        System.out.println();
        System.out.println();
    }

    public void Menu_principal() throws Exception {
        System.out.println();
        // String texto = "Inscribir equipo(1) | Ver Fixture(2) | Ver Planillas de
        // equipos(3) | Inicio de torneo(4) \n| Resultados de partidos(5) | Apuestas?(6)
        // | Informacion del torneo(7) | Salir(0)";
        String texto = "\u001b[36m      \u2554\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2557\n      \u2551 Inscribir equipo(1) \u2551 Ver Fixture(2) \u2551 Ver Planillas de equipos(3) \u2551 Inicio de torneo(4) \u2551 Resultados de partidos(5) \u2551 Apuestas?(6) \u2551 Informacion del torneo(7) \u2551 Salir(0) \u2551\n      \u255A\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u255D\u001b[0m";
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
        System.out.println("¿Desea seguir ingresando equipos");

    }


public void fixture() {
    
    
    for (int i = 0; i < juan.length; i++) {
        String equipo = juan[i].getNombreEquipo();
        if (equipo.length() >= 7) {
            pep[i] = equipo.substring(0, 7);
        } else {
            StringBuilder sb = new StringBuilder(equipo);
            while (sb.length() < 7) {
                sb.append(" ");
            }
            pep[i] = sb.toString();
        }
    }

    int g=0;
    int pu=0;
    
    System.out.println("╔═════════╦═══════╦════════╗                                                               ");
    System.out.println("║ Equipos ║ Goles ║ Puntos ║                                                               ");
    System.out.println("╚═════════╩═══════╩════════╝                                                               ");
    System.out.println("                                        ╔═════════╦═══════╗                                ");
    System.out.println("╔══════════════════════════╗            ║ Equipos ║ Goles ║                                ");
    System.out.println("║         Grupo  A         ║            ╚═════════╩═══════╝                                ");
    System.out.println("╠═════════╦═══════╦════════╣                                                               ");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║            ╔═════════╦═══════╗                                ");
    System.out.println(  "╠═════════╬═══════╬════════╣            ║ "+pep+" ║ "+g+" ║                                ");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║            ╠═════════╬═══════╣                                ");
    System.out.println(  "╠═════════╬═══════╬════════╣            ║ "+pep+" ║ "+g+" ║                                ");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║            ╚═════════╩═══════╝                                ");
    System.out.println("╠═════════╬═══════╬════════╣                                            ╔═════════════════╗");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║                                            ║      FINAL      ║       \u001b[33m╔═══════════════════════════╗\u001b[0m");
    System.out.println("╚═════════╩═══════╩════════╝                                            ╠═════════╦═══════╣       \u001b[33m║          CAMPEON          ║\u001b[0m");
    System.out.println(  "                                                                        ║ "+pep+" ║ "+g+" ║       \u001b[33m╠═══════════════════════════╣\u001b[0m");
    System.out.println(  "                                                                        ╠═════════╬═══════╣       \u001b[33m║       "   +pep+   "       ║\u001b[0m");
    System.out.println(  "                                                                        ║ "+pep+" ║ "+g+" ║       \u001b[33m╚═══════════════════════════╝\u001b[0m");
    System.out.println("╔══════════════════════════╗                                            ╚═════════╩═══════╝");
    System.out.println("║         Grupo  B         ║                                                               ");
    System.out.println("╠═════════╦═══════╦════════╣                                                               ");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║            ╔═════════╦═══════╗                                ");
    System.out.println(  "╠═════════╬═══════╬════════╣            ║ "+pep+" ║ "+g+" ║                                ");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║            ╠═════════╬═══════╣                                ");
    System.out.println(  "╠═════════╬═══════╬════════╣            ║ "+pep+" ║ "+g+" ║                                ");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║            ╚═════════╩═══════╝                                ");
    System.out.println("╠═════════╬═══════╬════════╣                                                               ");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║                                                               ");
    System.out.println("╚═════════╩═══════╩════════╝                                                               ");
}

     public void fix16(){  

      int g=0;
      int pu=0;
    System.out.println("");
    System.out.println("╔═════════╦═══════╦════════╗                                                                                                                                                           ╔═════════╦═══════╦════════╗");
    System.out.println("║ Equipos ║ Goles ║ Puntos ║                                                                                                                                                           ║ Equipos ║ Goles ║ Puntos ║");
    System.out.println("╚═════════╩═══════╩════════╝                                                                                                                                                           ╚═════════╩═══════╩════════╝");
    System.out.println("                                        ╔═════════╦═══════╗                                \u001b[33m╔═══════════════════════════╗\u001b[0m                              ╔═════════╦═══════╗                                          ");
    System.out.println("╔══════════════════════════╗            ║ Equipos ║ Goles ║                                \u001b[33m║          CAMPEON          ║\u001b[0m                              ║ Equipos ║ Goles ║              ╔══════════════════════════╗");
    System.out.println("║         Grupo  A         ║            ╚═════════╩═══════╝                                \u001b[33m╠═══════════════════════════╣\u001b[0m                              ╚═════════╩═══════╝              ║         Grupo  C         ║");
    System.out.println(  "╠═════════╦═══════╦════════╣                                                               \u001b[33m║       "   +pep+   "       ║\u001b[0m                                                               ╠═════════╦═══════╦════════╣");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║            ╔═════════╦═══════╗                                \u001b[33m╚═══════════════════════════╝\u001b[0m                              ╔═════════╦═══════╗              ║ "+pep+" ║ "+g+" ║ "+pu+" ║");
    System.out.println(  "╠═════════╬═══════╬════════╣            ║ "+pep+" ║ "+g+" ║                                                                                           ║ "+pep+" ║ "+g+" ║              ╠═════════╬═══════╬════════╣");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║            ╠═════════╬═══════╣                                                                                           ╠═════════╬═══════╣              ║ "+pep+" ║ "+g+" ║ "+pu+" ║");
    System.out.println(  "╠═════════╬═══════╬════════╣            ║ "+pep+" ║ "+g+" ║                                     ╔═════════════════╗                                   ║ "+pep+" ║ "+g+" ║              ╠═════════╬═══════╬════════╣");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║            ╚═════════╩═══════╝                                     ║      FINAL      ║                                   ╚═════════╩═══════╝              ║ "+pep+" ║ "+g+" ║ "+pu+" ║");
    System.out.println("╠═════════╬═══════╬════════╣                                                                    ╠═════════╦═══════╣                                                                    ╠═════════╬═══════╬════════╣");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║                                                                    ║ "+pep+" ║ "+g+" ║                                                                    ║ "+pep+" ║ "+g+" ║ "+pu+" ║");
    System.out.println("╚═════════╩═══════╩════════╝                                   ╔═════════╦═══════╗              ╠═════════╬═══════╣            ╔═════════╦═══════╗                                     ╚═════════╩═══════╩════════╝");
    System.out.println(  "                                                               ║ "+pep+" ║ "+g+" ║              ║ "+pep+" ║ "+g+" ║            ║ "+pep+" ║ "+g+" ║                                                                 ");
    System.out.println("                                                               ╠═════════╬═══════╣              ╚═════════╩═══════╝            ╠═════════╬═══════╣                                                                 ");
    System.out.println(  "                                                               ║ "+pep+" ║ "+g+" ║                                             ║ "+pep+" ║ "+g+" ║                                                                 ");
    System.out.println("╔══════════════════════════╗                                   ╚═════════╩═══════╝              ╔═════════════════╗            ╚═════════╩═══════╝                                     ╔══════════════════════════╗");
    System.out.println("║         Grupo  B         ║                                                                    ║  Tercer Puesto  ║                                                                    ║         Grupo  D         ║");
    System.out.println("╠═════════╦═══════╦════════╣                                                                    ╠═════════╦═══════╣                                                                    ╠═════════╦═══════╦════════╣");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║            ╔═════════╦═══════╗                                     ║ "+pep+" ║ "+g+" ║                                  ╔═════════╦═══════╗               ║ "+pep+" ║ "+g+" ║ "+pu+" ║");
    System.out.println(  "╠═════════╬═══════╬════════╣            ║ "+pep+" ║ "+g+" ║                                     ╠═════════╬═══════╣                                  ║ "+pep+" ║ "+g+" ║               ╠═════════╬═══════╬════════╣");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║            ╠═════════╬═══════╣                                     ║ "+pep+" ║ "+g+" ║                                  ╠═════════╬═══════╣               ║ "+pep+" ║ "+g+" ║ "+pu+" ║");
    System.out.println(  "╠═════════╬═══════╬════════╣            ║ "+pep+" ║ "+g+" ║                                     ╚═════════╩═══════╝                                  ║ "+pep+" ║ "+g+" ║               ╠═════════╬═══════╬════════╣");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║            ╚═════════╩═══════╝                                                                                          ╚═════════╩═══════╝               ║ "+pep+" ║ "+g+" ║ "+pu+" ║");
    System.out.println("╠═════════╬═══════╬════════╣                                                                                                                                                           ╠═════════╬═══════╬════════╣");
    System.out.println(  "║ "+pep+" ║ "+g+" ║ "+pu+" ║                                                                                                                                                           ║ "+pep+" ║ "+g+" ║ "+pu+" ║");
    System.out.println("╚═════════╩═══════╩════════╝                                                                                                                                                           ╚═════════╩═══════╩════════╝");          
}
}
