package listas_exercicios;

import java.util.Scanner;

public class Exe7 {
	public int calcular(int numero) {
		int resultado = 0;
		if (numero % 2 == 0) {
			resultado = numero + 5;
			System.out.println("Número par somado mais 5");
		} else {
			resultado = numero + 8;
			System.out.println("Número ímpar somado mais 8");
		}
		return resultado;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		Exe7 soma = new Exe7();
		int resultado = soma.calcular(numero);

		System.out.println("O resultado da operação é: " + resultado);
		scanner.close();
	}
}
