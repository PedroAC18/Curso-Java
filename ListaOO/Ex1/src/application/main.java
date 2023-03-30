package application;

import entities.Rectangle;
import java.util.Scanner;
import java.util.Locale;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle x = new Rectangle();

        System.out.println("Entre com a largura e altura do retangulo: ");
        x.width = sc.nextDouble();
        x.height = sc.nextDouble();

        System.out.println("Area:"+ x.area());
        System.out.println("Perimetro: "+ x.perimeter());
        System.out.println("Diagonal: "+ x.diagonal());

        sc.close();
    }
}
