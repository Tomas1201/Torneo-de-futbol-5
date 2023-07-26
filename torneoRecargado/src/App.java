
import java.util.Scanner;
import javax.sound.sampled.*;

import java.io.File;
import java.util.Arrays;

public class App {
    // Instancias
    static Menus menu = new Menus();
    static Inscripcion ins = new Inscripcion();
    static SorteoGrupo sorteo = new SorteoGrupo();

    // variables
    static boolean apagar = true;

    public static void main(String[] args) throws Exception {
        AudioInputStream audioInputStream = AudioSystem
                .getAudioInputStream(new File("torneoRecargado/audio/AudioFinal.wav"));
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        String opcion;
        Scanner sc = new Scanner(System.in);

        menu.cartelera();
        while (apagar) {

            menu.Menu_principal();
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    if (PartidosCuartos.finTorneo) {
                        System.out.println("El torneo a finalizado, muchas gracias por participar");
                    } else {
                        if (ins.Reglas1) {
                            menu.reglas();
                        }
                        ins.InscripEquipo();
                    }
                    break;
                case "2":
                    System.out.println("Proximamente");

                    // incompleto(No se puede mostrar por falta de terminar)

                    // if (ins.getEquipos2() == null) {
                    // System.out.println("No hay equipos inscriptos actualmente");
                    // } else {
                    // if (ins.getCantidadEquipos() == 0) {
                    // System.out.println("No hay equipos inscriptos actualmete");
                    // } else {

                    // if(ins.getCantidadEquipos() == ins.getModalidad()){

                    // if (ins.getModalidad() == 8) {
                    // menu.fixture();
                    // } else {
                    // menu.fix16();
                    // }
                    // }

                    // else{
                    // System.out.println("Todos los equipos deben estar inscriptos para poder
                    // mostrar el fixture");
                    // System.out.println("Cantidad de Equipos:
                    // "+ins.getCantidadEquipos()+"/"+ins.getModalidad());;
                    // }
                    // }

                    // }
                    break;
                case "3":

                    System.out.println("Proximamente");

                    // if (ins.getEquipos2() == null) {
                    // System.out.println("No hay equipos inscriptos actualmente");
                    // } else {

                    // System.out.println("Equipos Inscriptos: ");
                    // for (int i = 0; i < ins.getCantidadEquipos(); i++) {
                    // System.out.println("*" + ins.getEquipos2()[i].getNombreEquipo());
                    // }
                    // System.out.println("Por favor indique el nombre del equipo que desea ver: ");
                    // String Buscado = sc.nextLine();
                    // for (int i = 0; i < ins.getEquipos2().length; i++) {
                    // if (ins.getEquipos2()[i].getNombreEquipo().equals(Buscado)) {
                    // ins.getEquipos2()[i].plantilla();

                    // }

                    // }
                    // }
                    break;
                case "4":
                    if (PartidosCuartos.finTorneo) {
                        System.out.println("El torneo a finalizado, muchas gracias por participar");
                    } else {
                        if (ins.getEquipos2() == null) {
                            System.out.println("No hay equipos inscriptos actualmente");
                        } else {
                            if (ins.getCantidadEquipos() == 0) {
                                System.out.println("No hay equipos inscriptos actualmete");
                            } else {

                                if (ins.getCantidadEquipos() == ins.getModalidad()) {
                                    SorteoGrupo.realizarSimulacion();
                                    SorteoPartidos.sorteParti();
                                    PartidosGrupos.partidGrup();
                                    GanadorGrupo.obtenerEquipoGanador();
                                    SegundoLugarGrupo.obtenerSegundoEquipo();
                                    TercerLugarGrupo.obtenerTerceroGrupo();
                                    SorteoCuartos.sorteCuartos();
                                    PartidosCuartos.partidCuartos();
                                    clip.start();

                                    clip.drain();
                                    Thread.sleep(6000);
                                } else {
                                    System.out.println(
                                            "Todos los equipos deben estar inscriptos para poder iniciar el torneo");
                                    System.out.println("Cantidad de Equipos: " + ins.getCantidadEquipos() + "/"
                                            + ins.getModalidad());
                                    ;
                                }
                            }
                        }
                    }

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