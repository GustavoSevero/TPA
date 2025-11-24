import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1,n2,n3,n4,m,n,ex;
		
		System.out.println("Digite a nota do 1 bimestre:");
		n1 = ler.nextDouble();

		System.out.println("Digite a nota do 2 bimestre:");
		n2 = ler.nextDouble();

		System.out.println("Digite a nota do 3 bimestre:");
		n3 = ler.nextDouble();

		System.out.println("Digite a nota do 4 bimestre:");
		n4 = ler.nextDouble();
		
		m = (n1+n2+n3+n4)/4;
		System.out.println("Média: "+m);
		
		if(m>= 7) {
			System.out.println("Aprovado");
		} else if(m < 5) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Você está em exame!");
			System.out.println("Digite a nota exame:");
			ex = ler.nextDouble();
	
			n = (m+ex)/2;
			System.out.println("Nova média: "+n);
			
			if(n>= 7) {
				System.out.println("Aprovado (em exame)");
			}else {
				System.out.println("Reprovado");
			}
		}
	}

}

