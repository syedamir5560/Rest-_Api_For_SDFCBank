package com.rest.service;

import java.util.List;

import com.rest.entity.Account;

public interface AccountService {

	public Account saveAccount(Account account);
	public Account getOne(Long accountNumber);
	public List<Account> getAll();
	
	public Account balanceForm(Account account);
	public Account depositeForm(Account account);
	public Account withdrawForm(Account account);
	public Account transforForm(Account account);
	public Account CloseAccount(Account account);
	

	
}
