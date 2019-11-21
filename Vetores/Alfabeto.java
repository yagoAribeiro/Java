import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String letras[] = new String[26];
		int r;
		System.out.println("Digite as letras do alfabeto:");
		for (int i=0; i<26;i++) {
			letras[i] = in.next();
				for (r=0; i==25 && i<26; r++){
				System.out.print(letras[r]+", ");
				}
			}
		}
}
