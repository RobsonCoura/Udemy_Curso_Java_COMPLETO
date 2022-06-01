package br.com.principal.heranca_e_polimorfismo.application;

import br.com.principal.heranca_e_polimorfismo.entities.Employee;
import br.com.principal.heranca_e_polimorfismo.entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {

        //Formato de dados modelo US
        Locale.setDefault(Locale.US);
        //Leitor de dados
        Scanner sc = new Scanner(System.in);

        //Criando (Instanciada) Lista de funcionario
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        //Criando um for para ler repetidamente a quantidade de funcionarios
        for (int i=1; i<=n; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hours: ");
            double valuePerHour = sc.nextDouble();
            //Criando uma condição se vai ler a taxa adicional de funcionario
            if (ch == 'y'){
                System.out.print("additional charge: ");
                double additionalCharge = sc.nextDouble();
                //Instanciando um novo funcionario e adicionando na lista
                Employee emp = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            }
            else{
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        //Criando um for para percorer a lista de funcionario
        for (Employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
