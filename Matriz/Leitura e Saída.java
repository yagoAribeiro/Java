import java.util.Scanner;
public class ex1 {
	public static void main (String [] args) {
	Scanner in=new Scanner (System.in);
	int  v [][]= new int [3] [3];
	int i, j;
	
	for (i=0; i<=2; i++) {
		for (j=0; j<=2; j++) {
			System.out.print("\nEntra valor ["+(i+1)+"] ["+(j+1)+"] :: ");
			v [i] [j]= in.nextInt();
			
		}
	}
	System.out.print("\n:: valores da matriz ::\n\n");
	for (i=0; i<=2; i++) {
		for (j=0; j<=2; j++) {
			System.out.print(" ["+v[i] [j]+"]");
			if (j==2);
			System.out.print("\n");
	  }
	}
  }
}
