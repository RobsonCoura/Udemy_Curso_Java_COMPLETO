package br.com.principal.heranca_e_polimorfismo.entities;

public abstract class TaxPayer {

    //Atributos
    private String name;
    private Double anualIncome;

    //Contrutor padrao sem argumentos
    public TaxPayer(){
    }
    //Construtor com argumentos
    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
    //Metodo quanto de imposto esse contribuinte paga
    public abstract double tax();


}
