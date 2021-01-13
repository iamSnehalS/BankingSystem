package com.snehal.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.snehal.entity.Account;

@Transactional
@Repository
public class AccountDAO implements IAccountDAO {
	@PersistenceContext	
	private EntityManager entityManager;	

	@Override
	public void addAccount(Account account) {
		entityManager.persist(account);
		
	}
	@Override
	public void updateWithIntrestAccount(int accountid) {
		Account account = getAccountById(accountid);
		double intrest = account.getBalance() * 0.035;
		account.setBalance(account.getBalance() + intrest);
		entityManager.persist(account);
		
	}
	
	@Override
	public void depositAccount(int accountid, double amount) {
		Account account = getAccountById(accountid);
		account.setBalance(account.getBalance() + amount);
		entityManager.persist(account);
	}
	
	@Override
	public void withdrawAccount(int accountid, double amount) {
		Account account = getAccountById(accountid);
		account.setBalance(account.getBalance() - amount);
		entityManager.persist(account);
	}
	
	@Override
	public void transferMoneyAccount(int accountidfrom, int accountidto, double amount) {
		Account account = getAccountById(accountidfrom);
		if(account.getBalance() < amount) {
			throw new RuntimeException("Insufficient funds..");
		}
		withdrawAccount(accountidfrom, amount);
		depositAccount(accountidto, amount);

	}
	@Override
	public Account getAccountById(int accountid) {
		return entityManager.find(Account.class, accountid);
	}
	
	@Override
	public Double getAccountBalanceId(int accountid) {
		return entityManager.find(Account.class, accountid).getBalance();
	}
}
