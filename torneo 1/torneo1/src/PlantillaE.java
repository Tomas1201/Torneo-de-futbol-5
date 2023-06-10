public class PlantillaE {
    static String hola;
    Jugadores juga = new Jugadores();
    public void plantillae(){
         
    System.out.println("------------------------------------------");
    System.out.println("                   "+ hola +"             ");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    }
    public void mostrard(){

    
    for(int j=0; j<17;j++){
            for(int i=0; i<j; i++){

            System.out.println(juga.NombreJugadores[j][i]);  
                
            System.out.println(juga.numeroDni[j][i]);
            System.out.println( juga.Obrasocial[j][i]);
            System.out.println(juga.Aptomedica[j][i]);
                System.out.println("Condicion del jugador(en juego-1),(en banca-2),(No sitado-3)");
                //si juego entonces
                System.out.println( juga.posicion[j][i]);
            }
            }  
        }
}
