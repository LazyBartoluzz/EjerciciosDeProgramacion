package demo;

import java.util.Scanner;

public class CifradoCesar {

	static Character ALFABETO[] = new Character[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
			'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer cuantoSeCorreElAlfabeto;
		Integer posicionLetra;
		Integer posLetra;

		Character[] alfabetoMovido = new Character[ALFABETO.length];

		String mensaje;
		char sentidoDeMovimiento;

		System.out.println("# de movimientos: ");
		cuantoSeCorreElAlfabeto = sc.nextInt();

		System.out.println("""
				Para ir de derecha a izquierda => i
				Para ir de izquierda a derecha => d
				""");
		sentidoDeMovimiento = sc.next().charAt(0);

		sc.nextLine();
		System.out.println("Ingrese mensaje; ");
		mensaje = sc.nextLine();

		for (int i = 0; i < alfabetoMovido.length; i++) {

			if (sentidoDeMovimiento == 'i') {

				posicionLetra = i + cuantoSeCorreElAlfabeto;
				if (posicionLetra >= alfabetoMovido.length) {

					posicionLetra = posicionLetra - alfabetoMovido.length;
				}
			} else {

				posicionLetra = i - cuantoSeCorreElAlfabeto;
				if (posicionLetra < 0) {

					posicionLetra = alfabetoMovido.length - Math.abs(posicionLetra);
				}
			}
			alfabetoMovido[i] = ALFABETO[posicionLetra];
		}
		
		//------ACA SIMPLEMENTE MUESTRE EL ALFABETO NORMAL Y EL MOVIDO
		for (int i = 0; i < alfabetoMovido.length; i++) {

			System.out.print(ALFABETO[i]);
			System.out.print(", ");
		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < alfabetoMovido.length; i++) {

			System.out.print(alfabetoMovido[i]);
			System.out.print(", ");
		}
		System.out.println();
		System.out.println();
		///-------
		
		String mensajeCodificado = "";

		for (int i = 0; i < mensaje.length(); i++) {

			posLetra = 0;
			for (int j = 0; j < alfabetoMovido.length; j++) {

				if (mensaje.charAt(i) == ALFABETO[j]) {

					posLetra = j;
					break;
				}
			}
			mensajeCodificado += "" + alfabetoMovido[posLetra];
		}

		System.out.println(mensajeCodificado);
		// MENSAJE ENCRIPTADO
		System.out.println("\n\nMENSAJE ENCRIPTADO");
		for (int i = 0; i < mensaje.length(); i++) {

			posLetra = 0;
			for (int j = 0; j < alfabetoMovido.length; j++) {

				if (mensajeCodificado.charAt(i) == alfabetoMovido[j]) {

					posLetra = j;
					break;
				}
			}
			System.out.print(ALFABETO[posLetra]);
		}
		sc.close();

	}
}
