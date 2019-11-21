import java.util.Scanner;
public class Ex12 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vetA[] = new int[10];		
		for(int i=0;i<10;i++) {
			vetA[i] = in.nextInt();
		}
				
		if(validar(vetA)==true) {
			System.out.println("O vetor A é um palíndromo");
		}
		else if(validar(vetA)==false) {
			System.out.println("O vetor A não é um palíndromo");
		}
			
	}
	static boolean validar(int[] valorA)
	{
		for(int i=0,j=9;i<10;i++,j--) {
			if(valorA[i] != valorA[j]) {
				return false;
			}
		}
		return true;
	}
}
