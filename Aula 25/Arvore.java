import java.util.ArrayList;
import java.util.Scanner;

public class Arvore {
	public static void main (String[] args) {
		
		No raiz = null;
		
		ArrayList<No> consulta = new ArrayList<No>();

		ArrayList<Integer> valoresInseridos = new ArrayList<Integer>();
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		int x = 0;
		
		while (x == 0) {
		
		System.out.println("Selecione uma opcaoo.");
		System.out.println("\n 1 - Consultar arvore binaria");
		System.out.println(" 2 - Inserir valor na arvore binaria");
		System.out.println(" 3 - Sair do sistema");
		int escolha = scan1.nextInt();
		

		
		

		switch (escolha) {
		case 1:
            System.out.println("Consultando arvore binaria:");
            if (raiz != null) {
                raiz.consulta(raiz);
            } else {
                System.out.println("arvore vazia.");
            }
            break;
		
		case 2:
				

			while(true) {
                System.out.println("Digite um valor para ser inserido, ou digite 0 para terminar de inserir. ");
                int inserindoValores = scan2.nextInt();

                if (inserindoValores == 0) {
                    break;
                }

                valoresInseridos.add(inserindoValores);
                
                System.out.println("Valores inseridos: " + valoresInseridos);

                if (raiz == null) {
                    raiz = new No(inserindoValores);
                } else {
                    raiz.inserirValor(new No(inserindoValores), raiz);
                }
            }
            break;
		case 3:
			System.out.println("\n Saindo do sistema");
			System.exit(0);
			break;
			
		default:
			System.out.println("Digite um valor valido.");
			return;
		}
		
	}
	}
	

}
