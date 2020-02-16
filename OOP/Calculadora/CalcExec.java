import java.util.Scanner;
public class CalcExec {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		Calculadora calculo = new Calculadora();
		
		System.out.println("Insira o valor 1");
		calculo.num1 = in.nextFloat();
		System.out.println("Insira o valor 2");
		calculo.num2 = in.nextFloat();
		System.out.println("Selecione a operação: (/, *, +, -)");
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
