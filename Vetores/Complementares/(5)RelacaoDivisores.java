import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] vetA = new int[10];
		for(int i = 0;i < 10;i++) {
			vetA[i] = in.nextInt();
		}
		
		for(int i = 0;i < 10;i++) {
			linhaDiv(vetA[i]);

	}
}
	static void linhaDiv(int valorVet){
		for(int i = 1;i < valorVet;i++) {
			if(valorVet % i == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println(valorVet);
}
}