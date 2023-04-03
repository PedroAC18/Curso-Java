package application;

import entities.*;
import entitites_enum.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        //Dados do cliente para criação desse
        System.out.println("Enter Client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date: ");
        String birthDate = sc.nextLine();
        Client client = new Client(name, email, sdf.parse(birthDate));

        //Status do pedido
        System.out.println("Enter Order data: ");
        System.out.print("Status:");
        OrderStatus oS = OrderStatus.valueOf(sc.next());

        //Criação do pedido com o momento do sistema, status e dados cliente
        Order order = new Order(new Date(), oS, client);

        //Saber quantos items terão o pedido
        System.out.println("How many Items ?");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Enter #"+i+" item data:");
            //Infos produto e criação do produto
            System.out.print("Product name: ");
            sc.nextLine();//necessário pois foi lido um int anteriormente
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            double pPrice = sc.nextDouble();
            Product p = new Product(pName, pPrice); //criação do pedido

            System.out.print("Quantity: ");
            int qtd = sc.nextInt();

            OrderItem oI = new OrderItem(qtd,pPrice, p);//criação do pedido do item
            order.addItem(oI);//adicionar o pedido de item à lista de pedidos
        }

        System.out.println();
        System.out.println("Order Summary: ");
        System.out.println(order.toString());


        sc.close();

    }
}
