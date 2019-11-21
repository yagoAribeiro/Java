import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int A[] = new int [11];
		
		
		//Laço 1
		System.out.println("Digite 11 números");
		for (int i=0; i<11; i++) {
			A[i] = in.nextInt();
		}
		for (int r=0; r<11; r++) {
			System.out.println("A["+r+"] = "+"2 elevado ao elemento de valor "+A[r]+" , resulta em: "+Math.pow(2,A[r]));
		}
	}

}
