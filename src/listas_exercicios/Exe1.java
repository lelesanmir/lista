package listas_exercicios;

import java.util.Scanner;

public class Exe1 {

	/**
	 * 1) Faça um programa que leia os valores A, B, C e imprima na tela se a soma de A + B é
     * menor que C.
	 * @param A
	 * @param B
	 * @param C
	 * @return
	 */
	public String avalia(int A, int B, int C) {
		
		if ((A + B) < C) {
			return "A soma de A= " + A + " + B " + B + " é menor do que C " + C;
		} else {
			return "A soma de A= " + A + " + B " + B + " é maior ou igual do que C " + C;
		}

	}// Fim do método

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Exe1 objeto = new Exe1();
		int a, b, c;
		System.out.println("Digite o valor de A: ");
		a = input.nextInt();
		System.out.println("Digite o valor de B: ");
		b = input.nextInt();
		System.out.println("Digite o valor de C: ");
		c = input.nextInt();
		
		//System.out.println(objeto.avalia(a, b, c));
		//Executa um ou outro, senão fica repetido.
		
		String resultado = objeto.avalia(a, b, c);
		System.out.println(resultado);
		
		input.close();
	}//Fim método
	
}

