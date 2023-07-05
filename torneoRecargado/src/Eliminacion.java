import java.util.Random;

public class Eliminacion {
    Inscripcion inscripcion = new Inscripcion();
    SorteoGrupo sorteoGrupo = new SorteoGrupo();
    SorteoPartidos sorteoPartidos = new SorteoPartidos();
   
    Equipos equipos = new Equipos();
    Equipos ganadorA = sorteoGrupo.grupoA.getEquipoGanador();
    Equipos segundoA = sorteoGrupo.grupoA.getEquipoSegundo();
    Equipos ganadorB = sorteoGrupo.grupoB.getEquipoGanador();
    Equipos segundoB = sorteoGrupo.grupoB.getEquipoSegundo();
    Equipos ganadorC = sorteoGrupo.grupoC.getEquipoGanador();
    Equipos segundoC = sorteoGrupo.grupoC.getEquipoGanador();
    Equipos ganadorD = sorteoGrupo.grupoD.getEquipoGanador();
    Equipos segundoD = sorteoGrupo.grupoD.getEquipoGanador();

    public void partidoEliminacion() {
        if (inscripcion.getEquipos2().length == 8){
                int golesA = generarNumeroAleatorio(0, 3);
                int golesB = generarNumeroAleatorio(0, 3);
          
            for(int i = 0; i < 6 ;i++){
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