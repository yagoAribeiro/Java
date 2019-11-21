import java.util.Scanner;
public class Ex3 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int A[] = new int [10];
		
		System.out.println("Digite 10 números: ");
		for(int i=0;i<10;i++) {
			A[i] = in.nextInt(); 
	}	
		for(int r=0; r<10; r++) {
			//váriaveis de comparação e segundo contador
			int comp=A[r], result;
			
			//segundo laço
			for(int cont2=0;comp>0;comp--) {
				result=A[r]%comp;
				//incremento do contador 2
				if (result==0) {
					cont2++;
				}
				
				//condições
				if(comp==1) {
					
					
				if(cont2<=2) {
				System.out.println(A[r]+" É um número primo");	
				cont2=0;
				}else if (cont2>2){
				System.out.println(A[r]+" Não é um número primo");	
				cont2=0;
				}
			}
			}
		}
		
	}
}