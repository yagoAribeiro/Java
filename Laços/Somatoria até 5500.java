package somatorianumeros;
public class somatoria {
	public static void main (String[]args) {
		int i=0,soma=i;
		while (soma<=5500) {
			i++;
			soma= i+soma;
			System.out.println(""+soma);
		}
	}
}