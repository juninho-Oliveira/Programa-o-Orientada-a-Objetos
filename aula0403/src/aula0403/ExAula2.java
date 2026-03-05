package aula0403;

import java.util.Scanner; // import para lê o valor do usuario 

public class ExAula2 {

	public static void main(String[] args) {
		/*
		 * Faça um aplicativo que receba três valores inteiros na linha de comando e
		 * mostre o maior dentre eles.
		 */

		// Entrada de dados - via teclado (System.in);
		Scanner sc = new Scanner(System.in);

		// Valor1
		System.out.println("Digite o primeiro valor: ");
		int primeiroValor = sc.nextInt();

		// Valor1
		System.out.println("Digite o segundo valor: ");
		int segundoValor = sc.nextInt();

		// Valor1
		System.out.println("Digite o terceiro valor: ");
		int terceiroValor = sc.nextInt();

		if ((primeiroValor > segundoValor) && (primeiroValor > terceiroValor)) {

			// Imprimir
			System.out.println("O primeiro valor...: " + primeiroValor);

		} else if (segundoValor > terceiroValor) {

			// Imprimir
			System.out.println("O segundo valor...: " + segundoValor);

		} else {

			// Imprimir
			System.out.println("O terceiro valor...: " + terceiroValor);

		}

	}

}
