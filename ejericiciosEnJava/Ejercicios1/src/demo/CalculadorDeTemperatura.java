package demo;

import java.util.Scanner;

public class CalculadorDeTemperatura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char unidadDeMedida;

		Double valor;
		Integer tipoDeFormula;

		System.out.println("Para empezar ¿cuál es la unidad de medida?");
		System.out.println("""
				/*
				celsius = c
				fehrenheit = f
				kelvin = k
				rankine = r
				reaumur = u
				*/
				""");
		unidadDeMedida = sc.next().charAt(0);

		System.out.print("Valor: ");
		valor = sc.nextDouble();
		System.out.println("-------------");

		while (true) {

			System.out.print("De ");
			System.out.print(valor);
			switch (unidadDeMedida) {
			case 'c' -> System.out.print("C Celsius");
			case 'f' -> System.out.print("F Fehrenheit");
			case 'k' -> System.out.print("K kelvin");
			case 'r' -> System.out.print("Ra Rankine");
			case 'u' -> System.out.print("Re Réaumur");
			}
			System.out.println(" a ...");

			System.out.println("*Para salir oprima 5");

			switch (unidadDeMedida) {
			case 'c' -> {

				System.out.println("""
						1. Fahrenheit,
						2. Kelvin,
						3. Rankine,
						4. Réaumur
						""");

				tipoDeFormula = sc.nextInt();
				switch (tipoDeFormula) {
				case 1 -> {

					valor = ((9 * valor) / 5) + 32;
					unidadDeMedida = 'f';
				}
				case 2 -> {

					valor = valor + 273.15;
					unidadDeMedida = 'k';
				}
				case 3 -> {

					valor = ((9 * valor) / 5) + 491.67;
					unidadDeMedida = 'r';
				}
				case 4 -> {
					valor = (4 * valor) / 5;
					unidadDeMedida = 'u';
				}

				default -> {
					sc.close();
					System.exit(0);

				}
				}

			}
			case 'f' -> {

				System.out.println("""
						1. Celsius,
						2. Kelvin,
						3. Rankine,
						4. Réaumur
						""");

				tipoDeFormula = sc.nextInt();
				switch (tipoDeFormula) {
				case 1 -> {

					valor = (5 * (valor - 32)) / 9;
					unidadDeMedida = 'c';
				}
				case 2 -> {

					valor = ((5 * (valor - 32)) / 9) + 273.15;
					unidadDeMedida = 'k';
				}
				case 3 -> {

					valor = valor + 459.67;
					unidadDeMedida = 'r';
				}
				case 4 -> {
					valor = (4 * (valor - 32)) / 9;
					unidadDeMedida = 'u';// ACA;
				}
				default -> {
					sc.close();
					System.exit(0);
				}

				}

			}
			case 'k' -> {

				System.out.println("""
						1. Celsius,
						2. Fahrenheit,
						3. Rankine,
						""");

				tipoDeFormula = sc.nextInt();
				switch (tipoDeFormula) {
				case 1 -> {

					valor = valor - 273.15;
					unidadDeMedida = 'c';
				}
				case 2 -> {

					valor = ((9 * (valor - 273.15)) / 5) + 32;
					unidadDeMedida = 'f';
				}
				case 3 -> {

					valor = ((9 * (valor - 273.15)) / 5) + 491.67;
					unidadDeMedida = 'r';
				}

				default -> {
					sc.close();
					System.exit(0);
				}
				}

			}
			case 'r' -> {

				System.out.println("""
						1. Kelvin,
						2. Fahrenheit,
						3. Celsius,
						""");

				tipoDeFormula = sc.nextInt();
				switch (tipoDeFormula) {
				case 1 -> {

					valor = ((5 * (valor - 491.67)) / 9) + 273.15;
					unidadDeMedida = 'k';
				}
				case 2 -> {

					valor = valor - 459.67;
					unidadDeMedida = 'f';
				}
				case 3 -> {

					valor = (5 * (valor - 491.67)) / 9;
					unidadDeMedida = 'c';
				}

				default -> {
					sc.close();
					System.exit(0);
				}
				}

			}
			case 'u' -> {

				System.out.println("""
						1. Fahrenheit,
						2. Celsius,
						""");

				tipoDeFormula = sc.nextInt();
				switch (tipoDeFormula) { 
				case 1 -> {

					valor = ((9 * valor) / 4) + 32;
					unidadDeMedida = 'f';
				}
				case 2 -> {

					valor = (5 * valor) / 4;
					unidadDeMedida = 'c';
				}

				default -> {
					sc.close();
					System.exit(0);
				}
				}
			}
			}
		}
	}
}