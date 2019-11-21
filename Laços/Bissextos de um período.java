import java.util.Scanner;
public class Ex4 {
	public static void main (String[]args) {
		Scanner in=new Scanner(System.in);
		int ai,af,i,bix;
		System.out.println("Escreva o ano inicial:");
		ai= in.nextInt();
		System.out.println("Escreva o ano final:");
		af= in.nextInt();
		for (i=0;ai<=af;i++) {
		bix= ai%4;
		if (bix==0) {
			ai=ai+4;
			}else {
				ai=ai+1;
				//Somente haverá bissexto se bix=0!
			}
		System.out.println("Os anos bissextos deste período são: "+ai);
		}
		System.out.println("A quantidade de anos bissextos neste periodo foram: "+i);
	}
}