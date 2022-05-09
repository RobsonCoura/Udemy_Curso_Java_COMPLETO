package br.com.principal.exercicios_sequencial;

import java.util.Locale;
import java.util.Scanner;

/*Exercício 05

Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
public class Exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoP1 = sc.nextInt();
        int NumeroPeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();
        int codigoP2 = sc.nextInt();
        int NumeroPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();
        double totalPagar;

        totalPagar = (NumeroPeca1 * valorPeca1) + (NumeroPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$  %.2f%n",totalPagar);
    }
}
