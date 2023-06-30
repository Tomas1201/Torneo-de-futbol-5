
import java.util.Scanner;

public class App {
    // Instancias
    static Menus menu = new Menus();
    static Inscripcion ins = new Inscripcion();
    static Equipos equi = new Equipos();
    static SorteoGrupo sorteo = new SorteoGrupo();
    // variables
    static boolean apagar = true;

    public static void main(String[] args) throws Exception {
        String opcion;
        Scanner sc = new Scanner(System.in);

        menu.cartelera();
        while (apagar) {
            // menu.reglas();
            menu.Menu_principal();
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    ins.InscripEquipo();
                    break;
                case "2":

                    if (ins.getEquipos2() == null) {
                        System.out.println("No hay equipos inscriptos actualmente");
                    } else {
                        if (ins.getCantidadEquipos() == 0) {
                            System.out.println("No hay equipos inscriptos actualmete");
                        } else {
                            if (ins.getModalidad() == 8) {
                                menu.fixture();
                            } else {
                                menu.fix16();
                            }
                        }
                    }
                    break;
                case "3":

                    if (ins.getEquipos2() == null) {
                        System.out.println("No hay equipos inscriptos actualmente");
                    } else {
                        System.out.println("Por favor indique el nombre del equipo que desea ver");
                        System.out.println("Equipos Inscriptos: ");
                        for (int i = 0; i < ins.getCantidadEquipos(); i++) {
                            System.out.println("*" + ins.getEquipos2()[i].getNombreEquipo());
                        }

                        String Buscado = sc.nextLine();
                        for (int i = 0; i < ins.getEquipos2().length; i++) {
                            if (ins.getEquipos2()[i].getNombreEquipo().equals(Buscado)) {
                                ins.getEquipos2()[i].plantilla();

                            }
                        }
                    }
                    break;
                case "4":
                    sorteo.realizarSimulacion();
                    break;
                case "5":
                    System.out.println("Proximamente");
                    break;
                case "6":
                    System.out.println("Proximamente");
                    break;
                case "7":
                    System.out.println("Proximamente");
                    break;
                case "0":
                    apagar = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
        sc.close();

    }
}
