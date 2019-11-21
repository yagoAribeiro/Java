import java.util.Scanner;
public class Ex10 {	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vetA []= new int[10], vetB [] = new int[10];
		for(int i = 0;i < 10;i++) {
			vetA[i] = in.nextInt();
		}
		for(int i = 0;i < 10;i++) {
			vetB[i] = in.nextInt();
		}
		
		finalResult(vetA,vetB);
		
		
		
	}
	static boolean verifica(int[] numerodoVetor,int numeroComparacao){
		for(int i = 1;i <= numerodoVetor[0];i++) {
			if(numerodoVetor[i] == numeroComparacao) {
				return false;
			}
		}
		numerodoVetor[++numerodoVetor[0]] = numeroComparacao;
		return true;
	}
	static void finalResult (int []vetA,int[] vetB){		
		int vetores[] = new int[11];
		vetores[0] = 0;
		for(int i = 0;i < 10;i++) {
			boolean confirm = true;
			for(int j = 0;j < 10;j++) {
				if(vetA[i] == vetB[j]) {
					confirm = false;					
				}
				if(confirm && verifica(vetores,vetA[i])) {
					System.out.println(vetA[i]);
				};
			}
		}
}
}