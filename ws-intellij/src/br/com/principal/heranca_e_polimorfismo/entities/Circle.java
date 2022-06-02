package br.com.principal.heranca_e_polimorfismo.entities;

import br.com.principal.heranca_e_polimorfismo.entities.enums.Color;

public class Circle extends Shape{

    //Atributos
    private Double radius;

    //Construtor padrao sem argumentos
    public Circle(){
        super();
    }
    //Construtor com argumentos
    public Circle(Color color, Double radius) {
        super();
        this.radius = radius;
    }
    //Getters and Seeters
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Color color, Double radius) {
        this.radius = radius;
    }
    //Metodo para calculo da area
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
