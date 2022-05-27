package br.com.principal.heranca_e_polimorfismo.entities;

public class Account {

    //Atributos
    private Integer number;
    private String holder;
    protected Double balance;
    //Construtor padrao sem argumentos
    public Account(){
    }
    //Construtor padrao com argumentos
    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    //Getters and Setters
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
    //Metodo para operação de saque
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }
    //Metodo para operação de deposito
    public void deposit(double amount){
        balance += amount;
    }
}
