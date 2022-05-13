package br.com.principal.exercicio_de_arrays_listas_matrizes;

import java.util.Scanner;

public class Program_Ex02 {
    public static void main(String[] args) {

        //Leitura dos dados inseridos pelo usuario
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //Instaciar a matriz na memoria
        int[][] mat = new int[n][n];

        //Laço de repetição para percorrer as linhas
        for (int i=0; i< mat.length; i++)
        {
            //Laço de repetição percorendo as colunas
            for (int j=0; j< mat[i].length; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        //Imprimir na tela
        System.out.println("Main diagonal: ");
        for (int i=0; i< mat.length; i++)
        {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i=0; i< mat.length; i++)
        {
            for (int j=0; j< mat[i].length; j++)
            {
                    if (mat[i][j] < 0)
                    {
                        count++;
                    }
            }
        }
        System.out.println("Negative numbers: " + count);
        sc.close();
    }
}
