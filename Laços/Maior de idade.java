import java.util.Scanner;
public class Ex3 {
	public static void main (String[]args) {
		Scanner in=new Scanner(System.in);
		int aa,an,id,l;
		do {
			System.out.println("Digite o ano atual");
			aa=in.nextInt();
			System.out.println("Digite o ano de nascimento");
			an=in.nextInt();
			id=(aa-an);
			if (id>=18) {
				System.out.println("Maior de idade");
			}else {
				System.out.println("Menor de idade");
			}
			System.out.println("Deseja continuar? se sim=1, se não=2");
			l=in.nextInt();
		}while (l==1);
			
		}
		
			
		

		
		
	}

