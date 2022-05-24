package br.com.principal.enumeracoes_composicoes.application;

import br.com.principal.enumeracoes_composicoes.entities.Client;
import br.com.principal.enumeracoes_composicoes.entities.Order01;
import br.com.principal.enumeracoes_composicoes.entities.OrderItem;
import br.com.principal.enumeracoes_composicoes.entities.Product;
import br.com.principal.enumeracoes_composicoes.entities.enums.OrderStatus02;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) throws ParseException {

        //Criar esse Objeto para Formatação de Data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Imprimir com .
        Locale.setDefault(Locale.US);

        //Leitura de dados
        Scanner sc = new Scanner(System.in);

        //Imprimindo na tela e fazendo leitura de dados
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birth = sdf.parse(sc.next());

        //Instanciar um Client
        Client client = new Client(name, email, birth);

        System.out.println("Enter order data:");
        System.out.println("Status: ");

        //Converter String para OrderStatus02
        OrderStatus02 status02 = OrderStatus02.valueOf(sc.next());
        Order01 order01 = new Order01(new Date(), status02, client);

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();
        for (int i=1; i<=N; i++){
            System.out.println("Enter #" + i + " item data:" );
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            //Instanciar o Objeto Product
            Product product = new Product(productName, productPrice);

            //Instanciar o item de Product
            OrderItem it = new OrderItem(quantity, productPrice, product);

            //Add esse OrderItem dentro da List de pedido
            order01.addItem(it);
        }
        System.out.println();
        System.out.println(order01);
        sc.close();
    }
}
