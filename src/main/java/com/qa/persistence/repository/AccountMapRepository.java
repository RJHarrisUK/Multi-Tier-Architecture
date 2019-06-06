package com.qa.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

public class AccountMapRepository implements AccountRepository {

	JSONUtil jsonutil = new JSONUtil();

	private Map<Integer, Account> accountMap = new HashMap<Integer, Account>();

	// You must provide concrete implementation for each of these methods
	// do not change the method signature
	// THINK - if the parameter is a String, or the return type is a String
	// How can I convert to a String from an Object?
	// What utility methods do I have available?

	// You must complete this section using TDD
	// You can use the suggested tests or build your own.

	public int firstNameAmount(String name) {
//		int counter = 0;
//
//		for (Account account : this.accountMap.values()) {
//			if (account.getFirstName().equals(name)) {
//				counter++;
//			}
//		}
//		
//		return counter;
		return (int) this.accountMap.values().stream().filter(account -> account.getFirstName().equals(name)).count();
	}

	public String getAllAccounts() {
		return jsonutil.getJSONForObject(accountMap);
	}

	public String getAllAccountsJackson() {
		return jsonutil.getJSONForObject(accountMap);
	}

	public String createAccount(String account) {
		Account acc1 = jsonutil.getObjectForJSON(account, Account.class);
		accountMap.put(acc1.getId(), acc1);

		return "Created Successfully";
	}

	public String deleteAccount(int accountNumber) {
		accountMap.remove(accountNumber);
		return "Account deleted:" + accountNumber;
	}

	public String updateAccount(int accountNumber, String account) {

		return "Account updated:" + accountNumber;
	}

	// getters and setters
	public Map<Integer, Account> getAccountMap() {
		return accountMap;
	}

	public void setAccountMap(Map<Integer, Account> accountMap) {
		this.accountMap = accountMap;
	}

}
