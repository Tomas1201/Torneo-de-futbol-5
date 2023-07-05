import java.util.Random;

public class PartidosCuartos {
    static Boolean[] arrayBool = {false, true, true};
    static Equipos ganadorSemis1 = null;
    static Equipos ganadorSemis2 = null;
    static Equipos ganadorCuartos1 = null;
    static Equipos ganadorCuartos2 = null;
    static Equipos ganadorCuartos3 = null;
    static Equipos ganadorCuartos4 = null;

    public static void partidCuartos() throws Exception{

        if (Inscripcion.getEquipos2().length == 8) {

            for (int i = 0; i < 3; i++) {

                int golesA = generarNumeroAleatorio(0, 3);
                int golesB = generarNumeroAleatorio(0, 3);
                int booleano = generarNumeroAleatorio(0, 2);
                int numero = generarNumeroAleatorio(0, 1);
                int numero1;
                if (numero == 0) {
                    numero1 = 1;
                } else {
                    numero1 = 0;
                }

                if (i == 0) {
                    System.out.println("La siguiente semifinal se disputará entre " + SorteoCuartos.semis[0][0].getNombreEquipo() + " y " + SorteoCuartos.semis[0][1].getNombreEquipo());
                     Thread.sleep(1000);
                    if (golesA > golesB) {
                        System.out.println("¡" + SorteoCuartos.semis[0][0].getNombreEquipo() + " ha ganado por " + golesA + " a " + golesB + " contra " + SorteoCuartos.semis[0][1].getNombreEquipo() + "!");
                        ganadorSemis1 = SorteoCuartos.semis[0][0];
                    } else if (golesA == golesB && arrayBool[booleano] == true) {
                        System.out.println("Hubo un empate " + golesA + "a " + golesB + " y en el alargue, el equipo " + SorteoCuartos.semis[0][numero].getNombreEquipo() + " ha ganado por gol de oro contra " + SorteoCuartos.semis[0][numero1].getNombreEquipo() + "!");
                        ganadorSemis1 = SorteoCuartos.semis[0][numero];
                    } else if (golesA == golesB && arrayBool[booleano] == false) {
                        System.out.println("El partido empató " + golesA + " a " + golesB + " y no ha podido definirse por gol de oro. Habrá una tanda de penales");
                        int equipo1Goles = 0;
                        int equipo2Goles = 0;
                        int totalPenales = 0;
                        while ((equipo1Goles < 5 || equipo2Goles < 5) && Math.abs(equipo1Goles - equipo2Goles) < 2) {
                            int golEquipo1 = generarNumeroAleatorio(0, 1);
                            int golEquipo2 = generarNumeroAleatorio(0, 1);

                            if (golEquipo1 == 1) {
                                equipo1Goles++;
                                System.out.println(SorteoCuartos.semis[0][0].getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(SorteoCuartos.semis[0][0].getNombreEquipo() + " ha fallado un penal!");
                            }

                            if (golEquipo2 == 1) {
                                equipo2Goles++;
                                System.out.println(SorteoCuartos.semis[0][1].getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(SorteoCuartos.semis[0][1].getNombreEquipo() + " ha fallado un penal!");
                            }

                            totalPenales++;
                        }

                        if (equipo1Goles > equipo2Goles) {
                            System.out.println("¡El equipo " + SorteoCuartos.semis[0][0].getNombreEquipo() + " ganó la tanda de penales " + equipo1Goles + " a " + equipo2Goles + "!");
                            ganadorSemis1 = SorteoCuartos.semis[0][0];
                        } else if (equipo2Goles > equipo1Goles) {
                            System.out.println("¡El equipo " + SorteoCuartos.semis[0][1].getNombreEquipo() + " ganó la tanda de penales " + equipo2Goles + " a " + equipo1Goles + "!");
                            ganadorSemis1 = SorteoCuartos.semis[0][1];
                        } else {
                            int aleatorio = generarNumeroAleatorio(0, 1);
                            if (aleatorio == 0) {
                                System.out.println("¡El equipo " + SorteoCuartos.semis[0][0].getNombreEquipo() + " ganó la tanda de penales " + (equipo1Goles + 1) + " a " + equipo2Goles + "!");
                                ganadorSemis1 = SorteoCuartos.semis[0][0];
                            } else {
                                System.out.println("¡El equipo " + SorteoCuartos.semis[0][1].getNombreEquipo() + " ganó la tanda de penales " + (equipo2Goles + 1) + " a " + equipo1Goles + "!");
                                ganadorSemis1 = SorteoCuartos.semis[0][1];
                            }
                        }
                    } else if (golesA < golesB) {
                        System.out.println("¡" + SorteoCuartos.semis[0][1].getNombreEquipo() + " ha ganado por " + golesB + " a " + golesA + " contra " + SorteoCuartos.semis[0][0].getNombreEquipo() + "!");
                        ganadorSemis1 = SorteoCuartos.semis[0][1];
                    }
                } else if (i == 1) {
                    System.out.println("La siguiente semifinal se disputará entre " + SorteoCuartos.semis[1][0].getNombreEquipo() + " y " + SorteoCuartos.semis[1][1].getNombreEquipo());
                    if (golesA > golesB) {
                        System.out.println("¡" + SorteoCuartos.semis[1][0].getNombreEquipo() + " ha ganado por " + golesA + " a " + golesB + " contra " + SorteoCuartos.semis[1][1].getNombreEquipo() + "!");
                        ganadorSemis2 = SorteoCuartos.semis[1][0];
                    } else if (golesA == golesB && arrayBool[booleano] == true) {
                        System.out.println("Hubo un empate " + golesA + "a " + golesB + " y en el alargue, el equipo " + SorteoCuartos.semis[1][numero].getNombreEquipo() + " ha ganado por gol de oro contra " + SorteoCuartos.semis[1][numero1].getNombreEquipo() + "!");
                        ganadorSemis2 = SorteoCuartos.semis[1][numero];
                    } else if (golesA == golesB && arrayBool[booleano] == false) {
                        System.out.println("El partido empató " + golesA + " a " + golesB + " y no ha podido definirse por gol de oro. Habrá una tanda de penales");
                        int equipo1Goles = 0;
                        int equipo2Goles = 0;
                        int totalPenales = 0;
                        while ((equipo1Goles < 5 || equipo2Goles < 5) && Math.abs(equipo1Goles - equipo2Goles) < 2) {
                            int golEquipo1 = generarNumeroAleatorio(0, 1);
                            int golEquipo2 = generarNumeroAleatorio(0, 1);

                            if (golEquipo1 == 1) {
                                equipo1Goles++;
                                System.out.println(SorteoCuartos.semis[1][0].getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(SorteoCuartos.semis[1][0].getNombreEquipo() + " ha fallado un penal!");
                            }

                            if (golEquipo2 == 1) {
                                equipo2Goles++;
                                System.out.println(SorteoCuartos.semis[1][1].getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(SorteoCuartos.semis[1][1].getNombreEquipo() + " ha fallado un penal!");
                            }

                            totalPenales++;
                        }

                        if (equipo1Goles > equipo2Goles) {
                            System.out.println("¡El equipo " + SorteoCuartos.semis[1][0].getNombreEquipo() + " ganó la tanda de penales " + equipo1Goles + " a " + equipo2Goles + "!");
                            ganadorSemis2 = SorteoCuartos.semis[1][0];
                        } else if (equipo2Goles > equipo1Goles) {
                            System.out.println("¡El equipo " + SorteoCuartos.semis[1][1].getNombreEquipo() + " ganó la tanda de penales " + equipo2Goles + " a " + equipo1Goles + "!");
                            ganadorSemis2 = SorteoCuartos.semis[1][1];
                        } else {
                            int aleatorio = generarNumeroAleatorio(0, 1);
                            if (aleatorio == 0) {
                                System.out.println("¡El equipo " + SorteoCuartos.semis[1][0].getNombreEquipo() + " ganó la tanda de penales " + (equipo1Goles + 1) + " a " + equipo2Goles + "!");
                                ganadorSemis2 = SorteoCuartos.semis[1][0];
                            } else {
                                System.out.println("¡El equipo " + SorteoCuartos.semis[1][1].getNombreEquipo() + " ganó la tanda de penales " + (equipo2Goles + 1) + " a " + equipo1Goles + "!");
                                ganadorSemis2 = SorteoCuartos.semis[1][1];
                            }
                        }
                    } else if (golesA < golesB) {
                        System.out.println("¡" + SorteoCuartos.semis[1][1].getNombreEquipo() + " ha ganado por " + golesB + " a " + golesA + " contra " + SorteoCuartos.semis[1][0].getNombreEquipo() + "!");
                        ganadorSemis2 = SorteoCuartos.semis[1][1];
                    }

                } else if (i == 2) {
                    System.out.println("La final se disputará entre " + ganadorSemis1.getNombreEquipo() + " y " + ganadorSemis2.getNombreEquipo());
                     Thread.sleep(1000);
                    if (golesA > golesB) {
                        System.out.println("¡" + ganadorSemis1.getNombreEquipo() + " ha ganado por " + golesA + " a " + golesB + " contra " + ganadorSemis2.getNombreEquipo() + " y es el campeón del torneo!");
                    } else if (golesA == golesB && arrayBool[booleano] == true && numero == 0) {
                        System.out.println("Hubo un empate " + golesA + " a " + golesB + " y en el alargue, el equipo " + ganadorSemis1.getNombreEquipo() + " ha ganado por gol de oro contra " + ganadorSemis2.getNombreEquipo() + " y es el campeón del torneo!");
                    } else if (golesA == golesB && arrayBool[booleano] == true && numero == 1) {
                        System.out.println("Hubo un empate " + golesA + " a " + golesB + " y en el alargue, el equipo " + ganadorSemis2.getNombreEquipo() + " ha ganado por gol de oro contra " + ganadorSemis1.getNombreEquipo() + " y es el campeón del torneo!");
                    } else if (golesA == golesB && arrayBool[booleano] == false) {
                        System.out.println("El partido empató " + golesA + " a " + golesB + " y no ha podido definirse por gol de oro. Habrá una tanda de penales");
                        int equipo1Goles = 0;
                        int equipo2Goles = 0;
                        int totalPenales = 0;
                        while ((equipo1Goles < 5 || equipo2Goles < 5) && Math.abs(equipo1Goles - equipo2Goles) < 2) {
                            int golEquipo1 = generarNumeroAleatorio(0, 1);
                            int golEquipo2 = generarNumeroAleatorio(0, 1);

                            if (golEquipo1 == 1) {
                                equipo1Goles++;
                                System.out.println(ganadorSemis1.getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(ganadorSemis1.getNombreEquipo() + " ha fallado un penal!");
                            }

                            if (golEquipo2 == 1) {
                                equipo2Goles++;
                                System.out.println(ganadorSemis2.getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(ganadorSemis2.getNombreEquipo() + " ha fallado un penal!");
                            }

                            totalPenales++;
                        }

                        if (equipo1Goles > equipo2Goles) {
                            System.out.println("¡El equipo " + ganadorSemis1.getNombreEquipo() + " ganó la tanda de penales " + equipo1Goles + " a " + equipo2Goles + " y es el campeón del torneo!");
                        } else if (equipo2Goles > equipo1Goles) {
                            System.out.println("¡El equipo " + ganadorSemis2.getNombreEquipo() + " ganó la tanda de penales " + equipo2Goles + " a " + equipo1Goles + " y es el campeón del torneo!");
                        } else {
                            int aleatorio = generarNumeroAleatorio(0, 1);
                            if (aleatorio == 0) {
                                System.out.println("¡El equipo " + ganadorSemis1.getNombreEquipo() + " ganó la tanda de penales " + (equipo1Goles + 1) + " a " + equipo2Goles + " y es el campeón del torneo!");
                            } else {
                                System.out.println("¡El equipo " + ganadorSemis2.getNombreEquipo() + " ganó la tanda de penales " + (equipo2Goles + 1) + " a " + equipo1Goles + " y es el campeón del torneo!");
                            }
                        }
                    } else if (golesA < golesB) {
                        System.out.println("¡" + ganadorSemis2.getNombreEquipo() + " ha ganado por " + golesB + " a " + golesA + " contra " + ganadorSemis1.getNombreEquipo() + " y es el campeón del torneo!");
                         Thread.sleep(1000);
                    }
                }
            }
        } else {
            for (int i = 0; i < 7; i++) {
                int golesA = generarNumeroAleatorio(0, 3);
                int golesB = generarNumeroAleatorio(0, 3);
                int booleano = generarNumeroAleatorio(0, 2);
                int numero = generarNumeroAleatorio(0, 1);
                int numero1;
                if (numero == 0) {
                    numero1 = 1;
                } else {
                    numero1 = 0;
                }

                if (i == 0) {
                    System.out.println("Los siguientes cuartos de final se disputarán entre " + SorteoCuartos.cuartos[0][0].getNombreEquipo() + " y " + SorteoCuartos.cuartos[0][1].getNombreEquipo());
                     Thread.sleep(1000);
                    if (golesA > golesB) {
                        System.out.println("¡" + SorteoCuartos.cuartos[0][0].getNombreEquipo() + " ha ganado por " + golesA + " a " + golesB + " contra " + SorteoCuartos.cuartos[0][1].getNombreEquipo() + "!");
                        ganadorCuartos1 = SorteoCuartos.cuartos[0][0];
                    } else if (golesA == golesB && arrayBool[booleano] == true) {
                        System.out.println("Hubo un empate " + golesA + " a " + golesB + " y en el alargue, el equipo " + SorteoCuartos.cuartos[0][numero].getNombreEquipo() + " ha ganado por gol de oro contra " + SorteoCuartos.cuartos[0][numero1].getNombreEquipo() + "!");
                        ganadorCuartos1 = SorteoCuartos.cuartos[0][numero];
                    } else if (golesA == golesB && arrayBool[booleano] == false) {
                        System.out.println("El partido empató " + golesA + " a " + golesB + " y no ha podido definirse por gol de oro. Habrá una tanda de penales");
                        int equipo1Goles = 0;
                        int equipo2Goles = 0;
                        int totalPenales = 0;
                        while ((equipo1Goles < 5 || equipo2Goles < 5) && Math.abs(equipo1Goles - equipo2Goles) < 2) {
                            int golEquipo1 = generarNumeroAleatorio(0, 1);
                            int golEquipo2 = generarNumeroAleatorio(0, 1);

                            if (golEquipo1 == 1) {
                                equipo1Goles++;
                                System.out.println(SorteoCuartos.cuartos[0][0].getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(SorteoCuartos.cuartos[0][0].getNombreEquipo() + " ha fallado un penal!");
                            }

                            if (golEquipo2 == 1) {
                                equipo2Goles++;
                                System.out.println(SorteoCuartos.cuartos[0][1].getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(SorteoCuartos.cuartos[0][1].getNombreEquipo() + " ha fallado un penal!");
                            }

                            totalPenales++;
                        }

                        if (equipo1Goles > equipo2Goles) {
                            System.out.println("¡El equipo " + SorteoCuartos.cuartos[0][0].getNombreEquipo() + " ganó la tanda de penales " + equipo1Goles + " a " + equipo2Goles + "!");
                            ganadorCuartos1 = SorteoCuartos.cuartos[0][0];
                        } else if (equipo2Goles > equipo1Goles) {
                            System.out.println("¡El equipo " + SorteoCuartos.cuartos[0][1].getNombreEquipo() + " ganó la tanda de penales " + equipo2Goles + " a " + equipo1Goles + "!");
                            ganadorCuartos1 = SorteoCuartos.cuartos[0][1];
                        } else {
                            int aleatorio = generarNumeroAleatorio(0, 1);
                            if (aleatorio == 0) {
                                System.out.println("¡El equipo " + SorteoCuartos.cuartos[0][0].getNombreEquipo() + " ganó la tanda de penales " + (equipo1Goles + 1) + " a " + equipo2Goles + "!");
                                ganadorCuartos1 = SorteoCuartos.cuartos[0][0];
                            } else {
                                System.out.println("¡El equipo " + SorteoCuartos.cuartos[0][1].getNombreEquipo() + " ganó la tanda de penales " + (equipo2Goles + 1) + " a " + equipo1Goles + "!");
                                ganadorCuartos1 = SorteoCuartos.cuartos[0][1];
                            }
                        }
                    } else if (golesA < golesB) {
                        System.out.println("¡" + SorteoCuartos.cuartos[0][1].getNombreEquipo() + " ha ganado por " + golesB + " a " + golesA + " contra " + SorteoCuartos.cuartos[0][0].getNombreEquipo() + "!");
                         Thread.sleep(1000);
                        ganadorCuartos1 = SorteoCuartos.cuartos[0][1];
                    }
                } else if (i == 1) {
                    System.out.println("Los siguientes cuartos de final se disputarán entre " + SorteoCuartos.cuartos[1][0].getNombreEquipo() + " y " + SorteoCuartos.cuartos[1][1].getNombreEquipo());
                    if (golesA > golesB) {
                        System.out.println("¡" + SorteoCuartos.cuartos[1][0].getNombreEquipo() + " ha ganado por " + golesA + " a " + golesB + " contra " + SorteoCuartos.cuartos[1][1].getNombreEquipo() + "!");
                        ganadorCuartos2 = SorteoCuartos.cuartos[1][0];
                    } else if (golesA == golesB && arrayBool[booleano] == true) {
                        System.out.println("Hubo un empate " + golesA + " a " + golesB + " y en el alargue, el equipo " + SorteoCuartos.cuartos[1][numero].getNombreEquipo() + " ha ganado por gol de oro contra " + SorteoCuartos.cuartos[1][numero1].getNombreEquipo() + "!");
                        ganadorCuartos2 = SorteoCuartos.cuartos[1][numero];
                    } else if (golesA == golesB && arrayBool[booleano] == false) {
                        System.out.println("El partido empató " + golesA + " a " + golesB + " y no ha podido definirse por gol de oro. Habrá una tanda de penales");
                        int equipo1Goles = 0;
                        int equipo2Goles = 0;
                        int totalPenales = 0;
                        while ((equipo1Goles < 5 || equipo2Goles < 5) && Math.abs(equipo1Goles - equipo2Goles) < 2) {
                            int golEquipo1 = generarNumeroAleatorio(0, 1);
                            int golEquipo2 = generarNumeroAleatorio(0, 1);

                            if (golEquipo1 == 1) {
                                equipo1Goles++;
                                System.out.println(SorteoCuartos.cuartos[1][0].getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(SorteoCuartos.cuartos[1][0].getNombreEquipo() + " ha fallado un penal!");
                            }

                            if (golEquipo2 == 1) {
                                equipo2Goles++;
                                System.out.println(SorteoCuartos.cuartos[1][1].getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(SorteoCuartos.cuartos[1][1].getNombreEquipo() + " ha fallado un penal!");
                            }

                            totalPenales++;
                        }

                        if (equipo1Goles > equipo2Goles) {
                            System.out.println("¡El equipo " + SorteoCuartos.cuartos[1][0].getNombreEquipo() + " ganó la tanda de penales " + equipo1Goles + " a " + equipo2Goles + "!");
                            ganadorCuartos2 = SorteoCuartos.cuartos[1][0];
                        } else if (equipo2Goles > equipo1Goles) {
                            System.out.println("¡El equipo " + SorteoCuartos.cuartos[1][1].getNombreEquipo() + " ganó la tanda de penales " + equipo2Goles + " a " + equipo1Goles + "!");
                            ganadorCuartos2 = SorteoCuartos.cuartos[1][1];
                        } else {
                            int aleatorio = generarNumeroAleatorio(0, 1);
                            if (aleatorio == 0) {
                                System.out.println("¡El equipo " + SorteoCuartos.cuartos[1][0].getNombreEquipo() + " ganó la tanda de penales " + (equipo1Goles + 1) + " a " + equipo2Goles + "!");
                                ganadorCuartos2 = SorteoCuartos.cuartos[1][0];
                            } else {
                                System.out.println("¡El equipo " + SorteoCuartos.cuartos[1][1].getNombreEquipo() + " ganó la tanda de penales " + (equipo2Goles + 1) + " a " + equipo1Goles + "!");
                                ganadorCuartos2 = SorteoCuartos.cuartos[1][1];
                            }
                        }
                    } else if (golesA < golesB) {
                        System.out.println("¡" + SorteoCuartos.cuartos[1][1].getNombreEquipo() + " ha ganado por " + golesB + " a " + golesA + " contra " + SorteoCuartos.cuartos[1][0].getNombreEquipo() + "!");
                        ganadorCuartos2 = SorteoCuartos.cuartos[1][1];
                    }

                } else if (i == 2) {
                    System.out.println("Los siguientes cuartos de final se disputarán entre " + SorteoCuartos.cuartos[2][0].getNombreEquipo() + " y " + SorteoCuartos.cuartos[2][1].getNombreEquipo());
                     Thread.sleep(1000);
                    if (golesA > golesB) {
                        System.out.println("¡" + SorteoCuartos.cuartos[2][0].getNombreEquipo() + " ha ganado por " + golesA + " a " + golesB + " contra " + SorteoCuartos.cuartos[2][1].getNombreEquipo() + "!");
                        ganadorCuartos3 = SorteoCuartos.cuartos[2][0];
                    } else if (golesA == golesB && arrayBool[booleano] == true) {
                        System.out.println("Hubo un empate " + golesA + " a " + golesB + " y en el alargue, el equipo " + SorteoCuartos.cuartos[2][numero].getNombreEquipo() + " ha ganado por gol de oro contra " + SorteoCuartos.cuartos[2][numero1].getNombreEquipo() + "!");
                        ganadorCuartos3 = SorteoCuartos.cuartos[2][numero];
                    } else if (golesA == golesB && arrayBool[booleano] == false) {
                        System.out.println("El partido empató " + golesA + " a " + golesB + " y no ha podido definirse por gol de oro. Habrá una tanda de penales");
                        int equipo1Goles = 0;
                        int equipo2Goles = 0;
                        int totalPenales = 0;
                        while ((equipo1Goles < 5 || equipo2Goles < 5) && Math.abs(equipo1Goles - equipo2Goles) < 2) {
                            int golEquipo1 = generarNumeroAleatorio(0, 1);
                            int golEquipo2 = generarNumeroAleatorio(0, 1);

                            if (golEquipo1 == 1) {
                                equipo1Goles++;
                                System.out.println(SorteoCuartos.cuartos[2][0].getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(SorteoCuartos.cuartos[2][0].getNombreEquipo() + " ha fallado un penal!");
                            }

                            if (golEquipo2 == 1) {
                                equipo2Goles++;
                                System.out.println(SorteoCuartos.cuartos[2][1].getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(SorteoCuartos.cuartos[2][1].getNombreEquipo() + " ha fallado un penal!");
                            }

                            totalPenales++;
                        }

                        if (equipo1Goles > equipo2Goles) {
                            System.out.println("¡El equipo " + SorteoCuartos.cuartos[2][0].getNombreEquipo() + " ganó la tanda de penales " + equipo1Goles + " a " + equipo2Goles + "!");
                            ganadorCuartos3 = SorteoCuartos.cuartos[2][0];
                        } else if (equipo2Goles > equipo1Goles) {
                            System.out.println("¡El equipo " + SorteoCuartos.cuartos[2][1].getNombreEquipo() + " ganó la tanda de penales " + equipo2Goles + " a " + equipo1Goles + "!");
                            ganadorCuartos3 = SorteoCuartos.cuartos[2][1];
                        } else {
                            int aleatorio = generarNumeroAleatorio(0, 1);
                            if (aleatorio == 0) {
                                System.out.println("¡El equipo " + SorteoCuartos.cuartos[2][0].getNombreEquipo() + " ganó la tanda de penales " + (equipo1Goles + 1) + " a " + equipo2Goles + "!");
                                ganadorCuartos3 = SorteoCuartos.cuartos[2][0];
                            } else {
                                System.out.println("¡El equipo " + SorteoCuartos.cuartos[2][1].getNombreEquipo() + " ganó la tanda de penales " + (equipo2Goles + 1) + " a " + equipo1Goles + "!");
                                ganadorCuartos3 = SorteoCuartos.cuartos[2][1];
                            }
                        }
                    } else if (golesA < golesB) {
                        System.out.println("¡" + SorteoCuartos.cuartos[2][1].getNombreEquipo() + " ha ganado por " + golesB + " a " + golesA + " contra " + SorteoCuartos.cuartos[2][0].getNombreEquipo() + "!");
                        ganadorCuartos3 = SorteoCuartos.cuartos[2][1];
                    }

                } else if (i == 3){
                    System.out.println("Los siguientes cuartos de final se disputarán entre " + SorteoCuartos.cuartos[3][0].getNombreEquipo() + " y " + SorteoCuartos.cuartos[3][1].getNombreEquipo());
                     Thread.sleep(1000);
                    if (golesA > golesB) {
                        System.out.println("¡" + SorteoCuartos.cuartos[3][0].getNombreEquipo() + " ha ganado por " + golesA + " a " + golesB + " contra " + SorteoCuartos.cuartos[3][1].getNombreEquipo() + "!");
                        ganadorCuartos4 = SorteoCuartos.cuartos[3][0];
                    } else if (golesA == golesB && arrayBool[booleano] == true) {
                        System.out.println("Hubo un empate " + golesA + " a " + golesB + " y en el alargue, el equipo " + SorteoCuartos.cuartos[3][numero].getNombreEquipo() + " ha ganado por gol de oro contra " + SorteoCuartos.cuartos[3][numero1].getNombreEquipo() + "!");
                        ganadorCuartos4 = SorteoCuartos.cuartos[3][numero];
                    } else if (golesA == golesB && arrayBool[booleano] == false) {
                        System.out.println("El partido empató " + golesA + " a " + golesB + " y no ha podido definirse por gol de oro. Habrá una tanda de penales");
                        int equipo1Goles = 0;
                        int equipo2Goles = 0;
                        int totalPenales = 0;
                        while ((equipo1Goles < 5 || equipo2Goles < 5) && Math.abs(equipo1Goles - equipo2Goles) < 2) {
                            int golEquipo1 = generarNumeroAleatorio(0, 1);
                            int golEquipo2 = generarNumeroAleatorio(0, 1);

                            if (golEquipo1 == 1) {
                                equipo1Goles++;
                                System.out.println(SorteoCuartos.cuartos[3][0].getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(SorteoCuartos.cuartos[3][0].getNombreEquipo() + " ha fallado un penal!");
                            }

                            if (golEquipo2 == 1) {
                                equipo2Goles++;
                                System.out.println(SorteoCuartos.cuartos[3][1].getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(SorteoCuartos.cuartos[3][1].getNombreEquipo() + " ha fallado un penal!");
                            }

                            totalPenales++;
                        }

                        if (equipo1Goles > equipo2Goles) {
                            System.out.println("¡El equipo " + SorteoCuartos.cuartos[3][0].getNombreEquipo() + " ganó la tanda de penales " + equipo1Goles + " a " + equipo2Goles + "!");
                            ganadorCuartos4 = SorteoCuartos.cuartos[3][0];
                        } else if (equipo2Goles > equipo1Goles) {
                            System.out.println("¡El equipo " + SorteoCuartos.cuartos[3][1].getNombreEquipo() + " ganó la tanda de penales " + equipo2Goles + " a " + equipo1Goles + "!");
                            ganadorCuartos4 = SorteoCuartos.cuartos[3][1];
                        } else {
                            int aleatorio = generarNumeroAleatorio(0, 1);
                            if (aleatorio == 0) {
                                System.out.println("¡El equipo " + SorteoCuartos.cuartos[3][0].getNombreEquipo() + " ganó la tanda de penales " + (equipo1Goles + 1) + " a " + equipo2Goles + "!");
                                ganadorCuartos4 = SorteoCuartos.cuartos[3][0];
                            } else {
                                System.out.println("¡El equipo " + SorteoCuartos.cuartos[3][1].getNombreEquipo() + " ganó la tanda de penales " + (equipo2Goles + 1) + " a " + equipo1Goles + "!");
                                ganadorCuartos4 = SorteoCuartos.cuartos[3][1];
                            }
                        }
                    } else if (golesA < golesB) {
                        System.out.println("¡" + SorteoCuartos.cuartos[3][1].getNombreEquipo() + " ha ganado por " + golesB + " a " + golesA + " contra " + SorteoCuartos.cuartos[3][0].getNombreEquipo() + "!");
                        ganadorCuartos4 = SorteoCuartos.cuartos[3][1];
                    }

                } else if (i == 4) {
                    System.out.println("La siguiente semifinal se disputará entre " + ganadorCuartos1.getNombreEquipo() + " y " + ganadorCuartos2.getNombreEquipo());
                     Thread.sleep(1000);
                    if (golesA > golesB) {
                        System.out.println("¡" + ganadorCuartos1.getNombreEquipo() + " ha ganado por " + golesA + " a " + golesB + " contra " + ganadorCuartos2.getNombreEquipo() + "!");
                        ganadorSemis1 = ganadorCuartos1;
                    } else if (golesA == golesB && arrayBool[booleano] == true && numero == 0) {
                        System.out.println("Hubo un empate " + golesA + " a " + golesB + " y en el alargue, el equipo " + ganadorCuartos1.getNombreEquipo() + " ha ganado por gol de oro contra " + ganadorCuartos2.getNombreEquipo() + "!");
                        ganadorSemis1 = ganadorCuartos1;
                    } else if (golesA == golesB && arrayBool[booleano] == true && numero == 1) {
                        System.out.println("Hubo un empate " + golesA + " a " + golesB + " y en el alargue, el equipo " + ganadorCuartos2.getNombreEquipo() + " ha ganado por gol de oro contra " + ganadorCuartos1.getNombreEquipo() + "!");
                        ganadorSemis1 = ganadorCuartos2;
                    }else if (golesA == golesB && arrayBool[booleano] == false) {
                        System.out.println("El partido empató " + golesA + " a " + golesB + " y no ha podido definirse por gol de oro. Habrá una tanda de penales");
                        int equipo1Goles = 0;
                        int equipo2Goles = 0;
                        int totalPenales = 0;
                        while ((equipo1Goles < 5 || equipo2Goles < 5) && Math.abs(equipo1Goles - equipo2Goles) < 2) {
                            int golEquipo1 = generarNumeroAleatorio(0, 1);
                            int golEquipo2 = generarNumeroAleatorio(0, 1);

                            if (golEquipo1 == 1) {
                                equipo1Goles++;
                                System.out.println(ganadorCuartos1.getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(ganadorCuartos1.getNombreEquipo() + " ha fallado un penal!");
                            }

                            if (golEquipo2 == 1) {
                                equipo2Goles++;
                                System.out.println(ganadorCuartos2.getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(ganadorCuartos2.getNombreEquipo() + " ha fallado un penal!");
                            }

                            totalPenales++;
                        }

                        if (equipo1Goles > equipo2Goles) {
                            System.out.println("¡El equipo " + ganadorCuartos1.getNombreEquipo() + " ganó la tanda de penales " + equipo1Goles + " a " + equipo2Goles + "!");
                            ganadorSemis1 = ganadorCuartos1;
                        } else if (equipo2Goles > equipo1Goles) {
                            System.out.println("¡El equipo " + ganadorCuartos2.getNombreEquipo() + " ganó la tanda de penales " + equipo2Goles + " a " + equipo1Goles + "!");
                            ganadorSemis1 = ganadorCuartos2;
                        } else {
                            int aleatorio = generarNumeroAleatorio(0, 1);
                            if (aleatorio == 0) {
                                System.out.println("¡El equipo " + ganadorCuartos1.getNombreEquipo() + " ganó la tanda de penales " + (equipo1Goles + 1) + " a " + equipo2Goles + "!");
                                ganadorSemis1 = ganadorCuartos1;
                            } else {
                                System.out.println("¡El equipo " + ganadorCuartos2.getNombreEquipo() + " ganó la tanda de penales " + (equipo2Goles + 1) + " a " + equipo1Goles + "!");
                                ganadorSemis1 = ganadorCuartos2;
                            }
                        }
                    } else if (golesA < golesB) {
                        System.out.println("¡" + ganadorCuartos2.getNombreEquipo() + " ha ganado por " + golesB + " a " + golesA + " contra " + ganadorCuartos1.getNombreEquipo() + "!");
                        ganadorSemis1 = ganadorCuartos2;
                    }
                } else if (i == 5){
                    System.out.println("La siguiente semifinal se disputará entre " + ganadorCuartos3.getNombreEquipo() + " y " + ganadorCuartos4.getNombreEquipo());
                     Thread.sleep(1000);
                    if (golesA > golesB) {
                        System.out.println("¡" + ganadorCuartos3.getNombreEquipo() + " ha ganado por " + golesA + " a " + golesB + " contra " + ganadorCuartos4.getNombreEquipo() + "!");
                        ganadorSemis2 = ganadorCuartos3;
                    } else if (golesA == golesB && arrayBool[booleano] == true && numero == 0) {
                        System.out.println("Hubo un empate " + golesA + " a " + golesB + " y en el alargue, el equipo " + ganadorCuartos3.getNombreEquipo() + " ha ganado por gol de oro contra " + ganadorCuartos4.getNombreEquipo() + "!");
                        ganadorSemis2 = ganadorCuartos3;
                    } else if (golesA == golesB && arrayBool[booleano] == true && numero == 1) {
                        System.out.println("Hubo un empate " + golesA + " a " + golesB + " y en el alargue, el equipo " + ganadorCuartos4.getNombreEquipo() + " ha ganado por gol de oro contra " + ganadorCuartos3.getNombreEquipo() + "!");
                        ganadorSemis2 = ganadorCuartos4;
                    }else if (golesA == golesB && arrayBool[booleano] == false) {
                        System.out.println("El partido empató " + golesA + " a " + golesB + " y no ha podido definirse por gol de oro. Habrá una tanda de penales");
                        int equipo1Goles = 0;
                        int equipo2Goles = 0;
                        int totalPenales = 0;
                        while ((equipo1Goles < 5 || equipo2Goles < 5) && Math.abs(equipo1Goles - equipo2Goles) < 2) {
                            int golEquipo1 = generarNumeroAleatorio(0, 1);
                            int golEquipo2 = generarNumeroAleatorio(0, 1);

                            if (golEquipo1 == 1) {
                                equipo1Goles++;
                                System.out.println(ganadorCuartos3.getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(ganadorCuartos3.getNombreEquipo() + " ha fallado un penal!");
                            }

                            if (golEquipo2 == 1) {
                                equipo2Goles++;
                                System.out.println(ganadorCuartos4.getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(ganadorCuartos4.getNombreEquipo() + " ha fallado un penal!");
                            }

                            totalPenales++;
                        }

                        if (equipo1Goles > equipo2Goles) {
                            System.out.println("¡El equipo " + ganadorCuartos3.getNombreEquipo() + " ganó la tanda de penales " + equipo1Goles + " a " + equipo2Goles + "!");
                            ganadorSemis2 = ganadorCuartos3;
                        } else if (equipo2Goles > equipo1Goles) {
                            System.out.println("¡El equipo " + ganadorCuartos4.getNombreEquipo() + " ganó la tanda de penales " + equipo2Goles + " a " + equipo1Goles + "!");
                            ganadorSemis2 = ganadorCuartos4;
                        } else {
                            int aleatorio = generarNumeroAleatorio(0, 1);
                            if (aleatorio == 0) {
                                System.out.println("¡El equipo " + ganadorCuartos3.getNombreEquipo() + " ganó la tanda de penales " + (equipo1Goles + 1) + " a " + equipo2Goles + "!");
                                ganadorSemis2 = ganadorCuartos3;
                            } else {
                                System.out.println("¡El equipo " + ganadorCuartos4.getNombreEquipo() + " ganó la tanda de penales " + (equipo2Goles + 1) + " a " + equipo1Goles + "!");
                                ganadorSemis2 = ganadorCuartos4;
                            }
                        }
                    } else if (golesA < golesB) {
                        System.out.println("¡" + ganadorCuartos4.getNombreEquipo() + " ha ganado por " + golesB + " a " + golesA + " contra " + ganadorCuartos3.getNombreEquipo() + "!");
                        ganadorSemis2 = ganadorCuartos4;
                    }
                } else if (i == 6){
                    System.out.println("La final se disputará entre " + ganadorSemis1.getNombreEquipo() + " y " + ganadorSemis2.getNombreEquipo());
                     Thread.sleep(1000);
                    if (golesA > golesB) {
                        System.out.println("¡" + ganadorSemis1.getNombreEquipo() + " ha ganado por " + golesA + " a " + golesB + " contra " + ganadorSemis2.getNombreEquipo() + " y es el campeón del torneo!");
                    } else if (golesA == golesB && arrayBool[booleano] == true && numero == 0) {
                        System.out.println("Hubo un empate " + golesA + " a " + golesB + " y en el alargue, el equipo " + ganadorSemis1.getNombreEquipo() + " ha ganado por gol de oro contra " + ganadorSemis2.getNombreEquipo() + " y es el campeón del torneo!");
                    } else if (golesA == golesB && arrayBool[booleano] == true && numero == 1) {
                        System.out.println("Hubo un empate " + golesA + " a " + golesB + " y en el alargue, el equipo " + ganadorSemis2.getNombreEquipo() + " ha ganado por gol de oro contra " + ganadorSemis1.getNombreEquipo() + " y es el campeón del torneo!");
                    } else if (golesA == golesB && arrayBool[booleano] == false) {
                        System.out.println("El partido empató " + golesA + " a " + golesB + " y no ha podido definirse por gol de oro. Habrá una tanda de penales");
                        int equipo1Goles = 0;
                        int equipo2Goles = 0;
                        int totalPenales = 0;
                        while ((equipo1Goles < 5 || equipo2Goles < 5) && Math.abs(equipo1Goles - equipo2Goles) < 2) {
                            int golEquipo1 = generarNumeroAleatorio(0, 1);
                            int golEquipo2 = generarNumeroAleatorio(0, 1);

                            if (golEquipo1 == 1) {
                                equipo1Goles++;
                                System.out.println(ganadorSemis1.getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(ganadorSemis1.getNombreEquipo() + " ha fallado un penal!");
                            }

                            if (golEquipo2 == 1) {
                                equipo2Goles++;
                                System.out.println(ganadorSemis2.getNombreEquipo() + " ha anotado un penal!");
                            } else {
                                System.out.println(ganadorSemis2.getNombreEquipo() + " ha fallado un penal!");
                            }

                            totalPenales++;
                        }

                        if (equipo1Goles > equipo2Goles) {
                            System.out.println("¡El equipo " + ganadorSemis1.getNombreEquipo() + " ganó la tanda de penales " + equipo1Goles + " a " + equipo2Goles + " y es el campeón del torneo!");
                        } else if (equipo2Goles > equipo1Goles) {
                            System.out.println("¡El equipo " + ganadorSemis2.getNombreEquipo() + " ganó la tanda de penales " + equipo2Goles + " a " + equipo1Goles + " y es el campeón del torneo!");
                        } else {
                            int aleatorio = generarNumeroAleatorio(0, 1);
                            if (aleatorio == 0) {
                                System.out.println("¡El equipo " + ganadorSemis1.getNombreEquipo() + " ganó la tanda de penales " + (equipo1Goles + 1) + " a " + equipo2Goles + " y es el campeón del torneo!");
                            } else {
                                System.out.println("¡El equipo " + ganadorSemis2.getNombreEquipo() + " ganó la tanda de penales " + (equipo2Goles + 1) + " a " + equipo1Goles + " y es el campeón del torneo!");
                            }
                        }
                    } else if (golesA < golesB) {
                        System.out.println("¡" + ganadorSemis2.getNombreEquipo() + " ha ganado por " + golesB + " a " + golesA + " contra " + ganadorSemis1.getNombreEquipo() + " y es el campeón del torneo!");
                    }
                }
            } //corchete de for i=7

        } //corchete del else del if equipos==8

    } // corchete método

    public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
} //corchete clase

