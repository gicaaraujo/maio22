package Formativa;

import java.util.Scanner;

public class Área {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double lados, area;
		
		System.out.println("Informe a medida dos lados: ");
		lados = ler.nextDouble();
		
		area = (lados*lados);
		
		System.out.println("A área do quadrado é: "+ area);
	}

}
