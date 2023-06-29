
import java.util.Scanner;

public class App {
    // Instancias
    static Menus menu = new Menus();
    static Inscripcion ins = new Inscripcion();
    static Equipos equi = new Equipos();
    static fech fix = new fech();
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
                    fix.fixture();
                    break;
                case "3":
                    System.out.println("Porfavor indique el nombre del equipo que decea ver");
                    String Buscado = sc.nextLine();
                    for (int i = 0; i < ins.getEquipos().length; i++) {
                        if (ins.getEquipos()[i].getNombreEquipo().equals(Buscado)) {
                            ins.getEquipos()[i].plantilla();
                            break;
                        }
                    }
                case "4":
                    System.out.println("Proximamente");
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
