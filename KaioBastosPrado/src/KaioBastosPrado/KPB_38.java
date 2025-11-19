package KaioBastosPrado;

import java.util.Scanner;

public class KPB_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        char sair;

	        do {
	            System.out.print("Deseja sair? (s/n): ");
	            sair = sc.next().toLowerCase().charAt(0);

	        } while (sair != 's');

	        System.out.println("Programa encerrado.");

	        sc.close();
	    }

	

}
