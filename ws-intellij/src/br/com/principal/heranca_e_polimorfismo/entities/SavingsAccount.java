package br.com.principal.heranca_e_polimorfismo.entities;
//final - evita que a classe seja herdada por outra classe
public final class SavingsAccount extends Account{

    //Atributos
    private Double interestRate;
    //Construtor padrao sem argumentos
    public SavingsAccount(){
        super();
    }
    //Construtor padrao com argumentos
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }
    //Getters and Setters
    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    //Metodo para atualizar essa conta com saldo de juros
    public void updatebalance(){
        balance += balance * interestRate;
    }
    //Metodo withDraw
    //Para informar o compilador que isso é uma sobreposição coloca Anotação @Override
    @Override
    public void withdraw(double amount){
        balance -= amount;
    }

}
