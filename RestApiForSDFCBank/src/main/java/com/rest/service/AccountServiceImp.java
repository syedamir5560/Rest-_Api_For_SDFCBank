package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Account;
import com.rest.repository.AccountRepo;

@Service
public class AccountServiceImp implements AccountService {
	
	@Autowired
	private AccountRepo accountRepo;

	@Override
	public Account saveAccount(Account account) {
		Account a=	accountRepo.save(account);
		return a;
	}

	@Override
	public Account getOne(Long accountNumber) {
		Account a=  accountRepo.findById(accountNumber).get();
		
		return a;
	}

	@Override
	public List<Account> getAll() {
		List<Account> a=accountRepo.findAll();
		return a;
	}

	@Override
	public Account balanceForm(Account account) {
		
		Account record=accountRepo.findById(account.getAccountNumber()).get();
		
		return record ;
	}

	@Override
	public Account depositeForm(Account account) {
		
		Account record=accountRepo.findById(account.getAccountNumber()).get();
		
		double bal=record.getBalance();
		double depAmt=account.getDepositeAmt();
	if(record.getName().equals(account.getName()) && record.getPassword().equals(account.getPassword()))
	{
		bal=bal+depAmt;
	}
	double oldBal=bal-depAmt;
	
	record.setBalance(bal);
	record.setDepositeAmt(depAmt);
	record.setOldBalance(oldBal);
	
	       accountRepo.save(record);
	       
		return record;
	}

	
	@Override
	public Account withdrawForm(Account account) {
		
 Account record=accountRepo.findById(account.getAccountNumber()).get();
		
		double bal=record.getBalance();
		double wAmt=account.getWithdrawAmt();
	if(record.getName().equals(account.getName()) && record.getPassword().equals(account.getPassword()))
	{
		bal=bal-wAmt;
	}
	double oldBal=bal+wAmt;
	
	record.setBalance(bal);
	record.setWithdrawAmt(wAmt);
	record.setOldBalance(oldBal);
	
	       accountRepo.save(record);
	       
		return record;	
		
	}

	@Override
	public Account transforForm(Account account) {
		
		Account record=accountRepo.findById(account.getAccountNumber()).get();
		
		double bal=record.getBalance();
		
		double tranAmt=account.getTransAmt();
		
		if(record.getName().equals(account.getName()) && record.getPassword().equals(account.getPassword()))
		{
		
		}
		
		double bal1 =bal-tranAmt;
		
		long acno=account.getTransAcno();
		record.setTransAcno(acno);
		
		Account record1=accountRepo.findById(record.getTransAcno()).get();
		
		double trOldBal=record1.getBalance();
		record1.setBalance(trOldBal);
		
		double trNewBal=trOldBal+tranAmt;
		
		record.setBalance(bal1);
		record.setOldBalance(bal);
		record.setTransAmt(tranAmt);
		record.setTransAcOldBalance(trOldBal);
		record.setTransAcNewBalance(trNewBal);
		
		
		
		accountRepo.save(record);
		accountRepo.save(record1);

		return record;
	}

	@Override
	public Account CloseAccount(Account account) {


		Account record=accountRepo.findById(account.getAccountNumber()).get();
		return record;
	}

	
}
