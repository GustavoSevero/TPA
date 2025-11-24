import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int id, maiorId, menorId, i;
		maiorId = 0;
		menorId = 0;
		
		i=1;
		while(i<=5) {
			System.out.println("Digite uma idade:");
			id = ler.nextInt();
			
			if(id>= 18) {
				maiorId++;
			}else {
				menorId++;
			}
			i++;
		}
		System.out.println(maiorId+" são maiores de idade");
		System.out.println(menorId+" são menores de idade");
		
	}

}
