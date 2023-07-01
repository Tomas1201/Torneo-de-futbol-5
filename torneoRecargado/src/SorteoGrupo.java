public class SorteoGrupo {
      Inscripcion inscripcion = new Inscripcion();
    Grupo grupoA;
    Grupo grupoB;
    Grupo grupoC;
    Grupo grupoD;

    public void realizarSimulacion (){

            if (inscripcion.getEquipos2().length == 8) {
                grupoA = new Grupo();
                System.arraycopy(inscripcion.getEquipos2(), 0, grupoA.getEquipo(), 0, 4);
                grupoA.setNombreGrupo("Grupo A");

                grupoB = new Grupo();
                System.arraycopy(inscripcion.getEquipos2(), 4, grupoB.getEquipo(), 0, 4);
                grupoB.setNombreGrupo("Grupo B");

            } else {
                grupoA = new Grupo();
                System.arraycopy(inscripcion.getEquipos2(), 0, grupoA.getEquipo(), 0, 4);
                grupoA.setNombreGrupo("Grupo A");

                grupoB = new Grupo();
                System.arraycopy(inscripcion.getEquipos2(), 4, grupoB.getEquipo(), 0, 4);
                grupoB.setNombreGrupo("Grupo B");

                grupoC = new Grupo();
                System.arraycopy(inscripcion.getEquipos2(), 8, grupoC.getEquipo(), 0, 4);
                grupoC.setNombreGrupo("Grupo C");

                grupoD = new Grupo();
                System.arraycopy(inscripcion.getEquipos2(), 12, grupoC.getEquipo(), 0, 4);
                grupoD.setNombreGrupo("Grupo D");
            }
        }
}