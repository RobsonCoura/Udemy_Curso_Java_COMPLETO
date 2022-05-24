package br.com.principal.enumeracoes_composicoes.entities;

import br.com.principal.enumeracoes_composicoes.entities.enums.OrderStatus02;
import sun.font.CreatedFontTracker;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order01 {

    //Metodo para manipulação de Data
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    //Atributos
    private Date moment;
    private OrderStatus02 status;

    //Associações dos Objetos
    private Client client;

    //Criando a uma lista
    private List<OrderItem> items = new ArrayList<>();

    //Contrutor sem argumentos
    public Order01(){
    }
    //Contrutor com argumentos
    public Order01(Date moment, OrderStatus02 status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    //Getters and Setters
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus02 getStatus() {
        return status;
    }

    public void setStatus(OrderStatus02 status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    //Metodo para add item na List
    public void addItem(OrderItem item){
        items.add(item);
    }
    //Metodo para remove item na List
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    //Metodo para soma do subTotal
    public double total(){
        double sum = 0.0;
        for(OrderItem it : items){
            sum += it.subTotal();
        }
        return sum;
    }
    //Metodo toString para imprimir
    @Override
    public String toString(){
        //Metodo para StringBuilder acrecenta um monte de coisas nele e no final convert para String
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : items){
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
