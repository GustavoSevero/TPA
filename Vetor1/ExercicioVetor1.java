package prjAulavetor;

import java.util.Scanner;

public class ExercicioVetor1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM =10;
		int i, a[],b[];
		
		a = new int[TAM];
		b = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"o vetor");
			a[i] = ler.nextInt();
			
			b[i] = a[i]*a[i];
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
		System.out.println("]");

	}
}