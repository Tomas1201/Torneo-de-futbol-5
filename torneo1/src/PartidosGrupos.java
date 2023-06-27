import java.util.Random;

public class PartidosGrupos {
    Inscripcion inscripcion = new Inscripcion();
    SorteoGrupo sorteoGrupo = new SorteoGrupo();
    SorteoPartidos sorteoPartidos = new SorteoPartidos();
    Grupo grupo = new Grupo();
    Equipos equipos = new Equipos();
    int [] arrayAmarillas = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1};
    int [] arrayRojas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    public void partidGrup() {
        if (inscripcion.getEquipos().length == 8){
            for (int i = 0; i < sorteoPartidos.partidosA.length; i++) {
                int golesA = generarNumeroAleatorio(0, 10);
                int golesB = generarNumeroAleatorio(0, 10);
                int decidirAmarillasA = generarNumeroAleatorio(0, 1);
                int decidirAmarillasB = generarNumeroAleatorio(0, 1);
                int decidirRojasA = generarNumeroAleatorio(0, 1);
                int decidirRojasB = generarNumeroAleatorio(0, 1);
                for (int j = 0; j < sorteoPartidos.partidosA[i].length; j++) {
                     int elemento = sorteoPartidos.partidosA[i][j];
            }}} else {

                }

    }
        public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
