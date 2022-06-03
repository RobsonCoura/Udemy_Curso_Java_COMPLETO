package br.com.principal.heranca_e_polimorfismo.application;

import br.com.principal.heranca_e_polimorfismo.entities.Company;
import br.com.principal.heranca_e_polimorfismo.entities.Individual;
import br.com.principal.heranca_e_polimorfismo.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {

        //Metodo para ter o ponto decimal
        Locale.setDefault(Locale.US);
        //Leitura de dados
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of taxpayers: ");
        int N = sc.nextInt();

        //Criando uma Lista
        List<TaxPayer> list = new ArrayList<>();

        //Criando um For para ler
        for(int i=1; i <= N; i++){
            System.out.println("Taxpayer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            //Criando uma condição
            if (type == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                Individual x = new Individual(name, anualIncome, healthExpenditures);
                list.add(x);
            }
            else{
                System.out.print("Number of employeess: ");
                Integer numberOfEmpleyees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmpleyees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        //Criando um for para percorer na lista
        for (TaxPayer tp : list){
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
        }
        System.out.println();
        double sum = 0.0;
        //Criando um for para percorer na lista
        for (TaxPayer tp : list){
            sum += tp.tax();
        }
        System.out.println("TOTAL TAKES: $ " + String.format("%.2f", sum));
        sc.close();
    }
}
