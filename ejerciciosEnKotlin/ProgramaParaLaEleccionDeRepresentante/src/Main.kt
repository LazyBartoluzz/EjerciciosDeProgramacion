//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val votoInfluenciadoPorPublicidadEnInternet= 700000;
    val votoInfluenciadoPorPublicidadEnRadio= 200000;
    val votoInfluenciadoPorPublicidadEnTelevision= 600000;

    var bandElecciones : Boolean;

    var costoCampagnaDeRep1 : Int;
    var costoCampagnaDeRep2 : Int;
    var costoCampagnaDeRep3 : Int;
    var costoDado : Int;

    var cantidadVotantesDelRepresentante1:Int;
    var cantidadVotantesDelRepresentante2:Int;
    var cantidadVotantesDelRepresentante3:Int;
    var totalDeLosVotos : Int;

    var tipoOpcionUsuario : Int;

    cantidadVotantesDelRepresentante1 = 0;cantidadVotantesDelRepresentante2 = 0;
    cantidadVotantesDelRepresentante3=0; totalDeLosVotos = 0;

    costoCampagnaDeRep1=0;costoCampagnaDeRep2=0;costoCampagnaDeRep3=0;

    println( "Sistema Para El Voto De Representantes En El Municipio De \"Premier\"" );

    bandElecciones = true;
    while ( bandElecciones ) {

        println("""
            
            Elija la opción que desee:
            
            1. Votar por el candidato de su elección,
            2. Ver el costo de campaña de un candidato,
            3. Vaciar todas las urnas de votación,
            4. Ver número total de votos,
            5. Ver porcentaje de votos por cada candidato,
            6. Costo promedio de campaña en las elecciones,
            7. salir.
            
        """.trimIndent());

        tipoOpcionUsuario = readln().toInt();
        when ( tipoOpcionUsuario ) {

            1 -> {

                println("""
                    ------------------
                    Su voto fue influenciado por publicidad en la...
                    
                    1. Internet,
                    2. Radio,
                    3. Television.
                    -----------------
                """.trimIndent());

                tipoOpcionUsuario = readln().toInt();
                costoDado = when (tipoOpcionUsuario) {
                    1 -> votoInfluenciadoPorPublicidadEnInternet;
                    2 -> votoInfluenciadoPorPublicidadEnRadio;
                    else -> votoInfluenciadoPorPublicidadEnTelevision;
                }
                /**
                 *
                 * La anterior es una posibilidad que se puede hacer con when en Kotlin, para simplificar
                 * el codigo se puede asignar lo que devuleve when y hay que poner la rama else para que sirva
                 *
                 */

                println("""
                    ------------------
                    Candidatos 
                    
                    1. Pato Donald,
                    2. Doña Clotilde,
                    3. Mickey Mouse.
                    -----------------
                """.trimIndent());

                tipoOpcionUsuario = readln().toInt();

                if ( tipoOpcionUsuario == 1 ) {
                    cantidadVotantesDelRepresentante1++;
                    costoCampagnaDeRep1 += costoDado;
                }
                if ( tipoOpcionUsuario == 2 ) {
                    cantidadVotantesDelRepresentante2++;
                    costoCampagnaDeRep2 += costoDado;
                }
                if ( tipoOpcionUsuario == 3 ){
                    cantidadVotantesDelRepresentante3++;
                    costoCampagnaDeRep3 += costoDado;
                }

            }

            2 -> {

                println("""
                    ------------------
                    Seleccione el candidado para ver el costo de su campaña
                    
                    1. Pato Donald,
                    2. Doña Clotilde,
                    3. Mickey Mouse.
                    -----------------
                """.trimIndent());

                tipoOpcionUsuario = readln().toInt();
                print("El costo de la campaña del candidado $tipoOpcionUsuario es: ");

                when (tipoOpcionUsuario){
                    1 -> println( costoCampagnaDeRep1 );
                    2 -> println( costoCampagnaDeRep2 );
                    else -> println( costoCampagnaDeRep3 );
                }
                println();
            }

            3 -> {

                cantidadVotantesDelRepresentante1 = 0;
                cantidadVotantesDelRepresentante2 = 0;
                cantidadVotantesDelRepresentante3 = 0;
                println( "La urnas ahora estan vacias" );

                //si vacia las urnas y pues el costo de las campañas de los representantes vuelve a ser de cero
                costoCampagnaDeRep1=0;costoCampagnaDeRep2=0;costoCampagnaDeRep3=0;
            }

            4 -> {
                totalDeLosVotos=cantidadVotantesDelRepresentante1 + cantidadVotantesDelRepresentante2 + cantidadVotantesDelRepresentante3;
                println( "El número total de los votos es $totalDeLosVotos " );
            }

            5 -> {
                totalDeLosVotos=cantidadVotantesDelRepresentante1 + cantidadVotantesDelRepresentante2 + cantidadVotantesDelRepresentante3;

                println( "Los Porcentajes de los votos" );
                println( "1). Pato Donald => ${ ( cantidadVotantesDelRepresentante1 * 100 ) / totalDeLosVotos }%" );
                println( "2). Doña Clotilde =>  ${ ( cantidadVotantesDelRepresentante2 * 100 ) / totalDeLosVotos }%" );
                println( "3). Mickey Mouse => ${ ( cantidadVotantesDelRepresentante3 * 100 ) / totalDeLosVotos }%" );
            }

            6 -> {

                println( "Costo promedio de campaña" );
                println( " PROMEDIO=> ${ ( costoCampagnaDeRep1 + costoCampagnaDeRep2 + costoCampagnaDeRep3 ) / 3 }" );
            }

            else -> {

                bandElecciones=false;
                println("saliendo...");
            }
        }
    }
}