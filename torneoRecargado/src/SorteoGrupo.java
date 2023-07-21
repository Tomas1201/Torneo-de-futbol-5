public class SorteoGrupo {

    static Grupo grupoA;
    static Grupo grupoB;
    static Grupo grupoC;
    static Grupo grupoD;

    public static void realizarSimulacion()throws Exception{
System.out.println("A continuacion se realizara el sorteo de grupos");
            if (Inscripcion.getEquipos2().length == 8) {

                Equipos[] grupA = {Inscripcion.getEquipos2()[0], Inscripcion.getEquipos2()[1], Inscripcion.getEquipos2()[2], Inscripcion.getEquipos2()[3]};
                grupoA = new Grupo();
                grupoA.setEquipo(grupA);
                grupoA.setNombreGrupo("Grupo A");

                Equipos[] grupB = {Inscripcion.getEquipos2()[4], Inscripcion.getEquipos2()[5], Inscripcion.getEquipos2()[6], Inscripcion.getEquipos2()[7]};
                grupoB = new Grupo();
                grupoB.setEquipo(grupB);

                grupoB.setNombreGrupo("Grupo B");
                System.out.println("El grupo A esta conformado por " + grupoA.getEquipo()[0].getNombreEquipo() + ", " + grupoA.getEquipo()[1].getNombreEquipo() + ", " +  grupoA.getEquipo()[2].getNombreEquipo() + " y " +  grupoA.getEquipo()[3].getNombreEquipo());
                System.out.println("El grupo B esta conformado por " + grupoB.getEquipo()[0].getNombreEquipo() + ", " + grupoB.getEquipo()[1].getNombreEquipo() + ", " +  grupoB.getEquipo()[2].getNombreEquipo() + " y " +  grupoB.getEquipo()[3].getNombreEquipo());

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

               
 System.out.println("El grupo A esta conformado por " + grupoA.getEquipo()[0].getNombreEquipo() + ", " + grupoA.getEquipo()[1].getNombreEquipo() + ", " +  grupoA.getEquipo()[2].getNombreEquipo() + " y " +  grupoA.getEquipo()[3].getNombreEquipo());
              Thread.sleep(1000);
                System.out.println("El grupo B esta conformado por " + grupoB.getEquipo()[0].getNombreEquipo() + ", " + grupoB.getEquipo()[1].getNombreEquipo() + ", " +  grupoB.getEquipo()[2].getNombreEquipo() + " y " +  grupoB.getEquipo()[3].getNombreEquipo());
                  Thread.sleep(1000);
                System.out.println("El grupo C esta conformado por " + grupoC.getEquipo()[0].getNombreEquipo() + ", " + grupoC.getEquipo()[1].getNombreEquipo() + ", " +  grupoC.getEquipo()[2].getNombreEquipo() + " y " +  grupoC.getEquipo()[3].getNombreEquipo());
                  Thread.sleep(1000);
                System.out.println("El grupo D esta conformado por " + grupoD.getEquipo()[0].getNombreEquipo() + ", " + grupoD.getEquipo()[1].getNombreEquipo() + ", " +  grupoD.getEquipo()[2].getNombreEquipo() + " y " +  grupoD.getEquipo()[3].getNombreEquipo());
                  Thread.sleep(1000);
            }
           
      
        }


        
}