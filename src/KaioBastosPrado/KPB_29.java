package KaioBastosPrado;

import java.util.Scanner;

public class KPB_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número positivo: ");
	        int n = sc.nextInt();

	        int cont = 0;

	        while (n > 0) {
	            n /= 10;
	            cont++;
	        }

	        System.out.println("Quantidade de dígitos: " + cont);

	        sc.close();
	    }
	

	}


