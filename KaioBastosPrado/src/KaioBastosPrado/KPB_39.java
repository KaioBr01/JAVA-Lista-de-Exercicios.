package KaioBastosPrado;

import java.util.Scanner;

public class KPB_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um número entre 1 e 5: ");
            numero = sc.nextInt();

        } while (numero < 1 || numero > 5);

        System.out.println("Número válido: " + numero);

        sc.close();
    }
	}


