public class Calculadora {
	private double num1;
	private double num2;
	private String operador;
	private double result;
	
	
	
	
	public double getNum1() {
		return this.num1;
	}
	public double getNum2() {
		return this.num2;
	}
	public String getOperador() {
		return this.operador;
	}
	public double getResultado() {
		return this.result;
	}
	
	
	public void setNum1(double numero) {
		this.num1 = numero;
	}
	public void setNum2(double numero) {
		this.num2 = numero;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public void setResultado(double numero) {
		this.result = numero;
	}
	
	
	
	public void Divisao() {
			this.result = num1/num2;
			System.out.println(this.result);
	}
	
	public void Multiplicacao() {
			this.result = num1*num2;
			System.out.println(this.result);
	}
	public void Soma() {
			this.result = num1+num2;
			System.out.println(this.result);
	}
	public void Subtracao() {
			this.result = num1-num2;
			System.out.println(this.result);
	}
	
	public void verif(String operador) {
		switch(operador){
		case "/" :{
			this.Divisao();
			break;
		}
		case "*": {
			this.Multiplicacao();
			break;
		}
		case "+":{
			this.Soma();
			break;
		}
		case "-":{
			this.Subtracao();
			break;
		}
		default:{
			System.out.println("Operador inválido");
		}
		}
	}
	

}
