package br.com.principal.outros_topicos_java;

import java.util.Scanner;

public class Exemplo_bitwase01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mask = 0b100000;
        int n = sc.nextInt();

        if ((n & mask) != 0){
            System.out.println("6th bit is true!");
        }
        else {
            System.out.print("6th bit is false!");
        }
    }
}
