import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM = 5;
		int i, a[], j;
		
		a = new int[TAM];
		
		for(i=0; i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"  valor do vetor:");
			a[i] = sc.nextInt();
		}
		System.out.println("");
		for(i=0; i<TAM; i++) {
			System.out.println(a[i]);
			if(i !=TAM-1) {
				System.out.println("");
				
			}
		}
		System.out.println("]/n");
		
		for(i=0; i<TAM; i++) {
			boolean primo = true;
			
			if(a[i] == 1) {
				primo = false;
			}
			for(j=2; j<a[i]; j++) {
				if(a[i]%j == 0) {
					primo = false;
					break;
				}
			}
			if(primo) {
				System.out.print("PRIMO");}
			else {
				System.out.print("NAO");
			}
			if( i != TAM-1) {
				Systeam.out.print("!");
				
			}
			}
		sc.close();
		}
		
}
