package listas_exercicios;

import java.util.Scanner;

public class Exe9{
	
	public static double calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);

        System.out.print("Condição: ");
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Acima do peso");
        } else {
            System.out.println("Obeso");
        }

        return imc;
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("IMC: " + imc);

        scanner.close();
    }
}

