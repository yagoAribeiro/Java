import java.util.Scanner;
public class Horoscopo {
	public static void main (String[]Args) {
		 Scanner in = new Scanner (System.in);
		 int d,m;
		 System.out.println("Insira o dia");
		 d=in.nextInt();
		 System.out.println("Insira o mês");
		 m=in.nextInt();
		 if (m==1) {
			 if (d<=20 && d>0){
				 System.out.println("Capricórnio");
			 }
				 if(d>20 && d<=31){
					 System.out.println("Aquário");
				 } 
				 
		 }
		 
		 if (m==2) {
			 if (d<=19 && d>0) {
				 System.out.println("Aquário");
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
					 System.out.println("Áries");
				 } 
		 }
		 if (m==4) {
			 if (d<=20 && d>0){
				 System.out.println("Áries");
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
					 System.out.println("Gêmeos");
				 } 
		 }
		 if (m==6) {
			 if (d<=21 && d>0){
				 System.out.println("Gêmeos");
			 }
				 if(d>20 && d<=30){
					 System.out.println("Câncer");
				 } 
		 }
		 if (m==7) {
			 if (d<=21 && d>0){
				 System.out.println("Câncer");
			 }
				 if(d>21 && d<=31){
					 System.out.println("Leão");
				 } 
		 }
		 if (m==8) {
			 if (d<=22 && d>0){
				 System.out.println("Leão");
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
					 System.out.println("Escorpião");
				 } 
		 }
		 if (m==11) {
			 if (d<=21 && d>0){
				 System.out.println("Escorpião");
			 }
				 if(d>21 && d<=30){
					 System.out.println("Sagitário");
				 } 
		 }
		 if (m==12) {
			 if (d<=21 && d>0){
				 System.out.println("Sagitário");
			 }
				 if(d>21 && d<=31){
					 System.out.println("Capricórnio");
				 } 
		 }else if(d>31 || d<=0) {
			 System.out.println("Dia inválido");
		 }else if(m>12 || m<=0) {
			 System.out.println("Mês inválido");
		 }
	}
}
