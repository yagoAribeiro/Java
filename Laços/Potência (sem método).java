import java.util.Scanner;
public class ExC {

	public static void main (String[]args) {
		
		Scanner in= new Scanner (System.in);
		int numero,expoente,contador=1,numeroalternativo;
		System.out.println("Insira o valor da base");
		numero= in.nextInt();
		System.out.println("Insira o valor do expoente");
		expoente= in.nextInt();
		numeroalternativo=numero;
		while (contador!=expoente) {
			numero= numero*numeroalternativo;
			contador++;
			}
		System.out.println("O resultado é:"+numero);
		}
	}
