package br.com.principal.heranca_e_polimorfismo.entities;

public class Employee {

    //Atributos
    private String name;
    private Integer hours;
    private Double valuePerHour;

    //Construtor padrao sem argumentos
    public Employee(){
    }
    //Construtor padrao com argumentos
    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }
    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
    //Função do pagamento
    public double payment(){
    return hours * valuePerHour;
    }
}
