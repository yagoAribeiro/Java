import java.math.*;
public class ex3 {
	//É possível também importar o método Random em Java, utilizado com parâmetros que suportam números negativos!
	public static void main(String[]args) {
		int m [][] = new int [3][3];
		int i,j,maior = 0,menor = 500, l1=0, l2=0, col1=0, col2=0;
		for (i=0; i<=2; i++) {
			for(j=0; j<=2; j++) {
				m [i][j] = (int) (Math.random()*500);
			}
		}
		for (i=0; i<=2; i++) {
			for(j=0; j<=2; j++) {
				System.out.print("["+m[i][j]+"]");
			}
			System.out.print("\n");
		}
		for(i=0; i<=2; i++) {
			for(j=0; j<=2; j++) {
				
				if(m[i][j]>maior) {
					maior = m[i][j];
					l1 = i;
					col1 = j;		
					}if(m[i][j]<menor){
					menor = m[i][j];
					l2 = i;
					col2 = j;
				}
				
			}
			
			
			
		}
		System.out.println("Maior número:"+maior+", Linha: "+(l1+1)+", Coluna: "+(col1+1));
		System.out.println("Menor número:"+menor+", Linha: "+(l2+1)+", Coluna: "+(col2+1));
		
	}
}
