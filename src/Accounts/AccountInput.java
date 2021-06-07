package Accounts;

import java.util.Scanner;
import Exception.EmailFormatException;

public interface AccountInput {

	public String getID();
		
	public void setID(String Id);
		
	public String getName();
		
	public void setName(String name);
		
	public String getEmail();
		
	public void setEmail(String email) throws EmailFormatException;
		
	public String getPhone();
		
	public void setPhone(String phone);
		
	public void getUserInput(Scanner input);
		
	public void printInfo();
		
	public void setAccountID(Scanner input);
		
	public void setAccountName(Scanner input);
		
	public void setAccountEmail(Scanner input);
		
	public void setAccountPhone(Scanner input);
		
}

