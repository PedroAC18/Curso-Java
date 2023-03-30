package program;

import entities.Employee;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee em = new Employee();

        //recebendo valores
        System.out.println("Name: ");
        em.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        em.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        em.tax = sc.nextDouble();

        //printando valores
        System.out.println();
        System.out.println("Employee: " + em.name);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        System.out.println();
        em.increaseSalary(percentage);
        sc.close();
    }
}
