package com.microbank.accounts.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Accounts extends BaseEntity {

    @Column(name="customer_id")
    private Long customerId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;

    private String accountType;

    private String branchAddress;

}
