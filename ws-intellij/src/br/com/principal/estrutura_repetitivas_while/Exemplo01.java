package br.com.principal.estrutura_repetitivas_while;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;
        while (x != 0){//enquanto
            soma += x;
           // soma = soma + x;
            x = sc.nextInt();
        }
        System.out.println(soma);
        sc.close();
    }
}
