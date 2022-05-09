package br.com.principal.exercicios_sequencial;
/*Exercício 06

Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double areaTriangulo;
        areaTriangulo = (A * C) /2;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);

        double areaCirculo;
        double π = 3.14159;
        areaCirculo = Math.pow(C, 2.0) * π;
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);

        double areaTrapezio;
        areaTrapezio = (A+B)*C/2;
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);

        double areaQuadrado;
        areaQuadrado = B * B;
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);

        double areaRetangulo;
        areaRetangulo = A * B;
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);


    }
}
