import java.util.Scanner;
public class Futebol {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int c;
		do {
		int id;
		id=in.nextInt();
		switch (id) {
		case 6:
		{
			System.out.println("Dente de leite");
			break;
		} 
		case 7:
		{
			System.out.println("j�nior");
			break;
		} 
		case 8:{
			System.out.println("j�nior max");
			break;
		} 
		case 9:
		{
			System.out.println("j�nior m�ster");
			break;
		} 
		case 10:
		{
			System.out.println("m�ster");
			break;
		} 
		default:
		{
			System.out.println("Idade inv�lida");
			break;
		}
		}
		System.out.println("Deseja continuar? 1-sim, 2-n�o");
		c = in.nextInt();
		}while (c==1);
	}
}
