package ma.emsi.ebankbackend.dtos;

import ma.emsi.ebankbackend.entities.BankAccount;
import ma.emsi.ebankbackend.enums.OperationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;


@Data
public class AccountOperationDTO {

    private  Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}
