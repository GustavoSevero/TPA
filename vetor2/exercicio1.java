import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM = 8;
		int i, a[], b[], j=0;
		
		a = new int[TAM];
		b = new int[TAM];
		
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+" valor do vetor:");
			a[i] = ler.nextInt();
			
			
			}
			for(i=0;i<TAM;i++) {
			   if ( a[i] % 2 == 0) {
				b[j] = a[i];}
			   
			   else {
				   j--;
			   }
			   j++;
			}
			
			for(i=0;i<TAM;i++) {
				   if ( a[i] % 2 == 0) {
					b[j] = a[i];}
				   j++;
				
			}
		
		
	for(i=0;i<TAM;i++) {
        System.out.print(b[i]+" ");
	
	}
	

	}

}
 