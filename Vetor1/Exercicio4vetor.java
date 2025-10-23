package prjAulavetor;

import java.util.Scanner;

public class Exercicio4vetor {


	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM =10;
		int i, a[];
		double media=0;
		
		a = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("digite o "+(i+1)+"o vetor");
			a[i] = ler.nextInt();
			media += a[i];
			
		}
		
		media /= TAM;
		System.out.print("a [");
		for (i=0; i<TAM; i++) {		
		     System.out.print(a[i]+" ");
		  
		  }
		System.out.println("]\n");
		System.out.println("a sua media é:" +media);

	}
}
