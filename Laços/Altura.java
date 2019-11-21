
public class ExA {

public static void main (String[]args) {
		
		double j,p;
		j= 1.34;
		p= 1.45;
		int a;
		a=0;
		while (j<p) {
			a++;
			p= p+0.20;
			j= j+0.25;
		}
		System.out.println("Joao levará:" +a);
		System.out.println("ano(s) para ser maior do que pedro");
	}
}

