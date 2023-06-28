public class SorteoGrupo {
    Inscripcion inscripcion = new Inscripcion();
    Grupo grupoA;
    Grupo grupoB;
    Grupo grupoC;
    Grupo grupoD;
    public void realizarSimulacion (){

            if (inscripcion.getEquipos().length == 8) {
                grupoA = new Grupo();
                System.arraycopy(inscripcion.getEquipos(), 0, grupoA.getEquipo(), 0, 4);
                grupoA.setNombreGrupo("Grupo A");

                grupoB = new Grupo();
                System.arraycopy(inscripcion.getEquipos(), 4, grupoB.getEquipo(), 0, 4);
                grupoB.setNombreGrupo("Grupo B");

            } else {
                grupoA = new Grupo();
                System.arraycopy(inscripcion.getEquipos(), 0, grupoA.getEquipo(), 0, 4);
                grupoA.setNombreGrupo("Grupo A");

                grupoB = new Grupo();
                System.arraycopy(inscripcion.getEquipos(), 4, grupoB.getEquipo(), 0, 4);
                grupoB.setNombreGrupo("Grupo B");

                grupoC = new Grupo();
                System.arraycopy(inscripcion.getEquipos(), 8, grupoC.getEquipo(), 0, 4);
                grupoC.setNombreGrupo("Grupo C");

                grupoD = new Grupo();
                System.arraycopy(inscripcion.getEquipos(), 12, grupoC.getEquipo(), 0, 4);
                grupoD.setNombreGrupo("Grupo D");
            }
        }
    }