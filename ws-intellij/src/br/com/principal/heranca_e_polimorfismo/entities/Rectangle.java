package br.com.principal.heranca_e_polimorfismo.entities;

import br.com.principal.heranca_e_polimorfismo.entities.enums.Color;

public class Rectangle  extends Shape{

    //Atributos
    private Double width;
    private Double height;

    //Construtor padrao sem argumentos
    public Rectangle(){
        super();
    }
    //Construtor com argumentos
    public Rectangle(Color color, Double width, Double height) {
        super();
        this.width = width;
        this.height = height;
    }
    //Getters and Seeters
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    //Metodo para calculo do retangulo
    @Override
    public double area() {
        return width * height;
    }
}
