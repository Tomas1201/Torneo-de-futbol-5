public class SorteoGrupo {
    Inscripcion inscripcion = new Inscripcion();
    public void realizarSimulacion() {

        for (int i = 0, j = inscripcion.getEquipos2().length / 4; i < j; i++) {
            if (inscripcion.getEquipos2().length == 8 && i == 0) {
                Grupo grupoA = new Grupo();
                Equipos[] equipo = grupoA.getEquipo();
                equipo[0] = inscripcion.getEquipos2()[0];
                equipo[1] = inscripcion.getEquipos2()[1];
                equipo[2] = inscripcion.getEquipos2()[2];
                equipo[3] = inscripcion.getEquipos2()[3];
                grupoA.setNombreGrupo("Grupo A");
            } else if (inscripcion.getEquipos2().length == 8 && i == 1) {
                Grupo grupoB = new Grupo();
                Equipos[] equipo = grupoB.getEquipo();
                equipo[0] = inscripcion.getEquipos2()[4];
                equipo[1] = inscripcion.getEquipos2()[5];
                equipo[2] = inscripcion.getEquipos2()[6];
                equipo[3] = inscripcion.getEquipos2()[7];
                grupoB.setNombreGrupo("Grupo B");
            } else if (inscripcion.getEquipos2().length == 16 && i == 0) {
                Grupo grupoA = new Grupo();
                Equipos[] equipo = grupoA.getEquipo();
                equipo[0] = inscripcion.getEquipos2()[0];
                equipo[1] = inscripcion.getEquipos2()[1];
                equipo[2] = inscripcion.getEquipos2()[2];
                equipo[3] = inscripcion.getEquipos2()[3];
                grupoA.setNombreGrupo("Grupo A");
            } else if (inscripcion.getEquipos2().length == 16 && i == 1) {
                Grupo grupoB = new Grupo();
                Equipos[] equipo = grupoB.getEquipo();
                equipo[0] = inscripcion.getEquipos2()[4];
                equipo[1] = inscripcion.getEquipos2()[5];
                equipo[2] = inscripcion.getEquipos2()[6];
                equipo[3] = inscripcion.getEquipos2()[7];
                grupoB.setNombreGrupo("Grupo B");
            } else if (inscripcion.getEquipos2().length == 16 && i == 2) {
                Grupo grupoC = new Grupo();
                Equipos[] equipo = grupoC.getEquipo();
                equipo[0] = inscripcion.getEquipos2()[8];
                equipo[1] = inscripcion.getEquipos2()[9];
                equipo[2] = inscripcion.getEquipos2()[10];
                equipo[3] = inscripcion.getEquipos2()[11];
                grupoC.setNombreGrupo("Grupo C");
            } else if (inscripcion.getEquipos2().length == 16 && i == 3) {
                Grupo grupoD = new Grupo();
                Equipos[] equipo = grupoD.getEquipo();
                equipo[0] = inscripcion.getEquipos2()[12];
                equipo[1] = inscripcion.getEquipos2()[13];
                equipo[2] = inscripcion.getEquipos2()[14];
                equipo[3] = inscripcion.getEquipos2()[15];
                grupoD.setNombreGrupo("Grupo D");
            }
        }
    }
}