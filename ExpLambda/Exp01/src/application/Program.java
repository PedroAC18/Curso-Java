package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Notebook",900.00));
        list.add(new Product("TV",1500.00));
        list.add(new Product("Smartphone",5000.00));

        list.sort((p1,p2) -> p1.getName().compareTo(p2.getName()));

        list.forEach(System.out::println);

        list.sort((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));
        System.out.println("===================================");

        list.forEach(System.out::println);
    }
}
