package br.com.principal.enumeracoes_composicoes.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    //Declarando uma constante
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    //Atributos
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    //Criação de uma lista de comentario
    private List<Comment> comments = new ArrayList<>();

    //Criação do construtor padrao
    public Post(){
    }
    //Criação do construtor com argumentos
    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }
    //Criação dos Getters e Setters

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }
    //Criação do metodo para adicionar um comentario
    public void addComment(Comment comment){
        comments.add(comment);
    }
    //Criação do metodo para deletar um comentario
    public void removeComment(Comment comment){
        comments.remove(comment);
    }
    //Criação do metodo ToString
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");
        for (Comment c : comments){
            sb.append(c.getText() + "\n");
        }
        return  sb.toString();
    }
}
