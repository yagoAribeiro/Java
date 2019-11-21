import java.util.Scanner;
import java.util.*;
public class Ex15 {	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vetA[] = new int[10], vetB[] = new int[10], vetC[] = new int[10];
		for(int i = 0;i < 10;i++) {
			vetA[i] = in.nextInt();
		}
		//Método de clonagem
		vetB = vetA.clone();
		crescentGroup(vetB);
		System.out.println("Agrupamento crescente:");
		for(int i = 0;i < 10;i++) {
			System.out.println(vetB[i]);
		}
		System.out.println();
		
		vetC = vetA.clone();
		System.out.println("Agrupamento decrescente:");
		decGroup(vetC);
		for(int i = 0;i < 10;i++) {
			System.out.println(vetC[i]);
		}
		
	}
	static void crescentGroup(int vetorB[]){
		for(int i = 0;i < 10;i++) {
			for(int j = 1+i;j < 10;j++) {
				if(vetorB[i] > vetorB[j]) {
					int invert = vetorB[i];
					vetorB[i] = vetorB[j];
					vetorB[j] = invert;
				}
			}
		}
	}
	static void decGroup(int vetorC[]){
		for(int i = 0;i < 10;i++) {
			for(int j = 1+i;j < 10;j++) {
				if(vetorC[i] < vetorC[j]) {
					int invert = vetorC[i];
					vetorC[i] = vetorC[j];
					vetorC[j] = invert;
				}
			}
		}
	}
}