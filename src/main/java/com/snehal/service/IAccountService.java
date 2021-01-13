package com.snehal.service;

import org.springframework.security.access.annotation.Secured;

import com.snehal.entity.Account;


public interface IAccountService {
	
	 @Secured ({"ROLE_USER"})
     Double getAccountBalanceId(int accountid);
	 @Secured ({"ROLE_USER"})
	 Account getAccountById(int accountid);
	 @Secured ({"ROLE_USER"})
     void addAccount(Account account);
	 @Secured ({"ROLE_USER"})
	 void depositAccount(int accountid, double amount);
	 @Secured ({"ROLE_USER"})
	 void withDrawAccount(int accountid, double amount);
	 @Secured ({"ROLE_USER"})
	 void transferMoneyAccount(int accountidfrom, int accountidto, double amount);
	 @Secured ({"ROLE_USER"})
	 void updateWithIntrestAccount(int accountid);
}
