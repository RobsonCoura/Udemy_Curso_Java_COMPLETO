package br.com.principal.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble();
        System.out.println("Voce digitou: " + x);

        sc.close();
    }
}
