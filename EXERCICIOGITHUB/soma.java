package EXERCICIOGITHUB;

import java.util.Scanner;

public class soma{
    public static void main(String[] args) {
        int valor1, valor2, soma;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        valor1 = scan.nextInt();
        System.out.println("Digite outro numero: ");
        valor2 = scan.nextInt();
        soma = valor1+valor2;
        System.out.println("O resultado é: "+soma);
    }
}
