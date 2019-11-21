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
			System.out.println("júnior");
			break;
		} 
		case 8:{
			System.out.println("júnior max");
			break;
		} 
		case 9:
		{
			System.out.println("júnior máster");
			break;
		} 
		case 10:
		{
			System.out.println("máster");
			break;
		} 
		default:
		{
			System.out.println("Idade inválida");
			break;
		}
		}
		System.out.println("Deseja continuar? 1-sim, 2-não");
		c = in.nextInt();
		}while (c==1);
	}
}
