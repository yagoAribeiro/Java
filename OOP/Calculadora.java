import java.util.Scanner;

public class Calculadora {
	float num1;
	float num2;
	float result;
	boolean divi;
	boolean multi;
	boolean som;
	boolean sub;
	
	protected void Divisao() {
		if (this.divi) {
			this.result = num1/num2;
			System.out.println(this.result);
		}
	}
	protected void Multiplicacao() {
		if (this.multi) {
			this.result = num1*num2;
			System.out.println(this.result);
		}
	}
	protected void Soma() {
		if (this.som) {
			this.result = num1+num2;
			System.out.println(this.result);
		}
	}
	protected void Subtracao() {
		if (this.sub) {
			this.result = num1-num2;
			System.out.println(this.result);
		}
	}
	public void verif(String operador) {
		switch (operador) {
		case "/":
			this.divi = true;
		break;
		case "*":
			this.multi = true;
		break;
		case "+":
			this.som = true;
		break;
		case "-":
			this.sub = true;
		break;
		default:
			System.out.println("Operador inv�lido!");
		break;
		}
	}
	

public static void main (String[]args) {
	
	Scanner in = new Scanner (System.in);
	
	Calculadora calculo = new Calculadora();
	
	System.out.println("Insira o valor 1");
	calculo.num1 = in.nextFloat();
	System.out.println("Insira o valor 2");
	calculo.num2 = in.nextFloat();
	System.out.println("Selecione a opera��o: (/, *, +, -)");
	String operator = in.next();
	calculo.verif(operator);
	if(calculo.divi) {
		calculo.Divisao();
	}
	if(calculo.multi) {
		calculo.Multiplicacao();
	}
	if(calculo.som) {
		calculo.Soma();
	}
	if(calculo.sub) {
		calculo.Subtracao();
	}
	
	
	
	
	
	
}
}
