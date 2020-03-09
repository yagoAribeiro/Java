import java.util.Scanner;

public class LeituraImc {
	Scanner in = new Scanner(System.in);
	CalcImc Imc = new CalcImc();
	double peso;
	double altura;

	public void Leitura() {
		System.out.println("Digite seu peso: ");
		peso = in.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = in.nextDouble();
		System.out.printf("O seu IMC é de: "+"%n %.2f", Imc.Calculo(this.peso, this.altura));
	}
}
