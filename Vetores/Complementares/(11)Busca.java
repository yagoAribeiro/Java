import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vetA[] = new int [10], busca;
		for(int i = 0;i<10;i++) {
			vetA[i] = in.nextInt();
		}
		System.out.println("Coloque o número de busca:");
		busca = in.nextInt();
		int confirm=0;
		for(int i=0;i<10;i++) {
			if(busca==vetA[i]) {
				System.out.println("O número "+busca+" foi localizado na posição: "+i);
				confirm++;
			}
		}
		if(confirm==0) {
			System.out.println("O número "+busca+" Não existe em A");	
		}
	}

}
