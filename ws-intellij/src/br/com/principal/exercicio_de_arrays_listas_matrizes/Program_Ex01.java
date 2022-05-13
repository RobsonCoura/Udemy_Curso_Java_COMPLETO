package br.com.principal.exercicio_de_arrays_listas_matrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program_Ex01 {
    public static void main(String[] args) {

        //Object to set the decimal point separator.
        Locale.setDefault(Locale.US);

        //Object to read keyboard data entered by user
        Scanner sc = new Scanner(System.in);

        //Creating the list of employees
        List<Employee_Ex01> list = new ArrayList<>();

        //Screen printing
        System.out.println("How many employees will be registered? ");
        // Creating the variable N and already reading it through the Scanner
        int N = sc.nextInt();

        //Repeat loop for the list of employees
        for (int i=0; i<N; i++)
        {
            System.out.println();
            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id))
            {
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary  = sc.nextDouble();

            //Estanciating an Employee object with this data you typed
            Employee_Ex01 emp = new Employee_Ex01(id, name, salary);

            //Add this employee to the list
            list.add(emp);
        }
        System.out.println();
        System.out.println("Enter the employee id that have salary increase : ");
        int idsalary = sc.nextInt();
        //Procurando a posição do Id salary dentro da lista se encontrar quer dizer que esse "pos" não vai ser null
        //Integer pos = position(list, idsalary);

        //Fazendo uma busca usando lista.stream() é uma forma especial de transformar,
        // sua lista em uma stream que aceita funções lambida.
        Employee_Ex01 emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        if (emp == null)
        {
            System.out.println("This id does not exist!\r\n");
        }
        else
        {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            //Recebe o valor do salario e inclementa um porcentagem sobre o salario
            emp.increasesalary(percent);
        }
        //Print employee list
        System.out.println();
        System.out.println("List of employees:");
        for (Employee_Ex01 e : list)
        {
            System.out.println(emp);
        }

        //Forma de encontrar o elemento (id) usando o Stream exprexão lambida
        //Para fechar o recurso que abriu do Scanner
        sc.close();
    }
    //Criando uma função auxiliar para procurar um elemento na lista
    public static Integer position(List<Employee_Ex01> list, int id)
    {
        //Laço de repetição para começar na posição ZERO e ir até a posição 3 da lista.
        for (int i = 0; i < list.size(); i++)
        {
            //Testa se o Id do elemento da posição (i) é igual o Id do que estou procurando sendo igual retorna o valor de (i).
            if (list.get(i).getId() == id)
            {
                return i;
            }
        }
        return null;
    }

    //Metodo auxiliar verificação atravez do id funcionario se existe
    public static boolean hasId(List<Employee_Ex01> list, int id)
    {
        Employee_Ex01 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
