package br.com.principal.exercicios_sequencial;

/*Exercício 02

Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.

Fórmula da área: area = π . raio2

Considere o valor de π = 3.14159
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double π = 3.14159;
        double raio = sc.nextDouble();
        double area;
        area = Math.pow(raio, 2.0) * π;

        System.out.printf("A=%.4f%n", area);
        sc.close();
    }
}
