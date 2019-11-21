import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vetA[] = new int[10];
		//Leitura
		for(int i = 0;i < 10;i++) {
			vetA[i] = in.nextInt();
		}
		//Saída com método
		for(int i = 0;i < 10;i++) {
			linhaPar(vetA[i]);
		}

	}
	static void linhaPar(int valorVet){
		for(int i = 0;i < valorVet;i+=2) {
			System.out.print(i + " ");
		}
		System.out.println(valorVet);
	}

}
