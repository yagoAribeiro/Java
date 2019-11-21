import java.util.Scanner;

public class Exc2 extends Exc1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String dias[] = new String[7];
		int r;
		
		for (int i=0; i<7;i++) {
			System.out.println("Digite os dias da semana:");
			dias[i] = in.next();
				for (r=0; i==6 && r<7; r++){
				System.out.print(dias[r]+", ");
				}
			}
		}
	}


