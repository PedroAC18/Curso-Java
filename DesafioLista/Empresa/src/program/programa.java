package program;

import entitie.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Funcionario> func = new ArrayList<>();

        for(int i=0; i < n; i++){
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double sal = sc.nextDouble();

            func.add(new Funcionario(id, nome, sal));
        }


        System.out.print("Qual id que vai aumentar o salario: ");
        int buscaID = sc.nextInt();
        Funcionario temp = func.stream().filter(x -> x.getId() == buscaID).findAny().orElse(null);
        if(temp == null){
            System.out.print("Funcionario nao existe ");
        }else{
            System.out.print("Qual a porcentagem que vai aumentar o salario: ");
            double porcentagem = sc.nextDouble();
            temp.aumentoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionarios:");
        for (Funcionario obj : func) {
            System.out.println(obj);
        }


        sc.close();
    }
}
