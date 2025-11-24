import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i,n,r,ant, suc;
		r = 1;
		
		System.out.println("Digite um número:");
		n = ler.nextInt();
		ant = 0;
		
		if(n >= 1) {
			System.out.println("1");
		}else {
			System.out.println("Número inválido.");
		}
		
		i=1;
		do {
			suc = r+ant;
			ant = r;
			r = suc;
			System.out.println(r);
			i++;
		}while(i <= n);
		ler.close();
	}

}

