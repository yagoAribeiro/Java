package tabuadanumero;
import java.util.Scanner;
public class tabuada {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int v, n, r;
		System.out.println("Introduza o valor:");
		n = in.nextInt();
		v=0;
		while (v<10) {
			v++;
			r= n*v;
			System.out.println("Esse número vezes "+v);
			System.out.println	("é:"+r);
			
		}
	}
}
