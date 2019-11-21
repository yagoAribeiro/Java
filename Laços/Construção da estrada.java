import java.util.Scanner;
public class ExD {

	public static void main (String[]args) {
		
		double tamanho, meses=1,tpormes=3.75,resultado;
		Scanner in= new Scanner (System.in);
		System.out.println("Insira o comprimento da estrada que deseja construir:");
		  tamanho = Double.parseDouble(in.nextLine());
		  if (tamanho<=tpormes) {
			  System.out.println("Sua estrada será construida em: "+meses+" meses");		 
		  }else {
			  resultado=tpormes;
		while (resultado<tamanho) {
			meses++;
			resultado= tpormes*meses;
		}
		System.out.println("Sua estrada será construida em: "+meses+" meses");
		}
	}
}