package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Predicate {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Notebook",900.00));
        list.add(new Product("TV",1500.00));
        list.add(new Product("Smartphone",5000.00));

        list.removeIf(p -> p.getPrice() < 100);

        for(Product p: list){
            System.out.println(p);
        }
    }
}
