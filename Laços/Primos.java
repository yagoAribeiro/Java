import java.util.Scanner;
public class Primos {
	public static void main (String[]args) {
		Scanner in= new Scanner (System.in);
		int numero,resto,contador=1,resto2;
		numero= in.nextInt();
		resto=numero%contador;
		while (contador<=numero) {
			contador++;
				}
		if (resto==0) {
			resto2=numero%numero;
		}else {
			System.out.println("N�o � um n�mero primo!");
			}
		resto2=numero%numero;
			if (resto2==0){
				System.out.println("� um n�mero primo!");
			}else {
				System.out.println("N�o � um n�mero primo!");
				}

			}
		}

