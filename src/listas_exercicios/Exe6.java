package listas_exercicios;
import java.util.Scanner;

public class Exe6 {
    private int valor1;
    private int valor2;
    
    public Exe6(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public String verificar() {
        if (valor1 == 1 && valor2 == 1) {
            return "Ambos os valores são VERDADEIROS";
        } else if (valor1 == 0 && valor2 == 0) {
            return "Ambos os valores são FALSOS";
        } else {
            return "Pelo menos um dos valores é VERDADEIRO E O OUTRO FALSO";
        }
    }

    // Exemplo de uso da classe
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor booleano (true=1, false=0): ");
        int valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor booleano (true=1, false=0): ");
        int valor2 = scanner.nextInt();
        
        Exe6 verificador = new Exe6(valor1, valor2);
        String resultado = verificador.verificar();
        System.out.println(resultado);
        
        scanner.close();
    }
    
}
