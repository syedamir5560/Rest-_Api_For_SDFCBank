package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Account;
import com.rest.service.AccountService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/save")
	public Account save(@RequestBody Account account)
	{
		Account a=	accountService.saveAccount(account);
		return a;
	}
	
	@PutMapping("/balance")
	public Account balance(@RequestBody Account account )
	{
	Account rec=	accountService.balanceForm(account);
	
		return rec;
		
	}
	
	
	@PutMapping("/deposite")
	public Account deposite(@RequestBody Account account )
	{
	Account reco=	accountService.depositeForm(account);
	

		return reco;
		
	}
	
	@PutMapping("/withdraw")
	public Account withdraw(@RequestBody Account account )
	{
	Account reco=	accountService.withdrawForm(account);
	
	
		return reco;
		
	}
	
	
	@PutMapping("/transfor")
	public Account transfor(@RequestBody Account account )
	{
	Account reco=	accountService.transforForm(account);
	
	
		return reco;
		
	}
	
	
	
	@PutMapping("/closeac")
	public Account closeAccount(@RequestBody Account account )
	{
	Account rec=	accountService.CloseAccount(account);
	
		return rec;
		
	}
	
	@GetMapping("/get/{accountNumber}")
	public Account getAccount(@PathVariable Long accountNumber)
	{
		Account a=	accountService.getOne(accountNumber);
		return a;
		
	}
	
	@GetMapping("/getAll")
	public List<Account> getALLAccount()
	{
		List<Account> a=	accountService.getAll();
		return a;
		
	}


}
