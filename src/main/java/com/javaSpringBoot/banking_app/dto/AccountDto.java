package com.javaSpringBoot.banking_app.dto;

import lombok.*;

@Data
@Getter
@Setter
public class AccountDto {

    private Long id;
    private String accountHolderName;
    private Double balance;

    public AccountDto(Long id, String accountHolderName, Double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public AccountDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}
