import java.util.Scanner;
public class Horoscopo {
	public static void main (String[]Args) {
		 Scanner in = new Scanner (System.in);
		 int d,m;
		 System.out.println("Insira o dia");
		 d=in.nextInt();
		 System.out.println("Insira o m�s");
		 m=in.nextInt();
		 if (m==1) {
			 if (d<=20 && d>0){
				 System.out.println("Capric�rnio");
			 }
				 if(d>20 && d<=31){
					 System.out.println("Aqu�rio");
				 } 
				 
		 }
		 
		 if (m==2) {
			 if (d<=19 && d>0) {
				 System.out.println("Aqu�rio");
			 }
			 if(d>19 && d<=28){
				 System.out.println("Peixes");
			 }  
		 }
		 
		 if (m==3) {
			 if (d<=20 && d>0){
				 System.out.println("Peixes");
			 }
				 if(d>20 && d<=31){
					 System.out.println("�ries");
				 } 
		 }
		 if (m==4) {
			 if (d<=20 && d>0){
				 System.out.println("�ries");
			 }
				 if(d>20 && d<=30){
					 System.out.println("Touro");
				 } 
		 }
		 if (m==5) {
			 if (d<=20 && d>0){
				 System.out.println("Touro");
			 }
				 if(d>20 && d<=31){
					 System.out.println("G�meos");
				 } 
		 }
		 if (m==6) {
			 if (d<=21 && d>0){
				 System.out.println("G�meos");
			 }
				 if(d>20 && d<=30){
					 System.out.println("C�ncer");
				 } 
		 }
		 if (m==7) {
			 if (d<=21 && d>0){
				 System.out.println("C�ncer");
			 }
				 if(d>21 && d<=31){
					 System.out.println("Le�o");
				 } 
		 }
		 if (m==8) {
			 if (d<=22 && d>0){
				 System.out.println("Le�o");
			 }
				 if(d>22 && d<=31){
					 System.out.println("Virgem");
				 } 
		 }
		 if (m==9) {
			 if (d<=22 && d>0){
				 System.out.println("Virgem");
			 }
				 if(d>22 && d<=30){
					 System.out.println("Libra");
				 } 
		 }
		 if (m==10) {
			 if (d<=22 && d>0){
				 System.out.println("Libra");
			 }
				 if(d>22 && d<=31){
					 System.out.println("Escorpi�o");
				 } 
		 }
		 if (m==11) {
			 if (d<=21 && d>0){
				 System.out.println("Escorpi�o");
			 }
				 if(d>21 && d<=30){
					 System.out.println("Sagit�rio");
				 } 
		 }
		 if (m==12) {
			 if (d<=21 && d>0){
				 System.out.println("Sagit�rio");
			 }
				 if(d>21 && d<=31){
					 System.out.println("Capric�rnio");
				 } 
		 }else if(d>31 || d<=0) {
			 System.out.println("Dia inv�lido");
		 }else if(m>12 || m<=0) {
			 System.out.println("M�s inv�lido");
		 }
	}
}
