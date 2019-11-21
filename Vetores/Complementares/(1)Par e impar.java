import java.util.Scanner;
public class Ex1 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int A[] = new int [20];
		int B[] = new int [20];
		System.out.println("Digite 20 números: ");
		for(int i=0;i<20;i++) {
			A[i] = in.nextInt(); 
			B[i] = A[i];
	}
		System.out.println("Números pares/ímpares:");
		
		for (int r=0; r<20; r++) {
			if (B[r]%2==0) {
			System.out.print(B[r]+",");
			}
		}
		for (int im=0;im<20;im++) {
			if (B[im]%2!=0) {
				System.out.print(B[im]+",");
			}
		}
	
}
}
