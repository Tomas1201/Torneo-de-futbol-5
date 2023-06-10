import java.util.Scanner;

public class App {
static Menus menu = new Menus();
static PlantillaE p = new PlantillaE();
static Inscripcion ins = new Inscripcion();
    public static void main(String[] args) throws Exception {
    byte opcion;
        Scanner sc = new Scanner(System.in);
ins.cajaPepe();
p.mostrard();
        menu.cartelera();
        opcion = sc.nextByte();
        sc.nextLine();
        switch(opcion){
case 1:
menu.inscripcion();
        }
        p.hola = sc.nextLine();
        p.plantillae();
    }
}
