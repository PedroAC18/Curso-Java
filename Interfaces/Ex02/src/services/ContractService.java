package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService ops;


    public ContractService(OnlinePaymentService ops) {
        this.ops = ops;
    }

    public void processContract(Contract contract, Integer months){
        double amountPerMonth = contract.getTotalValue()/months;

        for(int i=1; i<=months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = ops.interest(amountPerMonth, i);

            double fee = ops.paymentFee(amountPerMonth+interest);

            double totalValue = amountPerMonth+interest+fee;

            contract.getInstallments().add(new Installment(dueDate, totalValue));

        }

    }
}
