package com.snehal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snehal.dao.IAccountDAO;
import com.snehal.entity.Account;

@Service
public class AccountService implements IAccountService {
	@Autowired
	private IAccountDAO accountDAO;
	
	@Override
	public Double getAccountBalanceId(int accountid) {
		return accountDAO.getAccountBalanceId(accountid);
	}
	@Override
	public Account getAccountById(int accountid) {
		return accountDAO.getAccountById(accountid);
	}
	@Override
	public void addAccount(Account account) {
		accountDAO.addAccount(account);
	}
	@Override
	public void depositAccount(int accountid, double amount) {
		accountDAO.depositAccount(accountid, amount);		
	}
	@Override
	public void withDrawAccount(int accountid, double amount) {
		accountDAO.withdrawAccount(accountid, amount);		
	}
	@Override
	public void transferMoneyAccount(int accountidfrom, int accountidto, double amount) {
		accountDAO.transferMoneyAccount(accountidfrom, accountidto, amount);
	}
	
	@Override
	public void updateWithIntrestAccount(int accountid) {
		accountDAO.updateWithIntrestAccount(accountid);
	}
}
