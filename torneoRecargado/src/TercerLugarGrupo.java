public class TercerLugarGrupo {
    public static void obtenerTerceroGrupo() {
        {
            Equipos equipoTerceroA = null;
            Equipos equipoCuartoA = null;
            int maxPuntos3A = Integer.MIN_VALUE;
            int maxGoles3A = Integer.MIN_VALUE;
            int minAmarillas3A = Integer.MIN_VALUE;
            int minRojas3A = Integer.MIN_VALUE;
            Equipos equipoTerceroB = null;
            Equipos equipoCuartoB = null;
            int maxPuntos3B = Integer.MIN_VALUE;
            int maxGoles3B = Integer.MIN_VALUE;
            int minAmarillas3B = Integer.MIN_VALUE;
            int minRojas3B = Integer.MIN_VALUE;
            Equipos equipoTerceroC = null;
            Equipos equipoCuartoC = null;
            int maxPuntos3C = Integer.MIN_VALUE;
            int maxGoles3C = Integer.MIN_VALUE;
            int minAmarillas3C = Integer.MIN_VALUE;
            int minRojas3C = Integer.MIN_VALUE;
            Equipos equipoTerceroD = null;
            Equipos equipoCuartoD = null;
            int maxPuntos3D = Integer.MIN_VALUE;
            int maxGoles3D = Integer.MIN_VALUE;
            int minAmarillas3D = Integer.MIN_VALUE;
            int minRojas3D = Integer.MIN_VALUE;

            if (Inscripcion.getEquipos2().length == 8){

                for (Equipos equipo : SorteoGrupo.grupoA.getEquipo()) {
                    int puntos = equipo.getPuntos();
                    int goles = equipo.getGoles();
                    int amarillas = equipo.getTarjetasAmarillas();
                    int rojas = equipo.getTarjetasRojas();

                    if (puntos > maxPuntos3A && equipo != SorteoGrupo.grupoA.getEquipoGanador() && equipo != SorteoGrupo.grupoA.getEquipoSegundo()) {
                        maxPuntos3A = puntos;
                        maxGoles3A = goles;
                        minAmarillas3A = amarillas;
                        minRojas3A = rojas;
                        equipoTerceroA = equipo;
                    } else if(puntos == maxPuntos3A && goles > maxGoles3A && equipo != SorteoGrupo.grupoA.getEquipoGanador() && equipo != SorteoGrupo.grupoA.getEquipoSegundo()) {
                        maxGoles3A = goles;
                        minAmarillas3A = amarillas;
                        minRojas3A = rojas;
                        equipoTerceroA = equipo;
                    } else if(puntos == maxPuntos3A && goles == maxGoles3A && amarillas < minAmarillas3A && equipo != SorteoGrupo.grupoA.getEquipoGanador() && equipo != SorteoGrupo.grupoA.getEquipoSegundo()) {
                        minAmarillas3A = amarillas;
                        minRojas3A = rojas;
                        equipoTerceroA = equipo;
                    } else if (puntos == maxPuntos3A && goles == maxGoles3A && amarillas == minAmarillas3A && rojas < minRojas3A && equipo != SorteoGrupo.grupoA.getEquipoGanador() && equipo != SorteoGrupo.grupoA.getEquipoSegundo()){
                        minRojas3A = rojas;
                        equipoTerceroA = equipo;
                    }
                }

                SorteoGrupo.grupoA.setEquipoTercero(equipoTerceroA);

                for (Equipos equipo : SorteoGrupo.grupoA.getEquipo()) {
                    if (equipo != SorteoGrupo.grupoA.getEquipoGanador() && equipo != SorteoGrupo.grupoA.getEquipoSegundo() && equipo != SorteoGrupo.grupoA.getEquipoTercero()){
                        equipoCuartoA = equipo;
                    }
                }

                SorteoGrupo.grupoA.setEquipoCuarto(equipoCuartoA);

                for (Equipos equipo : SorteoGrupo.grupoB.getEquipo()) {
                    int puntos = equipo.getPuntos();
                    int goles = equipo.getGoles();
                    int amarillas = equipo.getTarjetasAmarillas();
                    int rojas = equipo.getTarjetasRojas();

                    if (puntos > maxPuntos3B && equipo != SorteoGrupo.grupoB.getEquipoGanador() && equipo != SorteoGrupo.grupoB.getEquipoSegundo()) {
                        maxPuntos3B = puntos;
                        maxGoles3B = goles;
                        minAmarillas3B = amarillas;
                        minRojas3B = rojas;
                        equipoTerceroB = equipo;
                    } else if(puntos == maxPuntos3B && goles > maxGoles3B && equipo != SorteoGrupo.grupoB.getEquipoGanador() && equipo != SorteoGrupo.grupoB.getEquipoSegundo()) {
                        maxGoles3B = goles;
                        minAmarillas3B = amarillas;
                        minRojas3B = rojas;
                        equipoTerceroB = equipo;
                    } else if(puntos == maxPuntos3B && goles == maxGoles3B && amarillas < minAmarillas3B && equipo != SorteoGrupo.grupoB.getEquipoGanador() && equipo != SorteoGrupo.grupoB.getEquipoSegundo()) {
                        minAmarillas3B = amarillas;
                        minRojas3B = rojas;
                        equipoTerceroB = equipo;
                    } else if (puntos == maxPuntos3B && goles == maxGoles3B && amarillas == minAmarillas3B && rojas < minRojas3B && equipo != SorteoGrupo.grupoB.getEquipoGanador() && equipo != SorteoGrupo.grupoB.getEquipoSegundo()){
                        minRojas3B = rojas;
                        equipoTerceroB = equipo;
                    }
                }

                SorteoGrupo.grupoB.setEquipoTercero(equipoTerceroB);

                for (Equipos equipo : SorteoGrupo.grupoB.getEquipo()) {
                    if (equipo != SorteoGrupo.grupoB.getEquipoGanador() && equipo != SorteoGrupo.grupoB.getEquipoSegundo() && equipo != SorteoGrupo.grupoB.getEquipoTercero()){
                        equipoCuartoB = equipo;
                    }
                }

                SorteoGrupo.grupoB.setEquipoCuarto(equipoCuartoB);

            } else {

                for (Equipos equipo : SorteoGrupo.grupoA.getEquipo()) {
                    int puntos = equipo.getPuntos();
                    int goles = equipo.getGoles();
                    int amarillas = equipo.getTarjetasAmarillas();
                    int rojas = equipo.getTarjetasRojas();

                    if (puntos > maxPuntos3A && equipo != SorteoGrupo.grupoA.getEquipoGanador() && equipo != SorteoGrupo.grupoA.getEquipoSegundo()) {
                        maxPuntos3A = puntos;
                        maxGoles3A = goles;
                        minAmarillas3A = amarillas;
                        minRojas3A = rojas;
                        equipoTerceroA = equipo;
                    } else if(puntos == maxPuntos3A && goles > maxGoles3A && equipo != SorteoGrupo.grupoA.getEquipoGanador() && equipo != SorteoGrupo.grupoA.getEquipoSegundo()) {
                        maxGoles3A = goles;
                        minAmarillas3A = amarillas;
                        minRojas3A = rojas;
                        equipoTerceroA = equipo;
                    } else if(puntos == maxPuntos3A && goles == maxGoles3A && amarillas < minAmarillas3A && equipo != SorteoGrupo.grupoA.getEquipoGanador() && equipo != SorteoGrupo.grupoA.getEquipoSegundo()) {
                        minAmarillas3A = amarillas;
                        minRojas3A = rojas;
                        equipoTerceroA = equipo;
                    } else if (puntos == maxPuntos3A && goles == maxGoles3A && amarillas == minAmarillas3A && rojas < minRojas3A && equipo != SorteoGrupo.grupoA.getEquipoGanador() && equipo != SorteoGrupo.grupoA.getEquipoSegundo()){
                        minRojas3A = rojas;
                        equipoTerceroA = equipo;
                    }
                }
                SorteoGrupo.grupoA.setEquipoTercero(equipoTerceroA);

                for (Equipos equipo : SorteoGrupo.grupoA.getEquipo()) {
                    if (equipo != SorteoGrupo.grupoA.getEquipoGanador() && equipo != SorteoGrupo.grupoA.getEquipoSegundo() && equipo != SorteoGrupo.grupoA.getEquipoTercero()){
                        equipoCuartoA = equipo;
                    }
                }

                SorteoGrupo.grupoA.setEquipoCuarto(equipoCuartoA);

                for (Equipos equipo : SorteoGrupo.grupoB.getEquipo()) {
                    int puntos = equipo.getPuntos();
                    int goles = equipo.getGoles();
                    int amarillas = equipo.getTarjetasAmarillas();
                    int rojas = equipo.getTarjetasRojas();

                    if (puntos > maxPuntos3B && equipo != SorteoGrupo.grupoB.getEquipoGanador() && equipo != SorteoGrupo.grupoB.getEquipoSegundo()) {
                        maxPuntos3B = puntos;
                        maxGoles3B = goles;
                        minAmarillas3B = amarillas;
                        minRojas3B = rojas;
                        equipoTerceroB = equipo;
                    } else if(puntos == maxPuntos3B && goles > maxGoles3B && equipo != SorteoGrupo.grupoB.getEquipoGanador() && equipo != SorteoGrupo.grupoB.getEquipoSegundo()) {
                        maxGoles3B = goles;
                        minAmarillas3B = amarillas;
                        minRojas3B = rojas;
                        equipoTerceroB = equipo;
                    } else if(puntos == maxPuntos3B && goles == maxGoles3B && amarillas < minAmarillas3B && equipo != SorteoGrupo.grupoB.getEquipoGanador() && equipo != SorteoGrupo.grupoB.getEquipoSegundo()) {
                        minAmarillas3B = amarillas;
                        minRojas3B = rojas;
                        equipoTerceroB = equipo;
                    } else if (puntos == maxPuntos3B && goles == maxGoles3B && amarillas == minAmarillas3B && rojas < minRojas3B && equipo != SorteoGrupo.grupoB.getEquipoGanador() && equipo != SorteoGrupo.grupoB.getEquipoSegundo()){
                        minRojas3B = rojas;
                        equipoTerceroB = equipo;
                    }
                }

                SorteoGrupo.grupoB.setEquipoTercero(equipoTerceroB);

                for (Equipos equipo : SorteoGrupo.grupoB.getEquipo()) {
                    if (equipo != SorteoGrupo.grupoB.getEquipoGanador() && equipo != SorteoGrupo.grupoB.getEquipoSegundo() && equipo != SorteoGrupo.grupoB.getEquipoTercero()){
                        equipoCuartoB = equipo;
                    }
                }

                SorteoGrupo.grupoB.setEquipoCuarto(equipoCuartoB);

                for (Equipos equipo : SorteoGrupo.grupoC.getEquipo()) {
                    int puntos = equipo.getPuntos();
                    int goles = equipo.getGoles();
                    int amarillas = equipo.getTarjetasAmarillas();
                    int rojas = equipo.getTarjetasRojas();

                    if (puntos > maxPuntos3C && equipo != SorteoGrupo.grupoC.getEquipoGanador() && equipo != SorteoGrupo.grupoC.getEquipoSegundo()) {
                        maxPuntos3C = puntos;
                        maxGoles3C = goles;
                        minAmarillas3C = amarillas;
                        minRojas3C = rojas;
                        equipoTerceroC = equipo;
                    } else if(puntos == maxPuntos3C && goles > maxGoles3C && equipo != SorteoGrupo.grupoC.getEquipoGanador() && equipo != SorteoGrupo.grupoC.getEquipoSegundo()) {
                        maxGoles3C = goles;
                        minAmarillas3C = amarillas;
                        minRojas3C = rojas;
                        equipoTerceroC = equipo;
                    } else if(puntos == maxPuntos3C && goles == maxGoles3C && amarillas < minAmarillas3C && equipo != SorteoGrupo.grupoC.getEquipoGanador() && equipo != SorteoGrupo.grupoC.getEquipoSegundo()) {
                        minAmarillas3C = amarillas;
                        minRojas3C = rojas;
                        equipoTerceroC = equipo;
                    } else if (puntos == maxPuntos3C && goles == maxGoles3C && amarillas == minAmarillas3C && rojas < minRojas3C && equipo != SorteoGrupo.grupoC.getEquipoGanador() && equipo != SorteoGrupo.grupoC.getEquipoSegundo()){
                        minRojas3C = rojas;
                        equipoTerceroC = equipo;
                    }
                }

                SorteoGrupo.grupoC.setEquipoTercero(equipoTerceroC);

                for (Equipos equipo : SorteoGrupo.grupoC.getEquipo()) {
                    if (equipo != SorteoGrupo.grupoC.getEquipoGanador() && equipo != SorteoGrupo.grupoC.getEquipoSegundo() && equipo != SorteoGrupo.grupoC.getEquipoTercero()){
                        equipoCuartoC = equipo;
                    }
                }

                SorteoGrupo.grupoC.setEquipoCuarto(equipoCuartoC);

                for (Equipos equipo : SorteoGrupo.grupoD.getEquipo()) {
                    int puntos = equipo.getPuntos();
                    int goles = equipo.getGoles();
                    int amarillas = equipo.getTarjetasAmarillas();
                    int rojas = equipo.getTarjetasRojas();

                    if (puntos > maxPuntos3D && equipo != SorteoGrupo.grupoD.getEquipoGanador() && equipo != SorteoGrupo.grupoD.getEquipoSegundo()) {
                        maxPuntos3D = puntos;
                        maxGoles3D = goles;
                        minAmarillas3D = amarillas;
                        minRojas3D = rojas;
                        equipoTerceroD = equipo;
                    } else if(puntos == maxPuntos3D && goles > maxGoles3D && equipo != SorteoGrupo.grupoD.getEquipoGanador() && equipo != SorteoGrupo.grupoD.getEquipoSegundo()) {
                        maxGoles3D = goles;
                        minAmarillas3D = amarillas;
                        minRojas3D = rojas;
                        equipoTerceroD = equipo;
                    } else if(puntos == maxPuntos3D && goles == maxGoles3D && amarillas < minAmarillas3D && equipo != SorteoGrupo.grupoD.getEquipoGanador() && equipo != SorteoGrupo.grupoD.getEquipoSegundo()) {
                        minAmarillas3D = amarillas;
                        minRojas3D = rojas;
                        equipoTerceroD = equipo;
                    } else if (puntos == maxPuntos3D && goles == maxGoles3D && amarillas == minAmarillas3D && rojas < minRojas3D && equipo != SorteoGrupo.grupoD.getEquipoGanador() && equipo != SorteoGrupo.grupoD.getEquipoSegundo()){
                        minRojas3D = rojas;
                        equipoTerceroD = equipo;
                    }
                }

                SorteoGrupo.grupoD.setEquipoTercero(equipoTerceroD);

                for (Equipos equipo : SorteoGrupo.grupoD.getEquipo()) {
                    if (equipo != SorteoGrupo.grupoD.getEquipoGanador() && equipo != SorteoGrupo.grupoD.getEquipoSegundo() && equipo != SorteoGrupo.grupoD.getEquipoTercero()){
                        equipoCuartoD = equipo;
                    }
                }

                SorteoGrupo.grupoD.setEquipoCuarto(equipoCuartoD);

            }
        }
    }
}
