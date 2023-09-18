package exercicio2;

import java.util.Scanner;

import arvores.AVLint;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		AVLint avl = new AVLint();
		
		int opcao, valor;
		do {
			
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			System.out.println("2 - Mostrar FB dos nós");
			opcao = le.nextInt();
			
			switch(opcao) {
			case 0:
				System.out.println("Encerrado o programa");
			break;
			case 1:
				System.out.println("Informe valor: ");
				valor = le.nextInt();
				avl.root = avl.inserirAVL(avl.root, valor);
				avl.atualizaAlturas(avl.root);
			break;
			case 2:
				System.out.println("Apresentação FB dos nós");
				avl.mostraFB(avl.root);
				System.out.println();
			break;
			
			default:
				System.out.println("Opcão inválida");
			}
			
		}while(opcao != 0);
		
		le.close();
	}

}
