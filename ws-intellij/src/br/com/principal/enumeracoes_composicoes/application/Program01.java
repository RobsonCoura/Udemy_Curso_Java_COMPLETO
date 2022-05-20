package br.com.principal.enumeracoes_composicoes.application;

import br.com.principal.enumeracoes_composicoes.entities.Order;
import br.com.principal.enumeracoes_composicoes.entities.enums.OrderStatus01;

import java.util.Date;

public class Program01 {
    public static void main(String[] args) {

        //Declarar um novo Objeto do tipo Order
        Order order = new Order(1080, new Date(), OrderStatus01.PENDING_PAYMENT);

        //Imprimir na tela
        System.out.println(order);

        //Instanciar um Objeto do tipo OrderStatus, para CONVERTER de Enum para String.
        OrderStatus01 os1 = OrderStatus01.DELIVERED;

        OrderStatus01 os2 = OrderStatus01.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);


    }
}
