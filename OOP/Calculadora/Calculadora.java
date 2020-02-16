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
			System.out.println("Operador inválido!");
		break;
		}
	}
	

}
