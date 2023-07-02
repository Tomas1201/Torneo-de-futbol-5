import java.util.Scanner;

public class Inscripcion {
  private static Boolean error1 = true;
  private byte CantidadEquipos;
  static byte decision = -100;
  static String Respuesta;
  static String Respuesta2;
  static String Respuesta3;
  static Scanner sc = new Scanner(System.in);
  static Equipos[] equipos2;
  static Boolean pi = true;
  static Boolean euler = true;
  static boolean ru = true;
  static boolean bu = true;
  static boolean tru = true;
  static boolean bru = true;
  static int iteracion;
  static boolean Minimo = true;

  private static byte Modalidad;

  static boolean decisionprecarga;
  static Precarga precarga = new Precarga();
  static boolean Modalidad1 = true;
  static int pepe = 0;
  static boolean precargaDe = true;
  boolean Reglas1 = true;


  public static Equipos[] getEquipos2() {

    return equipos2;
  }

  public byte getCantidadEquipos() {
    return CantidadEquipos;
  }

  public byte getModalidad() {
    return Modalidad;
  }

  public void setModalidad(byte modalidad) {
    Modalidad = modalidad;
  }

  public void setCantidadEquipos(byte cantidadEquipos) {
    CantidadEquipos = cantidadEquipos;
  }

  public void InscripEquipo() {
    String Reglas;

    while (Reglas1) {
      System.out.println("Esta de acuerdo con estas reglas?");
      Reglas = sc.nextLine();
      switch (Reglas) {
        case "si":
          Reglas1 = false;
          break;
        case "no":
          Reglas1 = true;
          break;
        default:
          System.out.println("Eleccion invalida");
          break;
      }
      break;
    }
    // solo se ejecuta si se aceptan las condiciones
    if (Reglas1 != true) {
      while (Modalidad1) {
        System.out.println("Porfavor ingrese la modalidad del torneo (8)(16) equipos");
        try {
          Modalidad = sc.nextByte();
        } catch (Exception e) {
          System.out.println("Error: Debes ingresar un número válido.");
          sc.nextLine();
        }

        switch (Modalidad) {
          case 8:
            equipos2 = new Equipos[8];
            Modalidad1 = false;
            sc.nextLine();
            break;
          case 16:
            equipos2 = new Equipos[16];
            Modalidad1 = false;
            sc.nextLine();
            break;
          default:
            System.out.println("Modalidad invalida");
            System.out.println("Se recuerda que el torneo solo iniciara con 8 o 16 equipos");
            break;
        }

      }
      // while de desicion de precarga
      while (precargaDe) {
        System.out.println("Desea precargar equipos?");
        Respuesta3 = sc.nextLine();
        switch (Respuesta3) {
          case "si":
            decisionprecarga = true;
            break;
          case "no":
            decisionprecarga = false;
            precargaDe = false;
            break;
          default:
            System.out.println("error : Respuesta invalida");
            break;
        }

        if (decisionprecarga) {
          setCantidadEquipos(Modalidad);
          equipos2 = precarga.pre(Modalidad);
          precargaDe = false;
        }
      }

      if (CantidadEquipos == equipos2.length) {
        System.out.println("Todos los equipos fueron inscriptos, todo listo para iniciar el torneo");

      } else {

        while (error1) {
          System.out.println("Indique la cantidad de equipos a ingresar: ");
          try {
            CantidadEquipos += sc.nextByte();
            error1 = false;

          } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número válido.");
            sc.nextLine();
          }
        }
        sc.nextLine();

        for (; pepe < CantidadEquipos; pepe++) {
          equipos2[pepe] = new Equipos();
          System.out.println("Cantidad de equipos ingresados: " + pepe + "/" + Modalidad);
          while (ru) {
            System.out.println("Ingrese el nombre del " + (pepe + 1) + " Equipo: ");
            equipos2[pepe].setNombreEquipo(sc.nextLine());
            if (equipos2[pepe].getNombreEquipo().matches("[a-zA-Z ]+")) {
              ru = false;
            } else {
              System.out.println("error : ingrese un nombre valido");
            }
          }
          while (bu) {
            System.out.println("Ingrese el nombre del capitan: ");
            equipos2[pepe].setCapitan(sc.nextLine());
            if (equipos2[pepe].getCapitan().matches("[a-zA-Z ]+")) {
              bu = false;
            } else {
              System.out.println("error : ingrese un nombre valido");
            }
          }
          while (tru) {
            System.out.println("Ingrese el nombre del Subcapitan:");
            equipos2[pepe].setSubcapitan(sc.nextLine());
            if (equipos2[pepe].getSubcapitan().matches("[a-zA-Z ]+")) {
              tru = false;
            } else {
              System.out.println("error : ingrese un nombre valido");
            }
          }
          while (equipos2[pepe].getInsJuga()) {
            while (bru) {
              System.out.println("Ingrese la cantidad de jugadores: ");
              try {
                equipos2[pepe].jugadores2 = new Jugadores[sc.nextByte()];
                sc.nextLine();
                bru = false;
              } catch (Exception e) {
                System.out.println("Error: Debes ingresar un número válido.");
                sc.nextLine();
              }
            }
            // si la cantidad de jugadores esta entre 9 y 14 continua
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
                System.out.println("Todos los Jugadores Cuentan con Apto Medico acreditado por un medico? (si)(no)");
                Respuesta2 = sc.nextLine();

                switch (Respuesta2) {
                  case "si":
                    equipos2[pepe].setDocument2(true);
                    euler = false;
                    break;
                  case "no":
                    equipos2[pepe].setDocument2(false);
                    euler = false;
                    break;
                  default:
                    System.out.println("Su respuesta es invalida");

                    break;
                }
              }
              if (equipos2[pepe].getDocument1() && equipos2[pepe].getDocument2()) {
                equipos2[pepe].NombreJugador();
                equipos2[pepe].setInsJuga(false);
              } else {
                System.out.println("Lo sentimos pero todos los jugadores deben de contar la documentacion minima");
                System.out.println("Presione ENTER para continuar.");
                sc.nextLine();
                pepe--;
              }
              break;
              // si la cantidad de jugadores no esta entre los limites
            } else {
              bru = true;
              System.out.println("Su equipo no cumple con la norma de cantidad de jugadores");
              System.out.println("Decea realizar alguna de las siguiente operaciones?");
              System.out.println("Descartar inscripcion(1), Reinscribir Jugadores(2), Salir(0)");
              decision = sc.nextByte();
              sc.nextLine();
              switch (decision) {
                case 1:
                  equipos2[pepe].setInsJuga(false);
                  if (pepe > 0 && pepe != 1) {
                    pepe--;
                    CantidadEquipos--;
                  } else {
                    CantidadEquipos--;
                  }
                  break;
                case 2:
                  break;
                case 0:
                  equipos2[pepe].setInsJuga(false);
                  break;

              }

            }

          }
          // reinicio de variables
          ru = true;
          bu = true;
          euler = true;
          pi = true;
          tru = true;
          bru = true;
          error1 = true;
          equipos2[pepe].setInsJuga(true);
        }
        // Decision del switch
        if (decision == 0) {
          pepe--;
        }
        if (decision == 1 && pepe == 1) {
          pepe--;
        }
      }
    }
  }
}
