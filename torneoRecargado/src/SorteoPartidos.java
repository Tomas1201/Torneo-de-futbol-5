public class SorteoPartidos {

static Equipos[][] partidosA;
static Equipos[][] partidosB;
static Equipos[][] partidosC;
static Equipos[][] partidosD;
    public static void sorteParti() {
        if (Inscripcion.getEquipos2().length == 8){
            partidosA = new Equipos[6][2];
            partidosA[0][0] = SorteoGrupo.grupoA.getEquipo()[0];
            partidosA[0][1] = SorteoGrupo.grupoA.getEquipo()[1];
            partidosA[1][0] = SorteoGrupo.grupoA.getEquipo()[2];
            partidosA[1][1] = SorteoGrupo.grupoA.getEquipo()[3];
            partidosA[2][0] = SorteoGrupo.grupoA.getEquipo()[0];
            partidosA[2][1] = SorteoGrupo.grupoA.getEquipo()[3];
            partidosA[3][0] = SorteoGrupo.grupoA.getEquipo()[1];
            partidosA[3][1] = SorteoGrupo.grupoA.getEquipo()[2];
            partidosA[4][0] = SorteoGrupo.grupoA.getEquipo()[0];
            partidosA[4][1] = SorteoGrupo.grupoA.getEquipo()[2];
            partidosA[5][0] = SorteoGrupo.grupoA.getEquipo()[1];
            partidosA[5][1] = SorteoGrupo.grupoA.getEquipo()[3];
            partidosB = new Equipos[6][2];
            partidosB[0][0] = SorteoGrupo.grupoB.getEquipo()[0];
            partidosB[0][1] = SorteoGrupo.grupoB.getEquipo()[1];
            partidosB[1][0] = SorteoGrupo.grupoB.getEquipo()[2];
            partidosB[1][1] = SorteoGrupo.grupoB.getEquipo()[3];
            partidosB[2][0] = SorteoGrupo.grupoB.getEquipo()[0];
            partidosB[2][1] = SorteoGrupo.grupoB.getEquipo()[3];
            partidosB[3][0] = SorteoGrupo.grupoB.getEquipo()[1];
            partidosB[3][1] = SorteoGrupo.grupoB.getEquipo()[2];
            partidosB[4][0] = SorteoGrupo.grupoB.getEquipo()[0];
            partidosB[4][1] = SorteoGrupo.grupoB.getEquipo()[2];
            partidosB[5][0] = SorteoGrupo.grupoB.getEquipo()[1];
            partidosB[5][1] = SorteoGrupo.grupoB.getEquipo()[3];
        }else {
            partidosA = new Equipos[6][2];
            partidosA[0][0] = SorteoGrupo.grupoA.getEquipo()[0];
            partidosA[0][1] = SorteoGrupo.grupoA.getEquipo()[1];
            partidosA[1][0] = SorteoGrupo.grupoA.getEquipo()[2];
            partidosA[1][1] = SorteoGrupo.grupoA.getEquipo()[3];
            partidosA[2][0] = SorteoGrupo.grupoA.getEquipo()[0];
            partidosA[2][1] = SorteoGrupo.grupoA.getEquipo()[3];
            partidosA[3][0] = SorteoGrupo.grupoA.getEquipo()[1];
            partidosA[3][1] = SorteoGrupo.grupoA.getEquipo()[2];
            partidosA[4][0] = SorteoGrupo.grupoA.getEquipo()[0];
            partidosA[4][1] = SorteoGrupo.grupoA.getEquipo()[2];
            partidosA[5][0] = SorteoGrupo.grupoA.getEquipo()[1];
            partidosA[5][1] = SorteoGrupo.grupoA.getEquipo()[3];
            partidosB = new Equipos[6][2];
            partidosB[0][0] = SorteoGrupo.grupoB.getEquipo()[0];
            partidosB[0][1] = SorteoGrupo.grupoB.getEquipo()[1];
            partidosB[1][0] = SorteoGrupo.grupoB.getEquipo()[2];
            partidosB[1][1] = SorteoGrupo.grupoB.getEquipo()[3];
            partidosB[2][0] = SorteoGrupo.grupoB.getEquipo()[0];
            partidosB[2][1] = SorteoGrupo.grupoB.getEquipo()[3];
            partidosB[3][0] = SorteoGrupo.grupoB.getEquipo()[1];
            partidosB[3][1] = SorteoGrupo.grupoB.getEquipo()[2];
            partidosB[4][0] = SorteoGrupo.grupoB.getEquipo()[0];
            partidosB[4][1] = SorteoGrupo.grupoB.getEquipo()[2];
            partidosB[5][0] = SorteoGrupo.grupoB.getEquipo()[1];
            partidosB[5][1] = SorteoGrupo.grupoB.getEquipo()[3];
            partidosC = new Equipos[6][2];
            partidosC[0][0] = SorteoGrupo.grupoC.getEquipo()[0];
            partidosC[0][1] = SorteoGrupo.grupoC.getEquipo()[1];
            partidosC[1][0] = SorteoGrupo.grupoC.getEquipo()[2];
            partidosC[1][1] = SorteoGrupo.grupoC.getEquipo()[3];
            partidosC[2][0] = SorteoGrupo.grupoC.getEquipo()[0];
            partidosC[2][1] = SorteoGrupo.grupoC.getEquipo()[3];
            partidosC[3][0] = SorteoGrupo.grupoC.getEquipo()[1];
            partidosC[3][1] = SorteoGrupo.grupoC.getEquipo()[2];
            partidosC[4][0] = SorteoGrupo.grupoC.getEquipo()[0];
            partidosC[4][1] = SorteoGrupo.grupoC.getEquipo()[2];
            partidosC[5][0] = SorteoGrupo.grupoC.getEquipo()[1];
            partidosC[5][1] = SorteoGrupo.grupoC.getEquipo()[3];
            partidosD = new Equipos[6][2];
            partidosD[0][0] = SorteoGrupo.grupoD.getEquipo()[0];
            partidosD[0][1] = SorteoGrupo.grupoD.getEquipo()[1];
            partidosD[1][0] = SorteoGrupo.grupoD.getEquipo()[2];
            partidosD[1][1] = SorteoGrupo.grupoD.getEquipo()[3];
            partidosD[2][0] = SorteoGrupo.grupoD.getEquipo()[0];
            partidosD[2][1] = SorteoGrupo.grupoD.getEquipo()[3];
            partidosD[3][0] = SorteoGrupo.grupoD.getEquipo()[1];
            partidosD[3][1] = SorteoGrupo.grupoD.getEquipo()[2];
            partidosD[4][0] = SorteoGrupo.grupoD.getEquipo()[0];
            partidosD[4][1] = SorteoGrupo.grupoD.getEquipo()[2];
            partidosD[5][0] = SorteoGrupo.grupoD.getEquipo()[1];
            partidosD[5][1] = SorteoGrupo.grupoD.getEquipo()[3];

        }
    }
}

