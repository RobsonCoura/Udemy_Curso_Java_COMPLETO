package br.com.principal.heranca_e_polimorfismo.application;

import br.com.principal.heranca_e_polimorfismo.entities.Circle;
import br.com.principal.heranca_e_polimorfismo.entities.Rectangle;
import br.com.principal.heranca_e_polimorfismo.entities.Shape;
import br.com.principal.heranca_e_polimorfismo.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {

        //Formato de saida US
        Locale.setDefault(Locale.US);
        //Leitura de dados
        Scanner sc = new Scanner(System.in);

        //Criando uma lista de figuras
        List<Shape> list = new ArrayList<>();

        //Imprimir dados na tela
        System.out.print("Enter the number of shape: ");
        int n = sc.nextInt();

        //Criando um for para ler as N figuras
        for (int i=1; i<=n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            //Criando uma condição dos valores de entrada
            if (ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            }
            else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHEPE AREAS:");
        //Criando um for na lista para cada Shape
        for (Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }
        sc.close();
    }
}
