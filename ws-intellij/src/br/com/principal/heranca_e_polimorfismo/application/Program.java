package br.com.principal.heranca_e_polimorfismo.application;

import br.com.principal.heranca_e_polimorfismo.entities.Account;
import br.com.principal.heranca_e_polimorfismo.entities.BusinessAccount;
import br.com.principal.heranca_e_polimorfismo.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        //Criando uma variavel conta 1 e instanciando o Objeto Account
    Account acc1 = new Account(1001, "Alex", 1000.0);
    acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        //Criando outra variavel conta 2 e instanciando o Objeto SavingsAccount
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        //Chamando o acc2 withdraw
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        //Criando outra variavel conta 2 e instanciando o Objeto SavingsAccount
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        //Chamando o withdraw
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
