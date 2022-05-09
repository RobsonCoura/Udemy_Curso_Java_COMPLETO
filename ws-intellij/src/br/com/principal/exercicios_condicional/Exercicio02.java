package br.com.principal.exercicios_condicional;

import java.util.Scanner;

/*
Exercício 02

Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
*/
public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
