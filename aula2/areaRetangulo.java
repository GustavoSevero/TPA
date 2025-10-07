package prjAula02;
import java.util.Scanner;

public class areaRetangulo {
   public static void main(String[] args) {
	   
	   Scanner ler = new Scanner(System.in);
	   
	   double base, altura, area;
	  
		System.out.println("Digite o valor da base:");
		base = ler.nextDouble(); //base
		
		System.out.println("Digite o valor da altura:");
		altura = ler.nextDouble(); //altura
		
		area = (base*altura)/2;
		System.out.println("a area do retangulo é: "+ area);
		ler.close();
   }
   }
