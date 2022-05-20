package br.com.principal.enumeracoes_composicoes.entities;

public class Department {

    //Atributos
    private  String name;

    //Construtor
    public Department(){
    }
    //Construtor C/ argumentos
    public Department(String name) {
        this.name = name;
    }
    //Getters e Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
