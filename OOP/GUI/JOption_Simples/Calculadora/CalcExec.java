import javax.swing.JOptionPane;
import java.text.DecimalFormat;



public class CalcExec {
	public static void main(String[] args) {
		DecimalFormat formatarNumero = new DecimalFormat("#.00");
		Calculadora calculo = new Calculadora();
		
		calculo.setNum1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor")));
		calculo.setNum2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor")));
		calculo.setOperador(JOptionPane.showInputDialog("Digite a opera��o"));
		calculo.verif(calculo.getOperador());
		
		JOptionPane.showMessageDialog(null, "O resultado �: "+formatarNumero.format(calculo.getResultado()));
		
	}
}
