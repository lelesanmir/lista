package listas_exercicios;

import java.util.Scanner;

public class Exe3 {
	
	/**
	 * 3) Faça um programa para receber um número qualquer e informar na tela se é par ou
	 * ímpar.
	 */
	public void status() {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = input.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + " é par");
		}else {
			System.out.println(num + " é impar");
		}
		input.close();
	}
	
public static void main(String[] args) {
	
	Exe3 obj = new Exe3();
	obj.status();
	
	
}



}
