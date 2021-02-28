package com.inteview.banking.loanAccountService.account.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.inteview.banking.loanAccountService.base.dto.BaseDTO;
import com.inteview.banking.loanAccountService.constants.LoanTypeEnum;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanAccountDTO extends BaseDTO<LoanAccountDTO> implements Serializable {

    @NotNull
    private String accountNumber;

    @Enumerated(EnumType.STRING)
    @NotNull
    private LoanTypeEnum loanType;

    private Double balanceAmount;

    @NotNull
    private String branchId;

    public String getAccountNumber() {
        return accountNumber;
    }

    public LoanAccountDTO setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public LoanTypeEnum getLoanType() {
        return loanType;
    }

    public LoanAccountDTO setLoanType(LoanTypeEnum loanType) {
        this.loanType = loanType;
        return this;
    }

    public Double getBalanceAmount() {
        return balanceAmount;
    }

    public LoanAccountDTO setBalanceAmount(Double balanceAmount) {
        this.balanceAmount = balanceAmount;
        return this;
    }

    public String getBranchId() {
        return branchId;
    }

    public LoanAccountDTO setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
}
