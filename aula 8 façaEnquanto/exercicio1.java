import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	
			Scanner ler = new Scanner(System.in);
			int i, b, r, ex;

			System.out.println("Leia a base:");
			b = ler.nextInt();
			
			System.out.println("Leia o expoente:");
			ex = ler.nextInt();
			
			r = b;
			i = 1;
			
			do {
				r = r*b;
				i++;
			}while(i < ex);
			System.out.println("Resultado: "+ r);
			ler.close();
		}

	

	}


