package app;

import entidade.Aritimetica;

public class TestAritimetica {

	public static void main(String[] args) {
		Aritimetica aritimetica = new Aritimetica();
		
		System.out.println("A soma dos valores �: " + aritimetica.soma(1,2));
		
		System.out.println("A soma dos numeros das chamadas de voc�s �:  " + aritimetica.soma(1,13,12,6,4,10,9,11,8) );
		
		System.out.println("A Subtra��o dos numeros das chamadas de voc�s �:  " + aritimetica.subtracao(1,13,12,6,4,10,9,11,8) );
		
		System.out.println("A Multiplica��o dos numeros das chamadas de voc�s �:  " + aritimetica.multiplicacao(1,13,12,6,4,10,9,11,8) );
		
		System.out.println("A Divis�o dos numeros das chamadas de voc�s �:  " + aritimetica.divisao(1,13,12,6,4,10,9,11,8) );
	}
}
