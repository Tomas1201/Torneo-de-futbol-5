import java.util.Scanner;

public class Inscripcion {

  private byte CantidadEquipos;
  static byte decision = -1;
  static String Respuesta;
  static String Respuesta2;
  static Scanner sc = new Scanner(System.in);
  static Equipos equi1 = new Equipos();
  static Jugadores juga = new Jugadores();
  private Equipos[] equipos2;
  static Boolean pi = true;
  static Boolean euler = true;

  public void InscripEquipo() {
    System.out.println("Indique la cantidad de equipos a ingresar: ");
    equipos2 = new Equipos[sc.nextByte()];
    sc.nextLine();

    for (int pepe = 0; pepe < equipos2.length; pepe++) {
      equipos2[pepe] = new Equipos();

      System.out.println("Ingrese el nombre del " + (pepe + 1) + " Equipo: ");
      equipos2[pepe].setNombreEquipo(sc.nextLine());
      System.out.println("Ingrese el nombre de del capitan: ");
      equipos2[pepe].setCapitan(sc.nextLine());
      System.out.println("Ingrese el nombre del Subcapitan:");
      equipos2[pepe].setSubcapitan(sc.nextLine());

      while (equipos2[pepe].getInsJuga()) {
        System.out.println("Ingrese la cantidad de jugadores: ");

        equipos2[pepe].setCantidadJugadores(sc.nextByte());
        sc.nextLine();

        if (equipos2[pepe].getCantidadJugadores() <= 14 && equipos2[pepe].getCantidadJugadores() >= 9) {
          while (pi) {
            System.out.println("Todos los los jugadores del equipo cuenta con Obra social? (si)(no)");
            Respuesta = sc.nextLine();
            switch (Respuesta) {
              case "si":
                equipos2[pepe].setDocument1(true);
                System.out.println("El " + (pepe + 1) + " se registro exitosamente");
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

        else if (equipos2[pepe].getCantidadJugadores() < 9) {
          System.out.println("Su equipo no cumple con la cantidad de jugadores minimo");
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
