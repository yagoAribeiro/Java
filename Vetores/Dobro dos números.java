import java.util.Scanner;
public class Exc4 extends Exc1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int valor[] = new int [8];
		System.out.println("Insira os 7 valores:");
		for (int i=1;i<=7; i++) {
			valor[i]= in.nextInt();
			if(i==7) {
				System.out.println("O dobro destes números são:");
			}
			for (int r=1;i==7 && r<=7;r++) {
				System.out.print(+valor[r]*2+",");
			}
		}

	}

}
