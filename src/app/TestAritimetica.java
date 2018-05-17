package app;

import entidade.Aritimetica;

public class TestAritimetica {

	public static void main(String[] args) {
		Aritimetica aritimetica = new Aritimetica();
		
		System.out.println("A soma dos valores é: " + aritimetica.soma(1,2));
		
		System.out.println("A soma dos numeros das chamadas de vocês é:  " + aritimetica.soma(1,13,12,6,4,10,9,11,8) );
		
		System.out.println("A Subtração dos numeros das chamadas de vocês é:  " + aritimetica.subtracao(1,13,12,6,4,10,9,11,8) );
		
		System.out.println("A Multiplicação dos numeros das chamadas de vocês é:  " + aritimetica.multiplicacao(1,13,12,6,4,10,9,11,8) );
		
		System.out.println("A Divisão dos numeros das chamadas de vocês é:  " + aritimetica.divisao(1,13,12,6,4,10,9,11,8) );
	}
}
