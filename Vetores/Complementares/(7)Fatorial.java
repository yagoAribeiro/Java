import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int A[] = new int [15];
		int B[] = new int [15];
		
		System.out.println("Digite 15 números:");
		
		//primeiro laço
		for (int i=0; i<15; i++) {
			A[i] = in.nextInt();
		}
		//fatorial
		for (int c=0; c<15; c++) {
			for (int fatorial = A[c], copy = A[c]-1; copy!=0; copy--) {
				fatorial = fatorial*copy;
				B[c] = fatorial;
			}
		}
		System.out.println("O fatorial de cada número respectivamente são:");
		//Saída com apresentação em fatorial
		for (int r=0; r<15; r++) {
			System.out.print(B[r]+", ");
		}

	}

}
