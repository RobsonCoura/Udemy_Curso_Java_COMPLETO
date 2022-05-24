package br.com.principal.enumeracoes_composicoes.entities;

public class OrderItem {

    //Aributos
    private Integer quantity;
    private Double price;

    //OrderItem com uma referencia para o produto
    private Product product;

    //Construtor sem argumentos
    public OrderItem(){
    }

    //Construtor com argumentos
    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    //Getters and Setters
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    //Metodo subTotal
    public double subTotal(){
        return price * quantity;
    }
    //Metodo para toString
    @Override
    public String toString(){
        return getProduct().getName()
                + ", $"
                + String.format("%.2f", price)
                + " Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
