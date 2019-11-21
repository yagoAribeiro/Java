import java.util.Scanner;
public class Ex2 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int A[] = new int [5];
		System.out.println("Digite 5 números");
		for (int i=0; i<5; i++) {
			A[i] = in.nextInt();	
		}
		for (int r=0; r<5;) {
			System.out.println("Tabuada do valor:"+A[r]);
			for (int m=1; m<11; m++) {
				System.out.println(A[r]+"x"+m+" = "+A[r]*m);
			}
			r++;
		}
		
	
	}
}
