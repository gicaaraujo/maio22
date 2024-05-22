package Formativa;

import java.util.Scanner;

public class Operação {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double valor1, valor2, resultado=0, adicao, subtracao, multiplicacao;
		String operacao;
		
		System.out.println("Informe o valor 1: ");
		valor1 = ler.nextDouble();
		
		System.out.println("Informe o valor 2: ");
		valor2 = ler.nextDouble();
		
		System.out.println("Informe a operação desejada adição, subtração ou multiplicação: ");
		operacao = ler.next();

		if (operacao.equals ("adição")) {
			adicao = (valor1 + valor2);
			System.out.println("O resultado da adição é: " + adicao);
			}
		else if (operacao.equals("subtração")) {
			subtracao = (valor1 - valor2);
			System.out.println("O resultado da subtração é: " + subtracao);
		}
		
		else {
			multiplicacao = (valor1 * valor2);
			System.out.println("O resultado da multiplicação é: " + multiplicacao);
		}
	}

}
