package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Dados do contrato: ");
        System.out.print("Numero contrato: ");
        int num = sc.nextInt();
        System.out.print("Data: ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(num, date, totalValue);

        System.out.print("Numero de parcelas: ");
        int parcelas = sc.nextInt();

        ContractService cs = new ContractService(new PaypalService());

        cs.processContract(contract, parcelas);

        System.out.println("Parcelas: ");
        for(Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        sc.close();

    }

}
