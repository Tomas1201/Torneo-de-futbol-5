import java.util.Scanner;

public class Inscripcion {
  private static Boolean error1 = true;
  private byte CantidadEquipos;
  static byte decision = -1;
  static String Respuesta;
  static String Respuesta2;
  static Scanner sc = new Scanner(System.in);
  static Equipos equi1 = new Equipos();
  static Jugadores juga = new Jugadores();
  static Equipos[] equipos2;
  static Boolean pi = true;
  static Boolean euler = true;
  static boolean ru = true;
  static boolean bu = true;
  static boolean tru = true;
  static boolean bru = true;

  public Equipos[] getEquipos(){
    return equipos2;
  }





  public void InscripEquipo() {

    while (error1) {
      System.out.println("Indique la cantidad de equipos a ingresar: ");
      try {
        CantidadEquipos = sc.nextByte();
        equipos2 = new Equipos[CantidadEquipos];
        error1 = false;

      } catch (Exception e) {
        System.out.println("Error: Debes ingresar un número válido.");
        sc.nextLine();
      }
    }

    sc.nextLine();

    for (int pepe = 0; pepe < equipos2.length; pepe++) {
      equipos2[pepe] = new Equipos();

      while (ru) {
        System.out.println("Ingrese el nombre del " + (pepe + 1) + " Equipo: ");
        equipos2[pepe].setNombreEquipo(sc.nextLine());
        if (equipos2[pepe].getNombreEquipo().matches("[a-zA-Z ]+")) {
          ru = false;
        } else {
          System.out.println("error : ingrese un nombre valido");
        }
      }
      while(bu){
      System.out.println("Ingrese el nombre del capitan: ");
      equipos2[pepe].setCapitan(sc.nextLine());
      if (equipos2[pepe].getCapitan().matches("[a-zA-Z ]+")) {
          bu = false;
        } else {
          System.out.println("error : ingrese un nombre valido");
        }
      }
      while(tru){
      System.out.println("Ingrese el nombre del Subcapitan:");
      equipos2[pepe].setSubcapitan(sc.nextLine());
      if (equipos2[pepe].getSubcapitan().matches("[a-zA-Z ]+")) {
        tru = false;
      } else {
        System.out.println("error : ingrese un nombre valido");
      }
    }
      while (equipos2[pepe].getInsJuga()) {
       while(bru){
        System.out.println("Ingrese la cantidad de jugadores: ");
        try {
          equipos2[pepe].jugadores2 = new Jugadores[sc.nextByte()];
        sc.nextLine();
         bru = false;
        } catch (Exception e) {
          System.out.println("Error: Debes ingresar un número válido.");
          sc.nextLine();
        }}
        

        if (equipos2[pepe].jugadores2.length <= 14 && equipos2[pepe].jugadores2.length >= 2) {
          while (pi) {
            System.out.println("Todos los los jugadores del equipo cuenta con Obra social? (si)(no)");
            Respuesta = sc.nextLine();
            switch (Respuesta) {
              case "si":
                equipos2[pepe].setDocument1(true);
                pi = false;
                break;
              case "no":
                equipos2[pepe].setDocument1(false);
                pi = false;
                break;
              default:
                System.out.println("Su respuesta es invalida");

                break;
            }
          }
          while (euler) {
            System.out.println("Todos los Jugadores Cuentan con Apto Medico acreditado por un medico?");
            Respuesta2 = sc.nextLine();

            switch (Respuesta2) {
              case "si":
                equipos2[pepe].setDocument2(true);
                euler = false;
                break;
              case "no":
                euler = false;
                break;
              default:
                System.out.println("Su respuesta es invalida");

                break;
            }
          }
          if (equipos2[pepe].getDocument1() && equipos2[pepe].getDocument2()) {
            equipos2[pepe].NombreJugador();
            equipos2[pepe].Decirnombre();
            equipos2[pepe].setInsJuga(false);
          } else {
            System.out.println("Lo sentimos pero todos los jugadores deben de contar la documentacion minima");
          }
        }

        else if (equipos2[pepe].getCantidadJugadores() < 1) {
          System.out.println("Su equipo no cumple con la cantidad de jugadores minimo");
          bru = true;
        } else {

          System.out.println("Su equipo exede la cantidad de jugadores permitido");
          System.out.println("Decea realizar alguna de las siguiente operaciones?");
          System.out.println("Descartar inscripcion(1), Reinscribir Jugadores(2), Salir(0)");
          switch (decision) {
            case 1:
              pepe--;
              equipos2[pepe].setInsJuga(false);
              break;
            case 2:
              break;
            case 0:
              equipos2[pepe].setInsJuga(false);
              break;

          }

        }

      }
    }
  }

}
