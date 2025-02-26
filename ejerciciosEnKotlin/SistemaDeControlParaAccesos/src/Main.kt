
fun main() {

    var codigoAccesoUsuario:Int;
    var numeroIntentosLogin:Int;

    var nombreVisitante:String;
    var motivoVisitaVisitante:String;

    println( "\t\tSistema De Control De Acceso Basado En Identificaciones\n" );

    numeroIntentosLogin=0;
    while (numeroIntentosLogin != 3) {

        print( "Ingrese su id: " );codigoAccesoUsuario=readln().toInt();

        if (1000 <= codigoAccesoUsuario && 1999 >= codigoAccesoUsuario) {
            //empleados
            println("""
                ------------------------------------------------------------
                ****Dear Employee
                
                Eres un empleado
                {}{}{}{}{}{}{}{}{}{}{}{}{}{}{...........
                
                ****
                ------------------------------------------------------------
            """.trimIndent());
            break;

        } else
            if (2000 <= codigoAccesoUsuario && 2999 >= codigoAccesoUsuario) {
                //visitantes

                print("Ingrese su nombre: ");
                nombreVisitante= readln();
                println("Ingrese el motivo de su visita");
                motivoVisitaVisitante = readln();

                println("Ingresando al sistema...");
                print("NOMBRE: $nombreVisitante");
                println("\tMOTIVO")
                print(motivoVisitaVisitante);
                break;
            } else {

                ++numeroIntentosLogin;
                println();
            }

    }

}