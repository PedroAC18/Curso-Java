package application;

import entities.Employee;
import entities.OutsorcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> listaFun = new ArrayList<>();

        System.out.print("Entre com o numero de funcionarios: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print("Terceirizado (s/n) ?");
            sc.nextLine();
            String terc = sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor hora: ");
            double valH = sc.nextDouble();

            if(terc.equals("s")){
                System.out.print("Custo adicional: ");
                double custo = sc.nextDouble();
                listaFun.add(new OutsorcedEmployee(nome, horas, valH, custo));
            }else{
                listaFun.add(new Employee(nome, horas, valH));
            }
        }

        for (Employee emp :listaFun ){
            System.out.println("Nome: " + emp.getName() + " - $"+ emp.payment());
        }

    }
}
