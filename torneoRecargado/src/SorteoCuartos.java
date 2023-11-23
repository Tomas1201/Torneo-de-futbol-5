public class SorteoCuartos {

    static Equipos[][] semis;
    static Equipos[][] cuartos;

    public static void sorteCuartos() {
        if (Inscripcion.getEquipos2().length == 8) {
            Equipos ganadorA = SorteoGrupo.grupoA.getEquipoGanador();
            Equipos segundoA = SorteoGrupo.grupoA.getEquipoSegundo();
            Equipos ganadorB = SorteoGrupo.grupoB.getEquipoGanador();
            Equipos segundoB = SorteoGrupo.grupoB.getEquipoSegundo();
            semis = new Equipos[2][2];
            semis[0][0] = ganadorA;
            semis[0][1] = segundoB;
            semis[1][0] = ganadorB;
            semis[1][1] = segundoA;

        } else {
            Equipos ganadorA = SorteoGrupo.grupoA.getEquipoGanador();
            Equipos segundoA = SorteoGrupo.grupoA.getEquipoSegundo();
            Equipos ganadorB = SorteoGrupo.grupoB.getEquipoGanador();
            Equipos segundoB = SorteoGrupo.grupoB.getEquipoSegundo();
            Equipos ganadorC = SorteoGrupo.grupoC.getEquipoGanador();
            Equipos segundoC = SorteoGrupo.grupoC.getEquipoGanador();
            Equipos ganadorD = SorteoGrupo.grupoD.getEquipoGanador();
            Equipos segundoD = SorteoGrupo.grupoD.getEquipoGanador();
            cuartos = new Equipos[4][2];
            cuartos[0][0] = ganadorA;
            cuartos[0][1] = segundoB;
            cuartos[1][0] = ganadorB;
            cuartos[1][1] = segundoA;
            cuartos[2][0] = ganadorC;
            cuartos[2][1] = segundoD;
            cuartos[3][0] = ganadorD;
            cuartos[3][1] = segundoC;
        }
    }
}