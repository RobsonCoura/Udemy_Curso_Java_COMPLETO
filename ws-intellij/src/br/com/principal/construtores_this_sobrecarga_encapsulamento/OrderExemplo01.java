package br.com.principal.construtores_this_sobrecarga_encapsulamento;

import java.util.Date;

public class OrderExemplo01 {
    private Date date;
    private ProductExemplo01 product;

    //Construtor
    public OrderExemplo01(Date date, ProductExemplo01 product) {
        this.date = date;
        this.product = product;
        this.product.name = "tV";
    }

    //Metodos
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ProductExemplo01 getProduct() {
        return product;
    }

    public void setProduct(ProductExemplo01 product) {
        this.product = product;
    }
}
