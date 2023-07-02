import java.util.Random;

public class Precarga {

    static String[] nombreEquipo = { "Atlético del Sol", "Racing Club", "Deportivo Alameda", "Unión Victoria",
            "Sport del Mar", "Juventud Esperanza", "Estrella del Norte", "América Central", "Victoria Fútbol Club",
            "Sporting Riviera", "Deportivo del Este", "Unión del Río", "Club Atlántico", "Deportivo Olímpico",
            "Centro Deportivo", "Juventus Sporting" };
    static String[] nombrePrimero = { "Alejandro", "Andrés", "Antonio", "Arturo", "Benjamín", "Carlos", "César",
            "Cristian", "Daniel", "David", "Diego", "Eduardo", "Enrique", "Esteban", "Felipe", "Fernando", "Francisco",
            "Gabriel", "Germán", "Gonzalo", "Gregorio", "Guillermo", "Gustavo", "Héctor", "Hernán", "Ignacio", "Isaac",
            "Ismael", "Iván", "Jacobo", "Javier", "Jesús", "Jorge", "José", "Juan", "Julio", "Leonardo", "Luis",
            "Manuel", "Marco", "Martín", "Mauricio", "Miguel", "Nicolás", "Óscar", "Pablo", "Patricio", "Pedro",
            "Rafael", "Ramón", "Raúl", "Ricardo", "Roberto", "Rodrigo", "Rubén", "Salvador", "Santiago", "Sebastián",
            "Sergio", "Simón", "Tomás", "Valentín", "Víctor", "Xavier", "Yahir", "Zebedeo", "Abel", "Adán", "Adrián",
            "Alán", "Alfonso", "Alonso", "Amadeo", "Amador", "Amancio", "Amaro", "Anselmo", "Armando", "Artemio",
            "Aurelio", "Baltasar", "Bartolomé", "Basilio", "Beltrán", "Bernardo", "Braulio", "Bruno", "Casiano", "Ciro",
            "Claudio", "Cosme", "Damián", "Dámaso", "Darío", "Demetrio", "Dionisio", "Efraín", "Elías", "Emiliano",
            "Ernesto", "Eusebio", "Fausto", "Federico", "Fermín", "Filiberto" };
    static String[] apellido = { "García", "González", "Rodríguez", "Fernández", "López", "Martínez", "Sánchez",
            "Pérez", "Gómez", "Martín", "Jiménez", "Hernández", "Ruiz", "Torres", "Ramírez", "Flores", "Romero",
            "Alonso", "Vargas", "Ramos", "Castro", "Vázquez", "Serrano", "Silva", "Mendoza", "Ortega", "Núñez",
            "Guerrero", "Cortés", "Rojas", "Acosta", "Moreno", "Delgado", "Rivas", "Ponce", "Vega", "Morales", "Rivera",
            "Cruz", "Navarro", "Reyes", "Orozco", "Cabrera", "Herrera", "Miranda", "Escobar", "Avila", "Medina",
            "Santos", "Figueroa", "Pacheco", "Peña", "Quintero", "Cordero", "Valenzuela", "Zamora", "Sepúlveda",
            "Hidalgo", "Andrade", "Castañeda", "Correa", "Villalobos", "Méndez", "Soto", "Contreras", "Parra", "Araya",
            "Salazar", "Montoya", "Aguirre", "Lara", "Escobar", "Tapia", "Valdés", "Navarrete", "Coronado", "Vargas",
            "Cáceres", "Cárdenas", "León", "Benítez", "Carvajal", "Guzmán", "Arias", "Vera", "Paredes", "Muñoz",
            "Campos", "Valencia", "Trujillo", "Chávez", "Toro", "Bravo", "Vidal", "Godoy", "Sanhueza", "Molina",
            "Montes", "Aguilar", "Córdova", "Miranda", "Espinoza", "Ríos" };
    // static Inscripcion ins = new Inscripcion();
    static Equipos equipo1 = new Equipos();
    static Equipos equipo2 = new Equipos();
    static Equipos equipo3 = new Equipos();
    static Equipos equipo4 = new Equipos();
    static Equipos equipo5 = new Equipos();
    static Equipos equipo6 = new Equipos();
    static Equipos equipo7 = new Equipos();
    static Equipos equipo8 = new Equipos();
    static Equipos equipo9 = new Equipos();
    static Equipos equipo10 = new Equipos();
    static Equipos equipo11 = new Equipos();
    static Equipos equipo12 = new Equipos();
    static Equipos equipo13 = new Equipos();
    static Equipos equipo14 = new Equipos();
    static Equipos equipo15 = new Equipos();
    static Equipos equipo16 = new Equipos();
    static Equipos[] arrayEquipos = { equipo1, equipo2, equipo3, equipo4, equipo5, equipo6, equipo7, equipo8, equipo9,
            equipo10, equipo11, equipo12, equipo13, equipo14, equipo15, equipo16 };
    Equipos[] arrayEquiposModalidad;

    public Equipos[] pre(int modalidad) {
        arrayEquiposModalidad = new Equipos[modalidad];
        for (int i = 0; i < modalidad; i++) {
            arrayEquiposModalidad[i] = arrayEquipos[i];
            arrayEquiposModalidad[i].setNombreEquipo(nombreEquipo[i]);
            arrayEquiposModalidad[i].setCapitan(
                    nombrePrimero[generarNumeroAleatorio(0, 99)] + " " + apellido[generarNumeroAleatorio(0, 99)]);
            arrayEquiposModalidad[i].setCantidadJugadores(generarNumeroAleatorio(9, 14));
            arrayEquiposModalidad[i].setSubcapitan(
                    nombrePrimero[generarNumeroAleatorio(0, 99)] + " " + apellido[generarNumeroAleatorio(0, 99)]);
            int cantidadJugadores = arrayEquiposModalidad[i].getCantidadJugadores();
            Jugadores[] jugadores = new Jugadores[cantidadJugadores];
            arrayEquiposModalidad[i].setJugadores2(jugadores);

            for (int k = 0; k < cantidadJugadores; k++) {
                arrayEquiposModalidad[i].getJugadores2()[k] = new Jugadores();
                arrayEquiposModalidad[i].getJugadores2()[k].setNombreJugador(
                        nombrePrimero[generarNumeroAleatorio(0, 99)] + " " + apellido[generarNumeroAleatorio(0, 99)]);
                arrayEquiposModalidad[i].getJugadores2()[k].setDNI(generarNumeroAleatorio(10000000, 40000000));
            }
        }
        // ins.setCantidadEquipos(ins.getCantidadEquipos());
        return arrayEquiposModalidad;
    }

    public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;

    }
}
