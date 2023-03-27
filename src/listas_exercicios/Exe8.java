package listas_exercicios;

import java.util.Scanner;

public class Exe8 {
    public int[] ordenar(int numero1, int numero2, int numero3) {
        int[] numeros = {numero1, numero2, numero3};
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        return numeros;
    }
    

    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();
            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = scanner.nextInt();
            System.out.print("Digite o terceiro número inteiro: ");
            int numero3 = scanner.nextInt();

            Exe8 ordenador = new Exe8();
            int[] numerosOrdenados = ordenador.ordenar(numero1, numero2, numero3);

            System.out.println("Os números em ordem decrescente são:");
            for (int numero : numerosOrdenados) {
                System.out.println(numero);
            scanner.close();
        }
    }

}

