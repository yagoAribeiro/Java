import javax.swing.JOptionPane;
//JOptionPane � uma caixa de di�logo simples utilizada para uma entrada e sa�da de valores mais din�mica!

import java.text.DecimalFormat;
//DecimalFormat � uma classe da IDE, utilizada para formatar valor do tipo double e delimitar as casas decimais!

public class Main {

	public static void main(String[] args) {
		
		
		LeituraImc calculoImc = new LeituraImc();
		DecimalFormat formatacao = new DecimalFormat("#.00");
		
		double numAltura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
		double numPeso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));
		
		calculoImc.setAltura(numAltura);
		calculoImc.setPeso(numPeso);
		
		calculoImc.setResultado(calculoImc.Calcular(calculoImc.getPeso(), calculoImc.getAltura()));
		String resultado = String.valueOf(formatacao.format(calculoImc.getResultado()));
		
		JOptionPane.showMessageDialog(null,"O seu IMC �: "+resultado);
	}
	
}
