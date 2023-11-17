package contaBancaria;

import java.util.Scanner;

import contaBancaria.util.Cores;

public class Menu {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;

		while (true) {
			
			// Menu
			System.out.println(Cores.TEXT_RESET);
			System.out.println("========================================");
			System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLUE_BACKGROUND );
			System.out.println("┌──────────────────────────────────────┐");
			System.out.println("|                                      |");
			System.out.println("|                 MENU                 |");
			System.out.println("|                                      |");
			System.out.println("├──────────────────────────────────────┤" + Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND);
			System.out.println("|                                      |");
			System.out.println("|  1 - Criar Conta                     |");
			System.out.println("|  2 - Listar todas as Contas          |");
			System.out.println("|  3 - Buscar Conta por Numero         |");
			System.out.println("|  4 - Atualizar Dados da Conta        |");
			System.out.println("|  5 - Apagar Conta                    |");
			System.out.println("|  6 - Sacar                           |");
			System.out.println("|  7 - Depositar                       |");
			System.out.println("|  8 - Transferir valores entre Contas |");
			System.out.println("|  0 - Sair                            |");
			System.out.println("|                                      |");
			System.out.println("└──────────────────────────────────────┘\n");
			System.out.print("→ Digite uma opção: ");
			opcao = leia.nextInt();

			if (opcao == 0) {
				sobre();
				System.exit(0);
			}

			switch (opcao) {
			
			case 1:
				
				System.out.println(Cores.TEXT_RESET);
				System.out.println("========================================");
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLUE_BACKGROUND );
				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("|             CRIAR CONTA              |");
				System.out.println("├──────────────────────────────────────┤" + Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND);
				System.out.println("| // To Do                             |");
				System.out.println("└──────────────────────────────────────┘");
				
				break;

			case 2:
				
				System.out.println(Cores.TEXT_RESET);
				System.out.println("========================================");
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLUE_BACKGROUND );
				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("|        LISTAR TODAS AS CONTAS        |");
				System.out.println("├──────────────────────────────────────┤" + Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND);
				System.out.println("| // To Do                             |");
				System.out.println("└──────────────────────────────────────┘");
				
				break;

			case 3:

				System.out.println(Cores.TEXT_RESET);
				System.out.println("========================================");
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLUE_BACKGROUND );
				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("| CONSULTAR DADOS DA CONTA POR NÚMERO  |");
				System.out.println("├──────────────────────────────────────┤" + Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND);
				System.out.println("| // To Do                             |");
				System.out.println("└──────────────────────────────────────┘");
				
				break;

			case 4:

				System.out.println(Cores.TEXT_RESET);
				System.out.println("========================================");
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLUE_BACKGROUND );
				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("|       ATUALIZAR DADOS DA CONTA       |");
				System.out.println("├──────────────────────────────────────┤" + Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND);
				System.out.println("| // To Do                             |");
				System.out.println("└──────────────────────────────────────┘");
				
				break;

			case 5:

				System.out.println(Cores.TEXT_RESET);
				System.out.println("========================================");
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLUE_BACKGROUND );
				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("|            APAGAR CONTA              |");
				System.out.println("├──────────────────────────────────────┤" + Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND);
				System.out.println("| // To Do                             |");
				System.out.println("└──────────────────────────────────────┘");
				
				break;

			case 6:

				System.out.println(Cores.TEXT_RESET);
				System.out.println("========================================");
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLUE_BACKGROUND );
				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("|                SAQUE                 |");
				System.out.println("├──────────────────────────────────────┤" + Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND);
				System.out.println("| // To Do                             |");
				System.out.println("└──────────────────────────────────────┘");
				
				break;

			case 7:

				System.out.println(Cores.TEXT_RESET);
				System.out.println("========================================");
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLUE_BACKGROUND );
				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("|               DEPÓSITO               |");
				System.out.println("├──────────────────────────────────────┤" + Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND);
				System.out.println("| // To Do                             |");
				System.out.println("└──────────────────────────────────────┘");
				
				break;

			case 8:

				System.out.println(Cores.TEXT_RESET);
				System.out.println("========================================");
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLUE_BACKGROUND );
				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("|      TRANSFERÊNCIA ENTRE CONTAS      |");
				System.out.println("├──────────────────────────────────────┤" + Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND);
				System.out.println("| // To Do                             |");
				System.out.println("└──────────────────────────────────────┘");
				
				break;

			default:

				System.out.println(Cores.TEXT_RESET);
				System.out.println("========================================");
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_RED_BACKGROUND_BRIGHT );
				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("|           OPÇÃO INVÁLIDA!            |");
				System.out.println("└──────────────────────────────────────┘");
				
				break;

			}

		}

	}

	public static void sobre() {
		System.out.println(Cores.TEXT_RESET);
		System.out.println("========================================");
		System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND );
		System.out.println("┌──────────────────────────────────────┐");
		System.out.println("| Projeto Desenvolvido por:            |");
		System.out.println("| Gabriel Sponda Freitas Bettarello    |");
		System.out.println("| github.com/gabrielsponda             |");
		System.out.println("└──────────────────────────────────────┘");
	}

}