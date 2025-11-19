package KaioBastosPrado;

import java.util.Scanner;

public class KPB_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        int senha;

	        do {
	            System.out.print("Digite a senha: ");
	            senha = sc.nextInt();
	        } while (senha != 1111);

	        System.out.println("Acesso liberado!");

	        sc.close();
	    }
	

	

}
