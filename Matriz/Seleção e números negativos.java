import java.util.Scanner;
import java.util.Random;
public class ex5 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		int spercol = 0, x = 0, y = 0, i = 0, j = 0;
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
		System.out.print("Main diagonal: \n");
		for(i = 0; i<x;) {
			for(spercol = 0; spercol<y; spercol++) {
				System.out.print(table[i][spercol]+", ");
				i++;
			}
			
		}
		System.out.print("\n Negative numbers: \n");
		for(i = 0; i<x; i++) {
			for(j = 0; j<y; j++) {	
				if(table[i][j]<0) {
				System.out.print(table[i][j]+", ");
				}
			}
		}
	}

}
