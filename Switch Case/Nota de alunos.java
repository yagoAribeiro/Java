import java.util.Scanner;
public class Ex3 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double  MB=0, B=0, R=0, I=0;
		int a,c;
		String n;
		System.out.println("Insira a quantidade de alunos");
		a = in.nextInt();
		for (c=1;c<=a;c++) {
		System.out.println("Insira a nota do "+c+"º aluno (Letras maísculas)");	
		n = in.next();
		switch (n) {
		case "MB":{
			MB++;
			break;
		}
		case "B":{
			B++;
			break;
		}
		case"R":{
			R++;
			break;
		}
		case"I":{
			I++;
			break;
		}
		default:{
			System.out.println("Nota inválida");
		}
			}
		}
		MB=MB*100/a;
		B=B*100/a;
		R=R*100/a;
		I=I*100/a;
		System.out.println("A porcentagem de notas médias da sala são:");
		System.out.println("MB = "+MB+"%");
		System.out.println("B = "+B+"%");
		System.out.println("R = "+R+"%");
		System.out.println("I ="+I+"%");
		
	}
}
