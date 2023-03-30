package program;

import entitie.bank;
import java.util.Scanner;

public class bankProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        bank account;

        String name;
        char op;
        int num_conta;

        System.out.print("Digite numero da conta: ");
        num_conta = sc.nextInt();

        System.out.print("Digite seu nome: ");
        sc.nextLine();
        name = sc.nextLine();


        System.out.print("Deseja adicionar saldo ? y/n ");
        op = sc.next().charAt(0);
        if(op == 'y'){
            System.out.print("Digite valor do deposito: ");
            double saldo = sc.nextDouble();
            account = new bank(num_conta, name, saldo);
        }else{
            account = new bank(num_conta, name);
            System.out.println("Saldo definido como zero");
        }
        System.out.println();
        System.out.println(account);

        System.out.println();
        System.out.print("Digite valor para deposito: ");
        double deposito = sc.nextDouble();
        account.deposito(deposito);
        System.out.println(account);

        System.out.println();
        System.out.print("Digite valor para saque: ");
        double saque = sc.nextDouble();
        account.saque(saque);
        System.out.println(account);
    }
}
