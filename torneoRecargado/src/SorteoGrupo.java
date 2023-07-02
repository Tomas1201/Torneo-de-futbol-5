public class SorteoGrupo {
    static Grupo grupoA;
    static Grupo grupoB;
    static Grupo grupoC;
    static Grupo grupoD;

    public static void realizarSimulacion(){

            if (Inscripcion.getEquipos2().length == 8) {

                Equipos[] grupA = {Inscripcion.getEquipos2()[0], Inscripcion.getEquipos2()[1], Inscripcion.getEquipos2()[2], Inscripcion.getEquipos2()[3]};
                grupoA = new Grupo();
                grupoA.setEquipo(grupA);
                grupoA.setNombreGrupo("Grupo A");

                Equipos[] grupB = {Inscripcion.getEquipos2()[4], Inscripcion.getEquipos2()[5], Inscripcion.getEquipos2()[6], Inscripcion.getEquipos2()[7]};
                grupoB = new Grupo();
                grupoB.setEquipo(grupB);
                grupoB.setNombreGrupo("Grupo B");

            } else {
                grupoA = new Grupo();

                Equipos[] grupA = {Inscripcion.getEquipos2()[0], Inscripcion.getEquipos2()[1], Inscripcion.getEquipos2()[2], Inscripcion.getEquipos2()[3]};
                grupoA.setEquipo(grupA);
                grupoA.setNombreGrupo("Grupo A");

                Equipos[] grupB = {Inscripcion.getEquipos2()[4], Inscripcion.getEquipos2()[5], Inscripcion.getEquipos2()[6], Inscripcion.getEquipos2()[7]};
                grupoB = new Grupo();
                grupoB.setEquipo(grupB);
                grupoB.setNombreGrupo("Grupo B");

                Equipos[] grupC = {Inscripcion.getEquipos2()[8], Inscripcion.getEquipos2()[9], Inscripcion.getEquipos2()[10], Inscripcion.getEquipos2()[11]};
                grupoC = new Grupo();
                grupoC.setEquipo(grupC);
                grupoC.setNombreGrupo("Grupo C");

                Equipos[] grupD = {Inscripcion.getEquipos2()[12], Inscripcion.getEquipos2()[13], Inscripcion.getEquipos2()[14], Inscripcion.getEquipos2()[15]};
                grupoD = new Grupo();
                grupoD.setEquipo(grupD);
                grupoD.setNombreGrupo("Grupo D");
            }
        }
}