import java.util.Scanner;
public class Ex6 {
	public static void main (String[]args) {
		Scanner in=new Scanner(System.in);
		int aa,an,id,l,id2;
		do {
		System.out.println("Escreva o ano atual:");
		aa=in.nextInt();
		System.out.println("Escreva o ano de nascimento:");
		an=in.nextInt();
		id=aa-an;
		System.out.println("A idade �: "+id);
		System.out.println("Escreva o ano atual:");
		aa=in.nextInt();
		System.out.println("Escreva o ano de nascimento:");
		an=in.nextInt();
		id2=aa-an;
		System.out.println("A idade �: "+id2);
		if (id2>id) {
			System.out.println("� mais velho que o �ltimo!");
			}else {
				if(id2==id) {
					System.out.println("Mesma idade do �ltimo!");
				}else {
					System.out.println("� mais novo do que o �ltimo!");
				}
			}System.out.println("Deseja continuar? se sim=1, se n�o=2");
			l=in.nextInt();
		}while (l==1);
		
	}
}