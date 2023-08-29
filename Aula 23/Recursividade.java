import java.util.Scanner;

public class Recursividade {
	public static void main(String[] args) {
		
		// ALUNO: RENATO ALEXANDRE DE CARVALHO - PTECH
		// PROFESSOR: CARLOS VERÍSSIMO
		// EXERCÍCIO: SEQUÊNCIA DE FIBONACCI UTILIZANDO A RECURSIVIDADE
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Insira a quantidade de sequências que serão impressas: ");
		
		int quantidadeSequencias = scanner2.nextInt();
		for (int i = 0; i < quantidadeSequencias; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
	public static int fibonacci(int x) {
		if (x < 2) {
			// Os primeiros dois números da sequência de Fibonacci são 1 e 1.
			return 1;
		} else {
			//cada número subsequente na sequência de Fibonacci é a soma dos dois números anteriores, ou seja:
			return fibonacci(x-1) + fibonacci(x-2);
		}
	}
}
