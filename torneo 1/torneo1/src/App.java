
import java.util.Scanner;
public class App {
static Menus menu = new Menus();
static PlantillaE p = new PlantillaE();
static Inscripcion ins = new Inscripcion();
static Equipos equi = new Equipos();
static fech fix = new fech();


    public static void main(String[] args) throws Exception {
    Byte opcion;
        Scanner sc = new Scanner(System.in);
        menu.cartelera();
        opcion = sc.nextByte();
        sc.nextLine();

        switch(opcion){
        case 1:
            ins.InscripEquipo();
            break;
        case 2:
        fix.fixture();
        break;
        case 3:
        p.plantillae();
        case 0:
        break;
        default:
        System.out.println("Opcion invalida");
        }
      sc.close();
    }
}
