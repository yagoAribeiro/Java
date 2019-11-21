import java.util.Random;
public class Ex13 {

	public static void main(String[] args) {
		Random geradorAleat = new Random();
		int vetA[] = new int[10], vetB[] = new int [10];
		for(int i=0; i<10; i++) {
			vetA[i]= (geradorAleat.nextInt(51));
		}
		for(int i =0; i<10;i++) {
			if(confirm(vetA[i])==true) {
				vetB[i]=1;
			}else {
				vetB[i]=0;
			}
			System.out.print(vetA[i]+" ");
		}
		System.out.print("\n");
		for(int i =0; i<10;i++) {
			System.out.print(vetB[i]+" ");	
		}
		
	}
	public static boolean confirm(int val) {
		if(val%2==0) {
			//par
			return true;
		}else {
			return false;
		}
		
		
	}
}
