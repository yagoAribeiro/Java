import java.math.*;
import java.util.Scanner;
public class bingo {

	//jogo de bingo!
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int bingo[][] = new int [4][4];
		int cartela[] = new int [16];
		int i, j, c, round = 0, cont = 0, rest = 16, errors = 0, ca = 0, confirm = 1;
		
		do {
		for(i=0; i<=3; i++) {
			for(j=0;j<=3;j++) {
				bingo[i][j] = (int) (Math.random()*75);
				//Ver a tabela!
				//System.out.print(" ["+bingo[i][j]+"] ");
			}
			//System.out.print("\n");
		}
		
		System.out.println("A tabela foi gerada, descubra as 16 dezenas!");
		for(cont=0; cont<=15;) {
			
			
		for(c=0; c<=15; c++) {
				cartela[c] = in.nextInt();
	}
		
	for(ca=0; ca<=15;) {	
		for(i=0;i<=3; i++) {
			for(j=0; j<=3; j++) {
		if (cartela[ca] == bingo[i][j]) {
			cont++;
			ca++;
			rest--;
		}
		else {
			errors++;
			ca++;
		}
			}
		}
		round++;
	}
		System.out.println("Round "+round+" concluído");
		System.out.println("Totais de erros: "+errors);	
		System.out.println("Restam: "+rest+" dezena(s)");
		
		}
		System.out.print("BINGO! \n"+"Rodadas toais:"+round+" \n");
		System.out.print("Digite '1' se deseja continuar! Digite qualquer número para não! \n");
		confirm = in.nextInt();
		}while(confirm == 1);
		
		if(confirm!=1) {
		System.out.println("Fim de programa!");
		}
		}
	}
	


