package listas_exercicios;

import java.util.Scanner;

public class Exe4 {
	
	/**
	 * 4) Faça um programa que leia dois valores inteiros A e B se os valores forem iguais deverá se
	 * somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos
	 * deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.
	 * @param a
	 * @param b
	 * @return
	 */
	public int calcular(int a, int b) {
	    int c;
	    if (a == b) {
	        c = a + b;
	    } else {
	        c = a * b;
	    }
	    System.out.println("O resultado é: " + c);
		return c;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Exe4 calc = new Exe4();
		int a, b;
		System.out.println("Digite o valor de A: ");
		a = input.nextInt();
		System.out.println("Digite o valor de B: ");
		b = input.nextInt();
		
		int resultado = calc.calcular(a, b);
		System.out.println(resultado);
		
		input.close();
	}
	

}
