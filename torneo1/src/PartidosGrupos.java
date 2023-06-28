import java.util.Random;

public class PartidosGrupos {
    Inscripcion inscripcion = new Inscripcion();
    SorteoGrupo sorteoGrupo = new SorteoGrupo();
    SorteoPartidos sorteoPartidos = new SorteoPartidos();
    Grupo grupo = new Grupo();
    Equipos equipos = new Equipos();
    int [] arrayAmarillas = {3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 0, 4, 5,};
    int [] arrayRojas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    public void partidGrup() {
        if (inscripcion.getEquipos().length == 8){
            for (int i = 0; i < sorteoPartidos.partidosA.length; i++) {
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
                sorteoPartidos.partidosA[i][0].setGoles(sorteoPartidos.partidosA[i][0].getGoles() + golesA);
                sorteoPartidos.partidosA[i][1].setGoles(sorteoPartidos.partidosA[i][1].getGoles() + golesB);
                sorteoPartidos.partidosA[i][0].setTarjetasAmarillas(sorteoPartidos.partidosA[i][0].getTarjetasAmarillas() + amarillasA);
                sorteoPartidos.partidosA[i][1].setTarjetasAmarillas(sorteoPartidos.partidosA[i][1].getTarjetasAmarillas() + amarillasB);
                sorteoPartidos.partidosA[i][0].setTarjetasRojas(sorteoPartidos.partidosA[i][0].getTarjetasRojas() + rojasA);
                sorteoPartidos.partidosA[i][1].setTarjetasRojas(sorteoPartidos.partidosA[i][1].getTarjetasRojas() + rojasB);
                if (golesA > golesB){
                    sorteoPartidos.partidosA[i][0].setPuntos(sorteoPartidos.partidosA[i][0].getPuntos() + 3);
                    sorteoPartidos.partidosA[i][0].setPartidosGanados(sorteoPartidos.partidosA[i][0].getPartidosGanados() + 1);
                    sorteoPartidos.partidosA[i][1].setPartidosPerdidos(sorteoPartidos.partidosA[i][1].getPartidosPerdidos() + 1);

                } else if (golesA == golesB) {
                    sorteoPartidos.partidosA[i][0].setPuntos(sorteoPartidos.partidosA[i][0].getPuntos() + 1);
                    sorteoPartidos.partidosA[i][1].setPuntos(sorteoPartidos.partidosA[i][1].getPuntos() + 1);
                    sorteoPartidos.partidosA[i][0].setPartidosEmpatados(sorteoPartidos.partidosA[i][0].getPartidosEmpatados() + 1);
                    sorteoPartidos.partidosA[i][1].setPartidosEmpatados(sorteoPartidos.partidosA[i][1].getPartidosEmpatados() + 1);
                } else {
                    sorteoPartidos.partidosA[i][1].setPuntos(sorteoPartidos.partidosA[i][1].getPuntos() + 3);
                    sorteoPartidos.partidosA[i][1].setPartidosGanados(sorteoPartidos.partidosA[i][1].getPartidosGanados() + 1);
                    sorteoPartidos.partidosA[i][0].setPartidosPerdidos(sorteoPartidos.partidosA[i][0].getPartidosPerdidos() + 1);
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
                sorteoPartidos.partidosB[i][0].setGoles(sorteoPartidos.partidosB[i][0].getGoles() + golesA2);
                sorteoPartidos.partidosB[i][1].setGoles(sorteoPartidos.partidosB[i][1].getGoles() + golesB2);
                sorteoPartidos.partidosB[i][0].setTarjetasAmarillas(sorteoPartidos.partidosB[i][0].getTarjetasAmarillas() + amarillasA2);
                sorteoPartidos.partidosB[i][1].setTarjetasAmarillas(sorteoPartidos.partidosB[i][1].getTarjetasAmarillas() + amarillasB2);
                sorteoPartidos.partidosB[i][0].setTarjetasRojas(sorteoPartidos.partidosB[i][0].getTarjetasRojas() + rojasA2);
                sorteoPartidos.partidosB[i][1].setTarjetasRojas(sorteoPartidos.partidosB[i][1].getTarjetasRojas() + rojasB2);
                  if (golesA2 > golesB2){
                    sorteoPartidos.partidosB[i][0].setPuntos(sorteoPartidos.partidosB[i][0].getPuntos() + 3);
                    sorteoPartidos.partidosB[i][0].setPartidosGanados(sorteoPartidos.partidosB[i][0].getPartidosGanados() + 1);
                    sorteoPartidos.partidosB[i][1].setPartidosPerdidos(sorteoPartidos.partidosB[i][1].getPartidosPerdidos() + 1);

                } else if (golesA2 == golesB2) {
                    sorteoPartidos.partidosB[i][0].setPuntos(sorteoPartidos.partidosB[i][0].getPuntos() + 1);
                    sorteoPartidos.partidosB[i][1].setPuntos(sorteoPartidos.partidosB[i][1].getPuntos() + 1);
                    sorteoPartidos.partidosB[i][0].setPartidosEmpatados(sorteoPartidos.partidosB[i][0].getPartidosEmpatados() + 1);
                    sorteoPartidos.partidosB[i][1].setPartidosEmpatados(sorteoPartidos.partidosB[i][1].getPartidosEmpatados() + 1);
                } else {
                    sorteoPartidos.partidosB[i][1].setPuntos(sorteoPartidos.partidosB[i][1].getPuntos() + 3);
                    sorteoPartidos.partidosB[i][1].setPartidosGanados(sorteoPartidos.partidosB[i][1].getPartidosGanados() + 1);
                    sorteoPartidos.partidosB[i][0].setPartidosPerdidos(sorteoPartidos.partidosB[i][0].getPartidosPerdidos() + 1);
                }
            }} else {
                for (int i = 0; i < sorteoPartidos.partidosA.length; i++) {
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
                    sorteoPartidos.partidosA[i][0].setGoles(sorteoPartidos.partidosA[i][0].getGoles() + golesA);
                    sorteoPartidos.partidosA[i][1].setGoles(sorteoPartidos.partidosA[i][1].getGoles() + golesB);
                    sorteoPartidos.partidosA[i][0].setTarjetasAmarillas(sorteoPartidos.partidosA[i][0].getTarjetasAmarillas() + amarillasA);
                    sorteoPartidos.partidosA[i][1].setTarjetasAmarillas(sorteoPartidos.partidosA[i][1].getTarjetasAmarillas() + amarillasB);
                    sorteoPartidos.partidosA[i][0].setTarjetasRojas(sorteoPartidos.partidosA[i][0].getTarjetasRojas() + rojasA);
                    sorteoPartidos.partidosA[i][1].setTarjetasRojas(sorteoPartidos.partidosA[i][1].getTarjetasRojas() + rojasB);
                    if (golesA > golesB){
                        sorteoPartidos.partidosA[i][0].setPuntos(sorteoPartidos.partidosA[i][0].getPuntos() + 3);
                        sorteoPartidos.partidosA[i][0].setPartidosGanados(sorteoPartidos.partidosA[i][0].getPartidosGanados() + 1);
                        sorteoPartidos.partidosA[i][1].setPartidosPerdidos(sorteoPartidos.partidosA[i][1].getPartidosPerdidos() + 1);

                    } else if (golesA == golesB) {
                        sorteoPartidos.partidosA[i][0].setPuntos(sorteoPartidos.partidosA[i][0].getPuntos() + 1);
                        sorteoPartidos.partidosA[i][1].setPuntos(sorteoPartidos.partidosA[i][1].getPuntos() + 1);
                        sorteoPartidos.partidosA[i][0].setPartidosEmpatados(sorteoPartidos.partidosA[i][0].getPartidosEmpatados() + 1);
                        sorteoPartidos.partidosA[i][1].setPartidosEmpatados(sorteoPartidos.partidosA[i][1].getPartidosEmpatados() + 1);
                    } else {
                        sorteoPartidos.partidosA[i][1].setPuntos(sorteoPartidos.partidosA[i][1].getPuntos() + 3);
                        sorteoPartidos.partidosA[i][1].setPartidosGanados(sorteoPartidos.partidosA[i][1].getPartidosGanados() + 1);
                        sorteoPartidos.partidosA[i][0].setPartidosPerdidos(sorteoPartidos.partidosA[i][0].getPartidosPerdidos() + 1);
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
                    sorteoPartidos.partidosB[i][0].setGoles(sorteoPartidos.partidosB[i][0].getGoles() + golesA2);
                    sorteoPartidos.partidosB[i][1].setGoles(sorteoPartidos.partidosB[i][1].getGoles() + golesB2);
                    sorteoPartidos.partidosB[i][0].setTarjetasAmarillas(sorteoPartidos.partidosB[i][0].getTarjetasAmarillas() + amarillasA2);
                    sorteoPartidos.partidosB[i][1].setTarjetasAmarillas(sorteoPartidos.partidosB[i][1].getTarjetasAmarillas() + amarillasB2);
                    sorteoPartidos.partidosB[i][0].setTarjetasRojas(sorteoPartidos.partidosB[i][0].getTarjetasRojas() + rojasA2);
                    sorteoPartidos.partidosB[i][1].setTarjetasRojas(sorteoPartidos.partidosB[i][1].getTarjetasRojas() + rojasB2);
                    if (golesA2 > golesB2){
                        sorteoPartidos.partidosB[i][0].setPuntos(sorteoPartidos.partidosB[i][0].getPuntos() + 3);
                        sorteoPartidos.partidosB[i][0].setPartidosGanados(sorteoPartidos.partidosB[i][0].getPartidosGanados() + 1);
                        sorteoPartidos.partidosB[i][1].setPartidosPerdidos(sorteoPartidos.partidosB[i][1].getPartidosPerdidos() + 1);

                    } else if (golesA2 == golesB2) {
                        sorteoPartidos.partidosB[i][0].setPuntos(sorteoPartidos.partidosB[i][0].getPuntos() + 1);
                        sorteoPartidos.partidosB[i][1].setPuntos(sorteoPartidos.partidosB[i][1].getPuntos() + 1);
                        sorteoPartidos.partidosB[i][0].setPartidosEmpatados(sorteoPartidos.partidosB[i][0].getPartidosEmpatados() + 1);
                        sorteoPartidos.partidosB[i][1].setPartidosEmpatados(sorteoPartidos.partidosB[i][1].getPartidosEmpatados() + 1);
                    } else {
                        sorteoPartidos.partidosB[i][1].setPuntos(sorteoPartidos.partidosB[i][1].getPuntos() + 3);
                        sorteoPartidos.partidosB[i][1].setPartidosGanados(sorteoPartidos.partidosB[i][1].getPartidosGanados() + 1);
                        sorteoPartidos.partidosB[i][0].setPartidosPerdidos(sorteoPartidos.partidosB[i][0].getPartidosPerdidos() + 1);
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
                    sorteoPartidos.partidosC[i][0].setGoles(sorteoPartidos.partidosC[i][0].getGoles() + golesA3);
                    sorteoPartidos.partidosC[i][1].setGoles(sorteoPartidos.partidosC[i][1].getGoles() + golesB3);
                    sorteoPartidos.partidosC[i][0].setTarjetasAmarillas(sorteoPartidos.partidosC[i][0].getTarjetasAmarillas() + amarillasA3);
                    sorteoPartidos.partidosC[i][1].setTarjetasAmarillas(sorteoPartidos.partidosC[i][1].getTarjetasAmarillas() + amarillasB3);
                    sorteoPartidos.partidosC[i][0].setTarjetasRojas(sorteoPartidos.partidosC[i][0].getTarjetasRojas() + rojasA3);
                    sorteoPartidos.partidosC[i][1].setTarjetasRojas(sorteoPartidos.partidosC[i][1].getTarjetasRojas() + rojasB3);
                    if (golesA3 > golesB3){
                        sorteoPartidos.partidosC[i][0].setPuntos(sorteoPartidos.partidosC[i][0].getPuntos() + 3);
                        sorteoPartidos.partidosC[i][0].setPartidosGanados(sorteoPartidos.partidosC[i][0].getPartidosGanados() + 1);
                        sorteoPartidos.partidosC[i][1].setPartidosPerdidos(sorteoPartidos.partidosC[i][1].getPartidosPerdidos() + 1);

                    } else if (golesA3 == golesB3) {
                        sorteoPartidos.partidosC[i][0].setPuntos(sorteoPartidos.partidosC[i][0].getPuntos() + 1);
                        sorteoPartidos.partidosC[i][1].setPuntos(sorteoPartidos.partidosC[i][1].getPuntos() + 1);
                        sorteoPartidos.partidosC[i][0].setPartidosEmpatados(sorteoPartidos.partidosC[i][0].getPartidosEmpatados() + 1);
                        sorteoPartidos.partidosC[i][1].setPartidosEmpatados(sorteoPartidos.partidosC[i][1].getPartidosEmpatados() + 1);
                    } else {
                        sorteoPartidos.partidosC[i][1].setPuntos(sorteoPartidos.partidosC[i][1].getPuntos() + 3);
                        sorteoPartidos.partidosC[i][1].setPartidosGanados(sorteoPartidos.partidosC[i][1].getPartidosGanados() + 1);
                        sorteoPartidos.partidosC[i][0].setPartidosPerdidos(sorteoPartidos.partidosC[i][0].getPartidosPerdidos() + 1);
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
                    sorteoPartidos.partidosD[i][0].setGoles(sorteoPartidos.partidosD[i][0].getGoles() + golesA4);
                    sorteoPartidos.partidosD[i][1].setGoles(sorteoPartidos.partidosD[i][1].getGoles() + golesB4);
                    sorteoPartidos.partidosD[i][0].setTarjetasAmarillas(sorteoPartidos.partidosD[i][0].getTarjetasAmarillas() + amarillasA4);
                    sorteoPartidos.partidosD[i][1].setTarjetasAmarillas(sorteoPartidos.partidosD[i][1].getTarjetasAmarillas() + amarillasB4);
                    sorteoPartidos.partidosD[i][0].setTarjetasRojas(sorteoPartidos.partidosD[i][0].getTarjetasRojas() + rojasA4);
                    sorteoPartidos.partidosD[i][1].setTarjetasRojas(sorteoPartidos.partidosD[i][1].getTarjetasRojas() + rojasB4);
                    if (golesA4 > golesB4){
                        sorteoPartidos.partidosD[i][0].setPuntos(sorteoPartidos.partidosD[i][0].getPuntos() + 3);
                        sorteoPartidos.partidosD[i][0].setPartidosGanados(sorteoPartidos.partidosD[i][0].getPartidosGanados() + 1);
                        sorteoPartidos.partidosD[i][1].setPartidosPerdidos(sorteoPartidos.partidosD[i][1].getPartidosPerdidos() + 1);

                    } else if (golesA4 == golesB4) {
                        sorteoPartidos.partidosD[i][0].setPuntos(sorteoPartidos.partidosD[i][0].getPuntos() + 1);
                        sorteoPartidos.partidosD[i][1].setPuntos(sorteoPartidos.partidosD[i][1].getPuntos() + 1);
                        sorteoPartidos.partidosD[i][0].setPartidosEmpatados(sorteoPartidos.partidosD[i][0].getPartidosEmpatados() + 1);
                        sorteoPartidos.partidosD[i][1].setPartidosEmpatados(sorteoPartidos.partidosD[i][1].getPartidosEmpatados() + 1);
                    } else {
                        sorteoPartidos.partidosD[i][1].setPuntos(sorteoPartidos.partidosD[i][1].getPuntos() + 3);
                        sorteoPartidos.partidosD[i][1].setPartidosGanados(sorteoPartidos.partidosD[i][1].getPartidosGanados() + 1);
                        sorteoPartidos.partidosD[i][0].setPartidosPerdidos(sorteoPartidos.partidosD[i][0].getPartidosPerdidos() + 1);
                    }

            }
        }
    }

        public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}