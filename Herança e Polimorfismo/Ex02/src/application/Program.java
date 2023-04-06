package application;

import entities.ImportedProduct;
import entities.UsedProduct;
import entities.Product;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qtd de produtos: ");
        int n = sc.nextInt();

        List<Product> list = new ArrayList<>();

        for(int i=1; i<=n; i++){
            System.out.println("Dados produto "+i);
            System.out.print("Comum, Usado ou Importado (c/u/i) ?");
            sc.nextLine();
            char tipo = sc.next().charAt(0);

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preco: ");
            double preco = sc.nextDouble();

            if(tipo == 'c'){
                list.add(new Product(nome, preco));
            }else if(tipo == 'i'){
                System.out.print("Imposto de importacao: ");
                double imposto = sc.nextDouble();
                list.add(new ImportedProduct(nome, preco, imposto));
            }else{
                System.out.print("Data de fabricacao: ");
                LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(nome, preco, data));
            }
        }

        for(Product p : list){
            System.out.println(p.priceTag());
        }
    }
}
