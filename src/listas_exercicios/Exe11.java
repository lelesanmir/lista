package listas_exercicios;

import java.util.Scanner;

public class Exe11 {

	public static double calculaMediaAproveitamento(double nota1, double nota2, double nota3, double me) {
        return (nota1 + nota2 * 2 + nota3 * 3 + me) / 7;
    }

    public static String obtemConceito(double ma) {
        if (ma >= 90) {
            return "A";
        } else if (ma >= 75) {
            return "B";
        } else if (ma >= 60) {
            return "C";
        } else if (ma >= 40) {
            return "D";
        } else {
            return "E";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de identificação do aluno: ");
        int id = sc.nextInt();

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double me = sc.nextDouble();

        double ma = calculaMediaAproveitamento(nota1, nota2, nota3, me);

        System.out.println("Número de identificação: " + id);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Média dos exercícios: " + me);
        System.out.println("Média de aproveitamento: " + ma);

        String conceito = obtemConceito(ma);

        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }

}
