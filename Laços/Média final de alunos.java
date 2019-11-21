import java.util.Scanner;
public class Ex2 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
			int a,t;
			double n1, n2, m;
			for (a=1, t=1;t<6; a++) {
				if(a>10) {
					t++;
					a=1;
				}
				System.out.println("Turma: "+t+" Aluno: "+a);
				System.out.println("Insira as duas notas:");
				n1= in.nextDouble();
				n2= in.nextDouble();
				m= (n1+n2)/2;
				System.out.println("Média do aluno: "+m);
				if (m<7) {
					System.out.println("Reprovado");
				}else {
					System.out.println("Aprovado");
				}
			}
	}
}
