package com.microbank.accounts.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Accounts extends BaseEntity {

    private Long customerId;

    @Id
    private Long accountNumber;

    private String accountType;

    private String branchAddress;

}
