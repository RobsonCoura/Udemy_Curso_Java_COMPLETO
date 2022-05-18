package br.com.principal.enumeracoes_composicoes;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    //Atributos
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    //Associaçoes
    private Department department;
    //Lista de contratos já instanciando
    private List<HourContract> contracts = new ArrayList<>();

    //Contrutor padrao vazio
    public Worker(){
    }
    //Contrutor C/ Argumentos
    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
    //Getters e Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }
    //Metodo para add um contrato a esse trabalhador
    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    //Metodo para remove um contrato a esse trabalhador
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

}
