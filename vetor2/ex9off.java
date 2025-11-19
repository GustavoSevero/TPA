import java.util.Scanner;

public class ex9off {

	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
	        int a[], b[], i, j, inr=0, y=0;
	        final int TAM = 10;
	        a = new int[TAM];
	        b = new int[TAM];
	        
	        for(i=0; i<TAM; i++) {
	            System.out.println("Digite o " + (i+1) + " valor do primeiro vetor:");
	            a[i]=ler.nextInt();
	            
	        }

	        for(i=0; i<TAM; i++) {
	            System.out.println("Digite o " + (i+1) + " valor do segundo vetor:");
	            b[i]=ler.nextInt();
	            
	        }

	        for(i=0; i<TAM; i++) {
	            for(j=0; j<TAM; j++) {
	                if(a[i]==b[j]) {
	                    inr++;
	                    
	                }
	            }
	        }

	        int c[] = new int[inr];

	        for(i=0; i<TAM; i++) {
	            for(j=0; j<TAM; j++) {
	                if(a[i]==b[j]) {
	                    c[y]=a[i];
	                    y++;
	                    
	                }
	            }
	        }

	        for(i=0; i<inr; i++) {
	            System.out.print(c[i] + " ");
	            
	        }

	}

}
