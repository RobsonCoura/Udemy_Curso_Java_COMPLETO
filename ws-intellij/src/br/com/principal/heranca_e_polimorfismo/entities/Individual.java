package br.com.principal.heranca_e_polimorfismo.entities;

public class Individual extends TaxPayer{

    //Atributos
    private Double healthExpenditures;

    //Construtor sem argumentos
    public Individual(){
    }

    //Construtor com argumentos
    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }
    //Getters and Setters
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    //Metodo de retornar o valor do imposto
    @Override
    public double tax() {

        //Operação Ternária   ? = Então  / : = Senão
        //double basicTax =  (getAnualIncome() < 20000.0) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;

        //Criando uma condicional
        double basicTax;
        if (getAnualIncome() < 20000.0){
            basicTax = getAnualIncome() * 0.15;
        }
        else{
            basicTax = getAnualIncome() * 0.25;
        }
        basicTax -= getHealthExpenditures() * 0.5;
        if (basicTax < 0.0){
            return 0.0;
        }
        else{
            return basicTax;
        }
    }
}
