import java.util.Random;

public class PartidosGrupos {

    static int [] arrayAmarillas = {3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 0, 4, 5,};
    static int [] arrayRojas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    public static void partidGrup() throws Exception{
        if (Inscripcion.getEquipos2().length == 8){
            for (int i = 0; i < SorteoPartidos.partidosA.length; i++) {

                int golesA = generarNumeroAleatorio(0, 3);
                int golesB = generarNumeroAleatorio(0, 3);
                int decidirAmarillasA = generarNumeroAleatorio(0, 16);
                int decidirAmarillasB = generarNumeroAleatorio(0, 16);
                int decidirRojasA = generarNumeroAleatorio(0, 19);
                int decidirRojasB = generarNumeroAleatorio(0, 19);
                int amarillasA = arrayAmarillas[decidirAmarillasA];
                int amarillasB = arrayAmarillas[decidirAmarillasB];
                int rojasA = arrayRojas[decidirRojasA];
                int rojasB = arrayRojas[decidirRojasB];

                System.out.println("El siguiente partido del grupo A se disputará entre " +SorteoPartidos.partidosA[i][0].getNombreEquipo() + " y " + SorteoPartidos.partidosA[i][1].getNombreEquipo());
                  Thread.sleep(1000);
                SorteoPartidos.partidosA[i][0].setGoles(SorteoPartidos.partidosA[i][0].getGoles() + golesA);
                SorteoPartidos.partidosA[i][1].setGoles(SorteoPartidos.partidosA[i][1].getGoles() + golesB);
                SorteoPartidos.partidosA[i][0].setTarjetasAmarillas(SorteoPartidos.partidosA[i][0].getTarjetasAmarillas() + amarillasA);
                SorteoPartidos.partidosA[i][1].setTarjetasAmarillas(SorteoPartidos.partidosA[i][1].getTarjetasAmarillas() + amarillasB);
                SorteoPartidos.partidosA[i][0].setTarjetasRojas(SorteoPartidos.partidosA[i][0].getTarjetasRojas() + rojasA);
                SorteoPartidos.partidosA[i][1].setTarjetasRojas(SorteoPartidos.partidosA[i][1].getTarjetasRojas() + rojasB);
                if (golesA > golesB){
                    SorteoPartidos.partidosA[i][0].setPuntos(SorteoPartidos.partidosA[i][0].getPuntos() + 3);
                    SorteoPartidos.partidosA[i][0].setPartidosGanados(SorteoPartidos.partidosA[i][0].getPartidosGanados() + 1);
                    SorteoPartidos.partidosA[i][1].setPartidosPerdidos(SorteoPartidos.partidosA[i][1].getPartidosPerdidos() + 1);
                    System.out.println("¡" + SorteoPartidos.partidosA[i][0].getNombreEquipo() + " ha ganado " + golesA + " a " + golesB + "!");

                } else if (golesA == golesB) {
                    SorteoPartidos.partidosA[i][0].setPuntos(SorteoPartidos.partidosA[i][0].getPuntos() + 1);
                    SorteoPartidos.partidosA[i][1].setPuntos(SorteoPartidos.partidosA[i][1].getPuntos() + 1);
                    SorteoPartidos.partidosA[i][0].setPartidosEmpatados(SorteoPartidos.partidosA[i][0].getPartidosEmpatados() + 1);
                    SorteoPartidos.partidosA[i][1].setPartidosEmpatados(SorteoPartidos.partidosA[i][1].getPartidosEmpatados() + 1);
                    System.out.println("¡El partido ha terminado en un empate " + golesA + " a " + golesB + "!");

                } else {
                    SorteoPartidos.partidosA[i][1].setPuntos(SorteoPartidos.partidosA[i][1].getPuntos() + 3);
                    SorteoPartidos.partidosA[i][1].setPartidosGanados(SorteoPartidos.partidosA[i][1].getPartidosGanados() + 1);
                    SorteoPartidos.partidosA[i][0].setPartidosPerdidos(SorteoPartidos.partidosA[i][0].getPartidosPerdidos() + 1);
                    System.out.println("¡" + SorteoPartidos.partidosA[i][1].getNombreEquipo() + " ha ganado " + golesB + " a " + golesA + "!");
                }
                int golesA2 = generarNumeroAleatorio(0, 3);
                int golesB2 = generarNumeroAleatorio(0, 3);
                int decidirAmarillasA2 = generarNumeroAleatorio(0, 16);
                int decidirAmarillasB2 = generarNumeroAleatorio(0, 16);
                int decidirRojasA2 = generarNumeroAleatorio(0, 19);
                int decidirRojasB2 = generarNumeroAleatorio(0, 19);
                int amarillasA2 = arrayAmarillas[decidirAmarillasA2];
                int amarillasB2 = arrayAmarillas[decidirAmarillasB2];
                int rojasA2 = arrayRojas[decidirRojasA2];
                int rojasB2 = arrayRojas[decidirRojasB2];

                System.out.println("El siguiente partido del grupo B se disputará entre " + SorteoPartidos.partidosB[i][0].getNombreEquipo() + " y " + SorteoPartidos.partidosB[i][1].getNombreEquipo());
                     Thread.sleep(1000);
                SorteoPartidos.partidosB[i][0].setGoles(SorteoPartidos.partidosB[i][0].getGoles() + golesA2);
                SorteoPartidos.partidosB[i][1].setGoles(SorteoPartidos.partidosB[i][1].getGoles() + golesB2);
                SorteoPartidos.partidosB[i][0].setTarjetasAmarillas(SorteoPartidos.partidosB[i][0].getTarjetasAmarillas() + amarillasA2);
                SorteoPartidos.partidosB[i][1].setTarjetasAmarillas(SorteoPartidos.partidosB[i][1].getTarjetasAmarillas() + amarillasB2);
                SorteoPartidos.partidosB[i][0].setTarjetasRojas(SorteoPartidos.partidosB[i][0].getTarjetasRojas() + rojasA2);
                SorteoPartidos.partidosB[i][1].setTarjetasRojas(SorteoPartidos.partidosB[i][1].getTarjetasRojas() + rojasB2);
                  if (golesA2 > golesB2){
                    SorteoPartidos.partidosB[i][0].setPuntos(SorteoPartidos.partidosB[i][0].getPuntos() + 3);
                    SorteoPartidos.partidosB[i][0].setPartidosGanados(SorteoPartidos.partidosB[i][0].getPartidosGanados() + 1);
                    SorteoPartidos.partidosB[i][1].setPartidosPerdidos(SorteoPartidos.partidosB[i][1].getPartidosPerdidos() + 1);
                    System.out.println("¡" + SorteoPartidos.partidosB[i][0].getNombreEquipo() + " ha ganado " + golesA2 + " a " + golesB2 + "!");

                } else if (golesA2 == golesB2) {
                    SorteoPartidos.partidosB[i][0].setPuntos(SorteoPartidos.partidosB[i][0].getPuntos() + 1);
                    SorteoPartidos.partidosB[i][1].setPuntos(SorteoPartidos.partidosB[i][1].getPuntos() + 1);
                    SorteoPartidos.partidosB[i][0].setPartidosEmpatados(SorteoPartidos.partidosB[i][0].getPartidosEmpatados() + 1);
                    SorteoPartidos.partidosB[i][1].setPartidosEmpatados(SorteoPartidos.partidosB[i][1].getPartidosEmpatados() + 1);
                    System.out.println("¡El partido ha terminado en un empate " + golesA2 + " a " + golesB2 + "!");

                  } else {
                    SorteoPartidos.partidosB[i][1].setPuntos(SorteoPartidos.partidosB[i][1].getPuntos() + 3);
                    SorteoPartidos.partidosB[i][1].setPartidosGanados(SorteoPartidos.partidosB[i][1].getPartidosGanados() + 1);
                    SorteoPartidos.partidosB[i][0].setPartidosPerdidos(SorteoPartidos.partidosB[i][0].getPartidosPerdidos() + 1);
                    System.out.println("¡" + SorteoPartidos.partidosB[i][1].getNombreEquipo() + " ha ganado " + golesB2 + " a " + golesA2 + "!");

                  }
            }
        } else {
                for (int i = 0; i < SorteoPartidos.partidosA.length; i++) {

                    int golesA = generarNumeroAleatorio(0, 3);
                    int golesB = generarNumeroAleatorio(0, 3);
                    int decidirAmarillasA = generarNumeroAleatorio(0, 16);
                    int decidirAmarillasB = generarNumeroAleatorio(0, 16);
                    int decidirRojasA = generarNumeroAleatorio(0, 19);
                    int decidirRojasB = generarNumeroAleatorio(0, 19);
                    int amarillasA = arrayAmarillas[decidirAmarillasA];
                    int amarillasB = arrayAmarillas[decidirAmarillasB];
                    int rojasA = arrayRojas[decidirRojasA];
                    int rojasB = arrayRojas[decidirRojasB];

                    System.out.println("El siguiente partido del grupo A se disputará entre " +SorteoPartidos.partidosA[i][0].getNombreEquipo() + " y " + SorteoPartidos.partidosA[i][1].getNombreEquipo());
                     Thread.sleep(1000);
                    SorteoPartidos.partidosA[i][0].setGoles(SorteoPartidos.partidosA[i][0].getGoles() + golesA);
                    SorteoPartidos.partidosA[i][1].setGoles(SorteoPartidos.partidosA[i][1].getGoles() + golesB);
                    SorteoPartidos.partidosA[i][0].setTarjetasAmarillas(SorteoPartidos.partidosA[i][0].getTarjetasAmarillas() + amarillasA);
                    SorteoPartidos.partidosA[i][1].setTarjetasAmarillas(SorteoPartidos.partidosA[i][1].getTarjetasAmarillas() + amarillasB);
                    SorteoPartidos.partidosA[i][0].setTarjetasRojas(SorteoPartidos.partidosA[i][0].getTarjetasRojas() + rojasA);
                    SorteoPartidos.partidosA[i][1].setTarjetasRojas(SorteoPartidos.partidosA[i][1].getTarjetasRojas() + rojasB);
                    if (golesA > golesB){
                        System.out.println("¡" + SorteoPartidos.partidosA[i][0].getNombreEquipo() + " ha ganado " + golesA + " a " + golesB + "!");
                        SorteoPartidos.partidosA[i][0].setPuntos(SorteoPartidos.partidosA[i][0].getPuntos() + 3);
                        SorteoPartidos.partidosA[i][0].setPartidosGanados(SorteoPartidos.partidosA[i][0].getPartidosGanados() + 1);
                        SorteoPartidos.partidosA[i][1].setPartidosPerdidos(SorteoPartidos.partidosA[i][1].getPartidosPerdidos() + 1);

                    } else if (golesA == golesB) {
                        System.out.println("¡El partido ha terminado en un empate " + golesA + " a " + golesB + "!");
                        SorteoPartidos.partidosA[i][0].setPuntos(SorteoPartidos.partidosA[i][0].getPuntos() + 1);
                        SorteoPartidos.partidosA[i][1].setPuntos(SorteoPartidos.partidosA[i][1].getPuntos() + 1);
                        SorteoPartidos.partidosA[i][0].setPartidosEmpatados(SorteoPartidos.partidosA[i][0].getPartidosEmpatados() + 1);
                        SorteoPartidos.partidosA[i][1].setPartidosEmpatados(SorteoPartidos.partidosA[i][1].getPartidosEmpatados() + 1);
                    } else {
                        System.out.println("¡" + SorteoPartidos.partidosA[i][1].getNombreEquipo() + " ha ganado " + golesB + " a " + golesA + "!");
                        SorteoPartidos.partidosA[i][1].setPuntos(SorteoPartidos.partidosA[i][1].getPuntos() + 3);
                        SorteoPartidos.partidosA[i][1].setPartidosGanados(SorteoPartidos.partidosA[i][1].getPartidosGanados() + 1);
                        SorteoPartidos.partidosA[i][0].setPartidosPerdidos(SorteoPartidos.partidosA[i][0].getPartidosPerdidos() + 1);

                    }
                    int golesA2 = generarNumeroAleatorio(0, 3);
                    int golesB2 = generarNumeroAleatorio(0, 3);
                    int decidirAmarillasA2 = generarNumeroAleatorio(0, 16);
                    int decidirAmarillasB2 = generarNumeroAleatorio(0, 16);
                    int decidirRojasA2 = generarNumeroAleatorio(0, 19);
                    int decidirRojasB2 = generarNumeroAleatorio(0, 19);
                    int amarillasA2 = arrayAmarillas[decidirAmarillasA2];
                    int amarillasB2 = arrayAmarillas[decidirAmarillasB2];
                    int rojasA2 = arrayRojas[decidirRojasA2];
                    int rojasB2 = arrayRojas[decidirRojasB2];

                    System.out.println("El siguiente partido del grupo B se disputará entre " +SorteoPartidos.partidosB[i][0].getNombreEquipo() + " y " + SorteoPartidos.partidosB[i][1].getNombreEquipo());
                     Thread.sleep(1000);
                    SorteoPartidos.partidosB[i][0].setGoles(SorteoPartidos.partidosB[i][0].getGoles() + golesA2);
                    SorteoPartidos.partidosB[i][1].setGoles(SorteoPartidos.partidosB[i][1].getGoles() + golesB2);
                    SorteoPartidos.partidosB[i][0].setTarjetasAmarillas(SorteoPartidos.partidosB[i][0].getTarjetasAmarillas() + amarillasA2);
                    SorteoPartidos.partidosB[i][1].setTarjetasAmarillas(SorteoPartidos.partidosB[i][1].getTarjetasAmarillas() + amarillasB2);
                    SorteoPartidos.partidosB[i][0].setTarjetasRojas(SorteoPartidos.partidosB[i][0].getTarjetasRojas() + rojasA2);
                    SorteoPartidos.partidosB[i][1].setTarjetasRojas(SorteoPartidos.partidosB[i][1].getTarjetasRojas() + rojasB2);
                    if (golesA2 > golesB2){
                        System.out.println("¡" + SorteoPartidos.partidosB[i][0].getNombreEquipo() + " ha ganado " + golesA2 + " a " + golesB2 + "!");
                        SorteoPartidos.partidosB[i][0].setPuntos(SorteoPartidos.partidosB[i][0].getPuntos() + 3);
                        SorteoPartidos.partidosB[i][0].setPartidosGanados(SorteoPartidos.partidosB[i][0].getPartidosGanados() + 1);
                        SorteoPartidos.partidosB[i][1].setPartidosPerdidos(SorteoPartidos.partidosB[i][1].getPartidosPerdidos() + 1);

                    } else if (golesA2 == golesB2) {
                        System.out.println("¡El partido ha terminado en un empate " + golesA2 + " a " + golesB2 + "!");
                        SorteoPartidos.partidosB[i][0].setPuntos(SorteoPartidos.partidosB[i][0].getPuntos() + 1);
                        SorteoPartidos.partidosB[i][1].setPuntos(SorteoPartidos.partidosB[i][1].getPuntos() + 1);
                        SorteoPartidos.partidosB[i][0].setPartidosEmpatados(SorteoPartidos.partidosB[i][0].getPartidosEmpatados() + 1);
                        SorteoPartidos.partidosB[i][1].setPartidosEmpatados(SorteoPartidos.partidosB[i][1].getPartidosEmpatados() + 1);
                    } else {
                        System.out.println("¡" + SorteoPartidos.partidosB[i][1].getNombreEquipo() + " ha ganado " + golesB2 + " a " + golesA2 + "!");
                        SorteoPartidos.partidosB[i][1].setPuntos(SorteoPartidos.partidosB[i][1].getPuntos() + 3);
                        SorteoPartidos.partidosB[i][1].setPartidosGanados(SorteoPartidos.partidosB[i][1].getPartidosGanados() + 1);
                        SorteoPartidos.partidosB[i][0].setPartidosPerdidos(SorteoPartidos.partidosB[i][0].getPartidosPerdidos() + 1);

                    }
                    int golesA3 = generarNumeroAleatorio(0, 3);
                    int golesB3 = generarNumeroAleatorio(0, 3);
                    int decidirAmarillasA3 = generarNumeroAleatorio(0, 16);
                    int decidirAmarillasB3 = generarNumeroAleatorio(0, 16);
                    int decidirRojasA3 = generarNumeroAleatorio(0, 19);
                    int decidirRojasB3 = generarNumeroAleatorio(0, 19);
                    int amarillasA3 = arrayAmarillas[decidirAmarillasA3];
                    int amarillasB3 = arrayAmarillas[decidirAmarillasB3];
                    int rojasA3 = arrayRojas[decidirRojasA3];
                    int rojasB3 = arrayRojas[decidirRojasB3];

                    System.out.println("El siguiente partido del grupo C se disputará entre " +SorteoPartidos.partidosC[i][0].getNombreEquipo() + " y " + SorteoPartidos.partidosC[i][1].getNombreEquipo());
                     Thread.sleep(1000);
                    SorteoPartidos.partidosC[i][0].setGoles(SorteoPartidos.partidosC[i][0].getGoles() + golesA3);
                    SorteoPartidos.partidosC[i][1].setGoles(SorteoPartidos.partidosC[i][1].getGoles() + golesB3);
                    SorteoPartidos.partidosC[i][0].setTarjetasAmarillas(SorteoPartidos.partidosC[i][0].getTarjetasAmarillas() + amarillasA3);
                    SorteoPartidos.partidosC[i][1].setTarjetasAmarillas(SorteoPartidos.partidosC[i][1].getTarjetasAmarillas() + amarillasB3);
                    SorteoPartidos.partidosC[i][0].setTarjetasRojas(SorteoPartidos.partidosC[i][0].getTarjetasRojas() + rojasA3);
                    SorteoPartidos.partidosC[i][1].setTarjetasRojas(SorteoPartidos.partidosC[i][1].getTarjetasRojas() + rojasB3);
                    if (golesA3 > golesB3){
                        System.out.println("¡" + SorteoPartidos.partidosC[i][0].getNombreEquipo() + " ha ganado " + golesA3 + " a " + golesB3 + "!");
                        SorteoPartidos.partidosC[i][0].setPuntos(SorteoPartidos.partidosC[i][0].getPuntos() + 3);
                        SorteoPartidos.partidosC[i][0].setPartidosGanados(SorteoPartidos.partidosC[i][0].getPartidosGanados() + 1);
                        SorteoPartidos.partidosC[i][1].setPartidosPerdidos(SorteoPartidos.partidosC[i][1].getPartidosPerdidos() + 1);

                    } else if (golesA3 == golesB3) {
                        System.out.println("¡El partido ha terminado en un empate " + golesA3 + " a " + golesB3 + "!");
                        SorteoPartidos.partidosC[i][0].setPuntos(SorteoPartidos.partidosC[i][0].getPuntos() + 1);
                        SorteoPartidos.partidosC[i][1].setPuntos(SorteoPartidos.partidosC[i][1].getPuntos() + 1);
                        SorteoPartidos.partidosC[i][0].setPartidosEmpatados(SorteoPartidos.partidosC[i][0].getPartidosEmpatados() + 1);
                        SorteoPartidos.partidosC[i][1].setPartidosEmpatados(SorteoPartidos.partidosC[i][1].getPartidosEmpatados() + 1);
                    } else {
                        System.out.println("¡" + SorteoPartidos.partidosC[i][1].getNombreEquipo() + " ha ganado " + golesB3 + " a " + golesA3 + "!");
                        SorteoPartidos.partidosC[i][1].setPuntos(SorteoPartidos.partidosC[i][1].getPuntos() + 3);
                        SorteoPartidos.partidosC[i][1].setPartidosGanados(SorteoPartidos.partidosC[i][1].getPartidosGanados() + 1);
                        SorteoPartidos.partidosC[i][0].setPartidosPerdidos(SorteoPartidos.partidosC[i][0].getPartidosPerdidos() + 1);

                    }
                    int golesA4 = generarNumeroAleatorio(0, 3);
                    int golesB4 = generarNumeroAleatorio(0, 3);
                    int decidirAmarillasA4 = generarNumeroAleatorio(0, 16);
                    int decidirAmarillasB4 = generarNumeroAleatorio(0, 16);
                    int decidirRojasA4 = generarNumeroAleatorio(0, 19);
                    int decidirRojasB4 = generarNumeroAleatorio(0, 19);
                    int amarillasA4 = arrayAmarillas[decidirAmarillasA4];
                    int amarillasB4 = arrayAmarillas[decidirAmarillasB4];
                    int rojasA4 = arrayRojas[decidirRojasA4];
                    int rojasB4 = arrayRojas[decidirRojasB4];

                    System.out.println("El siguiente partido del grupo D se disputará entre " +SorteoPartidos.partidosD[i][0].getNombreEquipo() + " y " + SorteoPartidos.partidosD[i][1].getNombreEquipo());
                     Thread.sleep(1000);
                    SorteoPartidos.partidosD[i][0].setGoles(SorteoPartidos.partidosD[i][0].getGoles() + golesA4);
                    SorteoPartidos.partidosD[i][1].setGoles(SorteoPartidos.partidosD[i][1].getGoles() + golesB4);
                    SorteoPartidos.partidosD[i][0].setTarjetasAmarillas(SorteoPartidos.partidosD[i][0].getTarjetasAmarillas() + amarillasA4);
                    SorteoPartidos.partidosD[i][1].setTarjetasAmarillas(SorteoPartidos.partidosD[i][1].getTarjetasAmarillas() + amarillasB4);
                    SorteoPartidos.partidosD[i][0].setTarjetasRojas(SorteoPartidos.partidosD[i][0].getTarjetasRojas() + rojasA4);
                    SorteoPartidos.partidosD[i][1].setTarjetasRojas(SorteoPartidos.partidosD[i][1].getTarjetasRojas() + rojasB4);
                    if (golesA4 > golesB4){
                        System.out.println("¡" + SorteoPartidos.partidosD[i][0].getNombreEquipo() + " ha ganado " + golesA4 + " a " + golesB4 + "!");
                        SorteoPartidos.partidosD[i][0].setPuntos(SorteoPartidos.partidosD[i][0].getPuntos() + 3);
                        SorteoPartidos.partidosD[i][0].setPartidosGanados(SorteoPartidos.partidosD[i][0].getPartidosGanados() + 1);
                        SorteoPartidos.partidosD[i][1].setPartidosPerdidos(SorteoPartidos.partidosD[i][1].getPartidosPerdidos() + 1);

                    } else if (golesA4 == golesB4) {
                        System.out.println("¡El partido ha terminado en un empate " + golesA4 + " a " + golesB4 + "!");
                        SorteoPartidos.partidosD[i][0].setPuntos(SorteoPartidos.partidosD[i][0].getPuntos() + 1);
                        SorteoPartidos.partidosD[i][1].setPuntos(SorteoPartidos.partidosD[i][1].getPuntos() + 1);
                        SorteoPartidos.partidosD[i][0].setPartidosEmpatados(SorteoPartidos.partidosD[i][0].getPartidosEmpatados() + 1);
                        SorteoPartidos.partidosD[i][1].setPartidosEmpatados(SorteoPartidos.partidosD[i][1].getPartidosEmpatados() + 1);
                    } else {
                        System.out.println("¡" + SorteoPartidos.partidosD[i][1].getNombreEquipo() + " ha ganado " + golesB4 + " a " + golesA4 + "!");
                        SorteoPartidos.partidosD[i][1].setPuntos(SorteoPartidos.partidosD[i][1].getPuntos() + 3);
                        SorteoPartidos.partidosD[i][1].setPartidosGanados(SorteoPartidos.partidosD[i][1].getPartidosGanados() + 1);
                        SorteoPartidos.partidosD[i][0].setPartidosPerdidos(SorteoPartidos.partidosD[i][0].getPartidosPerdidos() + 1);

                    }

            }
        }
    }

        public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}