package listas_exercicios;

import java.util.Scanner;

public class Exe5 {
	
	/**
	 * 5) Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo,
	 *imprimindo o resultado.
	 * @param numero
	 * @return
	 */
	public static  int calcular(int numero) {
        if (numero >= 0) {
            return numero * 2; // retorna o dobro se for positivo
        } else {
            return numero * 3; // retorna o triplo se for negativo
        }
    }//Fim do método
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        
        int resultado = calcular(numero);
        System.out.println(resultado);
        
        sc.close();
    
    }// Fim do main

    
    
}//Fim da Class Exe5
