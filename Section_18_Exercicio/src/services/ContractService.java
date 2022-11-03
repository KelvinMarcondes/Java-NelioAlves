package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymenteService onlinePaymenteService;

    public ContractService(OnlinePaymenteService onlinePaymenteService) {
        this.onlinePaymenteService = onlinePaymenteService;
    }

    public void processContract(Contract contract, int months){

        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().minusMonths(i);
            double interest = onlinePaymenteService.interest(basicQuota,i);
            double fee = onlinePaymenteService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate,quota));
        }
    }
}
