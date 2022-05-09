package br.com.principal.exercicios_p_o_o;

public class ProductExercicio02 {

    public String name;
    public double price;
    public int quantity;

    public double totalvalueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, total: $ "
                + String.format("%.2f", totalvalueInStock());
    }
}
