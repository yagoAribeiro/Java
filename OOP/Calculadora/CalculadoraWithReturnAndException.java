import java.util.Scanner;
public class CalculadoraWithReturnAndException extends Calculadora{

	static int val1;
	static int val2;
	float result;
	boolean exception = false;
	String operador;
	
	protected static float Soma(float valor1, float valor2) {
		return valor1+valor2;
	}
	protected static float Sub(float valor1, float valor2) {
		return valor1-valor2;
	}
	protected static float Multi(float valor1, float valor2) {
		return valor1*valor2;
	}
	protected static float Divi(int valor1, int valor2) {
		try {
		return valor1/valor2;
		}
		catch(ArithmeticException error) {
			return 0;
		}
	}
	protected void Exception() {
		if(this.exception) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
	}

	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		CalculadoraWithReturnAndException calculo = new CalculadoraWithReturnAndException();
		System.out.println("Insira o primeiro número");
		calculo.val1 = in.nextInt();
		System.out.println("Insira o segundo número");
		calculo.val2 = in.nextInt();
		System.out.println("Digite o operador (+,-,/,*)");
		calculo.operador = in.next();
		switch(calculo.operador) {
			case "+": { 
				calculo.result = calculo.Soma(val1, val2); 
				break;
				}
			case "-": { 
				calculo.result = calculo.Sub(val1, val2); 
				break;
			}
			case "*": { 
				calculo.result = calculo.Multi(val1, val2); 
				break;
				}
			case "/": {
				calculo.result = calculo.Divi(val1, val2); 
				if(calculo.Divi(val1, val2) == 0) {
					calculo.exception = true;
					System.out.println("Impossível dividir por zero!");
					calculo.Exception();
				}
				break;
				}
			default:{
				System.out.println("Operador inválido");
			}
		}
		System.out.println(calculo.result);
		
}
}