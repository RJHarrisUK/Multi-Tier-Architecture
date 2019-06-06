package com.qa.MapTests;
import static org.junit.Assert.*;

//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountMapRepository;
import com.qa.persistence.repository.Constants;
import com.qa.util.JSONUtil;

public class AccountServiceTest {

	private JSONUtil jsonUtil = new JSONUtil();
	private AccountMapRepository amr = new AccountMapRepository();
	private Account acc1 = new Account("Hunt", "D0001", "Matt", 1);

	@Before
	public void setup() {
		amr = new AccountMapRepository();
	}

	@Test
	public void getAllAccountsTest() {
		assertEquals("{}", amr.getAllAccounts());
	}

	@Test
	public void addAccountTest() {
		String accToCreate = jsonUtil.getJSONForObject(acc1);
		System.out.println(accToCreate);
		assertEquals(amr.createAccount(accToCreate), "Created Successfully");
		assertEquals(amr.getAccountMap().size(), 1);
	}

	@Test
	public void findByFirstName() {
		amr.createAccount(Constants.ACCOUNT1);
		amr.createAccount(Constants.ACCOUNT2);
		amr.createAccount(Constants.ACCOUNT3);
		amr.createAccount(Constants.ACCOUNT4);
		amr.createAccount(Constants.ACCOUNT5);
		amr.createAccount(Constants.ACCOUNT6);
		
		assertTrue(amr.firstNameAmount("Zebedee")==5);
	}
	

//	@Test
//	public void remove2AccountsTest() {
//		fail("TODO");
//	}
//
//	@Test
//	public void remove2AccountTestAnd1ThatDoesntExist() {
//		fail("TODO");
//	}
//
//	@Test
//	public void jsonStringToAccountConversionTest() {
//		// testing JSONUtil
//		fail("TODO");
//	}
//
//	@Test
//	public void accountConversionToJSONTest() {
//		// testing JSONUtil
//		fail("TODO");
//	}
//
//	@Test
//	public void getCountForFirstNamesInAccountWhenZeroOccurances() {
//		// For a later piece of functionality
//		fail("TODO");
//	}
//
//	@Test
//	public void getCountForFirstNamesInAccountWhenOne() {
//		// For a later piece of functionality
//		fail("TODO");
//	}
//
//	@Test
//	public void getCountForFirstNamesInAccountWhenTwo() {
//		// For a later piece of functionality
//		fail("TODO");
//	}
//
}
