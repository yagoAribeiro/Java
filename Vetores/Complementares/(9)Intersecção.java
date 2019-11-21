import java.util.Random;
public class Ex9 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int vetA[] = new int [10], vetB[] = new int[10];
		for(int i=0; i<10; i++) {
			vetA[i] = (gerador.nextInt(201));
			vetB[i] = (gerador.nextInt(201));
		}
		int vetC[] = new int [20];
		for(int i=0; i<10; i++) {
			vetC[i] = vetA[i];
		}
		for(int i=0; i<10; i++) {
			vetC[i+10] = vetB[i];
		}
		System.out.println("Vetor A");
		for(int i=0; i<10; i++) {
			System.out.print(vetA[i]+" ");
		}
		System.out.println("\n Vetor B");
		for(int i=0; i<10; i++) {
			System.out.print(vetB[i]+" ");
		}
		System.out.println("\n Vetor C");
		for(int i=0; i<20; i++) {
			if(i==10) {
			System.out.print("/");
			}
			System.out.print(vetC[i]+" ");
		}
	}

}
