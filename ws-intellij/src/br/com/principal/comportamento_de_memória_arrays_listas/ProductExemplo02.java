package br.com.principal.comportamento_de_memória_arrays_listas;

public class ProductExemplo02 {

    private String name;
    private double price;

    public ProductExemplo02(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
