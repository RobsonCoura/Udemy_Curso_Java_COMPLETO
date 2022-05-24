package br.com.principal.enumeracoes_composicoes.entities;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    //Criar esse Objeto para Formatação de Data
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    //Atributos
    private String name;
    private String email;
    private Date birthDate;

    //Construtor sem argumentos
    public Client(){
    }

    //Construtor com argumentos
    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    //Metodo toString para imprimir na tela
    @Override
    public String toString(){
        return name + " (" + sdf.format(birthDate) + ") - " + email;
    }
}
