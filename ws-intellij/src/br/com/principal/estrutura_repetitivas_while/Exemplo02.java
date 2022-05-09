package br.com.principal.estrutura_repetitivas_while;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        while (X != Y){
            if (X < Y){
                System.out.println("Crescente");
            }
            else{
                System.out.println("Decrescente");
            }
             X = sc.nextInt();
             Y = sc.nextInt();
        }

        sc.close();
    }
}
