package br.com.principal.estrutura_repetitivas_while;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero inicial: ");
        int numeroInicial = sc.nextInt();

        System.out.println("Digite o numero final: ");
        int numeroFinal = sc.nextInt();

        int numeroAtual = numeroInicial;

        while (numeroAtual <= numeroFinal){
            System.out.println(numeroAtual); numeroAtual++;
        }
    }
}
