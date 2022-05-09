package br.com.principal.exercicios_p_o_o;

public class RetanguleExercicio01 {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }
    public double perimeter(){
        return 2 * (width + height);
    }
    public double diagonal(){
        return Math.sqrt(width * width + height * height);
    }
}
