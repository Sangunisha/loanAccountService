package com.inteview.banking.loanAccountService.account.repo;

import com.inteview.banking.loanAccountService.account.domain.LoanAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanAccountRepo extends CrudRepository<LoanAccount, String> {

}
