

fun main() {

    var monedasDe20:Int
    var monedasDe50:Int
    var monedasDe100:Int
    var monedasDe200:Int
    var monedasDe500:Int
    var cantidadTotalDeMonedas:Int

    var tipoMonedaAgregada:Int
    var tipoAccionSeleccionada:String
    var bandCiclo:Boolean

    val DENOMINACION_20:Int=20;
    val DENOMINACION_50:Int=50;
    val DENOMINACION_100:Int=100;
    val DENOMINACION_200:Int=200;
    val DENOMINACION_500:Int=500;

    monedasDe20=0
    monedasDe50=0
    monedasDe100=0
    monedasDe200=0
    monedasDe500=0

    println("\t.:LA ALCANCIA:.");

    bandCiclo=true
    while(bandCiclo) {

        println("""
			a. Agregar una Moneda
			b. Conteo de monedas individuales
			c. Calcular el total
			d. Vaciar la alcancia
			x. salir
		""")
        tipoAccionSeleccionada= readln();
        when(tipoAccionSeleccionada){
            "a"->{
                println("""¿Qué moneda quiere ingresar?
				1. $20
				2. $50
				3. $100
				4. $200
				5. $500
				""")
                tipoMonedaAgregada= readln().toInt();
                when(tipoMonedaAgregada){

                    1-> monedasDe20++;
                    2-> monedasDe50++;
                    3-> monedasDe100++;
                    4-> monedasDe200++;
                    5-> monedasDe500++;
                }
            }
            "b"->{

                println( "# monedas de 20 ${monedasDe20}" )
                println( "# monedas de 50 $monedasDe50" )
                println( "# monedas de 100 ${monedasDe100}" )
                println( "# monedas de 200 ${monedasDe200}" )
                println( "# monedas de 500 ${monedasDe500}" )
            }
            "c"->{

                cantidadTotalDeMonedas = (monedasDe20*DENOMINACION_20)+(monedasDe50*DENOMINACION_50)+
                        (monedasDe100*DENOMINACION_100)+(monedasDe200*DENOMINACION_200)+(monedasDe500*DENOMINACION_500);
                println( cantidadTotalDeMonedas );
            }
            "d"->{
                monedasDe20=0;
                monedasDe50=0;
                monedasDe100=0;
                monedasDe200=0;
                monedasDe500=0;
            }

            "x"-> bandCiclo=false;
        }
    }
}