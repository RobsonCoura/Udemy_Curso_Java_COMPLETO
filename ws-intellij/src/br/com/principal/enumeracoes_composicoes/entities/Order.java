package br.com.principal.enumeracoes_composicoes.entities;


import br.com.principal.enumeracoes_composicoes.entities.enums.OrderStatus01;

import java.util.Date;
//Entidade
public class Order {

    //Atributos
    private Integer id;
    private Date moment;
    private OrderStatus01 status01;

    //Construtor vazio
    public Order(){
    }
    //Contrutor com argumentos
    public Order(Integer id, Date moment, OrderStatus01 status01) {
        this.id = id;
        this.moment = moment;
        this.status01 = status01;
    }

    //Getters Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus01 getStatus01() {
        return status01;
    }

    public void setStatus01(OrderStatus01 status01) {
        this.status01 = status01;
    }

    //Gerar ToString
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status01=" + status01 +
                '}';
    }
}
