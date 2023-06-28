public class fech {
    public void fixture(){
Inscripcion ins = new Inscripcion();
    Equipos[] juan= ins.getEquipos();
    int j = 0 ;
    System.out.println("╔═════════╦═══════╦════════╗");
    System.out.println("║ Equipos ║ Goles ║ Puntos ║");
    System.out.println("╚═════════╩═══════╩════════╝");
    System.out.println("                                        ╔═════════╦═══════╗");
    System.out.println("╔══════════════════════════╗            ║ Equipos ║ Goles ║");
    System.out.println("║         Grupo  A         ║            ╚═════════╩═══════╝");
    System.out.println("╠═════════╦═══════╦════════╣");
    System.out.println(  "║  "+juan[0].getNombreEquipo()+"      ║     "+j+" ║      "+j+" ║"   +      "            ╔═════════╦═══════╗");
    System.out.println(  "╠═════════╬═══════╬════════╣"    +     "            ║  "+j+"      ║     "+j+" ║");
    System.out.println(  "║  "+j+"      ║     "+j+" ║      "+j+" ║"   +      "            ╠═════════╬═══════╣");
    System.out.println(  "╠═════════╬═══════╬════════╣"    +     "            ║  "+j+"      ║     "+j+" ║");
    System.out.println(  "║  "+j+"      ║     "+j+" ║      "+j+" ║"   +      "            ╚═════════╩═══════╝");
    System.out.println("╠═════════╬═══════╬════════╣");
    System.out.println(  "║  "+j+"      ║     "+j+" ║      "+j+" ║");
    System.out.println("╚═════════╩═══════╩════════╝                                            ╔═════════╦═══════╗");
    System.out.println("                                                                        ║  "+j+"      ║     "+j+" ║");
    System.out.println("                                                                        ╠═════════╬═══════╣");
    System.out.println("                                                                        ║  "+j+"      ║     "+j+" ║");
    System.out.println("╔══════════════════════════╗                                            ╚═════════╩═══════╝");
    System.out.println("║         Grupo  B         ║");
    System.out.println("╠═════════╦═══════╦════════╣");
    System.out.println(  "║  "+j+"      ║     "+j+" ║      "+j+" ║"   +      "            ╔═════════╦═══════╗");
    System.out.println(  "╠═════════╬═══════╬════════╣"    +     "            ║  "+j+"      ║     "+j+" ║");
    System.out.println(  "║  "+j+"      ║     "+j+" ║      "+j+" ║"   +      "            ╠═════════╬═══════╣");
    System.out.println(  "╠═════════╬═══════╬════════╣"    +     "            ║  "+j+"      ║     "+j+" ║");
    System.out.println(  "║  "+j+"      ║     "+j+" ║      "+j+" ║"   +      "            ╚═════════╩═══════╝");
    System.out.println("╠═════════╬═══════╬════════╣");
    System.out.println(  "║  "+j+"      ║     "+j+" ║      "+j+" ║");
    System.out.println("╚═════════╩═══════╩════════╝");
}}
