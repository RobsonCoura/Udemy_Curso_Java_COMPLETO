package br.com.principal.exercicios_sequencial;
/*Exercício 04

Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);//Localidade do sistema
        Scanner sc = new Scanner(System.in);

        int funcionario = sc.nextInt();
        int horasMensal = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario;

        salario = horasMensal * valorHora;

        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY =  U$ %.2f%n", salario );
        sc.close();
    }
}
