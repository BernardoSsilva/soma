package EXERCICIOGITHUB;

import java.util.Scanner;

public class soma{
    public static void main(String[] args) {
        int valor1, valor2;
        Scanner scan = new Scanner(System.in);

        // tentar executar o codigo dentro de try
        try {
            System.out.println("Digite um numero: ");
            valor1 = scan.nextInt();
            

            // tentar executar o codigo dentro de try
            try {
                System.out.println("Digite outro numero: ");
                valor2= scan.nextInt();
                System.out.println("O resultado é: "+(valor1+valor2));

             // caçar uma exceção, caso não for um valor inteiro como o determinado nas variaveis encerrar execução    
            } catch (Exception e){
                //o bloco catch procura entradas invalidas e as toma como excessão e encerra o funcionamento
                System.out.println("Valor invalido, Somente numeros são aceitos");
            }

            // caçar uma exceção, caso não for um valor inteiro como o determinado nas variaveis encerrar excecução 
        }catch(Exception e){
            System.out.println("Valor invalido, Somente numeros são aceitos");
        }
        
    }
}
