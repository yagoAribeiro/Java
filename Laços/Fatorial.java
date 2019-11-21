import java.util.Scanner;
public class ExB {

	public static void main (String[]args) {
		
		Scanner in= new Scanner (System.in);
		int fatorial,numero;
		System.out.println("Insira um número");
		numero = in.nextInt();
		fatorial=numero;
		while (numero!=1) {
			numero--;
			fatorial=fatorial*numero;
			System.out.println("Os valores fatoriais desse número é:"+fatorial);
		}
	}
}