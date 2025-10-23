package prjAulavetor;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			final int TAM =10;
			int i, a[],b[],c[];
			
			a = new int[TAM];
			b = new int[TAM];
			c = new int[TAM]; 
			

			for (i=0; i<TAM; i++) {
				System.out.println("digite o "+(i+1)+"o vetor");
				a[i] = ler.nextInt();
			}
				
			for (i=0; i<TAM; i++) {
					System.out.println("digite o "+(i+1)+"o vetor ");
					b[i] = ler.nextInt();
					c[i] = a[i] + b[i];
			}
			
			System.out.print("a [");
			for (i=0; i<TAM; i++) {		
			     System.out.print(a[i]+" ");
			  
			  }
			System.out.println("]\n");

			System.out.print("b [");
			for (i=0; i<TAM; i++) {		
			     System.out.print(b[i]+" ");
			  
			  }
			System.out.println("]\n");
			
			System.out.print("c [");
			for (i=0; i<TAM; i++) {		
			     System.out.print(c[i]+" ");
			  
			  }
			System.out.println("]\n");


	       
		
	}
}
