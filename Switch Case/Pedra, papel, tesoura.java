import java.util.Scanner;
public class Ex4 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int j1,j2,i;
		String c1,c2;
		for (j1=0,j2=0,i=0;i<=3;i++) {
			
			System.out.println("Jogador 1, escolha entre PEDRA, PAPEL ou TESOURA");
			c1 = in.next();
			System.out.println("Jogador 2, escolha entre PEDRA, PAPEL ou TESOURA");
			c2 = in.next();
			
			switch (c1){
			
			
			case "PEDRA":{
				
				switch (c2) {
				
				case "PAPEL":{
					System.out.println("Jogador 2 venceu");
					j2++;
					break;
				}
				case "TESOURA":{
					System.out.println("Jogador 1 venceu");
					j1++;
					break;
				}
				case "PEDRA":{
					System.out.println("Empate");
					break;
				}
				default:{
					System.out.println("Resposta inválida");
				}
				}
				break;
			}
			
			
			
			case "PAPEL":{
				
				switch (c2) {
				
				case "TESOURA":{
					System.out.println("Jogador 2 venceu");
					j2++;
					break;
				}
				case "PEDRA":{
					System.out.println("Jogador 1 venceu");
					j1++;
					break;
				}
				case "PAPEL":{
					System.out.println("Empate");
					break;
				}
				default:{
					System.out.println("Resposta inválida");
				}
				}
				break;
			}
			
			case "TESOURA":{
				
				switch (c2) {
				
				case "PEDRA":{
					System.out.println("Jogador 2 venceu");
					j2++;
					break;
				}
				case "PAPEL":{
					System.out.println("Jogador 1 venceu");
					j1++;
					break;
				}
				case "TESOURA":{
					System.out.println("Empate");
					break;
				}
				default:{
					System.out.println("Resposta inválida");
				}
				}
				break;
			}
			
			
			
			}
		}
		System.out.println("O jogo acabou!");
		System.out.println("Vitórias do jogador 1: "+j1);
		System.out.println("Vitórias do jogador 2: "+j2);
		
	}
}
