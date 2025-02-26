//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var numeroDado1:Int;var numeroDado2:Int;
    var juegosGanadosJugador1:Int;
    var juegosGanadosJugador2:Int;
    var contadorJuegos:Int;

    juegosGanadosJugador1=0;juegosGanadosJugador2=0;
    contadorJuegos=0;

    println("\tJUEGO DE LOS DADOS");

    println("""
        
        /**
        *PARA SALIR INGRESE LA "x"
        *
        */
    """.trimIndent());

    while( readln()!="x" ){

        contadorJuegos++;

        numeroDado1=((Math.random()*6)+1).toInt();
        numeroDado2=((Math.random()*6)+1).toInt();

        println( "Juego #$contadorJuegos Luna => $numeroDado1 Jorge => $numeroDado2" );

        if (numeroDado1 > numeroDado2) {
            juegosGanadosJugador1++;
        }
        if (numeroDado2 > numeroDado1) {

            juegosGanadosJugador2++;
        }
    }
    println("Luna tiene un total de $juegosGanadosJugador1 juegos ganados");
    println("Jorge tiene un total de $juegosGanadosJugador2 juegos ganados");

    if (juegosGanadosJugador1 > juegosGanadosJugador2) {

        println("Luna es la ganadora del juego");
    }
    else
    if (juegosGanadosJugador1 < juegosGanadosJugador2) {

        println("Jorge sale victorioso en el juego");
    }
    else{
        println("Hubo un empate Asombroso!!!");
    }

}