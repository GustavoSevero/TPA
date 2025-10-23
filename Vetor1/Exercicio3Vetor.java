package prjAulavetor;

import java.util.Scanner;

public class Exercicio3Vetor {


	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM =10;
		int i, a[],b[],j=TAM-1;
		
		a = new int[TAM];
		b = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("digite o "+(i+1)+"o vetor ");
			a[i] = ler.nextInt();
			b[j] = a[i];
			j--;
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
	}
}

