import java.util.Scanner;
public class Ex14 {	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vetA[] = new int[10], vetB[] = new int[10], vetC[] = new int[10];
		//Leituras
				for(int i = 0;i < 10;i++) {
					vetA[i] = in.nextInt();
				}		
			
				for(int i = 0;i < 10;i++) {
					vetB[i] = in.nextInt();
				}	
		
		for(int i = 0;i < 10;i++) {
			if(vetA[i] > vetB[i]) {
				vetC[i] = 1;
			}
			else if(vetA[i] == vetB[i]) {
				vetC[i] = 0;
			}
			else {
				vetC[i] = -1;
			}
		}	
		
		for(int i = 0;i < 10;i++) {
			System.out.print(vetC[i]);
		}
	}
}