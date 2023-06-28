
import java.util.Scanner;

public class App {
    static Menus menu = new Menus();
    static PlantillaE p = new PlantillaE();
    static Inscripcion ins = new Inscripcion();
    static Equipos equi = new Equipos();
    static fech fix = new fech();
    static boolean apagar = true;
    public static void main(String[] args) throws Exception {
        String opcion;
        Scanner sc = new Scanner(System.in);
        
       while(apagar){
        menu.reglas();
        
        menu.cartelera();
        opcion = sc.nextLine();
        
        switch (opcion) {
            case "1":
                ins.InscripEquipo();
                break;
            case "2":
                fix.fixture();
                break;
            case "3":
                p.plantillae();
            case "4":
                
            case "0":
            apagar = false;
                break;
            default:
                System.out.println("Opcion invalida");
        }}
        sc.close();
        
    }
}
