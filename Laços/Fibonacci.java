import java.util.Scanner;
public class ExF {

	public static void main (String[]args) {
		Scanner in= new Scanner (System.in);
		int numero,contador=0, contador2=1, resultado=0,i=1;
		System.out.println("Digite o número de termos:");
		numero= in.nextInt();
		while (i<=numero) {
			resultado= contador+contador2;
			contador2=contador2+contador;
			contador=contador+resultado;
			i++;
			System.out.println("A série de Fibonacci pelo número de termos é:"+resultado+"+"+contador+"...");
		}
		
		
	}
}
