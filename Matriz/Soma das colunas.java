import java.math.*;
public class ex4 {

	public static void main(String[] args) {
		
		int m[][] = new int [3][4];
		int i, j, som1 = 0, som2 = 0, som3 = 0;
		
		for(i=0; i<=2; i++) {
			for(j=0; j<=2; j++) {
				m[i][j] = (int) (Math.random()*100);
			}
			
		}
		for(i=0; i<=2; i++) {
			for(j=0; j<=2; j++) {
				if(i==0) {
				som1 += m[i][j];
				}
				else if(i==1) {
				som2 += m[i][j];	
				}
				else if(i==2) {
				som3 += m[i][j];	
				}
			}
		}
		for(i=0; i<=2; i++) {
			for(j=0;j<=3;j++) {	
				m[0][3] = som1;
				m[1][3] = som2;
				m[2][3] = som3;
				System.out.print("["+m[i][j]+"]");
			}
			System.out.print("\n");
		}

	}

}
