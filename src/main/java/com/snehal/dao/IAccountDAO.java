package com.snehal.dao;
import com.snehal.entity.Account;
public interface IAccountDAO {
	Account getAccountById(int accountid);
	Double getAccountBalanceId(int accountid);

    void addAccount(Account account);
    void withdrawAccount(int accountid, double amount);
    void depositAccount(int accountid, double amount) ;
	void transferMoneyAccount(int accountidfrom, int accountidto, double amount);
	void updateWithIntrestAccount(int accountid);

}
 