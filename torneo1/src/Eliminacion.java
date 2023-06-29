import java.util.Random;

public class Eliminacion {
    Inscripcion inscripcion = new Inscripcion();
    SorteoGrupo sorteoGrupo = new SorteoGrupo();
    SorteoPartidos sorteoPartidos = new SorteoPartidos();
    Grupo grupo = new Grupo();
    Equipos equipos = new Equipos();
    int [] arrayAmarillas = {3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 0, 4, 5,};
    int [] arrayRojas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    public void partidoEliminacion() {
        if (inscripcion.getEquipos2().length == 8){
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

                SorteoGrupo.grupoA

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
            }

}else {}

    }
                public static int generarNumeroAleatorio(int min, int max) {
            Random random = new Random();
                return random.nextInt(max - min + 1) + min;
        }}