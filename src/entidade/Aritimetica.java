package entidade;

public class Aritimetica {

	/**
	 * 
	 * @param ...valores (varargs) - é como fosse definido um vetor como parametro
	 */
	public double soma(double ...valores) {
		double resultado = 0;
		
		for(double v : valores) {
			resultado += v;
			
		}
		return resultado;
	}
	
	public double subtracao(double ...valores) {
		double resultado = valores[0];
		
		for(int i = 1; i < valores.length; i++) {
			resultado -= valores[1];
		}
		return resultado;
	}
	
	public double multiplicacao(double ...valores) {
		double resultado = 1;
		
		for(double m: valores) {
			resultado *= m;
		}
		return resultado;
	}
	
	public double divisao(double ...valores) {
		double resultado = 1;
		
		for(double d: valores) {
			resultado /= d;
		}
		return resultado;
	}
	
}
