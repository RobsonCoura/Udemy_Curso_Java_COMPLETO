package br.com.principal.construtores_this_sobrecarga_encapsulamento;

public class ProductExemplo01 {
    //Atributos
    String name;
    private double price;
    private int quantity;

    //Contrutor01
    public ProductExemplo01() {
    }

    //Contrutor02
    public ProductExemplo01(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Contrutor03
    public ProductExemplo01(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Metodo para pegar
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //Metodo para alterar
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Metodos para retornar
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    //Converter o Objeto para String
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
