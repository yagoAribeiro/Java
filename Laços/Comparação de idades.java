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
		System.out.println("A idade é: "+id);
		System.out.println("Escreva o ano atual:");
		aa=in.nextInt();
		System.out.println("Escreva o ano de nascimento:");
		an=in.nextInt();
		id2=aa-an;
		System.out.println("A idade é: "+id2);
		if (id2>id) {
			System.out.println("É mais velho que o último!");
			}else {
				if(id2==id) {
					System.out.println("Mesma idade do último!");
				}else {
					System.out.println("É mais novo do que o último!");
				}
			}System.out.println("Deseja continuar? se sim=1, se não=2");
			l=in.nextInt();
		}while (l==1);
		
	}
}