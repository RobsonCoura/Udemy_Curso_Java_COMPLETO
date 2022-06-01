package br.com.principal.heranca_e_polimorfismo.entities;

public class OutsourceEmployee extends Employee{

    //Atributos
    private Double additionalCharge;

    //Construtor padrao sem argumentos
    public OutsourceEmployee(){
        super();
    }

    //Contrutor com argumentos
    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }
    //Getters and Setters
    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    //Sobre escrever a função do funcionario
    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
