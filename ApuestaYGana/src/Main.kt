

fun main() {

    var cantidadDineroUsuario : Int;
    var numeroRandom : Int;
    var eleccionDineroUsuario:Char;
    var bandEjecucionJuego : Boolean;

    print( "Ingrese la cantidad de dinero que desea apostar: " )
    cantidadDineroUsuario= readln().toInt();

    bandEjecucionJuego = true;
    while (  bandEjecucionJuego ) {
        numeroRandom = ( Math.random() * 3 ).toInt() + 1;
        println( "Se muestra por consola el #$numeroRandom" );

        when(numeroRandom) {

            1 -> cantidadDineroUsuario *=2;
            2 -> cantidadDineroUsuario /= 2;
            3 -> {

                println("Señor, usted ha perdido todo su dinero!!!");
                bandEjecucionJuego = false;
                cantidadDineroUsuario=0;
            }
        }

        if( numeroRandom == 1 || numeroRandom == 2 ) {

            println(
                """            
                 *  Usted puede seguir jugando con su saldo actual (N):
                    
                    \$$cantidadDineroUsuario 
                    
                    O puede dejar de hacerlo (Y):
                    
                """.trimIndent()
            );
            eleccionDineroUsuario = readln().uppercase().get(0);
            if (eleccionDineroUsuario == 'Y') bandEjecucionJuego = false;
        }
    }

    println( "\n\t\tUsted termino con un saldo final de $cantidadDineroUsuario !!!!!!" );
}
