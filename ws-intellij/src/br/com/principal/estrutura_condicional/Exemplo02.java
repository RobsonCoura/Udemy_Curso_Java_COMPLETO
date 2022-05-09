package br.com.principal.estrutura_condicional;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o horario?");
        int horario = sc.nextInt();

        if (horario < 12) {
            System.out.println("Bom dia");
        } else if (horario < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        sc.close();
    }
}
