package KaioBastosPrado;

import java.util.Scanner;

public class KPB_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 2) {
            System.out.println("\nMENU:");
            System.out.println("1 - Mensagem");
            System.out.println("2 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Você escolheu a mensagem!");
            }
        }

        System.out.println("Programa encerrado.");

        sc.close();
    }


	}


