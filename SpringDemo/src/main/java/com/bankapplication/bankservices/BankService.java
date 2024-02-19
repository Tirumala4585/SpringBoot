package com.bankapplication.bankservices;

import com.bankapplication.model.Bank;

public interface BankService {
	Bank saveBank(Bank bank);

	Bank getBankById(int user_id);
	

}
