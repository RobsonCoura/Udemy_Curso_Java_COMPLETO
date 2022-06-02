package br.com.principal.heranca_e_polimorfismo.entities;

import br.com.principal.heranca_e_polimorfismo.entities.enums.Color;

public abstract class Shape {

    //Atributos
    private Color color;

    //Construtor padrao sem argumentos
    public Shape(){
    }

    //Getters and Setters
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    //Metodo (função) area
    public abstract double area();
}
