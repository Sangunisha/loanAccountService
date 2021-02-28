package com.inteview.banking.loanAccountService.account.domain;

import com.inteview.banking.loanAccountService.base.domain.BaseDomainObject;
import com.inteview.banking.loanAccountService.constants.LoanTypeEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class LoanAccount extends BaseDomainObject<LoanAccount> {

    @Size(min = 16, max = 16)
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

    public LoanAccount setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public LoanTypeEnum getLoanType() {
        return loanType;
    }

    public LoanAccount setLoanType(LoanTypeEnum loanType) {
        this.loanType = loanType;
        return this;
    }

    public Double getBalanceAmount() {
        return balanceAmount;
    }

    public LoanAccount setBalanceAmount(Double balanceAmount) {
        this.balanceAmount = balanceAmount;
        return this;
    }

    public String getBranchId() {
        return branchId;
    }

    public LoanAccount setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
}
