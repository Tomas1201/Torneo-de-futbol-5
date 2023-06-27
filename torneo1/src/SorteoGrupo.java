public class SorteoGrupo {
    Inscripcion inscripcion = new Inscripcion();
    Grupo grupoA;
    Grupo grupoB;
    Grupo grupoC;
    Grupo grupoD;
    public void realizarSimulacion (){

        for (int i = 0, j = inscripcion.getEquipos().length / 4; i < j; i++) {
            if (inscripcion.getEquipos().length == 8 && i == 0) {
                grupoA = new Grupo();
                Equipos[] equipo = grupoA.getEquipo();
                equipo[0] = inscripcion.getEquipos()[0];
                equipo[1] = inscripcion.getEquipos()[1];
                equipo[2] = inscripcion.getEquipos()[2];
                equipo[3] = inscripcion.getEquipos()[3];
                grupoA.setNombreGrupo("Grupo A");
            } else if (inscripcion.getEquipos().length == 8 && i == 1) {
                grupoB = new Grupo();
                Equipos[] equipo = grupoB.getEquipo();
                equipo[0] = inscripcion.getEquipos()[4];
                equipo[1] = inscripcion.getEquipos()[5];
                equipo[2] = inscripcion.getEquipos()[6];
                equipo[3] = inscripcion.getEquipos()[7];
                grupoB.setNombreGrupo("Grupo B");
            } else if (inscripcion.getEquipos().length == 16 && i == 0) {
                grupoA = new Grupo();
                Equipos[] equipo = grupoA.getEquipo();
                equipo[0] = inscripcion.getEquipos()[0];
                equipo[1] = inscripcion.getEquipos()[1];
                equipo[2] = inscripcion.getEquipos()[2];
                equipo[3] = inscripcion.getEquipos()[3];
                grupoA.setNombreGrupo("Grupo A");
            } else if (inscripcion.getEquipos().length == 16 && i == 1) {
                grupoB = new Grupo();
                Equipos[] equipo = grupoB.getEquipo();
                equipo[0] = inscripcion.getEquipos()[4];
                equipo[1] = inscripcion.getEquipos()[5];
                equipo[2] = inscripcion.getEquipos()[6];
                equipo[3] = inscripcion.getEquipos()[7];
                grupoB.setNombreGrupo("Grupo B");
            } else if (inscripcion.getEquipos().length == 16 && i == 2) {
                grupoC = new Grupo();
                Equipos[] equipo = grupoC.getEquipo();
                equipo[0] = inscripcion.getEquipos()[8];
                equipo[1] = inscripcion.getEquipos()[9];
                equipo[2] = inscripcion.getEquipos()[10];
                equipo[3] = inscripcion.getEquipos()[11];
                grupoC.setNombreGrupo("Grupo C");
            } else if (inscripcion.getEquipos().length == 16 && i == 3) {
                grupoD = new Grupo();
                Equipos[] equipo = grupoD.getEquipo();
                equipo[0] = inscripcion.getEquipos()[12];
                equipo[1] = inscripcion.getEquipos()[13];
                equipo[2] = inscripcion.getEquipos()[14];
                equipo[3] = inscripcion.getEquipos()[15];
                grupoD.setNombreGrupo("Grupo D");
            }
        }
    }
}