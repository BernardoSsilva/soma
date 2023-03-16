package EXERCICIOGITHUB;

import java.util.Scanner;

public class soma{
    public static void main(String[] args) {
        int soma, val1Int, val2Int
        String valor1, valor2, soma;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        valor1 = scan.next();
        if(valor1.matches("[0-9] +")){
            val1Int = Integer.parseInt(valor1);
            System.out.println("Digite outro numero: ");
            valor2= scan.next();
            if(valor2.matches("[0-9]+")){
                val2Int = Integer.parseInt(valor2)
                soma = val1Int+val2Int;
                System.out.println("O resultado é: "+soma);
            }
            
        }else{
            System.out.println("Valor Invalido");
        }
        
    }
}
