package KaioBastosPrado;

public class KPB_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int soma = 0;
        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }

        System.out.println("Soma dos pares = " + soma);
    }


	

}
