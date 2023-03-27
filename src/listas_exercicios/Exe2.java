package listas_exercicios;

import java.util.Scanner;

public class Exe2 {

	/**
	 * 2) Faça um programa que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja
     *“F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).
	 */
	public void status() {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o nome: ");
		String nome = input.nextLine();

		System.out.print("Digite o sexo (M/F): ");
		char sexo = input.next().charAt(0);

		System.out.print("Digite o estado civil: (casada/ solteira)");
		String estadoCivil = input.next();

		if (sexo == 'F' && estadoCivil.equalsIgnoreCase("C")) {
			System.out.print("Digite o tempo de casada: ");
			int tempoCasado = input.nextInt();
			System.out.println("Nome " + nome + "sexo " + sexo + " é casado(a) há " + tempoCasado + " anos.");

		} else {
		}
		System.out.println(nome + " não é casada.");
		input.close();
	}
	
	
	public static void main(String[] args) {

		Exe2 obj = new Exe2();
		obj.status();
		
	}
}
