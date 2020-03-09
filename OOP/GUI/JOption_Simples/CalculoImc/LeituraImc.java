public class LeituraImc {
	private double altura;
	private double peso;
	private double resultadoImc;

	public void setAltura(double valorAltura){
		this.altura = valorAltura;
	}
	public void setPeso(double valorPeso){
		this.peso = valorPeso;
	}
	public void setResultado(double valor){
		this.resultadoImc = valor;
	}
	public double getAltura(){
		return this.altura;
	}
	public double getPeso(){
		return this.peso;
	}
	public double getResultado(){
		return this.resultadoImc;
	}
	public double Calcular(double peso, double altura){
		double resultado = peso/(altura*altura);
		return resultado;

}
	























}




