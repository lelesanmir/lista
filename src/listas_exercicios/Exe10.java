package listas_exercicios;

import java.util.Scanner;

public class Exe10 {

	public static double calcularValorPago(double precoEtiqueta, int condicaoPagamento) {
		double valorPago;
		switch (condicaoPagamento) {
		case 1:
			valorPago = precoEtiqueta * 0.9;
			break;
		case 2:
			valorPago = precoEtiqueta * 0.85;
			break;
		case 3:
			valorPago = precoEtiqueta;
			System.out.println("Valor de cada parcela:  " + precoEtiqueta / 2 );
			break;
		case 4:
            valorPago = precoEtiqueta * 1.1;
            System.out.println("Valor de cada parcela:  " + precoEtiqueta/3 );
            break;
		default:
			System.out.println("Condição de pagamento inválida");
			return 0;
		}
		return valorPago;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o preço normal de etiqueta: ");
		double precoEtiqueta = input.nextDouble();

		System.out.println("Escolha a condição de pagamento:");
		System.out.println("1 - À vista em dinheiro ou cheque, recebe 10% de desconto");
		System.out.println("2 - À vista no cartão de crédito, recebe 15% de desconto");
		System.out.println("3 - Em duas vezes, preço normal  de etiqueta  sem juros ");
		System.out.println("4 - Em três vezes, preço normal  de etiqueta  com juros de 10%");
        int condicaoPagamento = input.nextInt();
		

		double valorPago = calcularValorPago(precoEtiqueta, condicaoPagamento);

		System.out.printf("Valor a ser pago: %.2f", valorPago);

		input.close();
	}
}
