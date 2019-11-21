import java.util.Scanner;
public class Ex8 {

	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int vetA[] = new int [10], vetB[] = new int [10];
		for(int i=0; i<10; i++) {
			vetA[i] = in.nextInt();
		}
		for(int i=0; i<10; i++) {
			vetB[i] = somatoria(vetA[i]);
			System.out.println("A somatória de "+(i+1)+" é "+vetB[i]);
		}
	}
	public static int somatoria(int numeroVet) {
		int soma = 0;
		for(int i=0; i<=numeroVet; i++) {
			soma +=i;
		}
		return soma;
	}

}