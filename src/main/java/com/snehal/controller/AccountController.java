package com.snehal.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

import com.snehal.entity.Account;
import com.snehal.service.IAccountService;


@Controller
@RequestMapping("acc")
public class AccountController {

	@Autowired
	private IAccountService accountService;
	@GetMapping("account/{id}")
	public ResponseEntity<Account> getAccountById(@PathVariable("id") Integer id) {
		Account Account = accountService.getAccountById(id);
		return new ResponseEntity<Account>(Account, HttpStatus.OK);
	}
	
	@GetMapping("accountbalnce/{id}")
	public ResponseEntity<Double> getAccountBalanceId(@PathVariable("id") Integer id) {
		Account account = accountService.getAccountById(id);
		return new ResponseEntity<Double>(account.getBalance(), HttpStatus.OK);
	}
	
	@PostMapping("addAccount")
	public ResponseEntity<Void> addAccount(@RequestBody Account account, UriComponentsBuilder builder) {
       accountService.addAccount(account);
      
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/Account/{id}").buildAndExpand(account.getAccountid()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@PutMapping("transferFunds")
	public ResponseEntity<String> updateAccount(@RequestParam int accountidfrom, @RequestParam int accountidto, @RequestParam double amount) {
		accountService.transferMoneyAccount(accountidfrom, accountidto, amount);
		return new ResponseEntity<String>("Succesful", HttpStatus.OK);
	}
	
	@PutMapping("withdrawAmount")
	public ResponseEntity<String> withdrawAccount(@RequestParam int accountid, @RequestParam double amount) {
		accountService.withDrawAccount(accountid, amount);
		return new ResponseEntity<String>("Wirtdraw operation succcessful", HttpStatus.OK);
	}
	
	@PutMapping("depositAmount")
	public ResponseEntity<String> depositAccount(@RequestParam int accountid, @RequestParam double amount) {
		accountService.depositAccount(accountid, amount);
		return new ResponseEntity<String>("Deposit operation succcessful", HttpStatus.OK);
	}
	
	
	@PutMapping("updtaeAccountWithIntrest/{id}")
	public ResponseEntity<String> updateWithIntrestAccount(@PathVariable("id") Integer id) {
		accountService.updateWithIntrestAccount(id);
		return new ResponseEntity<String>("Updated with intrest rate 3.5%..", HttpStatus.OK);
	}
	
} 