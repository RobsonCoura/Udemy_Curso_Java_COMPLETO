package br.com.principal.exercicios_condicional;
/*Exercício 01

Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero < -0 && numero > -10000){
            System.out.println("NEGATIVO");
        }
        else{
            System.out.println("NAO NEGATIVO");
            sc.close();
        }

    }
}
