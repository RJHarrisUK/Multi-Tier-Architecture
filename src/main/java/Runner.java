
import java.io.IOException;

//import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountMapRepository;
import com.qa.persistence.repository.Constants;

public class Runner {

	public static void main(String[] args) {
		
		AccountMapRepository amr;
		
		amr = new AccountMapRepository();
		
		amr.createAccount(Constants.ACCOUNT1);
		amr.createAccount(Constants.ACCOUNT2);
		System.out.println(amr.getAllAccounts());
		amr.getAllAccounts();
		amr.deleteAccount(1);
		System.out.println(amr.getAllAccounts());
		amr.updateAccount(1, Constants.ACCOUNT2);
		
//		Account acc = new Account(null, null, null, 0);
//		acc =  getObjectData(acc);
////		ObjectMapper Obj = new ObjectMapper();
//		
//		try {
//			String jsonStr = Obj.writeValueAsString(acc);
//			System.out.println(jsonStr);
//		}
//		catch (IOException e) {
//			e.printStackTrace();
		}
//		}
	
		public static Account getObjectData(Account acc) 
	    { 
	        // Insert the data 
	        acc.setId(1);
	        acc.setAccountNumber("One");
	        acc.setFirstName("Rich");
	        acc.setLastName("Harris");
	        // Return the object 
	        return acc; 
	}

}
