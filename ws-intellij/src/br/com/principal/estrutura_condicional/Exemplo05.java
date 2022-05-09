package br.com.principal.estrutura_condicional;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;
        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;//Toda vez que acabar o case, colocar o break;
            case 7:
                dia = "sabado";
                break;
            default://Para executar alguma coisa, caso todas as alternativas falhem!
                dia = "valor invalido";
                break;
        }
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
