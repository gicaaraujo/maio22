package Formativa;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double celsius, fahrenheit;

		System.out.println("Informe a temperatura em fahrenheit: ");
		fahrenheit = ler.nextDouble();

		celsius = ((fahrenheit - 32)* 5)/9;

		System.out.println("A temperatura convertida em celsius é: " + celsius);
	}

}
