import java.util.Scanner;

public class Iterativo {
    public static void main(String[] args) {
    	
		// ALUNO: RENATO ALEXANDRE DE CARVALHO - PTECH
		// PROFESSOR: CARLOS VERÍSSIMO
		// EXERCÍCIO: ALGORITMO PARA CONVERSÃO DE NÚMEROS DECIMAIS PARA DIFERENTES BASES UTILIZANDO ITERATIVIDADE E RECURSIVIDADE
    	
    	//CONVERSÃO UTILIZANDO MÉTODO ITERATIVO:
    	
        int posicao = 0;
        int[] array = new int[32];
        
        Scanner scanner1 = new Scanner(System.in);
        
        System.out.println("Insira o numero decimal desejado:" );
        int numero = scanner1.nextInt();
        
        System.out.println("Insira a base desejada para a conversão: \n\n2 - Binario \n8 - Octal \n16 - Hexadecimal" );
        int base = scanner1.nextInt();

        while (numero != 0) {
        	if (base == 2 || base == 8 || base == 16) {
            array[posicao] = numero % base;
            posicao++;
            numero = numero / base;
        	} else {
        		System.out.println("Insira uma base válida (2, 8 ou 16).");
        		System.exit(0);
        	}
        }
        
        // Sim, eu sei que o código abaixo ficou meio repetitivo, mas foi o jeito que eu encontrei pra fazer.
        if (base == 2) {
        	System.out.println("--------------------------");
            System.out.print("Resultado em binário: ");
            for (int i = posicao - 1; i >= 0; i--) {
            	System.out.print(array[i]);
            }
            System.out.println("\n--------------------------");
        } else if (base == 8) {
        	System.out.println("--------------------------");
            System.out.print("Resultado em octal: ");
            for (int i = posicao - 1; i >= 0; i--) {
            	System.out.print(array[i]);
            }
            System.out.println("\n--------------------------");
        } else if (base == 16) {
        	System.out.println("--------------------------");
            System.out.print("Resultado em hexadecimal: ");
            for (int i = posicao - 1; i >= 0; i--) {
            	System.out.print(Integer.toHexString(array[i]));
            }
            System.out.println("\n--------------------------");
        }
        
    }
}
