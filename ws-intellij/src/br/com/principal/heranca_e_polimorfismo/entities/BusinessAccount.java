package br.com.principal.heranca_e_polimorfismo.entities;

public class BusinessAccount extends Account {

    //Atributos
    private double loanLimit;

    //Construtor padrao sem argumentos
    public BusinessAccount() {
        //Chamando o super(); para executar a logica do construtor da class Base
        super();
    }

    //Construtor padrao com argumentos
    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    //Getters and Setters
    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    //Metodo para operação de emprestimo
    public void loan(double amount) {
        //Verificar se esse valor que está querendo emprestar ele é <= ao limite de emprestimo!
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }
    //Metodo para saque
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
