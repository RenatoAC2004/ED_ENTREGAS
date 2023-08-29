import java.util.Scanner;

public class Main {
	public static void main(String[] Args) {
		
		// ALUNO: RENATO ALEXANDRE DE CARVALHO - PTECH
		// PROFESSOR: CARLOS VERÍSSIMO
		// EXERCÍCIO: SEQUÊNCIA DE FIBONACCI UTILIZANDO LAÇO WHILE OU FOR
		
		int primeiroNumero = 0;
		int segundoNumero = 1;
		int terceiroNumero = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de sequências que serão impressas: ");
		
		int quantidadeSequencia = scanner.nextInt();
		
		
		for(int i = 0; i < quantidadeSequencia; i++) {
			
			// O QUE EU FIZ: Seguindo a lógica de Fibonacci, a sequência começa com 0 e 1 e, seguindo o padrão tradicional, cada número subsequente é a soma
			// dos dois números anteriores na sequência. É isso que estou fazendo no código abaixo:
			
			terceiroNumero = primeiroNumero + segundoNumero;
			primeiroNumero = segundoNumero;
			segundoNumero = terceiroNumero;
			
			System.out.print(primeiroNumero + " ");
		}
	}
}
