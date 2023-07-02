import java.util.Scanner;

public class Menus {
    Scanner sc = new Scanner(System.in);
    Jugadores juga = new Jugadores();
    static Inscripcion ins = new Inscripcion();
    static Equipos[] juan;
    static String[] pep;
    SorteoGrupo sorteoGrupo;




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
        String texto2 = "Antes de comenzar con la inscripcion debe de conocer las reglas para poder inscribir a un equipo";
         for (int i = 0; i < texto2.length(); i++) {
        System.out.print(texto2.charAt(i));
        Thread.sleep(5);
        }
        Thread.sleep(1000);
        System.out.println();

        String texto3 = "1.Todos los equipos deben de tener toda la documentacion solicita.";
         for (int i = 0; i < texto3.length(); i++) {
        System.out.print(texto3.charAt(i));
        Thread.sleep(5);}
         System.out.println();
         String texto4 = "2.Todos los equipos de tienen que contar con un minimo de 9 y un maximo de 14 jugadores.";
         for (int i = 0; i < texto4.length(); i++) {
        System.out.print(texto4.charAt(i));
        Thread.sleep(5);}
         System.out.println();
         String texto5 = "3.Todos los integrantes del equipo deben de contar con un apto medico avalado por un medico licenciado";
         for (int i = 0; i < texto5.length(); i++) {
        System.out.print(texto5.charAt(i));
        Thread.sleep(5);}
        System.out.println("");
         String texto6 = "4. no se permite ingresar nombres que cuenten con numeros o caracteres especiales";
         for (int i = 0; i < texto6.length(); i++) {
        System.out.print(texto6.charAt(i));
        Thread.sleep(5);}
 System.out.println();
         String texto7 = "Los equipos que no cumplan con estas normas no podran inscribirse";
         for (int i = 0; i < texto7.length(); i++) {
        System.out.print(texto7.charAt(i));
        Thread.sleep(5);}
         System.out.println();
         String texto8 = "El torneo solo se podra iniciar cuando todos los equipos esten inscriptos";
         for (int i = 0; i < texto8.length(); i++) {
        System.out.print(texto8.charAt(i));
        Thread.sleep(5);}
 System.out.println();
  System.out.println();

    }


    public void eleccion(){
        System.out.println("¿Desea seguir ingresando equipos");

    }


    public void fixture() {
        juan = ins.getEquipos2();
        pep =new String[ juan.length];
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
    System.out.println(  "║ "+pep[0]+" ║ "+g+" ║ "+pu+" ║            ╔═════════╦═══════╗                                ");
    System.out.println(  "╠═════════╬═══════╬════════╣            ║ "+pep+" ║ "+g+" ║                                ");
    System.out.println(  "║ "+pep[1]+" ║ "+g+" ║ "+pu+" ║            ╠═════════╬═══════╣                                ");
    System.out.println(  "╠═════════╬═══════╬════════╣            ║ "+pep+" ║ "+g+" ║                                ");
    System.out.println(  "║ "+pep[2]+" ║ "+g+" ║ "+pu+" ║            ╚═════════╩═══════╝                                ");
    System.out.println("╠═════════╬═══════╬════════╣                                            ╔═════════════════╗");
    System.out.println(  "║ "+pep[3]+" ║ "+g+" ║ "+pu+" ║                                            ║      FINAL      ║       \u001b[33m╔═══════════════════════════╗\u001b[0m");
    System.out.println("╚═════════╩═══════╩════════╝                                            ╠═════════╦═══════╣       \u001b[33m║          CAMPEON          ║\u001b[0m");
    System.out.println(  "                                                                        ║ "+pep+" ║ "+g+" ║       \u001b[33m╠═══════════════════════════╣\u001b[0m");
    System.out.println(  "                                                                        ╠═════════╬═══════╣       \u001b[33m║       "   +pep+   "       ║\u001b[0m");
    System.out.println(  "                                                                        ║ "+pep+" ║ "+g+" ║       \u001b[33m╚═══════════════════════════╝\u001b[0m");
    System.out.println("╔══════════════════════════╗                                            ╚═════════╩═══════╝");
    System.out.println("║         Grupo  B         ║                                                               ");
    System.out.println("╠═════════╦═══════╦════════╣                                                               ");
    System.out.println(  "║ "+pep[4]+" ║ "+g+" ║ "+pu+" ║            ╔═════════╦═══════╗                                ");
    System.out.println(  "╠═════════╬═══════╬════════╣            ║ "+pep+" ║ "+g+" ║                                ");
    System.out.println(  "║ "+pep[5]+" ║ "+g+" ║ "+pu+" ║            ╠═════════╬═══════╣                                ");
    System.out.println(  "╠═════════╬═══════╬════════╣            ║ "+pep+" ║ "+g+" ║                                ");
    System.out.println(  "║ "+pep[5]+" ║ "+g+" ║ "+pu+" ║            ╚═════════╩═══════╝                                ");
    System.out.println("╠═════════╬═══════╬════════╣                                                               ");
    System.out.println(  "║ "+pep[6]+" ║ "+g+" ║ "+pu+" ║                                                               ");
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
