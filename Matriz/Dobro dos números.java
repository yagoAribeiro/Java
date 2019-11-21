import java.util.Scanner;
public class ex2 {
	public static void main (String [] args) {
		int v[][] = new int [4][4];
		int i,j,c=2;
		for(i=0;i<=3;i++) {
			for(j=0;j<=3;j++) {
				v[i][j] = c;
				c = c*2;
			}
		}
		for(i=0;i<=3;i++) {
			for(j=0;j<=3;j++) {
				System.out.print(" ["+v[i][j]+"] ");				
			}
			System.out.print("\n");
		}
	}

}
	
