package br.com.principal.estrutura_repetitivas_while;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//Determinando que é uma entrada de dados!

        System.out.printf("Entre com sua idade:");
        int idade = sc.nextInt();//Variavel comseu tipo de dados

        while (idade >= 1) {//Condição para o laço de repetição, enquanto essa condição for verdadeira retorna o laço.

            System.out.printf("Sua idade: %d%n", idade);
            if (idade >= 18) {// Se a idade for maior ou igual a 18
                System.out.printf("Você é de maior...%n");
            } else {
                System.out.printf("Você é de menor...%n");
            }
            System.out.printf("Entre com sua idade:");
            idade = sc.nextInt();//Variavel comseu tipo de dados
        }
    }
}
