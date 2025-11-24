import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario;
		
		System.out.println("Digite o seu salário:");
		salario = ler.nextDouble();
		
		if(salario >= 1302) {
			System.out.println("Seu salário está acima do mínimo");
		}else {
			System.out.println("Seu salário está abaixo do mínimo");
		}
	}
}
		
