public class Ex2 {

	public static void main (String[]args) {
		
		int i=0;
		
		for (i=0;i<=500;) {
			if(confirmPar(i)==true) {
			System.out.println(i);
			}
			i++;
		}
	}
	public static Boolean confirmPar(int numero) {
		if(numero%2 == 0) {
			return true;
		}else {
			return false;
		} 
	}
}

