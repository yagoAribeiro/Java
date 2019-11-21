package metodosEx1;
import java.util.Scanner;
public class mainWithExercises {

	public static void main(String[] args) {
		Boolean confirm = false;
		String txt;
		do {
		Scanner in = new Scanner (System.in);
		int numero;
		String start;
		System.out.println("Selecione um dos métodos abaixo");
		System.out.printf("1 - para fatorial \n"+"2 - para tabuada \n"+"3 - para aposentadoria \n"+"4 - para potência");
		start = in.next();

		//Chamadas dos métodos
		switch(start) {
		//Fatorial
		case "1":
		{
	    System.out.println("(Fatorial) Digite um número:");
		numero = in.nextInt();
		System.out.println(fatorial(numero));
		break;
		}
		case "2":
		//Tabuada
		{
		System.out.println("(Tabuada) Digite um número:");
		numero = in.nextInt();
		for (int i=1; i<=10; i++) {
		System.out.printf(tabuada(numero, i));
		}
		break;
		}
		case "3":
		//Aposentadoria
		{
			String sexo = "";
			System.out.println("(Aposentadoria) Digite seu sexo (Homem ou Mulher):");
			sexo = in.next();
			System.out.println("(Aposentadoria) Digite sua idade:");
			numero = in.nextInt();
			System.out.println(aposentadoria(sexo, numero));
		break;
		}
		case "4":
			//Potenciação (NÃO FUNCIONA COM NÚMEROS NEGATIVOS!)
		{
			System.out.println("(Potência) Digite a base:");
			numero = in.nextInt();
			System.out.println("(Potência) Digite o expoente:");
		    int	numero2 = in.nextInt();
		    System.out.println(calc(numero,numero2));
		    break;
		}
		default:
			System.out.println("Índice inválido");
			break;
		}
		System.out.println("Deseja continuar? (sim) - se desejar ; Qualquer coisa para (nao)");
		txt = in.next();
		}while (confirm(txt) == true);
		if(confirm(txt) == false) {
			System.out.println("Programa encerrado!");
		}
	}
	
	//Criação dos métodos
	public static String fatorial (int valorF) {
		int v1, v2, r;
		for(v2 = 1, v1 = 1; v1<=valorF; v1++) {
			v2 = v1*v2;
		}
		r = v2;
		return ("O fatorial deste número é: "+r);
	}
	public static String tabuada (int valorT, int i) {
		String fim = "";
			int r = valorT*i;
			fim = (valorT+" x "+i+" = "+r+"\n");
		return fim;
	}
	public static String aposentadoria(String genero, int idade) {
		int r = 0;
		String respost = null;
		switch (genero) {
		case "Homem":
			r = 60 - idade;
			if (r>0) {
				respost = ("Restam "+r+" ano(s) para você se aposentar");
			}else {
				respost = ("Você ja pode se aposentar");
			}
		break;
		case "Mulher":
			r = 55 - idade;
			if (r>0) {
				respost = ("Restam "+r+" ano(s) para você se aposentar");
			}else {
				respost = ("Você ja pode se aposentar");
			}
			break;
			default:
				respost = "Gênero não identificado";
	}
		return(respost);
		
	}
	public static String calc(int x, int y) {
		int r = x;
		for(int i=1, clon = x;i<y;i++) {
			r = r*clon;
		}
		return ("O resultado é: "+r);
	}
	public static boolean confirm(String confirmacao) {
		Boolean finaliz = false;
		switch (confirmacao) {
			case "sim":
			finaliz = true;
			break;
			default:
			finaliz = false;
			break;
		}
		return finaliz;
	}
}
