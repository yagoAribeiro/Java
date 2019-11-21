import java.util.Scanner;
public class Exc1 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		String meses[] =  new String[12];
		for (int i=0; i<12; i++) {
			System.out.println("Insira o "+(i+1)+"º mês do ano:");
			meses[i]=in.next();
			for (int answer=0; answer<12 && i==11; answer++) {
				System.out.print(meses[answer]+" ");
			}
		}
	}

}
