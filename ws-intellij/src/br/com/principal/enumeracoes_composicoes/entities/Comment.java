package br.com.principal.enumeracoes_composicoes.entities;

public class Comment {

    //Atributos
    private String text;

    public Comment(){
    }
    //Construtor com argumentos
    public Comment(String text) {
        this.text = text;
    }
    //Getters e Setters

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
