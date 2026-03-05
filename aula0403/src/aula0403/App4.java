package aula0403;

public class App4 {

	public static void main(String[] args) {
		/*
		 * Dado um vetor v = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49,
		 * 50}, faça a soma de todos elementos 
		 */
		
		// array ou vetor
		int v[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
		int soma = 0;
		
		for (int i = 0; i < v.length; i++) {
			soma += v[i];
			System.out.println(v[i]);
		}
		
		System.out.println("Valor da soma do vetor é:...: " + soma);

	}

}
