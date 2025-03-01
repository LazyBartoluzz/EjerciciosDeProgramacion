package demo;

import java.util.Scanner;

public class BatallaPokemon {

	public static void main(String[] args) {
		
		float ataque, defensa, damage;
		char tipoAtacante,tipoDefensor;
		
		Scanner sc;
		
		ataque = ( (float) (Math.random()*100 ) ) + 1;
		defensa = ( (float) (Math.random()*100 ) ) + 1;
		
		damage = ( 50 * (ataque / defensa) );
		
		sc = new Scanner(System.in);
		
		System.out.println("Esta es una Batalla de Pokemones");
		
		System.out.println("""
				
				Tipos de Pokémon
				1. Agua,
				2. Fuego,
				3. Planta,
				4. Eléctrico.
				
				""");
		
		System.out.print("Ingrese el tipo de pokemon atacante: ");
		tipoAtacante=sc.next().charAt(0);
		
		System.out.print("Ingrese el tipo de pokemon defensor: ");
		tipoDefensor=sc.next().charAt(0);
		
		sc.close();
		
		System.out.println("antes "+damage);
		
		if ( tipoAtacante == '1' ) {
			
			if(tipoDefensor == '1' || tipoDefensor == '2') damage *= 0.5;
			if(tipoDefensor == '3' || tipoDefensor == '4') damage *= 2;	
		}
		
		if ( tipoAtacante == '2' ) {
					
			if(tipoDefensor == '1') damage *= 2;
			if(tipoDefensor == '2' || tipoDefensor == '3') damage *= 0.5;
		}
		
		if ( tipoAtacante == '3' ) {
			
			if(tipoDefensor == '1' || tipoDefensor == '3' || tipoDefensor == '4') damage *= 0.5;
			if(tipoDefensor == '2') damage *= 2;
		}
		
		if ( tipoAtacante == '4' ) {
		
			if(tipoDefensor == '4') damage *= 0.5;	
		}
		
		System.out.println( "El daño durante la batalla es de: "+damage+" puntos HP" );
	}
}
