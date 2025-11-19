package KaioBastosPrado;

import java.util.Scanner;

public class KPB_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int n = sc.nextInt();

	        int divisor = 1;
	        int contDivisores = 0;

	        while (divisor <= n) {
	            if (n % divisor == 0) {
	                contDivisores++;
	            }
	            divisor++;
	        }

	        if (contDivisores == 2) {
	            System.out.println("É primo.");
	        } else {
	            System.out.println("Não é primo.");
	        }

	        sc.close();
	    }

	}


