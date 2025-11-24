import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
    	double  id1, id2, id3, id4, id5, qtdMaior, porMaior, porMenor;
    	qtdMaior = 0;
    	
    	System.out.println ("Digite a idade 1:");
    	 id1 = ler. nextDouble (); 
    	 
    	 System.out.println ("Digite a idade 2:");
    	 id2 = ler. nextDouble (); 
    	 
    	 System.out.println ("Digite a idade 3:");
    	 id3 = ler. nextDouble (); 
    	 
    	 System.out.println ("Digite a idade 4:");
    	 id4 = ler. nextDouble ();
    	 
    	 System.out.println ("Digite a idade 5:");
    	 id5 = ler. nextDouble (); 

    	 if(id1 >= 18) {
    		 qtdMaior = qtdMaior + 1;
    		 System.out.println ("Aluno 1 é maior de idade");
    	 }else {
    		 System.out.println ("Aluno 1 é menor de idade");
    	 }
    	 if(id2 >= 18) {
    		 qtdMaior = qtdMaior + 1;
    		 System.out.println ("Aluno 2 é maior de idade");
    	 }else {
    		 System.out.println ("Aluno 2 é menor de idade");
    	 }
    	 if(id3 >= 18) {
    		 qtdMaior = qtdMaior + 1;
    		 System.out.println ("Aluno 3 é maior de idade");
    	 }else {
    		 System.out.println ("Aluno 3 é menor de idade");
    	 }
    	 if(id4 >= 18) {
    		 qtdMaior = qtdMaior + 1;
    		 System.out.println ("Aluno 4 é maior de idade");
    	 }else {
    		 System.out.println ("Aluno 4 é menor de idade");
    	 }
    	 if(id5 >= 18) {
    		 qtdMaior = qtdMaior + 1;
    		 System.out.println ("Aluno 5 é maior de idade");
    	 }else {
    		 System.out.println ("Aluno 5 é menor de idade");
    	 }
    	 
    	 porMaior = (qtdMaior/5)*100;
		 System.out.println ("A porcentagem de alunos maiores de idade é "+porMaior+"%");
		 
		 porMenor = 100 - porMaior;
		 System.out.println ("A porcentagem de alunos menores de idade é "+porMenor+"%");

	}

}
