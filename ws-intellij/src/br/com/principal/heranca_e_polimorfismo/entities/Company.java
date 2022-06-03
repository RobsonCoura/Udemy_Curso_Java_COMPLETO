package br.com.principal.heranca_e_polimorfismo.entities;

public class Company extends TaxPayer{
    //Atributos
    private Integer numberEmployees;

    //Construtor sem argumentos
    public Company(){
    }

    //Construtor com argumentos
    public Company(String name, Double anualIncome, Integer numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }
    //Getters and Setters
    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }
    //Metodo para calculo de imposto
    @Override
    public double tax() {
        if (numberEmployees > 10){
            return getAnualIncome() * 0.14;
        }
        else {
            return getAnualIncome() * 0.16;
        }
    }
}
