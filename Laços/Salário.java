import java.util.Scanner;
public class Ex1 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double s, sm, sma=0, sme=0, som;
		int i=1, mma=0,mme=0;
		System.out.println("m�s "+i+" Insira o sal�rio:");
		s=in.nextDouble();
		sma=s;
		sme=s;
		mma=1;
		mme=1;
		som=s;
		sm=s/2;
		i=2;
		do {
		System.out.println("m�s "+i+" Insira o sal�rio:");
		s=in.nextDouble();
		som=som+s;
		sm= sm+(s/2);
		if (s>sma) {
			sma=s;
			mma=i;
		}if (s<sme) {
			sme=s;
			mme=i;
		}
		System.out.println("Sal�rio total = "+som);
		System.out.println("Sal�rio m�dio = "+sm);
		System.out.println("M�s de maior sal�rio: "+mma);
		System.out.println("M�s de menor sal�rio: "+mme);
		i++;
		}while (i<=12);
	}
}
