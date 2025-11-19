package KaioBastosPrado;

import java.util.Scanner;

public class KPB_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            soma += numero;

        } while (numero % 10 != 0);

        System.out.println("Soma total = " + soma);

        sc.close();
    }


	}


