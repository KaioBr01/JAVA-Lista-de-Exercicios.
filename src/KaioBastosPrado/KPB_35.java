package KaioBastosPrado;

import java.util.Scanner;

public class KPB_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Digite um número positivo: ");
            n = sc.nextInt();
        } while (n <= 0);

        System.out.println("Número aceito: " + n);

        sc.close();
    }
	}


