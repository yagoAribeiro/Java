import java.util.Scanner;
public class Ex3 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int A[] = new int [10];
		
		System.out.println("Digite 10 n�meros: ");
		for(int i=0;i<10;i++) {
			A[i] = in.nextInt(); 
	}	
		for(int r=0; r<10; r++) {
			//v�riaveis de compara��o e segundo contador
			int comp=A[r], result;
			
			//segundo la�o
			for(int cont2=0;comp>0;comp--) {
				result=A[r]%comp;
				//incremento do contador 2
				if (result==0) {
					cont2++;
				}
				
				//condi��es
				if(comp==1) {
					
					
				if(cont2<=2) {
				System.out.println(A[r]+" � um n�mero primo");	
				cont2=0;
				}else if (cont2>2){
				System.out.println(A[r]+" N�o � um n�mero primo");	
				cont2=0;
				}
			}
			}
		}
		
	}
}