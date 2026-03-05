package aula0403;

import java.util.Scanner; // import para lê o valor do usuario 

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Entrada de dados - via teclado (System.in);
		Scanner sc = new Scanner(System.in);
		
		//nome
		System.out.println("Digite seu nome: ");
		String nome  = sc.nextLine();
		
		//idade
		System.out.println("Digite sua idade: ");
		int idade1  = sc.nextInt();
		
		//nota
		System.out.println("Digite sua idade: ");
		double nota = sc.nextDouble();
		
		//Imprimir
		System.out.println("Nome...: " + nome);
		System.out.println("Idade...: " + idade1);
		System.out.println("Nota...: " + nota);
		
	}

}
