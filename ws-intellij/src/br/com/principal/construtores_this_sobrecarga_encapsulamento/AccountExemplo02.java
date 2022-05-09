package br.com.principal.construtores_this_sobrecarga_encapsulamento;

public class AccountExemplo02 {
    private int number;
    private String holder;
    private double balance;

    //Construtor
    public AccountExemplo02(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }
    //Construtor
    public AccountExemplo02(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public AccountExemplo02(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    //Metodos pegar e alterar
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
    //Metodo para deposito
    public void deposit(double amount){
        balance += amount;
    }
    //Metodo para saque
    public  void withdraw(double amount){
        balance -= amount + 5.0;
    }
    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
