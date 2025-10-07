package prjAula02;
import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {

		//criando um scanner chamado ler
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a nota 1:");
		nota1 = ler.nextDouble(); //leia(nota1
		
		System.out.println("Digite a nota 2:");
		nota2 = ler.nextDouble(); //leia(nota2
		
		media = (nota1+nota2)/2; //calculo da media
		System.out.println("Sua media é: "+ media);
		ler.close();
		
	}