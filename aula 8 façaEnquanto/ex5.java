import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int id,i,qtdPessoas,f1,f2,f3,f4,f5;
		f1=0;
		f2=0;
		f3=0;
		f4=0;
		f5=0;
		
		i=2;
		do {
			System.out.println("Insira uma idade:");
			id = ler.nextInt();
			if(id < 16) {
				f1++;
				System.out.println("1 faixa");
			}else if(id>=16 && id<=30) {
				f2++;
				System.out.println("2ªfaixa");
			}else if(id >=31 && id<=45) {
				f3++;
				System.out.println("3 faixa");
			}else if(i >= 46 && id<=60) {
				f4++;
				System.out.println("4ªfaixa");
			}else {
				f5++;
				System.out.println("5 faixa");
			}
			System.out.println("Deseja continuar?");
			System.out.println("1 = Sim");
			System.out.println("2 = Não");
			i = ler.nextInt();
			
		}while(i==1);
		qtdPessoas = f1+f2+f3+f4+f5;
		
		
		if(qtdPessoas>0) {
			System.out.println(f1*100/qtdPessoas + "%");
			System.out.println(f2*100/qtdPessoas + "%");
			System.out.println(f3*100/qtdPessoas + "%");
			System.out.println(f4*100/qtdPessoas + "%");
			System.out.println(f5*100/qtdPessoas + "%");
			System.out.println("Faixa 1: "+f1);
			System.out.println("Faixa 2: "+f2);
			System.out.println("Faixa 3: "+f3);
			System.out.println("Faixa 4: "+f4);
			System.out.println("Faixa 5: "+f5);
		} else {
			System.out.println("Ninguém foi cadastrado.");
		}
	}

}
	