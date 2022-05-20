package br.com.principal.enumeracoes_composicoes.application;

import br.com.principal.enumeracoes_composicoes.entities.Department;
import br.com.principal.enumeracoes_composicoes.entities.HourContract;
import br.com.principal.enumeracoes_composicoes.entities.Worker;
import br.com.principal.enumeracoes_composicoes.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Manipulação de Datas
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        //Esse for vai repetir varias vezes até instanciar todos os contratos e associar aos trabalhadores
        for (int i=1; i<=n; i++){
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            //Instanciou o contrato
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            //Metodo associar esse contrato ao trabalhador
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        //Recortar a String e converter o subString para Inteiro
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f, ", worker.income(year, month)));
        sc.close();
    }
}
