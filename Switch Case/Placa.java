import java.util.Scanner;
public class Placa {
	public static void main (String[]Args) {
	 Scanner ler = new Scanner (System.in);
	 int pl;
	 System.out.println("Digite o n�mero final da placa");
	 pl = ler.nextInt();
	 switch(pl) {
	 	case 1:
	 	{
	 		System.out.println("Segunda-feira");
	 		break;
	 	}
	 	case 2:
	 	{
	 		System.out.println("Segunda-feira");
	 		break;
	 	}
	 	case 3:
	 	{
	 		System.out.println("Ter�a-Feira");
	 		break;
	 	}
	 	case 4:
	 	{
	 		System.out.println("Ter�a-feira");
	 		break;
	 	}
	 	case 5:
	 	{
	 		System.out.println("Quarta-feira");
	 		break;
	 	}
	 	case 6:
	 	{
	 		System.out.println("Quarta-feira");
	 		break;
	 	}
	 	case 7:
	 	{
	 		System.out.println("Quinta-feira");
	 		break;
	 	}
	 	case 8:
	 	{
	 		System.out.println("Quinta-feira");
	 		break;
	 	}
	 	case 9:
	 	{
	 		System.out.println("Sexta-feira");
	 		break;
	 	}
	 	case 0:
		{
	 		System.out.println("Sexta-feira");
	 		break;
	 	}
		default :
		{
			System.out.println("N�mero Inv�lido");
			break;
		}
	 }
	 
	}

}
