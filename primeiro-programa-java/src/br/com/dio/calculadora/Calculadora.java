package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double a, b;
		System.out.print("Digite o primeiro valor: ");
		a = scan.nextDouble();
		System.out.print("Digite o segundo valor: ");
		b = scan.nextDouble();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("As opera��es matem�ticas dos n�meros " + a + " e " + b);
		System.out.println("A soma � " + soma);
		System.out.println("A subtra��o � " + subtracao);
		System.out.println("A multiplica��o � " + multiplicacao);
		System.out.println("A divis�o � " + divisao);
		
	}
	
	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtracao(double a, double b) {
		return a - b;
	}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}

}
