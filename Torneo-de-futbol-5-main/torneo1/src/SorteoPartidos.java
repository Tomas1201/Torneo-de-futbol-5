public class SorteoPartidos {
    SorteoGrupo sorteoGrupo = new SorteoGrupo();
    Equipos equipos = new Equipos();
    Grupo grupo = new Grupo();
    public void sorteoPartidos() {
        if (sorteoGrupo.grupoC.getEquipo().length == 0){
            Equipos[][] partidosA = new Equipos[6][2];
            partidosA[0][0] = sorteoGrupo.grupoA.getEquipo()[0];
            partidosA[0][1] = sorteoGrupo.grupoA.getEquipo()[1];
            partidosA[1][0] = sorteoGrupo.grupoA.getEquipo()[2];
            partidosA[1][1] = sorteoGrupo.grupoA.getEquipo()[3];
            partidosA[2][0] = sorteoGrupo.grupoA.getEquipo()[0];
            partidosA[2][1] = sorteoGrupo.grupoA.getEquipo()[3];
            partidosA[3][0] = sorteoGrupo.grupoA.getEquipo()[1];
            partidosA[3][1] = sorteoGrupo.grupoA.getEquipo()[2];
            partidosA[4][0] = sorteoGrupo.grupoA.getEquipo()[0];
            partidosA[4][1] = sorteoGrupo.grupoA.getEquipo()[2];
            partidosA[5][0] = sorteoGrupo.grupoA.getEquipo()[1];
            partidosA[5][1] = sorteoGrupo.grupoA.getEquipo()[3];
            Equipos[][] partidosB = new Equipos[6][2];
            partidosB[0][0] = sorteoGrupo.grupoB.getEquipo()[0];
            partidosB[0][1] = sorteoGrupo.grupoB.getEquipo()[1];
            partidosB[1][0] = sorteoGrupo.grupoB.getEquipo()[2];
            partidosB[1][1] = sorteoGrupo.grupoB.getEquipo()[3];
            partidosB[2][0] = sorteoGrupo.grupoB.getEquipo()[0];
            partidosB[2][1] = sorteoGrupo.grupoB.getEquipo()[3];
            partidosB[3][0] = sorteoGrupo.grupoB.getEquipo()[1];
            partidosB[3][1] = sorteoGrupo.grupoB.getEquipo()[2];
            partidosB[4][0] = sorteoGrupo.grupoB.getEquipo()[0];
            partidosB[4][1] = sorteoGrupo.grupoB.getEquipo()[2];
            partidosB[5][0] = sorteoGrupo.grupoB.getEquipo()[1];
            partidosB[5][1] = sorteoGrupo.grupoB.getEquipo()[3];
        }else {
            Equipos[][] partidosA = new Equipos[6][2];
            partidosA[0][0] = sorteoGrupo.grupoA.getEquipo()[0];
            partidosA[0][1] = sorteoGrupo.grupoA.getEquipo()[1];
            partidosA[1][0] = sorteoGrupo.grupoA.getEquipo()[2];
            partidosA[1][1] = sorteoGrupo.grupoA.getEquipo()[3];
            partidosA[2][0] = sorteoGrupo.grupoA.getEquipo()[0];
            partidosA[2][1] = sorteoGrupo.grupoA.getEquipo()[3];
            partidosA[3][0] = sorteoGrupo.grupoA.getEquipo()[1];
            partidosA[3][1] = sorteoGrupo.grupoA.getEquipo()[2];
            partidosA[4][0] = sorteoGrupo.grupoA.getEquipo()[0];
            partidosA[4][1] = sorteoGrupo.grupoA.getEquipo()[2];
            partidosA[5][0] = sorteoGrupo.grupoA.getEquipo()[1];
            partidosA[5][1] = sorteoGrupo.grupoA.getEquipo()[3];
            Equipos[][] partidosB = new Equipos[6][2];
            partidosB[0][0] = sorteoGrupo.grupoB.getEquipo()[0];
            partidosB[0][1] = sorteoGrupo.grupoB.getEquipo()[1];
            partidosB[1][0] = sorteoGrupo.grupoB.getEquipo()[2];
            partidosB[1][1] = sorteoGrupo.grupoB.getEquipo()[3];
            partidosB[2][0] = sorteoGrupo.grupoB.getEquipo()[0];
            partidosB[2][1] = sorteoGrupo.grupoB.getEquipo()[3];
            partidosB[3][0] = sorteoGrupo.grupoB.getEquipo()[1];
            partidosB[3][1] = sorteoGrupo.grupoB.getEquipo()[2];
            partidosB[4][0] = sorteoGrupo.grupoB.getEquipo()[0];
            partidosB[4][1] = sorteoGrupo.grupoB.getEquipo()[2];
            partidosB[5][0] = sorteoGrupo.grupoB.getEquipo()[1];
            partidosB[5][1] = sorteoGrupo.grupoB.getEquipo()[3];
            Equipos[][] partidosC = new Equipos[6][2];
            partidosC[0][0] = sorteoGrupo.grupoC.getEquipo()[0];
            partidosC[0][1] = sorteoGrupo.grupoC.getEquipo()[1];
            partidosC[1][0] = sorteoGrupo.grupoC.getEquipo()[2];
            partidosC[1][1] = sorteoGrupo.grupoC.getEquipo()[3];
            partidosC[2][0] = sorteoGrupo.grupoC.getEquipo()[0];
            partidosC[2][1] = sorteoGrupo.grupoC.getEquipo()[3];
            partidosC[3][0] = sorteoGrupo.grupoC.getEquipo()[1];
            partidosC[3][1] = sorteoGrupo.grupoC.getEquipo()[2];
            partidosC[4][0] = sorteoGrupo.grupoC.getEquipo()[0];
            partidosC[4][1] = sorteoGrupo.grupoC.getEquipo()[2];
            partidosC[5][0] = sorteoGrupo.grupoC.getEquipo()[1];
            partidosC[5][1] = sorteoGrupo.grupoC.getEquipo()[3];
            Equipos[][] partidosD = new Equipos[6][2];
            partidosD[0][0] = sorteoGrupo.grupoD.getEquipo()[0];
            partidosD[0][1] = sorteoGrupo.grupoD.getEquipo()[1];
            partidosD[1][0] = sorteoGrupo.grupoD.getEquipo()[2];
            partidosD[1][1] = sorteoGrupo.grupoD.getEquipo()[3];
            partidosD[2][0] = sorteoGrupo.grupoD.getEquipo()[0];
            partidosD[2][1] = sorteoGrupo.grupoD.getEquipo()[3];
            partidosD[3][0] = sorteoGrupo.grupoD.getEquipo()[1];
            partidosD[3][1] = sorteoGrupo.grupoD.getEquipo()[2];
            partidosD[4][0] = sorteoGrupo.grupoD.getEquipo()[0];
            partidosD[4][1] = sorteoGrupo.grupoD.getEquipo()[2];
            partidosD[5][0] = sorteoGrupo.grupoD.getEquipo()[1];
            partidosD[5][1] = sorteoGrupo.grupoD.getEquipo()[3];
        }
    }
}

