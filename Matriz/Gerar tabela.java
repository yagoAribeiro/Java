import java.util.Random;
import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int pos = 0, x = 0, y = 0, i = 0, j = 0;
		Random aleat = new Random(); 
		System.out.print("Insira a quantidade de linhas \n");
		x = in.nextInt();
		System.out.println("Insira a quantidade de colunas");
		y = in.nextInt();
		
		int table[][] = new int [x][y]; 
		
		for(i = 0; i<x; i++) {
			for(j = 0; j<y; j++) {
				table[i][j] = aleat.nextInt()%15;	
				System.out.print("["+table[i][j]+"]");
				}
			System.out.print("\n");
		}
	
	}

}