package demo;

import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double saldo = 50000.0;
		Double dineroIngresado;

		char tipoAccion;

		Boolean bandCierre;

		bandCierre = true;

		System.out.println("\t\tCAJERO");
		
		while (bandCierre) {

			System.out.println("""
					1. Consutar el saldo disponible,
					2. Ingresar el dinero,
					3. Retirar dinero,
					4. Salir.
					""");

			tipoAccion = sc.next().charAt(0);

			System.out.print("\t");
			switch (tipoAccion) {
			case '1' -> {

				System.out.println("El saldo en su cuenta es de "+saldo);
			}
			case '2' -> {
				
				System.out.println("Ingrese la cantidad de saldo que desee ingresar");
				dineroIngresado = sc.nextDouble();
				saldo += dineroIngresado;
			}
			case '3' -> {

				System.out.println("Ingrese la cantidad de saldo que desee sacar");
				dineroIngresado = sc.nextDouble();

				if (saldo > 0.0 && dineroIngresado <= saldo) {
					saldo -= dineroIngresado;
					System.out.println("Proceso realizado correctamente");
				}else {
					
					System.out.println("uff! No se puede hacer el retiro");
				}
			}
			case '4' -> {
				System.out.println("gracias por usar nuestros servicios...");
				bandCierre = false;
			}
			}
			System.out.println();
			System.out.println();
			
			
		}
		
		sc.close();

	}
}
