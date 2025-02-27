package demo;

import java.util.Scanner;

public class PiedraPapelYTijera {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer resultadoJugador1,resultadoJugador2;
		Integer tipoLanzamiento1,tipoLanzamiento2;
		Integer contadorDeRondas;
		
		contadorDeRondas=0;
		
		resultadoJugador1=0;resultadoJugador2=0;
		while ( (resultadoJugador1 != 2) && ( resultadoJugador2 !=2 ) ) {
			
			contadorDeRondas++;
		
			System.out.println("PUNTAJE JUGADOR #1 "+resultadoJugador1);
			System.out.println("PUNTAJE JUGADOR #2 "+resultadoJugador2);
		
			
			tipoLanzamiento1=(int) ( Math.random()*4 );
			System.out.print("Jugador #1 saca ");
			if (   tipoLanzamiento1 ==0  ) {
				
				System.out.println("Piedra");
			}
			else if(   tipoLanzamiento1 ==1  ) {
				System.out.println("Papel");
				
			}else {
				System.out.println("Tijera");
			}

			tipoLanzamiento2=(int) ( Math.random()*4 );
						
			System.out.print("Jugador #2 saca ");
			if (   tipoLanzamiento2 ==0  ) {
				
				System.out.println("Piedra");
			}
			else if(   tipoLanzamiento2 ==1  ) {
				System.out.println("Papel");
				
			}else {
				System.out.println("Tijera");
			}
			
			//gana con la piedra
			if ( tipoLanzamiento1 == 0 && tipoLanzamiento2 == 2 ) {
				
				resultadoJugador1++;
			}
			if ( tipoLanzamiento1 == 2 && tipoLanzamiento2 == 0 ) {
				
				resultadoJugador2++;
			}
			
			//gana con la papel
			if ( tipoLanzamiento1 == 1 && tipoLanzamiento2 == 0 ) {
				
				resultadoJugador1++;
			}
			if ( tipoLanzamiento1 == 0 && tipoLanzamiento2 == 1 ) {
				
				resultadoJugador2++;
			}
			
			//gana con la tijera
			if ( tipoLanzamiento1 == 2 && tipoLanzamiento2 == 1 ) {
							
				resultadoJugador1++;
			}if ( tipoLanzamiento1 == 1 && tipoLanzamiento2 == 2 ) {
				
				resultadoJugador2++;
			}
			System.out.println("");
			System.out.println("----------");
		}
		
		if (resultadoJugador1>resultadoJugador2) {
			
			System.out.println( "HA GANADO EL JUGADOR #1" );
		}else {
			
			System.out.println( "HA GANADO EL JUGADOR #2" );
		}
		
		System.out.print("Se contaron un total de ");
		System.out.println(contadorDeRondas);	
		
		
		sc.close();
	}

}
